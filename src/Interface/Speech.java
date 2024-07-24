package Interface;

public class Speech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		topics t=new PersonA();
		t.intro();
		t.expl();
		t.concl();
		t=new PersonB();
		t.intro();
		t.expl();
		t.concl();
		t=new PersonC();
		t.intro();
		t.expl();
		t.concl();
		PersonA a=new PersonA();
		a.intro();
		a.expl();
		a.concl();
		
		
		

	}

}
