package Suit;

public abstract class Suit {
    public String name;
    private int power;
    
    public Suit() {}
    public Suit(String name) {
    	this.name = name;
    }
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}

}
