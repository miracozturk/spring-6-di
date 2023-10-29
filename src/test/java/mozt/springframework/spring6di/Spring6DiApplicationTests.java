package mozt.springframework.spring6di;

import mozt.springframework.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

    @Autowired
    ApplicationContext ctx;

    @Autowired
    MyController mc;


    @Test
    void testGetcontllerFromCtx() {
        MyController mc = ctx.getBean(MyController.class);
        System.out.println(mc.sayHello());
    }

    @Test
    void testAutowireOfController() {
        System.out.println("This is autowire version. ");
        System.out.println(mc.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
