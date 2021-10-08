import org.junit.jupiter.api.*;
import java.util.List;


class FilterListTest {
    private List<Person> listPerson;
    private Person person;

    @BeforeEach
    public void initList(){
        listPerson = new InitList().getListPerson();
    }

    @Test
    void filterListTest() {

    }
}