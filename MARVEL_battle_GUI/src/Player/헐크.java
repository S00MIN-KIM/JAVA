package Player;

import Weapon.*;

public class ��ũ extends Player implements myInterface.Throwable {

	public ��ũ() {}
	public ��ũ(String name) {
		super(name);
		this.set�����̸�("Hulk");
		this.setHp(2000);
		this.setPower(150);
		System.out.println("��ũ ���� �Ϸ�");
		���⼳��();
		System.out.println();
	}
	

	public String attack(Player target, Weapon weapon) {
		String ��� ="��ũ�� "+target.name+"���� "+weapon.name+"��(��) �����ϴ�!";
		System.out.println("��ũ�� "+target.name+"���� "+weapon.name+"��(��) �����ϴ�!");
		������(target, weapon);
		
		return ���;
	}
	
	public void ������(Player target, Weapon weapon) {
		target.setHp(target.getHp()-weapon.getPower());
		getWs().remove(weapon);
	}

}
