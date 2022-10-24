package student_manage1;

public class Student1 {
	
	private int studentID;
	private String studentName;
	private String studentPhone;
	private String studentCity;
	private String studentemail;
	private String studentgender;
	
	
	public int getStudentID() {
		return studentID;
	}
    public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

    public String getStudentName() {
		return studentName;
	}
    public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


    public String getStudentPhone() {
		return studentPhone;
	}
    public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

    public String getStudentCity() {
		return studentCity;
	}

    public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public String getStudentemail() {
		return studentemail;
	}
	
	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}
	
	public String getStudentgender() {
		return studentgender;
	}
	
	public void setStudentgender(String studentgender) {
		this.studentgender = studentgender;
	}
	

	public Student1(int studentID, String studentName, String studentPhone, String studentCity,String studentemail,String studentgender) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
		this.studentemail = studentemail;
		this.studentgender = studentgender;
	}
    public Student1(String studentName, String studentPhone, String studentCity,String studentemail ,String studentgender) {
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
		this.studentemail = studentemail;
		this.studentgender= studentgender;
	}




	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", studentCity=" + studentCity + ",studentemail=" + studentemail +",studentgender=" + studentgender +"]";
	}
}


