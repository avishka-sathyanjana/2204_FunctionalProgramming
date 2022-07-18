object question2{
    
    def CelToFan(c:Double):Double = c*1.8 + 32;

    def main(args: Array[String]):Unit={
        println("Temperature in Farenheit = "+CelToFan(35));
    }
}