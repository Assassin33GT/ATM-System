package investmentt1234;

import java.util.ArrayList;

import java.util.Scanner;

public class main_project {

	public static void main(String[] args) {
		ArrayList<investor>list = new ArrayList<>();//investors
		ArrayList<Company>list2 = new ArrayList<>();//company
		
	  list2 = F.ReadData();//company
	  list = F2.ReadData();//investor
		System.out.println(list2);
		for(;;) {
			
		Scanner sc =new Scanner(System.in);
		
		int ans5;
		int ans6 = 0;
		int ans4;
		int ans3;
		int l = 0;
		
		try {
		
		//FIRST ENTRY!!	
		System.out.println("HELLO EVERYONE 😃 \n THANK YOU FOR CHOOSING OUR INVESTING PRORGAM UPVEST FOR YOUR FINICIAL BENIFIT!  \n");
		System.out.println(" IF you are a company ENTER 1 \n IF you are an investor ENTER 2 ");
		System.out.print("\n Your Choice :");
		
		//ANSWER FOR COMPANY OR INVESTOR 
		ans5=sc.nextInt();
		//loop 
		for(int i = 0;i < 100; i++) {
			//if answer is not one or two
		while(ans5 <= 0 || ans5 >= 3)
		{
			System.out.println(" IF you are a company ENTER ONE \n IF you are an investor ENTER TWO \n" +" ONE or TWO only,please. ");
			System.out.print("\n Your Choice :");
			//choosing between company or investor
			ans5=sc.nextInt(); 
			
		}
		//IF THE CHOICE WAS A COMPANY!!
		if(ans5 == 1) {
			
			System.out.println("\nHello at UPVEST investment bank. \nEnter 1 to register : \nEnter 2 to login :");
			System.out.println();
			System.out.print("Your Choice : ");
			ans6 = sc.nextInt();
			System.out.println();
			//ans6 choice of register or login of company
            if(ans6 == 1)
            {
        //Registration
		//CHECKING COMPANY NAME 
			
				sc.nextLine();
				System.out.print("Please enter your Company name  :");
				String name = sc.nextLine();
				//so it doesn't compare the first input
				while(i>0)
				{
					int j = 0;
					//comparing if the user enters a name that exists
					for(int i6 = 0;i6 < list2.size();i6++) {
					if(name.compareTo(list2.get(i6).name) == 0)
					{
						System.out.print("This name is exist, Please enter new name :");
						name = sc.nextLine();
						j = i6;
						if(name.compareTo(list2.get(i6).name) != 0)
						{
							break;
						}
					}
					else
					{
						break;
					}
					}
						if(name.compareTo(list2.get(j).name) != 0)
						{
							break;
						}
				}
				//ENTERING COMPANY DETAILS
				System.out.print("enter your password :");
				String password = sc.nextLine();
				System.out.print("enter your country :");	
				String country = sc.nextLine();
				System.out.print("enter your city :");
				String city = sc.nextLine();
				System.out.print("Please enter number of shares you wish to sell and cannot be changed in the future :");
				int numberofshares =  sc.nextInt();
				//CHECKING LIMIT OF SHARES 
				while(numberofshares < 1)
				{
					System.out.print("\nPlease enter a number bigger than zero : ");
					numberofshares = sc.nextInt();
					
				}
				
				System.out.print("Please enter the max sell :");
				int maxSell = sc.nextInt();
				//Maxsell has to bigger than zero
				while(maxSell < 1)
				{
					System.out.print("Please enter the max sell bigger than zero :");
					maxSell = sc.nextInt();
				}
				
				System.out.print("Please enter the price of each share :");
				double priceofeachshare =  sc.nextDouble();
				//price of share has to e bigger than or equal than 0
				while(priceofeachshare <= 0)
				{
					System.out.print("Please enter the price of each share again and not negative or equal zero :");
					priceofeachshare =  sc.nextDouble();
				}
				
				//CREATING COMPANY OBJECT&& ENTERING INTO AN ARRAYLIST (LIST2) 
				list2.add(new Company(name,country,city,password,numberofshares,priceofeachshare,maxSell));
				
	            //WRITING COMPANY DETAILS INTO A FILE.	
                F.writeData(list2);

				System.out.println();
				System.out.println("                                 Thank you for using our service.");
				System.out.println("                              Your Company account has been created. ");
				System.out.println("                              GOODBYE .  \n\n");
				
				
			    }
           //ans6 choice of login of company 
            else if(ans6 == 2)
            {
            	//if the company list is empty
            	if(list2.isEmpty()) {
        			System.out.print("SORRY NO ACCOUNT IS MADE\n");
        		
        		}else {
                    //flag to enter if statement
    	            boolean found=false;

    	            while(found==false) {
    	            	
    	            	sc.nextLine();
        	            System.out.print(" Enter user name : ");
        	            String userName = sc.nextLine();

        	            System.out.print(" Enter password : ");
        	            String password = sc.nextLine();
        	            int s5=0;
        	            // loop of the company list
                 	   System.out.println(userName);
                 	   System.out.println(password);
                       for(int i2 = 0;i2 < list2.size();i2++) {
                    	   System.out.println(list2.get(i2).name);
                    	   System.out.println(list2.get(i2).Password);
                    	   
                    	    //checking if the username and password are correct
                    	  // if(userName.compareTo(list2.get(i2).name) == 0 && password.compareTo(list2.get(i2).Password) == 0)
                    	   if(userName.equals(list2.get(i2).name) && password.equals(list2.get(i2).Password))
                    	   {
                    		   found = true;
                    		   System.out.println("\n                               User successfully logged-in.. \n");
                    		   
                    		   System.out.println(list2.get(i2).toString()+"\n");				                   
        	                   int x;
        	                   while(true) {
        	                	   
        	                   System.out.println("Change username enter 1. \nChange country enter 2. \nChange city enter 3. \nFor Password enter 4. \nChange price of each share 5. \nChange max sell 6. \nWant to exit enter 7. ");
        	                   System.out.print("Choice : ");
        	                   x = sc.nextInt();
        	                   System.out.println();
        	                   
        	                   if(x == 1)
        	                   {
        	                	   System.out.print("Please enter new name :");
        	                	   sc.nextLine();
        	                	   String name=sc.nextLine();
        	                       list2.get(i2).setName(name);
        	                       System.out.println();
        	                   }
        	                   if(x == 2)
        	                   {
        	                	   System.out.print("Please enter country :");
        	                	   sc.nextLine();
        	                	   String Country;
        	                	   Country = sc.nextLine();
        	                	   list2.get(i2).setCountry(Country);
        	                	   System.out.println();
        	                   }
        	                   if(x == 3)
        	                   {
        	                	   System.out.print("Please enter city :");
        	                	   sc.nextLine();
        	                	   String City;
        	                	   City = sc.nextLine();
        	                	   list2.get(i2).setCity(City);
        	                	   System.out.println();
        	                   }
        	                   if(x == 4)
        	                   {
        	                	   System.out.print("Please enter new password :");
        	                	   sc.nextLine();
        	                	   String Password;
        	                	   Password = sc.nextLine();
        	                	   list2.get(i2).setPassword(Password);
        	                	   System.out.println();
        	                   }
        	                   if(x == 5)
        	                   {
        	 
        	                	System.out.print("Please enter the price of each share :");
        	       				double priceofeachshare =  sc.nextDouble();
        	       				while(priceofeachshare <= 0)
        	    				{
        	    					System.out.print("Please enter the price of each share again and not negative or equal zero :");
        	    					priceofeachshare =  sc.nextDouble();
        	    				}
        	       				list2.get(i2).setPriceofeachshare(priceofeachshare);
        	                     System.out.println();
        	                   }
        	                   if(x == 6)
        	                   {
        	                	   System.out.print("Please enter new max sell :");
        	                	  int maxSell = sc.nextInt();
        	                	  list2.get(i2).setMaxSell(maxSell);
        	                	  System.out.println();
        	                   }
        	                   if(x == 7)
        	                   {
        	                	   l = 6;
        	                	   break;
        	                   }
        	                   }
        	                   System.out.println(list2.get(i2).toString()+"\n");		
			                   s5=i2;
			                   break;
        	                  
                    	   }
                    	   
                    	   }//end of loop
                    	
        	          //if the username or password is wrong
        	            if(found == false) {
        	            	 System.out.println("                         In valid userName or password \n");
         	                
        	            }
    	            }            
            }
		
		
		System.out.println("HELLO EVERYONE \n THANK YOU FOR CHOOSING OUR INVESTING PRORGAM FOR YOUR FINICIAL BENIFIT!  \n");
		System.out.println(" IF you are a company ENTER ONE \n IF you are an investor ENTER TWO ");
		System.out.print("\n Your Choice : ");
		//ans5 is choice of company or investor
		
		
		
		ans5=sc.nextInt();
	/*	System.out.println(" IF you are a company ENTER 1 \n IF you are an investor ENTER 2 ");
		System.out.print("\n Your Choice :");
				ans5 = sc.nextInt();*/
				while(ans5 <= 0 || ans5 > 3)
				{
					System.out.println(" IF you are a company ENTER ONE \n IF you are an investor ENTER TWO ,Please enter only 1 or 2");
					System.out.print("\n Your Choice :");
					ans5 = sc.nextInt();
				}
				System.out.println();
				if(ans5 == 1)
				{
				
				}
				else if(ans5 == 2)
				{
					break;
				}
			}}
			
		}
		//IF ENTERED INVESTOR!	
		//ans5 choice the investor
		if(ans5 == 2) {
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		System.out.println("\nHello at UPVEST investment bank. \nEnter 1 to register : \nEnter 2 to login :");
		System.out.println();
		System.out.print("Your Choice : ");
		
		ans4 = sc.nextInt();
		System.out.println();
		
		while(ans4 < 0 || ans4 > 2)
		{  
			System.out.println("Enter 1 to register : \n enter 2 to login :");
			ans4 = sc.nextInt();
		}
		//ans4 choice of login or register investor
		if(ans4 == 1)
		{
			
		for(int i = 0;i < 100; i++) {
		sc.nextLine();
		System.out.print("Enter your username :");
		String name = sc.nextLine();
		
		while(i>0)
		{
			int j = 0;
			for(int i6 = 0;i6 < list.size();i6++) {
			if(name.compareTo(list.get(i6).name) == 0)
			{
				System.out.print("This username is exist, Please enter new name :");
				name = sc.nextLine();
				j = i6;
				if(name.compareTo(list.get(i6).name) != 0)
				{
					break;
				}
			}
			 else
			{
				break;
			}
			}
				if(name.compareTo(list.get(j).name) != 0)
				{
					break;
				}
		}
		
		System.out.print("Please enter your password :");
		String Password = sc.nextLine();
		System.out.print("Enter your country :");
		String country = sc.nextLine();
		System.out.print("Enter your city :");
		String city= sc.nextLine();
		System.out.print("Enter your balance and it should be more than 200 dollar :");
		double balance = sc.nextDouble();
		
		while(balance < 200 )
		{
			System.out.print("YOU HAVE ENTERED WRONG INPUT, TRY AGAIN!!");
			balance = sc.nextDouble();
		}
	    
		list.add(new investor(name,country,city,balance,Password));
		
		F2.writeData(list); 
		
		System.out.println();
		System.out.println("                             Thank you for using our service.");
		System.out.println("                              Your account has been created. ");
		System.out.println("\nFor investing Enter 1 . \nFor buying a share Enter 2 . \nFor selling Enter 3 .");
		int ans = sc.nextInt();
		
		while(ans <= 0 || ans > 3)
		{
			System.out.println("Please enter from 1 to 3\nFor investing Enter 1 . \nFor buying a share Enter 2 . \nFor selling Enter 3 .");
			ans = sc.nextInt();
		}
		
		if (ans == 1) {
			
			System.out.println("If you want to invest in our annual investment Enter 1 for the monthly investment Enter 2");
			int ans2 = sc.nextInt();
			
			while(ans2 <= 0 || ans2 >= 3)
			{
				System.out.println("Please enter from 1 or 2 \n"+"If you want to invest in our annual investment Enter 1 for the monthly investment Enter 2");
				ans2 = sc.nextInt();
			}
			//first option!!
			//INVESTING!!
			
			anualinvestment a1 = new anualinvestment(list.get(i));
			
			if (ans2 == 1) {
				a1.anual_bonus();
				System.out.println("\n"+"Your Balance After a year "+list.get(i).balance);
			}else if (ans2 == 2) {
				a1.monthy_bonus();
				System.out.println("\n"+"Your Balance After a month "+list.get(i).balance);
			}
		} 
		
		//second option!!
		//BUYING!!
		
		else if (ans == 2) {
		sc.nextLine();
		System.out.println();
		System.out.println("Companies :");
		System.out.println("---------");
			// showing the companies in the system 
		for(int y = 0;y < list2.size();y++)
			{
				System.out.println(list2.get(y).name); 
			}
			
			System.out.print("\nChoose the Company you want to invest in...");
			String Companyname = sc.nextLine();
			int counter=0;
			
			if(counter==0) { 
			for(int y = 0;y < list2.size();y++) {
				
			  if(Companyname.compareTo(list2.get(counter).name)==0 && counter<=list2.size()) {
			  System.out.print("Please enter the number of shares you want to buy :"+" max sell = "+list2.get(counter).maxSell+"\nNumber :");
			  double no_of_shares = sc.nextDouble();
			  // wrong max sell 
			  if(no_of_shares > list2.get(counter).maxSell)
			  {
				  sc.nextLine();
				  System.out.println("Please enter less than max sell "+" max sell = "+list2.get(counter).maxSell);
				  System.out.print("\nNumber : ");
				  no_of_shares = sc.nextDouble();
				  list.get(i).a = list2.get(counter);
				  list.get(i).buy(no_of_shares);
			  }
			  else {
				  list.get(i).a = list2.get(counter);
				  list.get(i).buy(no_of_shares);
			  }
			  
			  System.out.println("Your Balance now = "+list.get(i).balance);
			  counter++;
			  break;
			  }
			}
			  }
			else {
			  while(true) {
			       // if(true)
			       int i1 = 0;
				   while(Companyname.compareTo(list2.get(i1).name)!=0 && i1 < list2.size()) {
					   i1++;
				System.out.println("This name does not exist.");
				System.out.print("Please enter name again : ");
				 Companyname = sc.nextLine();
				 if(Companyname.compareTo(list2.get(i1).name)==0) {  
					  System.out.print("Please enter the number of shares you want to buy :");
					  double no_of_shares = sc.nextDouble();
					  list.get(i1).buy(no_of_shares);
					  //array of companies bought!!
					  list.get(i).s1.add(list2.get(counter));
					  System.out.println("Your Balance now = "+list.get(i1).balance);
					  break;
				 }
			      }
			      			
			  }
			  } } 
		
		//third option!!
		//SELLING!!
		else if (ans == 3) {
	
			sc.nextLine();
			System.out.println();
			System.out.println("Companies :");
			System.out.println("---------");
				
				for(int y = 0;y < list2.size();y++)
				{
					System.out.println(list2.get(y).name); 
				}
				
				System.out.print("\nChoose the Company that your shares are from");
				String Companyname = sc.nextLine();
				int counter=0;
				
				//if(counter==0) { 
				for(int y = 0;y < list2.size();y++) {
					  if(Companyname.compareTo(list2.get(counter).name)==0 && counter<=list2.size()) {
							System.out.print("Please enter the number of shares you want to sell :");
							double no_of_shares = sc.nextDouble();
							  list.get(i).a = list2.get(counter);
							  list.get(i).sell(no_of_shares);
								  
					  System.out.println("Your Balance now = "+list.get(i).balance);
					  counter++;
					  break;
					  }
					  }
		}
		

System.out.println();

System.out.println("Make new Account Enter 1 : \nLogin Enter 2 : \nExit Enter 3 :");
ans3 = sc.nextInt();
if(ans3 == 1)
{
	}
if(ans3 == 2)
{
   l=3;
	break;
}
if (ans3 == 3)
{
	l=4;
	break;
}
			}
}
		
		if(ans4 == 2 || l == 3)
		{
			if(list.isEmpty()) {
    			System.out.print("SORRY NO ACCOUNT IS MADE\n");
    		
    		}else {

	            boolean found=false;

	            while(found==false) {
	            	
    			    sc.nextLine();
    			    
	            	
    	            System.out.print(" Enter user name : ");
    	            String userName = sc.nextLine();

    	            System.out.print(" Enter password : ");
    	            String password = sc.nextLine();
    	            int s5=0;
    	            
                   for(int i2 = 0;i2 < list.size();i2++) {
                	    
                	   if(userName.compareTo(list.get(i2).name) == 0 && password.compareTo(list.get(i2).Password) == 0)
                	   {
                		   found = true;
                		   System.out.println("\n                               User successfully logged-in.. \n");
                		   int x;
                		   	
                		   while(true)
                		   {//change the user data
                			   System.out.println(list.get(i2).toString()+"\n");
    	                   System.out.println("Change username enter 1. \nChange country enter 2. \nChange city enter 3. \nFor Password enter 4. \nWant to deposit enter 5. \nWant to exit enter 6. ");
    	                   System.out.print("Choice :");
    	                   x = sc.nextInt();
    	                   System.out.println();
    	                   
    	                   if(x == 1)
    	                   {
    	                	   System.out.print("Please enter name :");
    	                	   sc.nextLine();
    	                	   String name=sc.nextLine();
    	                       list.get(i2).setName(name);
    	                       System.out.println();
    	                   }
    	                   if(x == 2)
    	                   {
    	                	   System.out.print("Please enter country :");
    	                	   sc.nextLine();
    	                	   String Country;
    	                	   Country = sc.nextLine();
    	                	   list.get(i2).setCountry(Country);
    	                	   System.out.println();
    	                   }
    	                   if(x == 3)
    	                   {
    	                	   System.out.print("Please enter city :");
    	                	   sc.nextLine();
    	                	   String City;
    	                	   City = sc.nextLine();
    	                	   list.get(i2).setCity(City);
    	                	   System.out.println();
    	                   }
    	                   if(x == 4)
    	                   {
    	                	   System.out.print("Please enter new password :");
    	                	   sc.nextLine();
    	                	   String Password;
    	                	   Password = sc.nextLine();
    	                	   list.get(i2).setPassword(Password);
    	                	   System.out.println();
    	                   }
    	                   if(x == 5)
    	                   {
    	                	System.out.print("Please enter number :");
 	                	    double deposit;
 	                	    deposit = sc.nextDouble();
 	                	    list.get(i2).getDeposite(deposit);
 	                	    System.out.println();
    	                   }
    	                   
    	                   if(x == 6)
    	                   {
    	                	   l = 4;
    	                	   break;
    	                   }
    	                   System.out.println(list2.get(i2).toString()+"\n");		
                	   }
                	   }
                	   }//end of loop
                	
    	          
    	            if(found == false) {
    	            	 System.out.println("                         In valid userName or password \n");
    	            }
	            }            
        }
			System.out.println("-----------------------------------------");
			System.out.println("-----------------------------------------");
			
		System.out.println("\n                Thank You For Using UPvest Investing Program. \n                      Hopefully To See You Later. ");
	}
		}

	}catch(Exception e)
	{
		e.printStackTrace();
		System.out.println("\nException -> Please enter number for your safety 😈 \n");
	}
		if(l == 4)
		{
			break;
		}
		}
}
}
