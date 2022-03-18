package Setting;
import java.util.ArrayList;

import Player.Player;

public class Player_team<T>{
	private T t;
	//T[] tt = new T[10];
	ArrayList <T> ar = new ArrayList <T>();

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public void add(T t) {
		ar.add(t);
	}

	public int size() {
		return ar.size();
	}

	public T get(int i) {
		return  ar.get(i);
	}

	public void remove(Player player) {
		ar.remove(player);
		
	}

}
