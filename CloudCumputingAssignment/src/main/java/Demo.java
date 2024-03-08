
import java.util.Scanner;

	class SavingsAccount{
	    double balance;
	    int interestRate;
	    int accountNo;

	    SavingsAccount(){
	    }
	    public SavingsAccount(double balance, int interestRate, int accountNo) {
	        this.balance = balance;
	        this.interestRate = interestRate;
	        this.accountNo = accountNo;
	    }
	    void withDraw(double amount){
	        if(amount > balance){
	            System.out.println("Invalid Amount");
	        }else
	        {
	            System.out.println("successfully withdrawn");
	            balance = balance-amount;
	            System.out.println("Balance = "+balance +"\n"+"Amount = "+amount);
	        }
	    }

	    void calculateInterest(){
	        Scanner sc=new Scanner(System.in);
	        double SI;
	        System.out.print("Enter the time(in year) : ");
	        int t=sc.nextInt();
	        SI = (balance * interestRate * t)/100;
	        System.out.println("simple interest "+SI);
	    }
	}

	public class Demo {
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the balance : ");
	        double p=sc.nextDouble();
	        System.out.print("Enter the account no : ");
	        int accountNo=sc.nextInt();
	        System.out.print("Enter the interestRate : ");
	        int r=sc.nextInt();
	        SavingsAccount sa=new SavingsAccount(p,r,accountNo);
	        sa.calculateInterest();
	        System.out.print("Enter the amount : ");
	        double amount =sc.nextDouble();
	        sa.withDraw(amount);

	    }

	}




