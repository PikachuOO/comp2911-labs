
public class Midfield implements RobotRole {
	
	private RoleType role;
	
	public Midfield() {
		this.role = RoleType.MIDFIELD;
	}
	
	@Override
	public RoleType getRoleType() {
		return role;
	}

}
