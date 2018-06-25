import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLIstExample {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		ArrayList<Comparable> alist = new ArrayList<Comparable>();
		alist.add("Cerosh");
		alist.add(38);
		alist.add(null);
		alist.add("Cerosh");
		System.out.println("Size of Array List is: " + alist.size());
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(i + " Element in Array List is: " + alist.get(i));
		}
		for (Object obj : alist) {
			System.out.println(" Element in Array List through Enhanced for loop: " + obj);
		}
		Iterator<Comparable> itr = alist.iterator();
		while (itr.hasNext()) {
			System.out.println("Getting value through Iterator: " + itr.next());
		}

	}

}
