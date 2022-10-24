package student_manage1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import student_manage1.Student1;
import student_manage1.StudentOp1;


public class Main1{


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Hello User Please Enter Your Name: \n");
		String user = br.readLine();
		System.out.println("Welcome To Student Management App." + user);
		
		
		
		while(true) {
			System.out.println("PRESS 1 to ADD student");
			System.out.println("PRESS 2 to DELETE student");
			System.out.println("PRESS 3 to DISPLAY student");
			System.out.println("PRESS 4 to UPDATE student");
			System.out.println("PRESS 5 to EXIT App");
			
			int c = Integer.parseInt(br.readLine());
			
			if(c == 1) {
				//Add student
				
				System.out.println("Enter User Name: ");
				String name = br.readLine();
				System.out.println("Enter User Phone: ");
				String phone = br.readLine();
				System.out.println("Enter User City: ");
				String city = br.readLine();
				System.out.println("Enter User Email: ");
				String email = br.readLine();
				System.out.println("Enter User Gender: ");
				String gender = br.readLine();
				
				
				//create student object
				Student1 st = new Student1(name,phone,city,email,gender);
				boolean ans = StudentOp1.insertStudentRecordToDB(st);
				if(ans) {
					System.out.println("Student record Inserted Successfully...");
					System.out.println("Student Record:" + st);
				}else {
					System.out.println("Some error Occured While Inserting...Please try Again!");
				}
				
			}
			else if(c == 2) {
				//Delete student
				System.out.println("Enter Student ID To Delete: ");
				int userID = Integer.parseInt(br.readLine());
				boolean f = StudentOp1.deleteStudentRecordFromDB(userID);
				if(f) {
					System.out.println("Student Of ID " + userID + " Record Deleted... ");
				}else {
					System.out.println("Something Went Wrong.. Please try Again!");
				}
			}
			else if(c == 3) {
				//Display student
				StudentOp1.showAllStudentRecords();
			}
			else if(c == 4) {
				//Update student
				System.out.println("PRESS 1 to UPDATE name");
				System.out.println("PRESS 2 to UPDATE phone");
				System.out.println("PRESS 3 to UPDATE city");
				System.out.println("PRESS 4 to UPDATE email");
				System.out.println("PRESS 5 to UPDATE gender");
				
				
				int val = Integer.parseInt(br.readLine());
				if(val == 1) {
					//Update Name
					System.out.println("Enter name to UPDATE...");
					String name = br.readLine();
					System.out.println("Enter ID to identify student!");
					int id = Integer.parseInt(br.readLine());
					Student1 st = new Student1();
					st.setStudentName(name);
					boolean f = StudentOp1.updateStudentRecord(val,name,id,st);
					if(f) {
						System.out.println("Student Name Updated Successfully...");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else if(val == 2) {
					//Update Phone
					System.out.println("Enter phone to UPDATE...");
					String phone = br.readLine();
					System.out.println("Enter ID to identify student!");
					int id = Integer.parseInt(br.readLine());
					Student1 st = new Student1();
					st.setStudentPhone(phone);
					boolean f = StudentOp1.updateStudentRecord(val,phone,id,st);
					if(f) {
						System.out.println("Student Phone Updated Successfully...");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else if(val == 3) {
					//Update city
					System.out.println("Enter city to UPDATE...");
					String city = br.readLine();
					System.out.println("Enter ID to identify student!");
					int id = Integer.parseInt(br.readLine());
					Student1 st = new Student1();
					st.setStudentCity(city);
					boolean f = StudentOp1.updateStudentRecord(val,city,id,st);
					if(f) {
						System.out.println("Student City Updated Successfully...");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else if(val == 4) {
					//Update email
					System.out.println("Enter email to UPDATE...");
					String email = br.readLine();
					System.out.println("Enter ID to identify student!");
					int id = Integer.parseInt(br.readLine());
					Student1 st = new Student1();
					st.setStudentemail(email);
					boolean f = StudentOp1.updateStudentRecord(val,email,id,st);
					if(f) {
						System.out.println("Student email Updated Successfully...");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				else if(val == 5) {
					//Update gender
					System.out.println("Enter gender to UPDATE...");
					String gender = br.readLine();
					System.out.println("Enter ID to identify student!");
					int id = Integer.parseInt(br.readLine());
					Student1 st = new Student1();
					st.setStudentemail(gender);
					boolean f = StudentOp1.updateStudentRecord(val,gender,id,st);
					if(f) {
						System.out.println("Student gender Updated Successfully...");
					}else {
						System.out.println("Something Went Wrong Please try Again!");
					}
				}
				
				else {
					System.out.println("Hey You have not updated Anything... Please choose option Correctly!");
				}
				
			}
			else if(c == 5) {
				//Exit
				
				System.out.println("Thank You For Using Application...If You Enjoyed, Please Experience It Again!" + user);
				break;
			}
			else {
				
			}
			
		}
	}
	


}


