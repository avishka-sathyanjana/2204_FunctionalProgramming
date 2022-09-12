class Account(no: Int, bal: Double){
        var accNo = no;
        var accBalance = bal;

        def transfer(that: Account, amount: Double): Unit = {
            this.accBalance = this.accBalance - amount;
            that.accBalance = that.accBalance + amount;
        }

        override def toString(): String = "Account Number: " + accNo.toString()  + " => Balance: "+ accBalance.toString();
}

object question3 extends App{

    var acc1 = new Account(1, 200000);
    var acc2 = new Account(2, 100000);

    println("Before transfer: ");
    println(acc1);
    println(acc2);

    var transferAmount = 50000;
    acc1.transfer(acc2, transferAmount);

    println("\nAfter transfer "+ transferAmount + "\n");
    
    println(acc1);
    println(acc2);

}