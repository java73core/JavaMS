import java.util.Objects;

public class Person {
    private Sex sex;

    private String name;

    private String surname;

    private Integer birthYear;

    private Integer id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return sex == person.sex ||
                Objects.equals(name, person.name) ||
                Objects.equals(surname, person.surname) ||
                Objects.equals(birthYear, person.birthYear) ||
                Objects.equals(id, person.id);
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

