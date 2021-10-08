import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
    private List<Person> listPerson = new ArrayList<>();
    private final Person person = new Person();

    public SortList(List<Person> listPerson) {
        this.listPerson = listPerson;
    }

    public List<Person> sortByYearAscend() {
        return listPerson.stream().sorted((o1, o2) -> o1.getBirthYear() - o2.getBirthYear()).collect(Collectors.toList());
    }

    public List<Person> sortByYearDescend() {
        return listPerson.stream().sorted((o1, o2) -> o2.getBirthYear() - o1.getBirthYear()).collect(Collectors.toList());
    }

    public List<Person> sortIdAscend() {
        return  listPerson.stream().sorted((o1, o2) -> o1.getId() - o2.getId()).collect(Collectors.toList());
    }

    public List<Person> sortIdDescend() {
        return   listPerson.stream().sorted((o1, o2) -> o2.getId() - o1.getId()).collect(Collectors.toList());
    }

    public List<Person> sortNameAscend(){
        return  listPerson.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
    }

    public List<Person> sortNameDescend(){
        return  listPerson.stream().sorted((o1, o2) -> o2.getName().compareTo(o1.getName())).collect(Collectors.toList());
    }

    public List<Person> sortSurnameAscend() {
        return   listPerson.stream().sorted((o1, o2) -> o1.getSurname().compareTo(o2.getSurname())).collect(Collectors.toList());
   }

    public List<Person> sortSurnameDescend() {
        return   listPerson.stream().sorted((o1, o2) -> o2.getSurname().compareTo(o1.getSurname())).collect(Collectors.toList());
   }

    public List<Person> sortBySexF() {
        return  listPerson.stream().sorted((o1, o2) -> o1.getSex().compareTo(o2.getSex())).collect(Collectors.toList());
    }

    public List<Person> sortBySexM() {
        return  listPerson.stream().sorted((o1, o2) -> o2.getSex().compareTo(o1.getSex())).collect(Collectors.toList());
    }
}
