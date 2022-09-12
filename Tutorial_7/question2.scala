class Rational(n: Int, d: Int){
    require(denominator > 0, "Denominator must be ono zero positive value") 
    def numerator = n;
    def denominator = d;

    def sub(r: Rational): Rational = {
        Rational(this.numerator*r.denominator - this.denominator*r.numerator , this.denominator*r.denominator);
    }

    override def toString(): String = numerator.toString() + "/" + denominator.toString();
}

object question2 extends App{

    var x = new Rational(3,4);
    var y = new Rational(5,8);
    var z = new Rational(2,7);
    
    println(x.sub(y).sub(z))
}