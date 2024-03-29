package Day16;

import java.util.Map;
import java.util.NavigableMap;
//import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		//TreeMap does not contain null key but it contains many null value
		//SortedMap<String,String>obj=new TreeMap<>();
		NavigableMap<String,String>obj=new TreeMap<>();
		obj.put("Manthan", "Student");
		obj.put("Ram", "Doctor");
		obj.put("Priyanka", "Engineer");
		obj.put("Vaishanvi", null);
		System.out.println(obj);
		//to extract the pairs from map
		for(Map.Entry m:obj.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println(obj.firstEntry());
		System.out.println(obj.lastEntry());
		System.out.println(obj.lastKey());


	}

}