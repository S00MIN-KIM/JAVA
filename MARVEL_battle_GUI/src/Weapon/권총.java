package Weapon;

import Player.Player;

public class ±ÇÃÑ extends ÃÑ {

	public ±ÇÃÑ() {}
	public ±ÇÃÑ(String name) {
		super(name);
		this.setPower(10);
		this.setÃÑ¾Ëpower(80);
	}
	public int getBulletPower(){
        return this.getÃÑ¾Ëpower();
    }

	@Override
	public void ´øÁö±â(Player target, Weapon weapon) {
		// TODO Auto-generated method stub
		System.out.println("±ÇÃÑÀ» ´øÁý´Ï´Ù.");
	}

	public void ÃÑ½î±â(Player target, Weapon weapon) {
		// TODO Auto-generated method stub
		System.out.println("±ÇÃÑÀ» ½õ´Ï´Ù.");
	}


	
}
