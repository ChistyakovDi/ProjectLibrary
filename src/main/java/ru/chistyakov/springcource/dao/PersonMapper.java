package ru.chistyakov.springcource.dao;

import org.springframework.jdbc.core.RowMapper;
import ru.chistyakov.springcource.models.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        Person person = new Person();

        person.setId(resultSet.getInt("id"));
        person.setFullName(resultSet.getString("full_name"));
        person.setYearOfBirth(resultSet.getInt("year_of_birth"));

        return person;
    }
}
