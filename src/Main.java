import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> states = new TreeMap<Integer, String>();
        states.put(10, "Germany");
        states.put(2, "Spain");
        states.put(14, "France");
        states.put(3, "Italy");

        String first = states.get(2);
        System.out.println(first); // Spain

        for (Map.Entry<Integer, String> item : states.entrySet()){
            System.out.printf("Key: %d Value: %s \n", item.getKey(), item.getValue());
        }
        // Key: 2 Value: Spain
        // Key: 3 Value: Italy
        // Key: 10 Value: Germany
        // Key: 14 Value: France

        Set<Integer> keys = states.keySet();
        System.out.println(keys); // [2, 3, 10, 14]

        Collection<String> values = states.values();
        System.out.println(values); // [Spain, Italy, Germany, France]

        Map<Integer, String> afterMap = states.tailMap(4);
        System.out.println(afterMap); // {10=Germany, 14=France}

        Map<Integer, String> beforeMap = states.headMap(10);
        System.out.println(beforeMap); // {2=Spain, 3=Italy}
        
        Map.Entry<Integer, String> lastItem = states.lastEntry();
        System.out.println(lastItem); // 14=France
        System.out.printf("Last item has key %d value %s \n", lastItem.getKey(), lastItem.getValue());
        // Last item has key 14 value France

        System.out.println();
        Map<String, Person> people = new TreeMap<String, Person>();
        people.put("1240i54", new Person("Tom"));
        people.put("1564i55", new Person("Bill"));
        people.put("4540i56", new Person("Nick"));

        for (Map.Entry<String, Person> item : people.entrySet()){
            System.out.printf("Key: %s Value: %s \n", item.getKey(), item.getValue().getName());
        }
        // Key: 1240i54 Value: Tom
        // Key: 1564i55 Value: Bill
        // Key: 4540i56 Value: Nick
    }
}