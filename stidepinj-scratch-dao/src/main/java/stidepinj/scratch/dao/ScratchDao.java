package stidepinj.scratch.dao;

import stidepinj.scratch.domain.Student;

public interface ScratchDao {

    Student addStudent(String givenName, String surname);

    boolean deleteStudent(String givenName, String surname);
}
