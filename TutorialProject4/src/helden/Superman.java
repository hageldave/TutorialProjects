package helden;

public class Superman extends Hero implements IFly, IHear {
	
	public Superman() {
		super("Clark Kent", "Superman");
	}

	@Override
	public void enableFlying(boolean enable) {
		if(enable){
			System.out.println(this.getPseudonym() + " started to fly.");
		} else {
			System.out.println(this.getPseudonym() + " stopped to fly.");
		}
	}

	@Override
	public void enableSuperHearing(boolean enable) {
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
