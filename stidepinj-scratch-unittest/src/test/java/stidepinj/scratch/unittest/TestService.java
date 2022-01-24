package stidepinj.scratch.unittest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {

    ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("classpath:stidepinj-service.xml");


}
