package Weapon;

import Player.Player;

public class ���� extends �� {

	public ����() {}
	public ����(String name) {
		super(name);
		this.setPower(10);
		this.set�Ѿ�power(80);
	}
	public int getBulletPower(){
        return this.get�Ѿ�power();
    }

	@Override
	public void ������(Player target, Weapon weapon) {
		// TODO Auto-generated method stub
		System.out.println("������ �����ϴ�.");
	}

	public void �ѽ��(Player target, Weapon weapon) {
		// TODO Auto-generated method stub
		System.out.println("������ ���ϴ�.");
	}


	
}
