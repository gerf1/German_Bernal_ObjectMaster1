package com.codingdojo;

public class Human {
	
	int strength = 3;
	int stealth = 3;
	int intelligence =3;
	int health = 100;
	

public void attack(Human h) {
	 health -= strength;
	 
	 
 }

public void displayHealth() {
	
		System.out.println("Human health is, "+health);

}
}
