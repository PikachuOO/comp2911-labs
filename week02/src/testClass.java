import java.util.GregorianCalendar;

/**
 * Created by ljcusack on 8/03/2016.
 */
public class testClass {
	public static void main(String args[]) {
		Employee e = new Employee("bob", 120);
		
		GregorianCalendar gc = new GregorianCalendar();
		Manager m = new Manager("sue", 150, gc);
		

		System.out.println(e.toString());
		System.out.println(m.toString());
		
		Employee e2 = e.clone();
		Manager m2 = m.clone();
		
		System.out.println(e.toString());
		System.out.println(m.toString());
		
		System.out.println("\ntesting..");
		System.out.println("e.equals(e): " + e.equals(e));
		System.out.println("e2.equals(e2): " + e2.equals(e2));
		System.out.println("e.equals(e2): " + e.equals(e2));
		System.out.println("e2.equals(e): " + e2.equals(e));
		System.out.println("");
		System.out.println("m.equals(m): " + m.equals(m));
		System.out.println("m2.equals(m2): " + m2.equals(m2));
		System.out.println("m.equals(m2): " + m.equals(m2));
		System.out.println("m2.equals(m): " + m2.equals(m));
		
	}
}
