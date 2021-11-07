package arrmod.dao;

import arrmod.models.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> index() {
        return jdbcTemplate.query("SELECT * FROM Person", new PersonMapper());//через маппер(используя класс PersonMapper)
    }                                                                  //без маппера new BeanPropertyRowMapper<>(Person.class)

    //возврат человека по заданному id
    public Person show(int id) {
        return jdbcTemplate.query("SELECT * FROM Person WHERE id=?", new Object[]{id},
                new BeanPropertyRowMapper<>(Person.class)).stream().findAny().orElse(null);
    }

    public void save(Person person) {
        jdbcTemplate.update("INSERT INTO Person VALUE (1, ?, ?, ?)", person.getName(),
                person.getAge(), person.getEmail());
    }

    public void update(int id, Person updatePerson) {
        jdbcTemplate.update("UPDATE Person Set name=?, age=?, email=? WHERE id=?", updatePerson.getName(),
                updatePerson.getAge(), updatePerson.getEmail(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM Person WHERE id=?", id);
    }
}
