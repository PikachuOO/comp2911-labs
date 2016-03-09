import java.util.GregorianCalendar;

/**
 * Created by ljcusack on 8/03/2016.
 */
public class testClass {
	public static void main(String args[]) {
		Employee e = new Employee("bob", 120);
		Employee e2 = e.clone();
		Employee e3 = new Employee("new bob", 130);
		
		GregorianCalendar gc = new GregorianCalendar();
		
		Manager m = new Manager("sue", 150, gc);
		Manager m2 = m.clone();
		Manager m3 = new Manager("new sue", 160, gc);

		System.out.println(e.toString());
		System.out.println(m.toString());
		
		System.out.println(e2.toString());
		System.out.println(m2.toString());
		
		System.out.println(e3.toString());
		System.out.println(m3.toString());
		
		System.out.println("\ntesting..");
		System.out.println("e.equals(e): " + e.equals(e));
		System.out.println("e2.equals(e2): " + e2.equals(e2));
		System.out.println("e.equals(e2): " + e.equals(e2));
		System.out.println("e2.equals(e): " + e2.equals(e));
		System.out.println("");
		
		System.out.println("e.equals(e3): " + e.equals(e3));
		System.out.println("e2.equals(e3): " + e2.equals(e3));
		System.out.println("e3.equals(e): " + e3.equals(e));
		System.out.println("e3.equals(e2): " + e3.equals(e2));
		System.out.println("");
		
		System.out.println("m.equals(m): " + m.equals(m));
		System.out.println("m2.equals(m2): " + m2.equals(m2));
		System.out.println("m.equals(m2): " + m.equals(m2));
		System.out.println("m2.equals(m): " + m2.equals(m));
		System.out.println("");
		
		System.out.println("m.equals(m3): " + m.equals(m3));
		System.out.println("m2.equals(m3): " + m2.equals(m3));
		System.out.println("m3.equals(m): " + m3.equals(m));
		System.out.println("m3.equals(m2): " + m3.equals(m2));
		System.out.println("");
	}
}
