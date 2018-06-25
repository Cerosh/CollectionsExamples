import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapExample {
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {
		HashMap<String, Comparable> hmap = new HashMap<String, Comparable>();
		hmap.put("Name", "Cerosh");
		hmap.put("Age", 39);
		hmap.put("Header", "");
		System.out.println("Map Elements: " + hmap);
		System.out.println("Age Value is: " + hmap.get("Age"));
		System.out.println("Different headers are: " + hmap.keySet());
		System.out.println("Various values are :" + hmap.values());

		ArrayList<HashMap<String, Comparable>> alist = new ArrayList<HashMap<String, Comparable>>();
		alist.add(hmap);
		Iterator<HashMap<String, Comparable>> itr = alist.iterator();
		while (itr.hasNext()) {
			System.out.println("Value Pulled out through While" + itr.next());
		}
		for (Object obj : alist) {
			System.out.println("Value pulled out through Enhanced for loop: " + obj);
		}
		for (String key : hmap.keySet()) {
			System.out.println("Values pulled out through looping with key: "+ hmap.get(key));
		}
		for (Comparable value : hmap.values()) {
			System.out.println("Values pulled out through looping through values: "+value);
		}
		for(Entry<String, Comparable> pair : hmap.entrySet()) {
			System.out.println("Pulling Key: " + pair.getKey() + " Pulling value: " + pair.getValue());
		}
	}

}
