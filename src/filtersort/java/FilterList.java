import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterList {
    private List<Person> listPerson = new ArrayList<>();

    FilterList(List<Person> listPerson) {
        this.listPerson = listPerson;
    }

    public List<Person> filterList(Integer id, String name, String surname, Sex sex, Integer yearBirth)
    {
        return listPerson.stream().filter(Objects::nonNull)
               .filter(list -> list.getId() == id  || list.getName().equals(name) || list.getSurname().equals(surname) || list.getSex() == sex || list.getBirthYear() == yearBirth)
               .collect(Collectors.toList());
    }
}
