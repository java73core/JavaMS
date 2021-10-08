import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;


class FilterListTest {
    private List<Person> listPerson;
    private List<Person> firstList;
    private List<Person> secondList;
    private Person person;

    @BeforeEach
    public void initList(){
        listPerson = new InitList().getListPerson();
        firstList = new ArrayList<>();
        secondList = new ArrayList<>();
    }

    @Test
    @Order(1)
    void filterListTestSurname() {
       FilterList filterList = new FilterList(listPerson);
       firstList = filterList.filterList(null, null, "Ivanov", null, null);
       secondList = listPerson.stream().filter(list -> list.getSurname().equals("Ivanov")).collect(Collectors.toList());
       assertEquals(firstList,secondList);
   }

    @Test
    @Order(2)
    void filterListTestName() {
        FilterList filterList = new FilterList(listPerson);
        firstList = filterList.filterList(null, "Anton", null, null, null);
        secondList = listPerson.stream().filter(list -> list.getName().equals("Anton")).collect(Collectors.toList());
        assertEquals(firstList,secondList);
    }

    @Test
    @Order(3)
    void filterListTestId() {
        FilterList filterList = new FilterList(listPerson);
        firstList = filterList.filterList(115, null, null, null, null);
        secondList = listPerson.stream().filter(list -> list.getId().equals(115)).collect(Collectors.toList());
        assertEquals(firstList,secondList);
    }

    @Test
    @Order(4)
    void filterListTestYearBirth() {
        FilterList filterList = new FilterList(listPerson);
        firstList = filterList.filterList(null, null, null, null, 1986);
        secondList = listPerson.stream().filter(list -> list.getBirthYear().equals(1986)).collect(Collectors.toList());
        assertEquals(firstList,secondList);
    }

    @Test
    @Order(5)
    void filterListTestSexF() {
        FilterList filterList = new FilterList(listPerson);
        firstList = filterList.filterList(null, null, null, Sex.F, null);
        secondList = listPerson.stream().filter(list -> list.getSex().equals(Sex.F)).collect(Collectors.toList());
        assertEquals(firstList,secondList);
    }

    @Test
    @Order(6)
    void filterListTestNameSexF() {
        FilterList filterList = new FilterList(listPerson);
        firstList = filterList.filterList(null, "Olga", null, Sex.F, null);
        secondList = listPerson.stream()
                .filter(list -> (list.getSex().equals(Sex.F)) || list.getName().equals("Olga"))
                .collect(Collectors.toList());
        assertEquals(firstList,secondList);
    }

    @Test
    @Order(7)
    void filterListTestSurnameName() {
        FilterList filterList = new FilterList(listPerson);
        firstList = filterList.filterList(null, "Olga", "Zakharova", null, null);
        secondList = listPerson.stream()
                .filter(list -> (list.getSurname().equals("Zakharova") || list.getName().equals("Olga")))
                .collect(Collectors.toList());
        assertEquals(firstList,secondList);
    }

    @Test
    @Order(8)
    void filterListTestSurnameYearBirth() {
        FilterList filterList = new FilterList(listPerson);
        firstList = filterList.filterList(null, null, "Mironov", null, 1986);
        secondList = listPerson.stream()
                .filter(list -> (list.getSurname().equals("Mironov") || list.getBirthYear().equals(1986)))
                .collect(Collectors.toList());
        assertEquals(firstList,secondList);
    }

    @Test
    @Order(9)
    void filterListTestIdYearBirth() {
        FilterList filterList = new FilterList(listPerson);
        firstList = filterList.filterList(113, null, null, null, 1986);
        secondList = listPerson.stream()
                .filter(list -> (list.getId().equals(113) || list.getBirthYear().equals(1986)))
                .collect(Collectors.toList());
        assertEquals(firstList,secondList);
    }

    @Test
    @Order(10)
    void filterListTestIdSurnameYearBirth() {
        FilterList filterList = new FilterList(listPerson);
        firstList = filterList.filterList(113, null, "Slepov", null, 1986);
        secondList = listPerson.stream()
                .filter(list -> (list.getId().equals(113) || list.getBirthYear().equals(1986) || list.getSurname().equals("Slepov")))
                .collect(Collectors.toList());
        assertEquals(firstList,secondList);
    }
}