import org.junit.jupiter.api.*;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.Assert.*;

class FilterListTest {
    private List<Person> listPerson;
    private List<Person> resultList;
    private List<Person> expectedList;
    private List<Person> listParameter;
    private Person person;
    private int index;

    @BeforeEach
    public void initList() throws Exception {
        listPerson = new InitList().getListPerson();
        listParameter = new Filter().createListParameter();
        int size = listParameter.size();
        index = (int) Math.random() * ++size;
    }

    @RepeatedTest(10)
    void repeatedTest() throws Exception {
        person = listParameter.get(index);
        resultList = new FilterList().filterList(listPerson, person);
        expectedList = listPerson.stream().filter(list -> list.equals(person)).collect(Collectors.toList());
        assertEquals(resultList,expectedList);
    }
}