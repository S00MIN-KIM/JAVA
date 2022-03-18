package Player;

import Weapon.*;

public class 블랙위도우 extends Player implements myInterface.Shootable {

	public 블랙위도우() {}
	public 블랙위도우(String name) {
		super(name);
		this.set영어이름("Black Widow");
		this.setHp(1500);
		this.setPower(80);
		System.out.println("블랙위도우 생성 완료");
		무기설정();
	}
	public void 무기설정() {
		this.weapon1 = this.무기줍기();
		this.weapon2 = this.무기줍기();
		if (weapon1 instanceof 망치 || weapon1 instanceof 돌덩이)
			System.out.println("블랙위도우가 무기를 획득하려 하였으나, 너무 무거워서 실패했습니다.");
		else
			this.addweapon(weapon1);
		if (weapon2 instanceof 망치 || weapon2 instanceof 돌덩이)
			System.out.println("블랙위도우가 무기를 획득하려 하였으나, 너무 무거워서 실패했습니다.");
		else
			this.addweapon(weapon2);
		this.showWeapon(this.name);
		System.out.println();
	
	}
	
	public String attack(Player target, Weapon weapon) {
		String 출력="블랙위도우가 "+target.name+"을(를)"+weapon.name +"으로 공격합니다!";
		System.out.println("블랙위도우가 "+target.name+"을(를)"+weapon.name +"으로 공격합니다!");
		총쏘기(target, weapon);
		return 출력;
	}
	
	public void 총쏘기(Player target, Weapon weapon) {
		target.setHp(target.getHp()-this.getPower()-weapon.getBulletPower());
	}


	
}
