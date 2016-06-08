
public class Striker implements RobotRole {

	private RoleType role;
	
	public Striker() {
		this.role = RoleType.STRIKER;
	}
	
	@Override
	public RoleType getRoleType() {
		return role;
	}
}
