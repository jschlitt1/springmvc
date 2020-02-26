package spring.services;

import javax.servlet.http.HttpServletRequest;

//would pull from a form
public class FormGame implements Game{
    HttpServletRequest request;
    @Override
    public String GetPublisher(int id) {
        request.getParameter("Publisher");
        return "Publisher 2";
    }

    @Override
    public String GetDeveloper(int id) {
        request.getParameter("Developer");
        return "Developer 2";
    }

    @Override
    public String GetTitle(int id) {
        request.getParameter("Title");
        return "Game 2";
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }
}
