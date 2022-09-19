import scala.math

case class Point(x: Int, y: Int) {

    def +(that: Point) = Point(this.x + that.x, this.y + that.y);
    def move(dx: Int, dy: Int) = Point(this.x + dx, this.y + dy);
    def invert ()= Point(this.y, this.x); //change its x and y

    //equation d^2 = (x1-x2)^2 + (y1-y2)^2
    def distance(that: Point) ={ 
        math.sqrt(math.pow(this.x - that.x, 2) + math.pow(this.y - that.y, 2))
    }
}

object question1 extends App{

    var p1 = Point(0,0);
    var p2 = Point(3,4);

    println("Point 1: " + p1);
    println("Point 2: " + p2);

    println("\nPoint 1 + Point 2 = " + (p1 + p2));

    var p3 = p1.move(6,8);
    println("\nMove point 1 by 2 => " + p3);

    //println("\nDistance between Point 1 and Point 2: " + p1.distance(p2))
    println("\nDistance between Point 3 and Point 2 is " + p3.distance(p2)); 
    println("\nInverse of Point 1 is " + p2.invert());

}

