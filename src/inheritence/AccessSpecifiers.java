package inheritence;

class Sample {
	private int a;
	
	private Sample(){
		System.out.println("hiii");
	}
	 Sample(int a){
		this.a=a;
	}
	private void sampleInput(int x) {
		this.a=a;
	}
	void returnSample() {
		System.out.println(a);
	}
}

class Sample2 {
	int b;
	Sample2(int x){
		this.b=x;
	}
	
}





public class AccessSpecifiers {
	public static void main (String[] args) {
		Sample s=new Sample(4);
//		 s=new Sample2(4);
	}
}
