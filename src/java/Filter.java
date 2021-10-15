import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Filter {
    private List<Person> listPerson = new InitList().getListPerson();
    private List<Person> listParametr = new ArrayList<>();

    private Integer randomBirthYearGenerator() throws Exception {
        Integer minValue = listPerson.stream().min(Comparator.comparingInt(Person::getBirthYear)).map(list -> list.getBirthYear()).orElseThrow(() -> new Exception());
        Integer maxValue = listPerson.stream().max(Comparator.comparingInt(Person::getBirthYear)).map(list -> list.getBirthYear()).orElseThrow(() -> new Exception());
        return  minValue + (int) (Math.random() * maxValue);
    }
    private Integer randomIdGenerator() throws Exception {
        Integer minValue = listPerson.stream().min(Comparator.comparingInt(Person::getId)).map(list -> list.getId()).orElseThrow(() -> new Exception());
        Integer maxValue = listPerson.stream().max(Comparator.comparingInt(Person::getId)).map(list -> list.getId()).orElseThrow(() -> new Exception());
        return  minValue + (int) (Math.random() * maxValue);
    }

    private String randomNameGenerator() throws Exception {
        List<String> name = listPerson.stream().map(Person::getName).collect(Collectors.toList());
        return  name.stream()
                .sorted((o1, o2) -> ThreadLocalRandom.current().nextInt(-1, 2))
                .findAny()
                .get();
    }

    private String randomSurnameGenerator() throws Exception {
        List<String> surname = listPerson.stream().map(Person::getSurname).collect(Collectors.toList());
        return  surname.stream()
                .sorted((o1, o2) -> ThreadLocalRandom.current().nextInt(-1, 2))
                .findAny()
                .get();
    }

    public List<Person> createListParameter () throws Exception {
        listParametr.add(new Person(randomIdGenerator(), null, null, null, randomBirthYearGenerator()));
        listParametr.add(new Person(null, randomNameGenerator(), null, null, randomBirthYearGenerator()));
        listParametr.add(new Person(null, randomNameGenerator(), randomSurnameGenerator(), null, null));
        listParametr.add(new Person(null, null, randomSurnameGenerator(), null, randomBirthYearGenerator()));
        listParametr.add(new Person(null, null, null, Sex.F, randomBirthYearGenerator()));
        listParametr.add(new Person(null, randomNameGenerator(), null, Sex.M, null));
        return listParametr;
    }


}
