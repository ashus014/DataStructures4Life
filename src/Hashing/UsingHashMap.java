package Hashing;

import java.util.HashMap;
import java.util.Map;

public class UsingHashMap {

    public static void main(String[] args) {

        HashMap<String, Integer> m = new HashMap<>();
        m.put("gfg", 10);
        m.put("ide", 15);
        m.put("courses", 20);
        System.out.println(m);
        System.out.println(m.size());
        for (Map.Entry<String, Integer> e : m.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

        //containsKey()
        if(m.containsKey("ide")){
            System.out.println("Yes");
        }

        //remove key from hashMap ,also return the value corresponding to that key
        m.remove("ide");

        System.out.println(m);

        //containsValue()
        if(m.containsValue(20))
            System.out.println("YES");
    }
}
