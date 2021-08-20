object q1 extends App{

val r = new Rational(6,8)
println(r.neg)
}

class Rational(m:Int,d:Int){
def numer=m
def denom=d

def neg = new Rational(-this.numer,this.denom)
override def toString = numer + "/" + denom

}