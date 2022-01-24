package stidepinj.scratch.service;

import stidepinj.scratch.domain.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScratchServiceImplGivenName implements ScratchService{

    private static List<Student> students = new ArrayList<>();

    public ScratchServiceImplGivenName() {
        fillStudentList();
    }


    private static List<Student> fillStudentList(){
        students.add(new Student("Helena", "Östlund"));
        students.add(new Student("Max", "Lundin"));
        students.add(new Student("Anna", "Karlsson"));
        return students;
    }


    @Override
    public List<String> getStudents() {
        return Arrays.asList(
                students.get(0).getGivenName(),
                students.get(1).getGivenName(),
                students.get(2).getGivenName());
    }
}
