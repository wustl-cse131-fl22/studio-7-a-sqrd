package studio7;

public class Fractions {
private int numerator;
private int denominator;

public Fractions(int numerator, int denominator) {
	super();
	this.numerator = numerator;
	this.denominator = denominator;
}
public int getNumerator() {
	return numerator;
}
public void setNumerator(int numerator) {
	this.numerator = numerator;
}
public int getDenominator() {
	return denominator;
}
public void setDenominator(int denominator) {
	this.denominator = denominator;
}
public Fractions Add(Fractions f) {
	int x = f.denominator*this.denominator;
	int y = f.denominator*this.denominator*this.numerator+f.denominator*this.denominator*f.numerator;
	return new Fractions(y,x);
	}
public Fractions Multiplication(Fractions f) {
	int x = f.denominator*this.denominator;
	int y = this.numerator*f.numerator;
	return new Fractions(y,x);
	}
public static int gcd(int p, int q) {
	if(p%q==0)
	{
		return q;
	}
	else
	{
		return gcd(q, p%q);
	}	
}

public Fractions Simplify() {
	int x = this.numerator/gcd(this.denominator,this.numerator);
	int y =this.denominator/gcd(this.denominator,this.numerator);
	return new Fractions(x,y);
	}
public Fractions recirpcal() {
	int x = this.numerator;
	int y =this.denominator;
	return new Fractions(y,x);
	}
public String toString() {
return numerator+"/"+denominator;	
}
}
