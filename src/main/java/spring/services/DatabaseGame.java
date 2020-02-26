package spring.services;

//would pull from database

import java.sql.*;

public class DatabaseGame implements  Game {
    @Override
    public String GetDeveloper(int id) {
        //if database existed I would have code to pull it out
        String sql ="";
        StartDatabase(sql);
        return "Developer 1";
    }

    @Override
    public String GetTitle(int id){
        String sql ="";
        StartDatabase(sql);
        return "Game 1";
    }

    @Override
    public String GetPublisher(int id) {
        String sql ="";
        StartDatabase(sql);
        return "Publisher 1";
    }

    //these don't actually do anything, this is more of a concept lines if it did use a database
    public void StartDatabase(String sql){
        //info that would start the database
        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;
        try {
            //create connections
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

            String absPath = "";// = getServletContext().getRealPath("/") + "../../db";

            absPath ="jdbc:derby:" + absPath;

            conn = DriverManager.getConnection(absPath, "jessie", "jessie");

            stmt = conn.createStatement();

            rset = stmt.executeQuery(sql);

            //output comes from here


        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }


    public static void closeDatabase(Connection conn, Statement stmt, ResultSet rset) {
        if (rset != null) {
            try {
                rset.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
