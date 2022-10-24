package student_manage1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import student_manage1.Student1;
import student_manage1.cp1;


public class StudentOp1 {
	private static String toUpdate;


	public static boolean insertStudentRecordToDB(Student1 st) {
		boolean f = false;
		try {
			Connection con = cp1.createc();
			String query = "insert into Student1(sname,sphone,scity,semail,sgender) values(?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			//set the value of parameters
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			pstmt.setString(4, st.getStudentemail());
			pstmt.setString(5, st.getStudentgender());
		    
			
			//execute..
			pstmt.executeUpdate();
			
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}


	public static boolean deleteStudentRecordFromDB(int userID) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = cp1.createc();
			String query = "delete from Student1 where sid=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			//set the value of parameters
			pstmt.setInt(1, userID);
			
			//execute..
			pstmt.executeUpdate();
			
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}


	public static void showAllStudentRecords() {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = cp1.createc();
			String query = "select * from Student1";
			Statement st = con.createStatement();
			ResultSet set = st.executeQuery(query);
			
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString(4);
				String email = set.getString(5);
				String gender = set.getString(6);
				
				
				
				System.out.println("Student ID: " + id + " \n Student Name: " + name + " \nStudent Phone: " + phone + " \nStudent city: " + city+ " \nStudent email: " + email+ " \nStudent gender: " + gender);
				System.out.println("----------------------------------------------");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}


	public static boolean updateStudentRecord(int val,String toUpdate,int id,Student1 st) {
		// TODO Auto-generated method stub
		boolean f = false;
		
		try {
			  Connection con = cp1.createc();
			 if(val == 1) {
					//Update Name
					
						String query = "update Student1 set sname=? where sid=?";
						PreparedStatement pstmt = con.prepareStatement(query);
						pstmt.setString(1, toUpdate);
						pstmt.setInt(2, id);
						
						//execute..
						pstmt.executeUpdate();
						f = true;
				}
				else if(val == 2) {
					//Update Phone
					String query = "update Student1 set sphone=? where sid=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, id);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
				else if(val == 3) {
					//Update City
					String query = "update Student1 set scity=? where sid=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, id);
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
					
				else if(val == 3) {
					//Update email
					String query = "update Student1 set semail=? where sid=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1,toUpdate);
					pstmt.setInt(2, id);
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
					
				else if(val == 3) {
					//Update gender
					String query = "update Student1 set sgender=? where sid=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, id);	
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
				else {
					
				}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return f;
	}


	
}

