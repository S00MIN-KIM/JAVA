package Weapon;

import java.util.Random;

import Player.Player;

public class ������ extends Weapon implements myInterface.Throwable {
	private int weight;
	
	public ������() {}
    public ������(String name) {
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
	public void ������(Player target, Weapon weapon) {
		// TODO Auto-generated method stub
		System.out.println("�����̸� �����ϴ�.");
		
	}


}
