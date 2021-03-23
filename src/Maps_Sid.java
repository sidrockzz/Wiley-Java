import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Maps_Sid {
    public static void main(String [] args){
        TreeMap map = new TreeMap();
        map.put("Sid",new Double(11.1));
        map.put("Akash",new Double(12.1));
        map.put("Avinash",new Double(13.11));
        map.put("Luffy",new Double(14.11));
        map.put("Zoro",new Double(15.11));
        System.out.println(map);
        map.replace("Sid",new Double(99.99));
        System.out.println(map);
        map.put("Sid",new Double(22.3));
        System.out.println(map);
        map.put("Sanji","Sanji");
        map.put("Hey",null);
        //Cant add null key
        //Differet types of keys cant be added
        map.put("Rayleigh",new Integer(20));
        System.out.println(map);
        Object e = map.get("Sid");
        System.out.println(e);
        //Cannot use the enumeration
        System.out.println("Size of map is:- " + map.size());
        if (map.containsKey("Luffy")) {
            Object a = map.get("Luffy");
            System.out.println("value for key"
                    + " \"vishal\" is:- " + a);
        }
        TreeMap mp = new TreeMap();
        mp.put(new Integer(101),"AAA");
        mp.put(new Integer(102),"BBB");
        mp.put(new Integer(103),"CCC");
        mp.put(new Integer(104),"DDD");
        mp.put(new Integer(105),"EEE");
        System.out.println(mp);
        Set s = mp.keySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()){
            Integer k = (Integer) itr.next();
            System.out.println(k);
        }
    }
}
