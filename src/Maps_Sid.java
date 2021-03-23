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
    }
}
