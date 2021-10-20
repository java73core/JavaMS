import java.util.*;

public class Sorter {
       private Map<String, Comparator> comparatorMap = new HashMap<String, Comparator>();

       private void  createMapOfComparator() {
           comparatorMap.put("sortByYearDescend", new Comparator<Person>() {
               @Override
               public int compare(Person o1, Person o2) {
                   return o2.getBirthYear() - o1.getBirthYear();
               }
           });
           comparatorMap.put("sortByYearAscend", new Comparator<Person>() {
               @Override
               public int compare(Person o1, Person o2) {
                   return o1.getBirthYear() - o2.getBirthYear();
               }
           });
           comparatorMap.put("sortIdAscend()", new Comparator<Person>() {
               @Override
               public int compare(Person o1, Person o2) {
                   return o1.getId() - o2.getId();
               }
           });
           comparatorMap.put("sortIdDescend()", new Comparator<Person>() {
               @Override
               public int compare(Person o1, Person o2) {
                   return o2.getId() - o1.getId();
               }
           });
           comparatorMap.put("sortNameAscend()", new Comparator<Person>() {
               @Override
               public int compare(Person o1, Person o2) {
                   return o1.getName().compareTo(o2.getName());
               }
           });
           comparatorMap.put("sortNameDescend()", new Comparator<Person>() {
               @Override
               public int compare(Person o1, Person o2) {
                   return o2.getName().compareTo(o1.getName());
               }
           });
           comparatorMap.put("sortSurnameAscend()", new Comparator<Person>() {
               @Override
               public int compare(Person o1, Person o2) {
                   return o1.getSurname().compareTo(o2.getSurname());
               }
           });
           comparatorMap.put("sortSurnameDescend()", new Comparator<Person>() {
               @Override
               public int compare(Person o1, Person o2) {
                   return o2.getSurname().compareTo(o1.getSurname());
               }
           });
           comparatorMap.put("sortBySexF()", new Comparator<Person>() {
               @Override
               public int compare(Person o1, Person o2) {
                   return o1.getSex().compareTo(o2.getSex());
               }
           });
           comparatorMap.put("sortBySexM()", new Comparator<Person>() {
               @Override
               public int compare(Person o1, Person o2) {
                   return o2.getSex().compareTo(o1.getSex());
               }
           });
       }

    public Map<String, Comparator> getComparatorMap() {
        return comparatorMap;
    }
}
