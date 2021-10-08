import org.junit.jupiter.api.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SortListTest {
    private List<Person> listPerson;
    private Person person;

    @BeforeEach
    public void initList(){
       listPerson = new InitList().getListPerson();
    }

    @Test
    @Order(1)
    void sortByYearAscend() {
        assertEquals(listPerson.stream().sorted(Comparator.comparingInt(Person::getBirthYear)).collect(Collectors.toList()), new SortList(listPerson).sortByYearAscend());
    }

    @Test
    @Order(2)
    void sortByYearDescend() {
        assertEquals(listPerson.stream().sorted(Comparator.comparingInt(Person::getBirthYear).reversed()).collect(Collectors.toList()), new SortList(listPerson).sortByYearDescend());
    }

    @Test
    @Order(3)
    void sortIdAscend() {
        assertEquals(listPerson.stream().sorted(Comparator.comparingInt(Person::getId)).collect(Collectors.toList()), new SortList(listPerson).sortIdAscend());
    }

    @Test
    @Order(4)
    void sortIdDescend() {
        assertEquals(listPerson.stream().sorted(Comparator.comparingInt(Person::getId).reversed()).collect(Collectors.toList()), new SortList(listPerson).sortIdDescend());
    }

    @Test
    @Order(5)
    void sortNameAscend() {
        assertEquals(listPerson.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList()), new SortList(listPerson).sortNameAscend());
    }

    @Test
    @Order(6)
    void sortNameDescend() {
        assertEquals(listPerson.stream().sorted(Comparator.comparing(Person::getName).reversed()).collect(Collectors.toList()), new SortList(listPerson).sortNameDescend());
    }

    @Test
    @Order(7)
    void sortSurnameAscend() {
        assertEquals(listPerson.stream().sorted(Comparator.comparing(Person::getSurname)).collect(Collectors.toList()), new SortList(listPerson).sortSurnameAscend());
    }

    @Test
    @Order(8)
    void sortSurnameDescend() {
        assertEquals(listPerson.stream().sorted(Comparator.comparing(Person::getSurname).reversed()).collect(Collectors.toList()), new SortList(listPerson).sortSurnameDescend());
    }

    @Test
    @Order(9)
    void sortBySexF() {
        assertEquals(listPerson.stream().sorted(Comparator.comparing(Person::getSex)).collect(Collectors.toList()), new SortList(listPerson).sortBySexF());
    }

    @Test
    @Order(10)
    void sortBySexM() {
        assertEquals(listPerson.stream().sorted(Comparator.comparing(Person::getSex).reversed()).collect(Collectors.toList()), new SortList(listPerson).sortBySexM());
    }
}