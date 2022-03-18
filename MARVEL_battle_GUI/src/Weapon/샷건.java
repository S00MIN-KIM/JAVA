package Weapon;

import Player.Player;

public class ¼¦°Ç extends ÃÑ {
	public ¼¦°Ç() {}
	public ¼¦°Ç(String name) {
		super(name);
		this.setPower(20);
		this.setÃÑ¾Ëpower(100);
	}
	public int getBulletPower(){
        return this.getÃÑ¾Ëpower();
    }

	@Override
	public void ´øÁö±â(Player target, Weapon weapon) {
		// TODO Auto-generated method stub
		System.out.println("¼¦°ÇÀ» ´øÁý´Ï´Ù.");
	}
	@Override
	public void ÃÑ½î±â(Player target, Weapon weapon) {
		// TODO Auto-generated method stub
		System.out.println("¼¦°ÇÀ» ½õ´Ï´Ù.");
		
	}

}
