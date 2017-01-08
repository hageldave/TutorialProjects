package helden;

public class Daredevil extends Hero implements IHear {

	boolean superhearing;
	
	public Daredevil() {
		super("Matthew Michael Murdock", "Daredevil");
	}
	
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("I also work as a Lawyer.");
	}

	
	public void enableSuperHearing(boolean enable){
		this.superhearing = enable;
		if(enable){
			System.out.println(this.getPseudonym() + " enabled his super hearing ability.");
		} else {
			System.out.println(this.getPseudonym() + " disabled his super hearing ability.");
		}
	}

	@Override
	public void hear(String tohear) {
		System.out.println(this.getPseudonym() + " hears: '" + tohear + "'");
	}
}
