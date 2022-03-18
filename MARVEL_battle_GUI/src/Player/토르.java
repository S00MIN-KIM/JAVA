package Player;

import Weapon.*;

public class 토르 extends Player implements myInterface.Shootable {

	public 토르() {}
	public 토르(String name) {
		super(name);
		this.set영어이름("Thor");
		this.setHp(1600);
		this.setPower(80);
		System.out.println("토르 생성 완료");
		무기설정();
	}
	
	public void 무기설정() {
		this.weapon1 = this.무기줍기();
		this.weapon2 = this.무기줍기();
		if (weapon1 instanceof 돌덩이)
			System.out.println("토르가 돌덩이를 발견했지만, 줍지 못했습니다.");
		else
			this.addweapon(weapon1);
		if ( weapon2 instanceof 돌덩이)
			System.out.println("토르가 돌덩이를 발견했지만, 줍지 못했습니다.");
		else
			this.addweapon(weapon2);
		this.showWeapon(this.name);
		System.out.println();
	}
	


	public String attack(Player target, Weapon weapon) {

		if (weapon instanceof 망치) {
			String 문구="토르가 "+target.name+"을(를) 망치로 때립니다!";
			망치로때리기(target, weapon);
			System.out.println("토르가 "+target.name+"을(를) 망치로 때립니다!");
			return 문구;
		}
		else {
			String 문구="토르가 "+target.name+"을(를)"+weapon.name +"으로 공격합니다!";
			총쏘기(target, weapon);
			System.out.println("토르가 "+target.name+"을(를)"+weapon.name +"으로 공격합니다!");
			return 문구;
		}
	}
	
	public void 망치로때리기(Player target, Weapon weapon) {
		
		target.setHp(target.getHp()-this.getPower()-weapon.getPower());
	}

	public void 총쏘기(Player target, Weapon weapon) {
		
		target.setHp(target.getHp()-this.getPower()-weapon.getBulletPower());
	}
}
