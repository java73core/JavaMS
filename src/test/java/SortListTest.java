import org.junit.jupiter.api.*;
import java.util.*;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.*;

class SortListTest {
    private List<Person> listPerson;
    private Map map;
    private Sorter sorter;
    private String value;
    private SortList sortList;
   // protected static Random generator = new Random();


    @BeforeEach
    public void initList(){
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