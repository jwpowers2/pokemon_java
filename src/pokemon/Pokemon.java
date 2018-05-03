package pokemon;

public class Pokemon {

	private String name;
	private int health;
	private String type;
	public static int count;
	
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
	}
	
	// getters and setters
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setHealth(int amount) {
		this.health += amount;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setCount(int amount) {
		count += amount;
	}
	
	public int getCount() {
		return count;
	}
}
