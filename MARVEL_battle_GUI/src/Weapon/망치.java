package Weapon;

import Player.Player;

public class ��ġ extends Weapon implements myInterface.Hitable {

	public ��ġ() {}
	public ��ġ(String name) {
		super(name);
		this.setPower(50);
	}
	@Override
	public String ������(Player target) {
		// TODO Auto-generated method stub
		String ����="��ġ�� �����ϴ�.";
		System.out.println("��ġ�� �����ϴ�.");
		return ����;
	}
	
	public void ������(Player target, Weapon weapon) {
		// TODO Auto-generated method stub
		System.out.println("��ġ�� �����ϴ�.");
		
	}
}
