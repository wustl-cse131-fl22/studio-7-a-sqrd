package studio7;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Retangle r1=new Retangle(1,1);
		System.out.println(r1.isLarger(new Retangle (2,2)));
		Die D20 = new Die(20);
		System.out.println(D20.roll());
		Fractions f1 = new Fractions (1,8);
		Fractions f2=f1.Add(f1);
		System.out.println(f2.Simplify());
		
		Fractions f3=f1.Multiplication(f1);
		System.out.println(f3.Simplify());
	}
}
