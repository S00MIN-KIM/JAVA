package myInterface;

import Player.Player;
import Weapon.Weapon;

public interface Attackable {

	public String attack(Player target);
	public String attack(Player target, Weapon weapon);
	
}
