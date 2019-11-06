// Develop a Identity Login Channel Interface.

import java.util.Scanner;

class Toidentitylogin {

      public static void main (String[] args) {
		  
         Scanner s = new Scanner(System.in);

		 String str;
         
         System.out.println();
		 System.out.println();
		 System.out.println("           Setup Utility - Copyright (C) 2019 - 2020, Gaurav Srivastava, Inc. \n");
		 System.out.println("\t\t\t\t----------------------- \n");
         System.out.println("\t\t\t\tIDENTITY LOGIN CHANNEL. \n");
		 System.out.println("\t\t\t\t----------------------- \n");
		 System.out.println();

		 System.out.println();
		 System.out.println(" ------------------------------------------------------------------------------ \n");
		 System.out.println(" CAUTION : Authentication Required. \n");
		 System.out.println(" This utility contains SENSITIVE INFORMATION. \n");
		 System.out.println(" To proceed, please confirm your identity. \n");
	     System.out.println(" ------------------------------------------------------------------------------ \n");
		 System.out.println();

		 System.out.println(" ------------------------------------------------------------------------------ \n");
		 System.out.println(" ALERT : After 3 unsuccessful attempts, \n"); 
		 System.out.println(" your identity will be blocked and all data will be erased. \n");
		 System.out.println(" ------------------------------------------------------------------------------ \n");
		 System.out.println();
		 
         System.out.println(" ------------------------------------------------------------------------------ \n");
		 System.out.println(" ALERT : Are You Sure, you want to continue with the login process? \n");
         System.out.println("         Reply with Yes to continue. \n");
		 System.out.println("         Input is CASE SENSITIVE. \n");
		 System.out.println("         Please check the entered input otherwise process will be terminated. \n");
		 System.out.print("         Press any other key to terminate the process. : ");

		 str = s.nextLine();

         Identitylogin.identitylogin(str);
	  }
}

    