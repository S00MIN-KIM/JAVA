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
	public abstract void ������(Player target, Weapon weapon);

	@Override
	public String attack(Player target) {
		// TODO Auto-generated method stub
		String ����="Ÿ���� �����մϴ�.";
		System.out.println("Ÿ���� �����մϴ�.");
		return ����;
	}
	@Override
	public String attack(Player target, Weapon weapon) {
		// TODO Auto-generated method stub
		String ����="���⸦ �̿��Ͽ� �����մϴ�.";
		System.out.println("���⸦ �̿��Ͽ� �����մϴ�.");
		return ����;
	}

}
