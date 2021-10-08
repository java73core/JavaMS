import java.util.ArrayList;
import java.util.List;

public class Person {
    private Sex sex;

    private String name;

    private String surname;

    private Integer birthYear;

    private Integer id;

    public Person() {
    }

    public Sex getSex(){
        return sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public Integer getId() {
        return id;
    }

    public Person(Integer id, String name, String surname, Sex sex, Integer birthYear) {
        this.birthYear = birthYear;
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", sex='" + sex  + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                '}' + System.lineSeparator();
    }
}

