import java.util.Calendar;
import java.util.GregorianCalendar;

// "extends Object" implicitly
public class Manager extends Employee {

	private Calendar hireDate;
	
//	public Object clone() {
//		return Manager()
//	}
	
	public Manager(String n, int s) {
		super(n, s);
		hireDate = new GregorianCalendar();
	}
	
	public Manager(String n, int s, Calendar hd) {
		super(n, s);
		hireDate = hd;
	}
	
	public void setHireDate(Calendar hd()) {
		hireDate = hd;
	}
	
	public Object clone() {
		Manager mClone = (Manager) super.clone();
		mClone.setHireDate(hireDate.clone());
		reurn mClone;
	}
	
}

// shallow copy
// deep copy
// 		-- deep copies recursively, of objects within objects
// try catch finally
// 		-- finally runs if error occurred or not regardless
