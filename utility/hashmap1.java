package utility;

import java.util.HashMap;
import java.util.Map;

public class hashmap1 {
    public static void main(String args[])
    {

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("R",20);
        hm.put("M",1);
        hm.put("S", 3);

        System.out.println(hm.get("R"));

        for(Map.Entry<String,Integer> val:hm.entrySet())
        {
            System.out.println(val.getKey()+ " "+val.getValue());
        }
    }
}
