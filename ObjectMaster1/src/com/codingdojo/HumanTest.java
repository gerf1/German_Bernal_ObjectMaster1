package com.codingdojo;

public class HumanTest {

	public static void main(String[] args) {
		Ninja ninja = new Ninja();
		Wizard wizard = new Wizard();
		Samurai samurai = new Samurai();
		
		
		wizard.attack(ninja);
		wizard.displayHealth();
		
	    ninja.attack(samurai);
	    ninja.displayHealth();
	    
	    wizard.attack(samurai);
		wizard.displayHealth();
		
        samurai.attack(ninja);
        samurai.displayHealth();


}}
