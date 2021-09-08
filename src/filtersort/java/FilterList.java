import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilterList {
    private List<Person> resultList = new ArrayList<>();
    private List<Person> listPerson = new ArrayList<>();
    private Person person = new Person();

    FilterList(List<Person> listPerson) {
        this.listPerson = listPerson;
    }

    public void printSearch(){
        System.out.println(filterList(0,"","",'M',1999));
    }

    public List<Person> filterList(int id, String name, String surname, char sex, int yearBirth) {
       Iterator<Person> iterName = listPerson.iterator();
         while(iterName.hasNext()){
            person = iterName.next();
              if(person.getId() == id  || person.getName().equals(name) && person.getSurname().equals(surname) || person.getSex() == sex || person.getBirthYear() == yearBirth) {
              resultList.add(person.toList());
            }
        } return resultList;
    }
}
