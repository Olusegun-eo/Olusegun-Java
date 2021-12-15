package chapterThree;

    public class Account {
        private int balance;
        private String firstName;
        private String lastName;
        private String accountName;


        public void deposit(int amountToDeposit) {
//            balance = balance + amountToDeposit;
            if (amountToDeposit > 0) {
                balance = balance + amountToDeposit;
            }
        }

        public int getBAlance() {
            return balance;
        }

        public void withdraw(int amountToWithDraw) {
            if (amountToWithDraw <= balance)
                balance = balance - amountToWithDraw;
        }
//
//        public String ssetNames(String firstName, String lastName, String accountName) {
//            this.firstName = firstName;
//            this.lastName = lastName;
//            this.accountName = accountName;
//            accountName = lastName + " " + firstName;
//        }
//
    }



