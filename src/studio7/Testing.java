package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdDraw.setPenColor(255,0,0);
		double x=0;
		int y=0;
		double z=10/.02;
		while (y<z)
		{
		if (y%2!=0)
		{
		StdDraw.line(.2,x,.2,x+.02);
		x=x+.02;
		y++;
		}
		else
		{
		x=x+.02;
		y++;
		}
		}
	}

}
