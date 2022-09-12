class Account(no: Int, bal: Double){
        var accNo = no;
        var accBalance = bal;

        def negBalance(): Boolean = no match{
            case x if(this.accBalance < 0) => true;
            case _ => false;
        }

        def BalAfterInt(): Double = {
            if(this.negBalance()){  
                this.accBalance + (this.accBalance * 0.1);
            }
            else{  
                this.accBalance + (this.accBalance * 0.05);
            }
        }


        override def toString(): String = "Account Number: " + accNo.toString()  + " => Balance: "+ accBalance.toString();
}

object question3 extends App{

    def findNegativeAccounts(account: List[Account]): List[Account] = {  
        account.filter(i => i.negBalance());
    }

    def findSumBalance(account: List[Account]): Double = { 
        account.map(_.accBalance).reduce((x, y) => x + y);
    }
    def FindFinalBalance(account: List[Account]): List[Double] = {  //get the final balances of all the accounts including the interest
        account.map(_.BalAfterInt());
    }


    var Bank = List(new Account(1, 100000), new Account(2, -10000), new Account(3, -1000), new Account(3, 2000));

    println("List of Accounts with negative balances in Bank: " + findNegativeAccounts(Bank) +"\n");
    println("Sum of all account balances in Bank : "+ findSumBalance(Bank) +"\n");
    println("Final acc balances after applying interest: " + FindFinalBalance(Bank) +"\n");

}