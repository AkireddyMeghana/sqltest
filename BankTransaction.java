public class BankTransaction {
        int amount,balance=30000;
        synchronized void withdraw(int amt)
        {
            System.out.println("withdraw the amount...");

            if(this.amount<amt)
            {
                System.out.println("Less account balance; waiting for the deposit...");
                try{wait();
                }
                catch(Exception e){}
            }

            this.amount-=amt;
            System.out.println("withdraw completed..."+amt);
        }

        synchronized void deposit(int amt)
        {
            System.out.println("going to deposit...");
            this.amount+=amt;

            System.out.println("deposit completed... "+amt);
            notify();
        }

}
