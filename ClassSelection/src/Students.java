
public class Students {

	private String firstName;
	private String lastName;
	private int studentId;
	private boolean preReq;
	
	public Students(String firstName, String lastName, int studentId, boolean preReq ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentId = studentId;
		this.preReq = preReq;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public boolean isPreReq() {
		return preReq;
	}

	public void setPreReq(boolean preReq) {
		this.preReq = preReq;
	}
}
