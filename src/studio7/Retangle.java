package studio7;

public class Retangle {
	
	private int width;
	private int length;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Retangle(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}
	public int area () {
		return this.width*this.length;
	}
	public int perimiter () {
		return 2*this.width+2*this.length;
	}
	public boolean isLarger(Retangle r) {
		return (r.area()<this.area());
	}
}
