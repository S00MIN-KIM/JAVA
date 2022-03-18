package Player;

import java.util.ArrayList;
import java.util.Random;

import Weapon.*;

public abstract class Player implements myInterface.Attackable, myInterface.Hitable {

	public String name;
    private int hp;
    private int power;
    protected Weapon weapon1, weapon2;
    String 문구="";
    private ArrayList <Weapon> ws = new ArrayList <Weapon>();
    private String 영어이름;
    
    public Player() {
    	
    }
    public Player(String name) {
    	this.name = name;
    	
    }
    

    
    public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void 무기설정() {
		weapon1 = 무기줍기();
		weapon2 = 무기줍기();
		addweapon(weapon1);
		addweapon(weapon2);
		this.showWeapon(this.name);
	}
	
	public Weapon 무기줍기() {
		int random;
		random = (int)(Math.random()*100) +1;
		if (random <=25) 
			return new 망치("묠니르");
		else if (random <=50) 
			return new 권총("권총");
		else if (random <=75) 
			return new 샷건("샷건");
		else
			return new 돌덩이("돌덩이");
	}
	
	public void addweapon(Weapon weapon) {
		getWs().add(weapon);
	}

	public String attack(Player target) {
		
		if (getWs().size()==0) {
			문구=this.때리기(target);
			return 문구;
		}
		else {
			 Random random = new Random();
			 int ran = random.nextInt(getWs().size());
			문구=attack(target, getWs().get(ran));
			return 문구;
		}	
	}
	
	public abstract String attack(Player target, Weapon weapon);
	
	public String 때리기(Player target) {
		String 문구=this.name+"(이)가 "+target.name+"을(를) 때렸습니다.";
		System.out.println(this.name+"(이)가 "+target.name+"을(를) 때렸습니다.");
		target.hp -= this.power;
		return 문구;
	}
	


//    public static void show_header(int round){
//    	System.out.println("------------------------------round"+round+"------------------------------");
//    }
    
    public void showWeapon(String name) {
    	System.out.print(name+" 소유 무기: ");
    	for (int i=0; i<this.getWs().size(); i++)
    		try {
    			System.out.print(this.getWs().get(i).name);
    			System.out.print("  ");
    		}catch(ArrayIndexOutOfBoundsException e) {
    			System.out.println();
    			break;
    		}
    	System.out.println();
    }
//
//    public void show(){
//    	System.out.println();
//    	System.out.println("##############################");
//    	System.out.println("▶이름: "+this.name);
//    	System.out.println("▶HP: "+this.hp);
//    	System.out.println("▶power: "+this.power);
//    	System.out.println("##############################");
//    	System.out.println();
//    }
	public ArrayList <Weapon> getWs() {
		return ws;
	}
	public void setWs(ArrayList <Weapon> ws) {
		this.ws = ws;
	}
	public String get영어이름() {
		return 영어이름;
	}
	public void set영어이름(String 영어이름) {
		this.영어이름 = 영어이름;
	}

}
