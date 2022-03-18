package Player;

import java.util.ArrayList;
import java.util.Random;

import Weapon.*;

public abstract class Player implements myInterface.Attackable, myInterface.Hitable {

	public String name;
    private int hp;
    private int power;
    protected Weapon weapon1, weapon2;
    String ����="";
    private ArrayList <Weapon> ws = new ArrayList <Weapon>();
    private String �����̸�;
    
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

	public void ���⼳��() {
		weapon1 = �����ݱ�();
		weapon2 = �����ݱ�();
		addweapon(weapon1);
		addweapon(weapon2);
		this.showWeapon(this.name);
	}
	
	public Weapon �����ݱ�() {
		int random;
		random = (int)(Math.random()*100) +1;
		if (random <=25) 
			return new ��ġ("���ϸ�");
		else if (random <=50) 
			return new ����("����");
		else if (random <=75) 
			return new ����("����");
		else
			return new ������("������");
	}
	
	public void addweapon(Weapon weapon) {
		getWs().add(weapon);
	}

	public String attack(Player target) {
		
		if (getWs().size()==0) {
			����=this.������(target);
			return ����;
		}
		else {
			 Random random = new Random();
			 int ran = random.nextInt(getWs().size());
			����=attack(target, getWs().get(ran));
			return ����;
		}	
	}
	
	public abstract String attack(Player target, Weapon weapon);
	
	public String ������(Player target) {
		String ����=this.name+"(��)�� "+target.name+"��(��) ���Ƚ��ϴ�.";
		System.out.println(this.name+"(��)�� "+target.name+"��(��) ���Ƚ��ϴ�.");
		target.hp -= this.power;
		return ����;
	}
	


//    public static void show_header(int round){
//    	System.out.println("------------------------------round"+round+"------------------------------");
//    }
    
    public void showWeapon(String name) {
    	System.out.print(name+" ���� ����: ");
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
//    	System.out.println("���̸�: "+this.name);
//    	System.out.println("��HP: "+this.hp);
//    	System.out.println("��power: "+this.power);
//    	System.out.println("##############################");
//    	System.out.println();
//    }
	public ArrayList <Weapon> getWs() {
		return ws;
	}
	public void setWs(ArrayList <Weapon> ws) {
		this.ws = ws;
	}
	public String get�����̸�() {
		return �����̸�;
	}
	public void set�����̸�(String �����̸�) {
		this.�����̸� = �����̸�;
	}

}
