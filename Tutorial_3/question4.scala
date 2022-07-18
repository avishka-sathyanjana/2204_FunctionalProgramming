object question4{
    def price(x:Int): Double = 24.95*x; //cost for books without discount

    def discount(x:Int):Double = 24.95*x*0.4;

    def shippingCost(y:Int):Double = {  
        if (y<=50){return 3;}
        else{return 3 + (y-50)*.75;}
    }// rs 50 for first 50 copies 9(i took 3 rs for all 50 books) and after that for every extra copy it will add 75 cents

    def totWholesaleCost(x:Int):Double = {
        price(x) - discount(x) + shippingCost(x)
    }

    def main(args: Array[String]): Unit = {
        println("Total wholesale cost = " + totWholesaleCost(60))
    }

}