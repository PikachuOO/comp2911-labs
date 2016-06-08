
public class Robot {

	private String name;
	private int id;
	private RobotRole role;
	
	public Robot(int id, String name, RobotRole role) {
		this.id = id;
		this.name = name;
		this.role = role;
	}
	
	public RoleType getRole() {
		return role.getRoleType();
	}
	
	public void setRole(RobotRole role) {
		this.role = role;
	}
}
