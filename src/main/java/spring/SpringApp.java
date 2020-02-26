package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.beans.Game;

public class SpringApp {
    public static void main(String[] args) {
        // load the Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        // retrieve bean from Spring container
        Game theGame = context.getBean("myCoach", Game.class);

        // call methods on the bean
        System.out.println(theGame.getTitle());

        // close the context
        context.close();

    }
}
