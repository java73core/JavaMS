import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
    private List<Person> listPerson = new ArrayList<>();
    private List<Person> resultList = new ArrayList<>();
    private Person person = new Person();

    public SortList(List<Person> listPerson) {
        this.listPerson = listPerson;
    }

/*    public void printList() {
        sortBySexF();
        System.out.println(resultList.toString());
    }*/

    public List<Person> sortByYearAscend() {
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getBirthYear() - o2.getBirthYear();
            }
        });
       return resultList = listPerson;
    }

    public List<Person> sortByYearDes() {
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getBirthYear() - o1.getBirthYear();
            }
        });
        return resultList = listPerson;
    }

    public List<Person> sortIdAscend() {
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId() - o2.getId();
            }
        });
        return resultList = listPerson;
    }

    public List<Person> sortIdDes() {
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getId() - o1.getId();
            }
        });
        return resultList = listPerson;
    }

    public List<Person> sortNameAscend(){
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return resultList = listPerson;
    }

    public List<Person> sortNameDes(){
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        return resultList = listPerson;
    }

    public List<Person> sortSurnameAscend() {
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        });
        return resultList = listPerson;
    }

    public List<Person> sortSurnameDes() {
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getSurname().compareTo(o1.getSurname());
            }
        });
        return resultList = listPerson;
    }

    public List<Person> sortBySexF() {
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getSex() - o2.getSex();
            }
        });
        return resultList = listPerson;
    }

    public List<Person> sortBySexM() {
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getSex() - o1.getSex();
            }
        });
        return resultList = listPerson;
    }
}
