object question2{

    def checkNum(number: Int): String = number match{
        case x if x==0 => "Number is Zero";
        case x if (x<0 && x%2==0)  => "Number is Negative and Even";
        case x if (x<0 && x%2!=0)  => "Number is Negative and Odd";
        case x if (x>0 && x%2==0)  => "Number is Possitive and Even";
        case x if (x>0 && x%2!=0)  => "Number is Possitive and Odd";
    }

    def main(args: Array[String]) ={
        print("Enter a number : ")
        println(checkNum(scala.io.StdIn.readInt())); //passing input as a parameter to the function
    }
}