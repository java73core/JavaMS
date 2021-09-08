public class Person {
    private char sex;

    private enum Sex{ M, F }

    private String name;

    private String surname;

    private int birthYear;

    private int id;

    public char getSex(){
        return Sex.valueOf(String.valueOf(this.sex)).equals('M') || Sex.valueOf(String.valueOf(this.sex)).equals('F')?
         sex: '\u0000';
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getId() {
        return id;
    }

    public Person(int id, String name, String surname, char sex, int birthYear) {
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

    public Person toList() {
        return new Person(id, name, surname, sex, birthYear);
    }
}

