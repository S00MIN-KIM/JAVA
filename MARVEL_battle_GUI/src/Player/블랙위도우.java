package Player;

import Weapon.*;

public class �������� extends Player implements myInterface.Shootable {

	public ��������() {}
	public ��������(String name) {
		super(name);
		this.set�����̸�("Black Widow");
		this.setHp(1500);
		this.setPower(80);
		System.out.println("�������� ���� �Ϸ�");
		���⼳��();
	}
	public void ���⼳��() {
		this.weapon1 = this.�����ݱ�();
		this.weapon2 = this.�����ݱ�();
		if (weapon1 instanceof ��ġ || weapon1 instanceof ������)
			System.out.println("�������찡 ���⸦ ȹ���Ϸ� �Ͽ�����, �ʹ� ���ſ��� �����߽��ϴ�.");
		else
			this.addweapon(weapon1);
		if (weapon2 instanceof ��ġ || weapon2 instanceof ������)
			System.out.println("�������찡 ���⸦ ȹ���Ϸ� �Ͽ�����, �ʹ� ���ſ��� �����߽��ϴ�.");
		else
			this.addweapon(weapon2);
		this.showWeapon(this.name);
		System.out.println();
	
	}
	
	public String attack(Player target, Weapon weapon) {
		String ���="�������찡 "+target.name+"��(��)"+weapon.name +"���� �����մϴ�!";
		System.out.println("�������찡 "+target.name+"��(��)"+weapon.name +"���� �����մϴ�!");
		�ѽ��(target, weapon);
		return ���;
	}
	
	public void �ѽ��(Player target, Weapon weapon) {
		target.setHp(target.getHp()-this.getPower()-weapon.getBulletPower());
	}


	
}
