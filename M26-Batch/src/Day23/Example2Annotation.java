package Day23;

import java.util.ArrayList;

public class Example2Annotation {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList a=new ArrayList<>();
		a.add(3);
		a.add("Manthan");
		System.out.println(a);


	}

}
