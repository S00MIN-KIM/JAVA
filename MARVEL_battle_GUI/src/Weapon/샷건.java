package Weapon;

import Player.Player;

public class ���� extends �� {
	public ����() {}
	public ����(String name) {
		super(name);
		this.setPower(20);
		this.set�Ѿ�power(100);
	}
	public int getBulletPower(){
        return this.get�Ѿ�power();
    }

	@Override
	public void ������(Player target, Weapon weapon) {
		// TODO Auto-generated method stub
		System.out.println("������ �����ϴ�.");
	}
	@Override
	public void �ѽ��(Player target, Weapon weapon) {
		// TODO Auto-generated method stub
		System.out.println("������ ���ϴ�.");
		
	}

}
