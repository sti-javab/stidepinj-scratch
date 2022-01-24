package stidepinj.scratch.unittest;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import stidepinj.scratch.service.ScratchService;

import java.util.List;

public class TestService {

    private static final String HELENA_OSTLUND = "Helena Östlund";
    private static final String MAX = "Max";

    ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("classpath:stidepinj-service.xml");


/*
    @Test
    public void testSpringWiring(){
        ScratchService scratchService = (ScratchService)applicationContext.getBean("service");
        List<String> students = scratchService.getStudents();
        Assert.assertEquals(HELENA_OSTLUND, students.get(0));
    }
*/

    @Test
    public void testSpringWiring(){
        ScratchService scratchService = (ScratchService)applicationContext.getBean("service");
        List<String> students = scratchService.getStudents();
        Assert.assertEquals(MAX, students.get(1));
    }
    
}
