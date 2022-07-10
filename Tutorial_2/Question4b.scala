object question4b {

    //calculate number ofattendees
    def attendees(price: Int): Int ={ 
        120 + (15-price)/5*20;
    }

    //calculate total income
    def income(price: Int): Int = {
        attendees(price) * price;
    }

    // calculate total cost
    def cost(price: Int): Int = {
        500 + 3*attendees(price);
    }

    // calculate total profit
    def profit(price: Int): Int = {
        income(price) - cost(price);
    }


    def main(args: Array[String]) = {
        println("Profit to the given ticket price is : "+profit(25));
  }
}

