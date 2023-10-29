package mozt.springframework.spring6di;

import mozt.springframework.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/***
 *
 * written mozt
 */
@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);
        MyController myController = ctx.getBean(MyController.class);
        System.out.println("In main method");
        System.out.println(myController.sayHello());

    }

}
