package Weapon;

import Player.Player;

public class 망치 extends Weapon implements myInterface.Hitable {

	public 망치() {}
	public 망치(String name) {
		super(name);
		this.setPower(50);
	}
	@Override
	public String 때리기(Player target) {
		// TODO Auto-generated method stub
		String 문구="망치로 때립니다.";
		System.out.println("망치로 때립니다.");
		return 문구;
	}
	
	public void 던지기(Player target, Weapon weapon) {
		// TODO Auto-generated method stub
		System.out.println("망치를 던집니다.");
		
	}
}
