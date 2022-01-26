package stidepinj.scratch.unittest;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sti.abstractions.dao.ForestDao;
import stidepinj.scratch.dao.ScratchDao;
import stidepinj.scratch.domain.Student;

public class TestDao {
    private static final String DENIZE = "Denize";
    private static final String JULIO = "Julio";



    ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("classpath:stidepinj-scratch-dao.xml");


   @Test
    public void testAddStudent(){
       ForestDao forestDao = (ForestDao) applicationContext.getBean("dao");
       stidepinj.scratch.domain.Student student = forestDao.createStudent("Julio", "Siklander");
        Assert.assertEquals(JULIO, student.getGivenName());
    }


}
