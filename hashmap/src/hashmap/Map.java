package hashmap;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.TreeMap;


public class Map {

	public static void main(String[] args) {
	HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
	LinkedHashMap<Integer,String>Linkedhashmap=new LinkedHashMap<Integer,String>();
	TreeMap<Integer,String>treemap=new TreeMap<Integer,String>();
    testmap(hashMap);
	}
	public static void testmap(HashMap<Integer,String> map) {
		map.put(5,"bhanu");
		map.put(1,"bhanus");
		map.put(3,"pavan");
		for(Integer key:map.keySet()) {
			String value=map.get(key);
			System.out.println(key+":"+value);
		}
	}

}
