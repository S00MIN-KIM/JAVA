package Weapon;

import java.util.ArrayList;

import Player.*;

public abstract class �� extends Weapon implements myInterface.Shootable {
    private int �Ѿ�power;

    public ��(){
    }
    public ��(String name) {
    	super(name);
    }


    public int get�Ѿ�power() {
		return �Ѿ�power;
	}
	public void set�Ѿ�power(int �Ѿ�power) {
		this.�Ѿ�power = �Ѿ�power;
	}
	
	public abstract void �ѽ��(Player target, Weapon weapon);
	
	

}
