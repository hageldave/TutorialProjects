package helden;

public class Main {

	public static void main(String[] args) {
		Superman superman = new Superman();
		Ironman ironman = new Ironman();
		Daredevil daredevil = new Daredevil();
		
		superman.introduce();
		System.out.println("---");
		ironman.introduce();
		System.out.println("---");
		daredevil.introduce();
		System.out.println("---");
		
//		sendHeroTo(superman, "New York");
		sendFlyerTo(superman, "New York");
		
		IHear hearer = daredevil;
		hearer.hear("whisper whisper");
	}
	
	public static void sendFlyerTo(IFly flyer, String destination){
		flyer.enableFlying(true);
		System.out.println("Flies to " + destination);
		flyer.enableFlying(false);
	}
	
	
	public static void sendHeroTo(Hero hero, String destination){
		System.out.println(hero.getPseudonym() + " starts walking to " + destination +".");
		System.out.println(hero.getPseudonym() + ": 'sigh.. this takes forever I wish i could fly.'");
	}
}
