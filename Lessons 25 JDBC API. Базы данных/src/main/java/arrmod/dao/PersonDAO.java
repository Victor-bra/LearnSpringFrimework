package arrmod.dao;

import arrmod.models.Person;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;

    private static final String URL = "jdbc:mysql://localhost:3306/myspringbd";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "08652428-7393";

    private static Connection connection;

    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connection successful!");
        }
        catch(Exception ex){
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
        try {
            connection = DriverManager.getConnection(URL,USERNAME, PASSWORD);
            System.out.println("Connection for DM successful");
        } catch (SQLException e) {
            System.out.println("Connection for DM failed");
            e.printStackTrace();
        }
    }

    public List<Person> index() {
        List<Person> people = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM Person";
            ResultSet resultSet = statement.executeQuery(SQL);

            while (resultSet.next()) {
                Person person = new Person();
                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString("name"));
                person.setAge(resultSet.getInt("age"));
                person.setEmail(resultSet.getString("email"));

                people.add(person);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return people;
    }

    //возврат человека по заданному id
    public Person show(int id) {
//        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
        return null;
    }

    public void save(Person person){
        try {
            Statement statement = connection.createStatement();
            String SQL = "INSERT INTO Person VALUE(" + 1 + ",'" + person.getName() + "'" +
                    "," + person.getAge() + ",'" + person.getEmail() + "')";
            statement.executeUpdate(SQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(int id, Person updatePerson){
//        Person personToBeUpdated = show(id);
//
//        personToBeUpdated.setName(updatePerson.getName());
//        personToBeUpdated.setAge(updatePerson.getAge());
//        personToBeUpdated.setEmail(updatePerson.getEmail());
    }

    public void delete(int id){
//        people.removeIf(p -> p.getId() ==id);
    }
}
