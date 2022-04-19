
package com.revature.config.p4.restarunt;
import java.sql.*;
import java.util.Scanner;
public class JdbcConnection {
	public static void main(String[] args) throws Exception{
		    createCredentials();
	        selectRoom();
		}	
	public static  void selectRoom(){
		Connection con=null;
		try {
		con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/PROJECT2","root","Harsha@1020");
		String sql="INSERT INTO Typeofrooms(ID,TYPEOFROOM,Roomcost,NUMBEROFDAYS,TOTALCOST)VALUES(?,?,?,?,?)";
		PreparedStatement mystmt = con.prepareStatement(sql);
		Scanner sc =new Scanner(System.in);
		System.out.println("******** WELCOME FOR BOOKING PROCESS   ********");
		System.out.println("                       PLEASE VERIFY YOUR ID:                                 ");
		System.out.print("Enter  Your ID: ");
		String id=sc.next();
     	System.out.println("Your ID is verified: ");
     	System.out.println("---------------------------------------------------------------------------------------------------------------------");
     	System.out.println(" ######$$$$$$$$$$$$$$$              WElCOME FOR ROOM SELECTION                   $$$$$$$$$$$$$$$$$####################");
     	System.out.println("\n                           press 1 for NormalRomm    perday-1000     \n                             (Facilities:FAN, TELEVISION ");
     	System.out.println("\n                           press 2 for Deluxe        perday-1500      \n                             (Facilities:AirConditionar,TELEVISION , HotWater) ");
     	System.out.println("\n                           press 3 for SuperDelxue   perday-2000      \n                             (Facilities:AirConditionar, TELEVISION , HotWater )");
     	System.out.println("\n                           press 4 for ExcutiveRoom  perday-2500     \n                              (Facilities:AirConditionar, TELEVISION , HotWater)\n" );
		System.out.print("Choose your option:");
		int roomCost=0;
		String  typeOfRoom  ="";
		char  choice;
		do
		{
		 choice=sc.next().charAt(0);
		       switch(choice) {
		               case '1':
			                 System.out.println( "your selected NormalRoom\n");
			                 typeOfRoom  = "NormalRoom";
			                 roomCost=1000;	
			                 choice='n';
			                 break;
		               case '2':
			                 System.out.println( "your selected Deluxe\n");
			                 typeOfRoom  ="Deluxe";
			                 roomCost=1500;
			                 choice='n';
			                 break;
		               case '3':
			                 System.out.println("your selected SuperDelxue\n");
			                 typeOfRoom ="SuperDelxue";
			                 roomCost=2000;
			                 choice='n';
			                 break;
		               case '4':
			                  System.out.println("your selected ExcutiveRooms\n");
			                  typeOfRoom  ="ExcutiveRooms";
			                  roomCost=2500;
			                  choice='n';
			                  break;
		               default:
			                   System.out.println ("Choose  Valid option :");
		               }//switch
		       
		}//while 
		while( choice !='n');
		System.out.print("Choose NUMBEROFDAYS You Want:\n");
		int  numberOfDays =sc.nextInt();
		int totalCost  =numberOfDays *roomCost;
		System.out.println("Total Cost: "+totalCost+"\n");
		mystmt.setString(1, id );
		mystmt.setString(2,typeOfRoom);
		mystmt.setInt(3, roomCost);
		mystmt.setInt(4, numberOfDays );
		mystmt.setInt(5, totalCost );
		mystmt.executeUpdate();
		System.out.println("your room is booked");
		sc.close();
     	System.out.println("-------------------------------------------------------------------------------------------------------------------------");

		}//TryEnd
		catch(Exception e) {System.out.println("Error");}
		finally {
			try {
			if(con!=null) {con.close();}
			else {System.out.println("Connection failed");}}
			catch(Exception e){System.out.println("Errorr");}
			
		}//finally
	}//selectRoom
        public static void createCredentials() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/PROJECT2","root","Harsha@1020");
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
			      catch(Exception e){System.out.println("Error");}
		}//finally

	}//createCredentialsEnd
}
  
