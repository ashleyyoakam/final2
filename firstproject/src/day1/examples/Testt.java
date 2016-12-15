package day1.examples;
import java.util.*;
public class Testt {

	public static void main(String[] args) throws Exception {
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Red");
		set.add("Yellow");
		set.add("Green");
		set.add("Blue");
		SortedSet temp = set.headSet("Purple");
		
		System.out.print(temp.first());
	}
}
