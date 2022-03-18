package Player;

import Weapon.*;

public class 헐크 extends Player implements myInterface.Throwable {

	public 헐크() {}
	public 헐크(String name) {
		super(name);
		this.set영어이름("Hulk");
		this.setHp(2000);
		this.setPower(150);
		System.out.println("헐크 생성 완료");
		무기설정();
		System.out.println();
	}
	

	public String attack(Player target, Weapon weapon) {
		String 출력 ="헐크가 "+target.name+"에게 "+weapon.name+"을(를) 던집니다!";
		System.out.println("헐크가 "+target.name+"에게 "+weapon.name+"을(를) 던집니다!");
		던지기(target, weapon);
		
		return 출력;
	}
	
	public void 던지기(Player target, Weapon weapon) {
		target.setHp(target.getHp()-weapon.getPower());
		getWs().remove(weapon);
	}

}
