package hashmap;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
	public static void main(String[] args) {
		Set<Integer>numb=new TreeSet<Integer>();
		numb.add(20);
		numb.add(15);
		numb.add(52);
		System.out.println(numb);
		for(Integer val:numb) {
			System.out.println(val);
		}
	}

}
