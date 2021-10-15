import java.util.ArrayList;

public class InitList {
    private ArrayList<Person> listPerson = new ArrayList<>();
    {
        listPerson.add(new Person(100, "Ivan", "Sidorov", Sex.M, 1980));
        listPerson.add(new Person(101, "Igor", "Petrov", Sex.M, 1982));
        listPerson.add(new Person(102, "Alex", "Khlebnikov", Sex.M, 1993));
        listPerson.add(new Person(103, "Petr", "Svirodov", Sex.M, 2002));
        listPerson.add(new Person(104, "Maxim", "Faridov", Sex.M, 2004));
        listPerson.add(new Person(105, "Venera", "Voronova", Sex.F, 1997));
        listPerson.add(new Person(106, "Olga", "Spivak", Sex.F, 1985));
        listPerson.add(new Person(107, "Andrey", "Mironov", Sex.M, 1986));
        listPerson.add(new Person(108, "Sergey", "Sidorov", Sex.M, 1986));
        listPerson.add(new Person(109, "Ivan", "Ivanov", Sex.M, 1988));
        listPerson.add(new Person(110, "Ilya", "Slepov", Sex.M, 1989));
        listPerson.add(new Person(111, "Ivan", "Shapkin", Sex.M, 1998));
        listPerson.add(new Person(112, "Anton", "Markov", Sex.M, 1992));
        listPerson.add(new Person(113, "Stepan", "Yaltin", Sex.M, 1997));
        listPerson.add(new Person(114, "Ivan", "Sumkin", Sex.M, 1994));
        listPerson.add(new Person(115, "Sergey", "Fadeev", Sex.M, 1983));
        listPerson.add(new Person(116, "Pavel", "Putin", Sex.M, 2001));
        listPerson.add(new Person(117, "Anton", "Temnikov", Sex.M, 1999));
        listPerson.add(new Person(118, "Olga", "Zakharova", Sex.F, 1991));
        listPerson.add(new Person(119, "Oleg", "Sidorov", Sex.M, 1987));
    }

    public ArrayList<Person> getListPerson() {
        return listPerson;
    }
}