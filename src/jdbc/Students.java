package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Students {
Scanner input=new Scanner(System.in);
    public void createDatabase() {
// driver load
// connection establish
// statement create
// execute - query
// Connection close

        try {
            String url = "jdbc:mysql://localhost:3306/";
            //myDriver = jdbc | Server = mysql | Localhost | port 3306 | database name= shiyam

            /*  Open MySql cmd 
          Step 1: Enter root password (Tanjid470!)
          Step 2: Select user();
          Step 3: select @@port;      
             */
            String userName = "root";
            String passWord = "Tanjid470!";
            Connection connection = DriverManager.getConnection(url, userName, passWord);
            Statement statement = connection.createStatement();
            System.out.println("\n\tConnected successfully...\n\n\n");
            String query = "create database Persons";
            boolean isQueryExcute = statement.execute(query);
            System.out.println(isQueryExcute);

            connection.close();

        } catch (Exception e) {
            //System.out.println("Can't Connected.....!");
            e.printStackTrace();
        }
    }

    public void createTable() {
        try {
            String url = "jdbc:mysql://localhost:3306/student";
            String userName = "root";
            String passWord = "Tanjid470!";
            Connection connection = DriverManager.getConnection(url, userName, passWord);
            Statement statement = connection.createStatement();
            System.out.println("\n\tConnected successfully...\n\n\n");
            String query = "create table StudentsDetails (rollno int(3), stdName varchar(20), stdEmail varchar(20));";
            boolean isQueryExcute = statement.execute(query);
    
            connection.close();

        } catch (Exception e) {
            //System.out.println("Can't Connected.....!");
            e.printStackTrace();
        }

    }

    void insertData() {
         try {
            String url = "jdbc:mysql://localhost:3306/";
            String databaseName="student";
            String userName = "root";
            String passWord = "Tanjid470!";
            Connection connection = DriverManager.getConnection(url+databaseName, userName, passWord);
            Statement statement = connection.createStatement();
            System.out.println("\n\tConnected successfully...\n\n\n");
             System.out.print("Roll no : ");
             int id = input.nextInt();
             System.out.print("Student name : ");
             String name = input.next();
             System.out.print("Student Email : ");
             String mail = input.next();
            String query = "INSERT into StudentsDetails VALUES("+id+",'"+name+"','"+name+"')";
            boolean isQueryExcute = statement.execute(query);
              System.out.println("\n\tInsert successfully...\n\n\n");
        
            connection.close();

        } catch (Exception e) {
            //System.out.println("Can't Connected.....!");
            e.printStackTrace();
        }
       
    }

    void updateData() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     try {
            String url = "jdbc:mysql://localhost:3306/";
            String databaseName="student";
            String userName = "root";
            String passWord = "Tanjid470!";
            Connection connection = DriverManager.getConnection(url+databaseName, userName, passWord);
            Statement statement = connection.createStatement();
            System.out.print("Strudent Roll no"
                    + " : ");
             int id = input.nextInt();
             System.out.print("Updated name : ");
             String name = input.next();
            String query = "update StudentsDetails SET stdName='"+name+"' WHERE rollno="+id+"";
          //  boolean isQueryExcute = statement.execute(query);
              System.out.println("\n\tUpdate successfully...\n\n\n");
     
            connection.close();

        } catch (Exception e) {
            //System.out.println("Can't Connected.....!");
            e.printStackTrace();
        }
    }

    void deleteData() {
       //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      try {
            String url = "jdbc:mysql://localhost:3306/";
            String databaseName="student";
            String userName = "root";
            String passWord = "Tanjid470!";
            Connection connection = DriverManager.getConnection(url+databaseName, userName, passWord);
            Statement statement = connection.createStatement();
           // System.out.println("\n\tConnected successfully...\n\n\n");
            System.out.print("Delete a Student info.\nEnter roll no:");
            int id=input.nextInt();
            String query = "Delete from StudentsDetails where rollno="+id+"";
            boolean isQueryExcute = statement.execute(query);
            System.out.println("\n\tDelete successfully...\n\n\n");
     
            connection.close();

        } catch (Exception e) {
            //System.out.println("Can't Connected.....!");
            e.printStackTrace();
        }
    }

    void realAllData() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      try {
            String url = "jdbc:mysql://localhost:3306/";
            String databaseName="student";
            String userName = "root";
            String passWord = "Tanjid470!";
            Connection connection = DriverManager.getConnection(url+databaseName, userName, passWord);
            Statement statement = connection.createStatement();
            String query = "Select * from StudentsDetails";
            ResultSet getAllData = statement.executeQuery(query);
            while(getAllData.next()){
                System.out.println(getAllData.getInt(1) +" "+getAllData.getString(2)+" "+getAllData.getString(3));
            }
         
            connection.close();

        } catch (Exception e) {
            //System.out.println("Can't Connected.....!");
            e.printStackTrace();
        }
    }

}
