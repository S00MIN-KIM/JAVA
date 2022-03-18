package Weapon;

import java.util.Random;

import Player.Player;

public class 돌덩이 extends Weapon implements myInterface.Throwable {
	private int weight;
	
	public 돌덩이() {}
    public 돌덩이(String name) {
		super(name);
		Random ran = new Random();
		weight = ran.nextInt(10)+1;
		this.setPower(weight*50);
	}

	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public void 던지기(Player target, Weapon weapon) {
		// TODO Auto-generated method stub
		System.out.println("돌덩이를 던집니다.");
		
	}


}
