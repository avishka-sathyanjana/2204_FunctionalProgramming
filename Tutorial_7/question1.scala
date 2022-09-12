class Rational(n: Int, d: Int) {
    require(denominator > 0, "Denominator must be ono zero positive value") 
    def numerator = n
    def denominator = d

    def neg = new Rational(-this.numerator, this.denominator)
    override def toString(): String = numerator + "/" + denominator
}

object question1 extends App {
  
    val num = new Rational(5, 2)
    println(num.neg)

}
