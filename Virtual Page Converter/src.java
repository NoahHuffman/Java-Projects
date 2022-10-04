import java.util.Scanner;
import java.lang.Math;
import java.io.*;

class A {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        //Creating Variables
        int pageSize=0;
        long vaddress=0;
        //Bool variables for checking the validity of input
        boolean invalid1 = true;
        boolean invalid2 = true;
        boolean invalid3 = true;
        boolean invalid4 = true;

        //Prompting user
        System.out.println("Please enter the system page size: ");

        while (invalid1 && invalid2){
            //Checking for int input
            try{
                String temp1 = in.nextLine();
                pageSize = Integer.parseInt(temp1);
                invalid1 = false;                
            }
            catch (Exception e){
                System.out.println("Invalid Input, try again: "); 
                continue;               
            }     
          
                //Checking for valid input range
                double low1 = Math.pow(2, 9);
                double high1 = Math.pow(2, 14);
                if (pageSize >= low1 && pageSize <= high1){
                    invalid2 = false;
                }else{
                    System.out.println("Invalid range, try again: ");
                    invalid1=true;
                    continue;
                }
                
        }
        
        //Prompting user
        System.out.println("Please enter the virtual address: ");

        while (invalid3 && invalid4){
        //Checking for int input
            try{
                String temp2 = (in.nextLine());
                vaddress = Long.parseLong(temp2);
                invalid3 = false;
                
            }
            catch (Exception e){
                System.out.println("Invalid Input, try again: ");
                continue;
            }

            //Checking for valid input range
            double high2 = Math.pow(2, 32);
            if (vaddress >= 0 && vaddress <= high2-1){
                invalid4 = false;
                break;
            }else{
                System.out.println("Invalid Range, try again: ");
                invalid3 = true;
                continue;
            }
        }

        //Virtual Page and Offset Calculations
        double vpage = vaddress / pageSize;
        String vpagef = String.format("%.0f",vpage);
        double offset = vaddress % pageSize;
        String offsetf = String.format("%.0f",offset);

        //Outputting Result
        System.out.println("This address is in virtual page: " + vpagef);
        System.out.println("At offset: " + offsetf);


    }
   }