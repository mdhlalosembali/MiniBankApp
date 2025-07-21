import java.util.HashMap;
import java.util.Scanner;
   
     public class MiniBankApp{
		 private HashMap<String,String>users= new HashMap<>();
		 private HashMap<String,Double>balances= new HashMap<>();
		 
		 private Scanner sc= new Scanner(System.in);
		 
		 // pre- populate users
		  public BankLoginApp(){
			  users.put("Doli","Doli123");
			   users.put("Mbali","mba345");
			    users.put("Sindi","Sindi789");
				
				balances.put("Doli", 1000.0);
				balances.put("Mbali", 2000.0);
				balances.put("Sindi", 3000.0);
				
		  }
		  //promt for login detais 
	      private void loginUser(){
			  System.out.println("Enter username");
			  String username= sc.nextLine();
			  System.out.println("Enter password");
			  String password= sc.nextLine();
			  
			  if(user.containsKey(username)&&users.get(username).equals(password)){
				  System.out.printIn("Login successful.Welcome"+username+);
				 showBankMenu(usernambe);
				 
			  }else{
				  System.out.println("Login failed.Incorrect username or password");
			  }
		  }
		  
		  private void displaywBankMenu(String username){
			  while(true){
				 System.out.println("----Banking menu----");
				 System.out.println("1.View balance");
				 System.out.println("2.Deposit money");
				 System.out.println("3.Withdraw money");
				 System.out.println("4.Logout");
				 System.out.println("1.Choose an option:");
				 String choice= sc.nextLine();
				 
				 switch(choice){
					 case"1":
					  System.out.println("1.Your current balance is R" +balances.get(username));
					  break;
					  
					  case"2":
					  deposit(username);
					  break;
					  
					  case"3":
					  withdraw(username);
					  break;
					  
					  case"4":
					  System.out.println("Logging out.Goodbye"+username);
					  return;
					  
					  default:
					  System.out.println(" Invalid option. Please try again");
				 }  
				  
			  }
		  }
		  
		  private void deposit(String username) {
        System.out.print("Enter amount to deposit: R");
        double amount = sc.nextDouble();
        sc.nextLine(); // consume newline
        if (amount > 0) {
            double newBalance = balances.get(username) + amount;
            balances.put(username, newBalance);
            System.out.println("Deposit successful. New balance: R" + newBalance);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private void withdraw(String username) {
        System.out.print("Enter amount to withdraw: R");
        double amount = sc.nextDouble();
        sc.nextLine(); // consume newline
        double currentBalance = balances.get(username);
        if (amount > 0 && amount <= currentBalance) {
            double newBalance = currentBalance - amount;
            balances.put(username, newBalance);
            System.out.println("Withdrawal successful. New balance: R" + newBalance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

		  public static void main(String[]args){
			  BankLoginApp app= new BankLoginApp();
			  System.out.println("----Bank Login----");
			  app.loginUser();
		  }
	 }