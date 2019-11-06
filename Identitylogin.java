// Develop a Identity Login Channel Interface.

import java.util.Scanner;

class Identitylogin {

	static void identitylogin(String str1) {
		 
		 Scanner s = new Scanner(System.in);

		 String str2;
		 String str3;
		 String password = "Gaurav";
		 String key1 = "Yes";
		 String key2 = "No";
		 String key3 = "Exit";

		 int attempts = 3;
         boolean bo = true;

		 System.out.println();
		 System.out.println(" ------------------------------------------------------------------------------ \n");

         if(str1.equals(key1)) {

              System.out.println();
			  System.out.println(" ------------------------------------------------------------------------------ \n");
              System.out.println(" CRITICAL WARNING : Remaining Attempts Left : " + attempts + "\n");
		      System.out.println();

              for(int i = -1; i <= attempts; i++) {

                    System.out.print(" Enter Password : ");
			 
                    str2 = s.nextLine();

			        System.out.println();

			        System.out.println(" ALERT : Are You Sure, you want to continue with this password? \n");
			        System.out.println("         Reply with Yes or No to continue. \n");
			        System.out.println("         Reply with Exit to terminate the process. \n");
					System.out.print("         Input is CASE SENSITIVE. : ");
			 
                    str3 = s.nextLine();

			        System.out.println();

                    if(i <= attempts) { 

					   if(str3.equals(key1) && str2.length() != '\0') {

                            for(int j = 0; j < str2.length(); j++) {

                                  if(str2.charAt(j) != password.charAt(j)) {

				                       bo = false;
                                       break;

                                  }	               
                            }
 
                         if(bo == true && str2.length() != '\0') {

                               System.out.println();
							   System.out.println(" ------------------------------------------------------------------------------- \n");
							   System.out.println(" Valid Password. Access Granted. \n");
                               System.out.println(" Identity Confirmation has been successfully completed and you are authorised. \n");
						       System.out.println(" ------------------------------------------------------------------------------- \n");
						       System.out.println();
							   System.out.println(" ------------------------------------------------------------------------------- \n");
							   System.out.println(" Process has been successfully completed. \n");
							   System.out.println(" Connected to Setup Utility - IDENTITY LOGIN CHANNEL.\n");
							   System.out.println(" ------------------------------------------------------------------------------- \n");
							   System.out.println();
                               System.out.println(" ------------------------------------------------------------------------------- \n");
							   System.out.println(" Credentials are as follows : \n");
							   System.out.println(" NAME : GAURAV SRIVASTAVA\n");
							   System.out.println(" ID   : 110659\n");
							   System.out.println(" AREA : DEVELOPMENT\n");
							   System.out.println(" ------------------------------------------------------------------------------- \n");
							 
                               break;  
						  
                         } else if(str2.length() > password.length()) {

                                     System.out.println(" Invalid Password. Access Denied. Try Again. \n");
						             System.out.println(" ------------------------------------------------------------------------------------- \n");
						 
						        } else if(attempts == 1) {

								            System.out.println(" Invalid Password. Access Denied. \n");
								            System.out.println(" ------------------------------------------------------------------------------ \n");

						               } else {
				
                                            System.out.println(" Invalid Password. Access Denied. Try Again. \n");
						                    System.out.println(" ------------------------------------------------------------------------------ \n");

                                         }

                               attempts--;
                        
					           if(attempts == 1) {
                          
						            System.out.println();
					                System.out.println();
					                System.out.println(" ------------------------------------------------------------------------------ \n");
                                    System.out.println(" CRITICAL WARNING : Remaining Attempts Left : " + attempts + " \n");
                                    System.out.println(" ALERT : * This is your last attempt. \n");
					                System.out.println();
                            
                               } else {

					                System.out.println();
					                System.out.println();
					                System.out.println(" ------------------------------------------------------------------------------ \n");
                                    System.out.println(" CRITICAL WARNING : Remaining Attempts Left : " + attempts + " \n");
					                System.out.println();

                                    bo = true;

					             }
          
                               if(attempts == 0) {

                                    System.out.println(" Out Of Attempts.\n");
			                        System.out.println(" Your identity has been blocked and all data has been erased.\n");
									System.out.println();
									System.out.println(" ------------------------------------------------------------------------------ \n");
									System.out.println();
									System.out.println(" ------------------------------------------------------------------------------ \n");
									System.out.println(" Process terminated. \n");
								    System.out.println(" Disconnected from Setup Utility - IDENTITY LOGIN CHANNEL.");
			                        System.out.println();
			                        System.out.println(" ------------------------------------------------------------------------------ \n");
		  	                        System.out.println();

                               }

					   } else if(str3.equals(key2)) {

			                       i--;
								   attempts--;
								   attempts++;

                              } else if(str3.equals(key3)) {

								          System.out.println();
								          System.out.println(" ------------------------------------------------------------------------------ \n");
										  System.out.println();
										  System.out.println(" ------------------------------------------------------------------------------ \n");
								          System.out.println(" Process terminated. \n");
								          System.out.println(" Disconnected from Setup Utility - IDENTITY LOGIN CHANNEL.");
                                          System.out.println();
								          System.out.println(" ------------------------------------------------------------------------------ \n");
								          System.out.println();
								          break;
								   
							         } else if(str2.length() == '\0' && !str3.equals(key1) && !str3.equals(key2) ) {
 
                                                 System.out.println(" * Password field cannot be left blank. \n");
												 System.out.println(" ALERT : Invalid input. \n");
								                 System.out.println("         Reply with Yes or No to continue. \n");
												 System.out.println("         Reply with Exit to terminate the process. \n");
                                                 System.out.println("         Input is CASE SENSITIVE. \n");
									      	     i--;
										         attempts--;
										         attempts++;
                                       
									        } else if(str2.length() == '\0' && str3.equals(key1) ) {

												        System.out.println(" * Password field cannot be left blank. \n");	  
												        i--;
								                        attempts--;
								                        attempts++;

									               } else {

                                                        System.out.println(" ALERT : Invalid input. \n");
								                        System.out.println("         Reply with Yes or No to continue. \n");
														System.out.println("         Reply with Exit to terminate the process. \n");
														System.out.println("         Input is CASE SENSITIVE. \n");
								                        i--;
								                        attempts--;
								                        attempts++;

		                                             }
			  
                    }   

	          }

	     } else if(str1.equals(key2)) {
			  
					 System.out.println();
					 System.out.println(" ------------------------------------------------------------------------------ \n");
					 System.out.println(" Process terminated. \n");
                     System.out.println(" Disconnected from Setup Utility - IDENTITY LOGIN CHANNEL.");
                     System.out.println();
			         System.out.println(" ------------------------------------------------------------------------------ \n");
				     System.out.println();

			    } else {
			  
					 System.out.println();
					 System.out.println(" ------------------------------------------------------------------------------ \n");
					 System.out.println(" Process terminated. \n");
                     System.out.println(" Disconnected from Setup Utility - IDENTITY LOGIN CHANNEL.");
                     System.out.println();
			         System.out.println(" ------------------------------------------------------------------------------ \n");
				     System.out.println();

				  }

    }
}
