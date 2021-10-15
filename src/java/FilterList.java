import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterList {

    public List<Person> filterList(List<Person> listPerson, Person filterParam) throws Exception {
        return listPerson.stream()
               .filter(Objects::nonNull)
               .filter(list -> list.equals(filterParam))
               .collect(Collectors.toList());
    }
}
