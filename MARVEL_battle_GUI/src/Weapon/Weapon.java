package Weapon;

import Player.Player;

public abstract class Weapon implements myInterface.Attackable{
    public String name;
    private int power;

    public Weapon() {}
    public Weapon(String name) {
    	this.name = name;
    }
    
    public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getBulletPower(){
        return 0;
    }
	public abstract void 던지기(Player target, Weapon weapon);

	@Override
	public String attack(Player target) {
		// TODO Auto-generated method stub
		String 문구="타겟을 공격합니다.";
		System.out.println("타겟을 공격합니다.");
		return 문구;
	}
	@Override
	public String attack(Player target, Weapon weapon) {
		// TODO Auto-generated method stub
		String 문구="무기를 이용하여 공격합니다.";
		System.out.println("무기를 이용하여 공격합니다.");
		return 문구;
	}

}
