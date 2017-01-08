package helden;

public class Ironman extends Hero implements IFly {
	
	public Ironman() {
		super("Tony Stark", "Iron Man");
	}	
	
	@Override
	public void enableFlying(boolean enable) {
		if(enable){
			System.out.println(this.getPseudonym() + " started to fly.");
		} else {
			System.out.println(this.getPseudonym() + " stopped to fly.");
		}
	}
	
}
