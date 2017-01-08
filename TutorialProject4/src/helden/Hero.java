package helden;

public class Hero {

	private String name;
	private String pseudonym;
	
	/**
	 * Constructor, makes new Hero.
	 * @param name of the hero
	 * @param pseudonym of the hero
	 */
	public Hero(String name, String pseudonym){
		this.name = name;
		this.pseudonym = pseudonym;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPseudonym() {
		return pseudonym;
	}
	
	/**
	 * Makes the hero introduce himself.
	 * (prints a message to console)
	 */
	public void introduce(){
		System.out.println("Hey my name is " + name + ", Im'm also known as " + pseudonym + ".");
	}
}
