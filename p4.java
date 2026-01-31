import java.util.*;
class account{
	int accno;
	double balance;
	void input(){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        accno = sc.nextInt();
        System.out.print("Enter Account Balance: ");
        balance = sc.nextDouble();
    }
	void disp(){
		 System.out.println("Account Number: " + accno);
        System.out.println("Balance: " + balance);
    }
}
class person extends account{
	String name;
	String aadhar_no;
	void input(){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLine();
        super.input();
	}
	void disp(){
		System.out.println("Name: " + name);
		System.out.println("aadhar no: "+ aadhar_no);
		super.disp();
	}
}
class p4_5709{
	public static void main(String arg[]){
		person p[]=new person[3];
		for(int i=0;i<3;i++){
			p[i]=new person();
			p[i].input();
		}
		for(int i=0;i<3;i++){
			p[i].disp();
		}
	}
}
		
		