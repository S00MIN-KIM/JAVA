package Player;

import Suit.�����̴��Ǽ�Ʈ;

import Weapon.*;


public class �����̴��� extends Player implements myInterface.Shootable {

	private Suit.�����̴��Ǽ�Ʈ ��Ʈ;
	
	public �����̴���() {}
	public �����̴���(String name) {
		super(name);
		this.set�����̸�("Spiderman");
		this.setHp(1200);
		this.setPower(50);
		System.out.println("�����̴��� ���� �Ϸ�");
		if( (int) (Math.random()*100 ) <= 80 ) {
			��Ʈ = new �����̴��Ǽ�Ʈ("�����̴���Ʈ");
			set��Ʈ(��Ʈ);
			System.out.println("�����̴����� ��Ʈ (�̸�:"+��Ʈ.name+")��(��) �����͵� �Բ� �����Ǿ����ϴ�.");
			this.setHp(1400);
			this.setPower(50+��Ʈ.getPower());
		}
		else
			System.out.println("�����̴��� ��Ʈ�� �����Ͱ� ����... �����̴����̳׿�...");
		���⼳��();
	}
	public Suit.�����̴��Ǽ�Ʈ get��Ʈ() {
		return ��Ʈ;
	}
	public void set��Ʈ(Suit.�����̴��Ǽ�Ʈ ��Ʈ) {
		this.��Ʈ = ��Ʈ;
	}
	
	public void ���⼳��() {
		this.weapon1 = this.�����ݱ�();
		this.weapon2 = this.�����ݱ�();
		if (weapon1 instanceof ��ġ || weapon1 instanceof ������)
			System.out.println("�����̴����� ���⸦ ȹ���Ϸ� �Ͽ�����, �ʹ� ���ſ��� �����߽��ϴ�.");
		else
			this.addweapon(weapon1);
		if (weapon2 instanceof ��ġ || weapon2 instanceof ������)
			System.out.println("�����̴����� ���⸦ ȹ���Ϸ� �Ͽ�����, �ʹ� ���ſ��� �����߽��ϴ�.");
		else
			this.addweapon(weapon2);
		this.showWeapon(this.name);
		System.out.println();
		
	}
	

	public String attack(Player target, Weapon weapon) {
		String ����="�����̴����� "+target.name+"��(��)"+weapon.name +"���� �����մϴ�!";
		System.out.println("�����̴����� "+target.name+"��(��)"+weapon.name +"���� �����մϴ�!");
		�ѽ��(target, weapon);
		return ����;
	}
	
	public void �ѽ��(Player target, Weapon weapon) {
		target.setHp(target.getHp()-this.getPower()-weapon.getBulletPower());
	}

	
}
