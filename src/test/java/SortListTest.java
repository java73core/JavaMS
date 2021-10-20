import org.junit.jupiter.api.*;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

class SortListTest {
    private List<Person> listPerson;
    private Map map;
    private Sorter sorter;
    private SortList sortList;

    @BeforeEach
    public void initList(){
       sortList = new SortList();
       map = new Sorter().getComparatorMap();
       listPerson = new InitList().getListPerson();
       sorter = new Sorter();
    }

    @RepeatedTest(10)
    void repeatedSortTest() {
        List<Object> keyList = new ArrayList<>(map.keySet());
        Collections.shuffle(keyList);
        String key = (String) keyList.get(0);
        assertEquals(listPerson.stream().sorted((Comparator<? super Person>) map.get(key)).collect(Collectors.toList()),
                sortList.sortList(listPerson, map, key));
    }
}