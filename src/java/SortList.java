import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortList {
    public List<Person> sortList(List<Person> listPerson, Map<String, Comparator> map, String key){
        return listPerson.stream().sorted((Comparator<? super Person>) map.get(key)).collect(Collectors.toList());
    }
}
