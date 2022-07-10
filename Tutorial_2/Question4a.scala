object question4{

    //amount for working hours
    def wage(x:Int):Int={
        250*x;
    }

    //amount for ot
    def ot(x:Int):Int={
        85*x;
    }

    def totSalary(x:Int, y:Int):Int={
        wage(x)+ot(y);
    }

    def tax(x:Int, y:Int):Float={
        totSalary(x,y)*0.12f;
    }

    def takeHomeSal(x:Int,y:Int):Float={
        totSalary(x,y)-tax(x,y)
    }

    def main(args: Array[String]) = {
    println(takeHomeSal(30, 40));
  }
}
