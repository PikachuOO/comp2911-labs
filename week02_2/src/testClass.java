import java.util.GregorianCalendar;

/**
 * Created by ljcusack on 8/03/2016.
 */
public class testClass {
	public static void main(String args[]) {
		Employee e = new Employee("bob", 120);
		Employee e2 = e.clone();
		Employee e3 = e.clone();
		Employee e4 = new Employee("new bob", 130);
		
		GregorianCalendar gc = new GregorianCalendar();
		
		Manager m = new Manager("sue", 150, gc);
		Manager m2 = m.clone();
		Manager m3 = m.clone();
		Manager m4 = new Manager("new sue", 160, gc);

		System.out.println(e.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		System.out.println(e4.toString());
		System.out.println();
		
		System.out.println(m.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		System.out.println(m4.toString());
		System.out.println();
		
		System.out.println("\ntesting..");
		System.out.println("e.equals(e) (reflexive): " + e.equals(e));
		System.out.println("e2.equals(e2) (reflexive): " + e2.equals(e2));
		System.out.println("");
		
		System.out.println("e.equals(e2) (symmetric): " + e.equals(e2));
		System.out.println("e2.equals(e) (symmetric): " + e2.equals(e));
		System.out.println("");
		
		System.out.println("e.equals(e2): (transitive) " + e.equals(e2));
		System.out.println("e2.equals(e3): (transitive) " + e2.equals(e3));
		System.out.println("e.equals(e3): (transitive) " + e.equals(e3));
		System.out.println("");
		
		System.out.println("e.equals(e4): " + e.equals(e4));
		System.out.println("e2.equals(e4): " + e2.equals(e4));
		System.out.println("e4.equals(e): " + e4.equals(e));
		System.out.println("e4.equals(e2): " + e4.equals(e2));
		System.out.println("");
		
		System.out.println("e.equals(null): " + e.equals(null));
		System.out.println("e2.equals(null): " + e2.equals(null));
		System.out.println("e3.equals(null): " + e3.equals(null));
		System.out.println("e4.equals(null): " + e4.equals(null));
		System.out.println("");
		
		System.out.println("m.equals(m) (reflexive): " + m.equals(m));
		System.out.println("m2.equals(m2) (reflexive): " + m2.equals(m2));
		System.out.println("");
		
		System.out.println("m.equals(m2) (symmetric): " + m.equals(m2));
		System.out.println("m2.equals(m) (symmetric): " + m2.equals(m));
		System.out.println("");
		
		System.out.println("m.equals(m2) (transitive): " + m.equals(m2));
		System.out.println("m2.equals(m3) (transitive): " + m2.equals(m3));
		System.out.println("m.equals(m3) (transitive): " + m.equals(m3));
		System.out.println("");
		
		System.out.println("m.equals(m4): " + m.equals(m4));
		System.out.println("m2.equals(m4): " + m2.equals(m4));
		System.out.println("m4.equals(m): " + m4.equals(m));
		System.out.println("m4.equals(m2): " + m4.equals(m2));
		System.out.println("");
		
		System.out.println("m.equals(null): " + m.equals(null));
		System.out.println("m2.equals(null): " + m2.equals(null));
		System.out.println("m3.equals(null): " + m3.equals(null));
		System.out.println("m4.equals(null): " + m4.equals(null));
		System.out.println("");
		
		System.out.println("e.equals(m) (LST): " + e.equals(m));
		System.out.println("m.equals(e) (LST): " + m.equals(e));
		System.out.println("e4.equals(m): " + e4.equals(m));
		System.out.println("m.equals(e4): " + m.equals(e4));
	}
}
