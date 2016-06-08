
public class Defender implements RobotRole {

	private RoleType role;
	
	public Defender() {
		this.role = RoleType.DEFENDER;
	}
	
	@Override
	public RoleType getRoleType() {
		return role;
	}
}
