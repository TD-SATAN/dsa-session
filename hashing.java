// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String>map = new HashMap<>();
        
        map.put(1,"Abi");
        map.put(2,"Madhu");
        map.put(3,"Kesav");
        
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.getOrDefault(4,"Not Found"));
        
        map.remove(2);
        map.remove(3);
        
        for(Integer key : map.keySet())
        {
            System.out.println(key+""+map.get(key));
        }
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Abi"));
        
        System.out.println(map.size());
        System.out.println(map.isEmpty());
    }
}
