import static org.junit.Assert.*;

import org.junit.Test;

public class TestRobot {

	@Test
	public void test() {
		RobotRole defender = new Defender();
		RobotRole midfield = new Midfield();
		RobotRole striker = new Striker();
		
		Robot zero = new Robot(0, "GK", defender);

		Robot one = new Robot(1, "LB", defender);
		Robot two = new Robot(2, "CLB", defender);
		Robot three = new Robot(3, "CRB", defender);
		Robot four = new Robot(4, "RB", defender);
		
		Robot five = new Robot(5, "DM", midfield);
		Robot six = new Robot(6, "DM", midfield);
		Robot seven = new Robot(7, "LM", midfield);
		Robot eight = new Robot(8, "RM", midfield);
		
		Robot nine = new Robot(9, "ST", striker);
		Robot ten = new Robot(10, "ST", striker);
		
		assertEquals(zero.getRole(), RoleType.DEFENDER);
		assertEquals(one.getRole(), RoleType.DEFENDER);
		assertEquals(two.getRole(), RoleType.DEFENDER);
		assertEquals(three.getRole(), RoleType.DEFENDER);
		assertEquals(four.getRole(), RoleType.DEFENDER);

		assertEquals(five.getRole(), RoleType.MIDFIELD);
		assertEquals(six.getRole(), RoleType.MIDFIELD);
		assertEquals(seven.getRole(), RoleType.MIDFIELD);
		assertEquals(eight.getRole(), RoleType.MIDFIELD);

		assertEquals(nine.getRole(), RoleType.STRIKER);
		assertEquals(ten.getRole(), RoleType.STRIKER);
	}

}
