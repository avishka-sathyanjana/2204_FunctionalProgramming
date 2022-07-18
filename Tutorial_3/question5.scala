object question5{
    
    def EasyPace(d1: Double):Double = d1*8.0;//time for easyoace

    def Tempo(d2: Double):Double = d2*7.0; // time for tempo

    def main(args: Array[String]):Unit = {
        println("The total running time = "+(EasyPace(2)+Tempo(3)+EasyPace(2))+" Minutes");
    }
}