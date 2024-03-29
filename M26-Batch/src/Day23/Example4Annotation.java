package Day23;

import java.lang.reflect.Method;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
	 

	int print();
	
}

class Parent2
{
	 @MyAnnotation(print=25)
	 public void display()
	 {
		 System.out.println("Welcome to Annotations");
	 }
}
public class Example4Annotation {

	public static void main(String[] args) throws Exception{
		 Parent2 p=new Parent2();
		 Method m=p.getClass().getMethod("display");
		 MyAnnotation a=m.getAnnotation(MyAnnotation.class);
		 System.out.println(a.print());
	}

}

