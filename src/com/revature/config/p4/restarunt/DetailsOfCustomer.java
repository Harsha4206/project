package com.revature.config.p4.restarunt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DetailsOfCustomer {
	 public static void createCredentials() {
			Connection con=null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/PROJECT2","Harsha","Harsha@1020");
				System.out.println("------------------------------------------------------------------------");
				System.out.println("@@@@@@@@@@@@@@@@@@@      Welcome for Registration             @@@@@@@@@@@");
				System.out.println("                     PLEASE FILL THE FOLLOWING DETAILS                   ");
				System.out.println("-------------------------------------------------------------------------");
				String sql="INSERT INTO enterdata(Name,ID ,PassWord,MobileNumber) VALUES(?,?,?,?)";
				PreparedStatement mystmt=con.prepareStatement(sql);
				Scanner obj=new Scanner(System.in);
				System.out.print("Enter your Name: ");
				String name=obj.nextLine();
				System.out.print("Create your ID: ");
				String id=obj.nextLine();
				System.out.print("Create Your password: ");
				String password=obj.nextLine();
				System.out.print("Enter your Mobile Number: ");
				int number=obj.nextInt();
				mystmt.setString(1,name);
				mystmt.setString(2,id);
				mystmt.setString(3,password);
				mystmt.setInt(4,number);
				try {
			    mystmt.executeUpdate();
				System.out.println("Your are Suceesfully register Don't Share with any one!");}
				catch(Exception e) {System.out.println("this ID has already existed! \n please create new ID");}
			}//TryEnd
		  
			 catch(Exception e) {System.out.println("Error");}
			  finally {
				  try {
					  if(con!=null) {con.close();}
					  else {System.out.println("Connection failed");}}
				      catch(Exception e){System.out.println("Errorr");}
			}//finally

		}//createCredentialsEnd
	}

		


