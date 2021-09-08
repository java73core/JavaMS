import java.util.ArrayList;

public class InitList {
    private ArrayList<Person> listPerson = new ArrayList<>();
    {
        listPerson.add(new Person(100, "Ivan", "Sidorov", 'M', 1980));
        listPerson.add(new Person(101, "Igor", "Petrov", 'M', 1982));
        listPerson.add(new Person(102, "Alex", "Khlebnikov", 'M', 1993));
        listPerson.add(new Person(103, "Petr", "Svirodov", 'M', 2002));
        listPerson.add(new Person(104, "Maxim", "Faridov", 'M', 2004));
        listPerson.add(new Person(105, "Venera", "Voronova", 'F', 1997));
        listPerson.add(new Person(106, "Olga", "Spivak", 'F', 1985));
        listPerson.add(new Person(107, "Andrey", "Mironov", 'M', 1986));
        listPerson.add(new Person(108, "Sergey", "Sidorov", 'M', 1986));
        listPerson.add(new Person(109, "Ivan", "Ivanov", 'M', 1988));
        listPerson.add(new Person(110, "Ilya", "Slepov", 'M', 1989));
        listPerson.add(new Person(111, "Ivan", "Shapkin", 'M', 1998));
        listPerson.add(new Person(112, "Anton", "Markov", 'M', 1992));
        listPerson.add(new Person(113, "Stepan", "Yaltin", 'M', 1997));
        listPerson.add(new Person(114, "Ivan", "Sumkin", 'M', 1994));
        listPerson.add(new Person(115, "Sergey", "Fadeev", 'M', 1983));
        listPerson.add(new Person(116, "Pavel", "Putin", 'M', 2001));
        listPerson.add(new Person(117, "Anton", "Temnikov", 'M', 1999));
        listPerson.add(new Person(118, "Olga", "Zakharova", 'F', 1991));
        listPerson.add(new Person(119, "Oleg", "Sidorov", 'M', 1987));
    }

    public ArrayList<Person> getListPerson() {
        return listPerson;
    }
}