/**
 * Created by ljcusack on 8/03/2016.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Manager extends Employee {
    private Calendar calendar;
    private Employee employee;
//    calendar = new Calendar();

    public Manager(String name, int salary, GregorianCalendar date) {
//    employee = super(name, salary);
        super(name, salary);
        this.calendar = new GregorianCalendar();
    }
}
