object question3{
    
    def sphereVolume(r: Double):Double = 4.0/3.0*math.Pi*r*r*r;

    def main(args: Array[String]):Unit={
        println("Volume of the Sphere = "+sphereVolume(5));
    }
}