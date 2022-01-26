package stidepinj.scratch.unittest;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import stidepinj.scratch.dao.ScratchDao;
import stidepinj.scratch.domain.Student;

public class TestDao {

    private static final String DENIZE = "Denize";

    ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("classpath:stidepinj-scratch-dao.xml");


   @Test
    public void testAddStudent(){
        ScratchDao scratchDao = (ScratchDao) applicationContext.getBean("dao");
        Student student = scratchDao.addStudent("Denize", "Scheffold");
        Assert.assertEquals(DENIZE, student.getGivenName());
    }

}
