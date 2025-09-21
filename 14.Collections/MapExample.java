import java.util.HashMap;
import java.util.Map;


public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> m = new HashMap<>();
        m.put(1,"a"); m.put(2,"b"); m.put(3,"c"); m.put(4,"d");
        System.out.println(m);

        m.put(4,"s");
        System.out.println(m);

        System.out.println(m.get(1));
        
        m.remove(4);
        System.out.println(m);

        System.out.println(m.containsKey(1));

        System.out.println(m.containsValue("c"));

        System.out.println(m.size());

        System.out.println(m.keySet());

        System.out.println(m.values());

        System.out.println(m.entrySet());


        //access using Loop
        System.out.println();
        System.out.println("Access Using Loop");
        for(Integer key:m.keySet()) System.out.println(key + "-->"+ m.get(key));

        //Access using Entry 

        System.out.println();
        System.out.println("Access Using EntrySet");
        for(Map.Entry<Integer,String> entry: m.entrySet()) System.out.println(entry.getKey()+"-->"+entry.getValue());

    }
}
