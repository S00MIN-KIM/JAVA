package Player;

import Weapon.*;

public class �丣 extends Player implements myInterface.Shootable {

	public �丣() {}
	public �丣(String name) {
		super(name);
		this.set�����̸�("Thor");
		this.setHp(1600);
		this.setPower(80);
		System.out.println("�丣 ���� �Ϸ�");
		���⼳��();
	}
	
	public void ���⼳��() {
		this.weapon1 = this.�����ݱ�();
		this.weapon2 = this.�����ݱ�();
		if (weapon1 instanceof ������)
			System.out.println("�丣�� �����̸� �߰�������, ���� ���߽��ϴ�.");
		else
			this.addweapon(weapon1);
		if ( weapon2 instanceof ������)
			System.out.println("�丣�� �����̸� �߰�������, ���� ���߽��ϴ�.");
		else
			this.addweapon(weapon2);
		this.showWeapon(this.name);
		System.out.println();
	}
	


	public String attack(Player target, Weapon weapon) {

		if (weapon instanceof ��ġ) {
			String ����="�丣�� "+target.name+"��(��) ��ġ�� �����ϴ�!";
			��ġ�ζ�����(target, weapon);
			System.out.println("�丣�� "+target.name+"��(��) ��ġ�� �����ϴ�!");
			return ����;
		}
		else {
			String ����="�丣�� "+target.name+"��(��)"+weapon.name +"���� �����մϴ�!";
			�ѽ��(target, weapon);
			System.out.println("�丣�� "+target.name+"��(��)"+weapon.name +"���� �����մϴ�!");
			return ����;
		}
	}
	
	public void ��ġ�ζ�����(Player target, Weapon weapon) {
		
		target.setHp(target.getHp()-this.getPower()-weapon.getPower());
	}

	public void �ѽ��(Player target, Weapon weapon) {
		
		target.setHp(target.getHp()-this.getPower()-weapon.getBulletPower());
	}
}
