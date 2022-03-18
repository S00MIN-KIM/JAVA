package Weapon;

import java.util.ArrayList;

import Player.*;

public abstract class ÃÑ extends Weapon implements myInterface.Shootable {
    private int ÃÑ¾Ëpower;

    public ÃÑ(){
    }
    public ÃÑ(String name) {
    	super(name);
    }


    public int getÃÑ¾Ëpower() {
		return ÃÑ¾Ëpower;
	}
	public void setÃÑ¾Ëpower(int ÃÑ¾Ëpower) {
		this.ÃÑ¾Ëpower = ÃÑ¾Ëpower;
	}
	
	public abstract void ÃÑ½î±â(Player target, Weapon weapon);
	
	

}
