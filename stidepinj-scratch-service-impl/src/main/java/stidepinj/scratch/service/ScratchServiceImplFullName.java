package stidepinj.scratch.service;

import stidepinj.scratch.domain.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScratchServiceImplFullName implements ScratchService{

    private static List<Student> students = new ArrayList<>();

    public ScratchServiceImplFullName() {
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
                students.get(0).toString(),
                students.get(1).toString(),
                students.get(2).toString());
    }

}
