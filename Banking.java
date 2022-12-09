import java.util.Scanner;

public class Banking {
    public static void main(String[] args){
        BankTransaction B1= new BankTransaction();
        int num,amt;
        long PhoneNumber;
        String name,address;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount ");
        amt=sc.nextInt();
        while(true){
            System.out.println("enter the number :1.To open the new account,2.To do the withdraw the amount," +
                    "3.To do the deposit,4.to close the account 5.enter the 0 to quit" );
            System.out.println("enter the num");
            num=sc.nextInt();


            if (num== 1) {
                System.out.println("enter the name");
                name = sc.next();
                System.out.println("enter the address");
                address = sc.next();
                System.out.println("enter the phone number");
                long phoneNumber = sc.nextLong();
                System.out.println("bank account is successfully created");
            } else if (num== 2) {
                new Thread() {
                    @Override
                    public void run() {
                        B1.withdraw(amt);
                    }
                }.start();
            } else if (num == 3) {
                new Thread() {
                    @Override
                    public void run() {
                        B1.deposit(amt);
                    }
                }.start();
            } else if (num == 4) {
                System.out.println("account is closed");
            } else if (num==9) {
                break;
            }
        }
    }
}

