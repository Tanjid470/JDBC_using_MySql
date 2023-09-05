package jdbc;

import java.util.Scanner;

public class JDBC {

    public static void main(String[] args) {
        Students student = new Students();
        Scanner input = new Scanner(System.in);
        boolean flag=true;
    
        while(flag){
                System.out.println("1| Create DataBase"
                + "\n2| Create Table"
                + "\n3| Insert Data"
                + "\n4| Update Data"
                + "\n5| Delete Data"
                + "\n6| View All "
                + "\n0| Exit");
             System.out.print("Enter :");
        int n=input.nextInt();
        switch (n) {
            case 1: {
                student.createDatabase();
                
                break;
            }
            case 2: {
                student.createTable();
                break;
            }
            case 3: {
                student.insertData();
                break;
            }
           
            case 4: {
                student.updateData();
                break;
            }
            case 5: {
                student.deleteData();
                break;
            }
            case 6: {
                student.realAllData();
                break;
            }
            case 0: {
               flag=false;
                break;
            }
            default: {
                System.out.println("You choose wrong option");
            }
        }

        }
        
       
    }

}
