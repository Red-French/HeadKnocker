package main;


public class Fighter {

	private String name; 
	private int weight;
	private static String bestPunch;
	private static int energy = 100;
	
	public Fighter(String name, int weight, String bestPunch) {
		this(energy, name, weight, bestPunch);  // send default energy with parameters
	}
	
	public Fighter(int energy, String name, int weight, String bestPunch) {
		super();
		this.name = name;
		this.weight = weight;
		Fighter.bestPunch = bestPunch;
		Fighter.energy = energy;
	}
	
	
	public String getName() {
		return name;
	}
	public int getWeight() {
		return weight;
	}
	public String getBestPunch() {
		return bestPunch;
	}
	public int getEnergy() {
		return energy;
	}

	public int setEnergy(int hit) {
		Fighter.energy = energy - hit;
		return Fighter.energy;
	}
	
}

