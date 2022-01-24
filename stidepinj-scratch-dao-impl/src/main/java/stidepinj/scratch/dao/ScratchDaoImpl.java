package stidepinj.scratch.dao;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import stidepinj.scratch.domain.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ScratchDaoImpl implements ScratchDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScratchDaoImpl.class);

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql//localhost:3306/course", "root", "root");
    }

    @Override
    public Student addStudent(String givenName, String surname) {
        final String ADD_STUDENT_SQL = "INSERT INTO student(givenName, surname) VALUES(?, ?)";

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(ADD_STUDENT_SQL);

            preparedStatement.setString(1, givenName);
            preparedStatement.setString(2, surname);

            int rows = preparedStatement.executeUpdate();

        } catch (SQLException sqlException) {
            LOGGER.error(sqlException.toString());
        }

        return new Student(givenName, surname);
    }

    //@TODO: finish query
    @Override
    public boolean deleteStudent(String givenName, String surname) {
        final String DELETE_STUDENT_SQL = "";

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(DELETE_STUDENT_SQL);

            preparedStatement.setString(1, givenName);
            preparedStatement.setString(2, surname);

            int rows = preparedStatement.executeUpdate();

        } catch (SQLException sqlException) {
            LOGGER.error(sqlException.toString());
            return false;
        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }
}
