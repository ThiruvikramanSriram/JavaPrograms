package inheritence;

public class StudentPojo {
	int a;
	int b;
	int c;
	public StudentPojo() {
	}
	public StudentPojo(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "StudentPojo [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
}


