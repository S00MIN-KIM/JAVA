package Player;

import Suit.아이언맨수트;
import Weapon.*;


public class 아이언맨 extends Player implements myInterface.Shootable {

	private Suit.아이언맨수트 수트;
	public 아이언맨() {
		
	}
	public 아이언맨(String name) {
		super(name);
		this.set영어이름("Iron man");
		this.setHp(1200);
		this.setPower(50);
		System.out.println("아이언맨 생성 완료");
		if( (int) (Math.random()*100 ) <= 80 ) {
			수트 = new 아이언맨수트("마크85");
			set수트(수트);
			System.out.println("아이언맨 수트 (이름:"+수트.name+")도 함께 생성되었습니다.");
			this.setHp(1400);
			this.setPower(50+수트.getPower());
		}
		else
			System.out.println("아이언맨 수트가 없는... 아이언맨이네요...");
		무기설정();
	}
	public Suit.아이언맨수트 get수트() {
		return 수트;
	}
	public void set수트(Suit.아이언맨수트 수트) {
		this.수트 = 수트;
	}	
	
	public void 무기설정() {
		this.weapon1 = this.무기줍기();
		this.weapon2 = this.무기줍기();
		if (weapon1 instanceof 망치 || weapon1 instanceof 돌덩이)
			System.out.println("아이언맨이 무기를 획득하려 하였으나, 아이언맨이 이용하기엔 적합하지 않군요.");
		else
			this.addweapon(weapon1);
		if (weapon2 instanceof 망치 || weapon2 instanceof 돌덩이)
			System.out.println("아이언맨이 무기를 획득하려 하였으나, 아이언맨이 이용하기엔 적합하지 않군요.");
		else
			this.addweapon(weapon2);
		this.showWeapon(this.name);
		System.out.println();
	
	}
	


	public String attack(Player target, Weapon weapon) {
		String 문구="아이언맨이 "+target.name+"을(를)"+weapon.name +"으로 공격합니다!";
		System.out.println("아이언맨이 "+target.name+"을(를)"+weapon.name +"으로 공격합니다!");
		총쏘기(target, weapon);
		return 문구;
	}
	
	public void 총쏘기(Player target, Weapon weapon) {
		target.setHp(target.getHp()-this.getPower()-weapon.getBulletPower());
	}

	

}
