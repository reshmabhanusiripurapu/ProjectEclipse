package hashmap;
import java.util.LinkedList;

public class Link {

	public static void main(String[] args) {
	LinkedList<String>choco=new LinkedList<String>();
	choco.add("dairymilk");
	choco.add("milkybar");
	choco.add("5star");
	for(int i=0;i<choco.size();i++) {
		System.out.println(choco.get(i));
	}
	for(String value:choco) {
		System.out.println(value);
	}

	}

}
