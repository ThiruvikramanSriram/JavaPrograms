package Interface;

interface allow{
	
}
class studentimpl implements allow{
	
}
class empl{
	
}

public class MarkerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentimpl s=new studentimpl();
		empl e=new empl();
		if(s instanceof allow)
			System.out.println("allow");
		if(e instanceof allow)
			System.out.println("allow");
	}

}
