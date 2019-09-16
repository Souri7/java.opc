package com.ocr.anthony;

import java.util.Scanner;

public class Order {
	public boolean allSidesEnable;
    /**
     * Display all available menus in the restaurant.
     */
    public void displayAvailableMenu() {
        System.out.println("Choix menu");
        System.out.println("1 - poulet");
        System.out.println("2 - boeuf");
        System.out.println("3 - végétarien");
        System.out.println("Que souhaitez-vous comme menu ?");
    }
    /**
     * Display a selected menu.
     * @param nbMenu The selected menu.
     */
    public void displaySelectedMenu(int nbMenu) {
        switch (nbMenu) {
            case 1:
                System.out.println("Vous avez choisi comme menu : poulet");
                break;
            case 2:
                System.out.println("Vous avez choisi comme menu : boeuf");
                break;
            case 3:
                System.out.println("Vous avez choisi comme menu : végétarien");
                break;
            default:
                System.out.println("Vous n'avez pas choisi de menu parmi les choix proposés");
                break;
        }
    }
    /**
     * Display all available side for the menu in the restaurant.
     */
    public void displayAvailableSide(int nbMenu) {
    	

    	System.out.println("Choix accompagnement");
    	if (nbMenu==1||nbMenu==2) {
    	allSidesEnable = true;
        System.out.println("1 - légumes frais");
        System.out.println("2 - frites");
        System.out.println("3 - riz");
        
        };
        if(nbMenu==3) {
        System.out.println("1 - riz");
        System.out.println("2 - pas de riz");
        }
        System.out.println("Que souhaitez-vous comme accompagnement ?");

        }
    
    /**
     * Display a selected side depending on all sides enable or not.
     * All sides = vegetables, chips and rice
     * No all sides = rice or not
     * @param nbSide The selected Side
     * @param allSidesEnable  enable display for all side or not
     */
    public void displaySelectedSide(int nbSide, boolean allSidesEnable) {

    	    if (allSidesEnable) {
    	        switch (nbSide) {
    	            case 1:
    	                System.out.println("Vous avez choisi comme accompagnement : légumes frais");
    	                break;
    	            case 2:
    	                System.out.println("Vous avez choisi comme accompagnement : frites");
    	                break;
    	            case 3:
    	                System.out.println("Vous avez choisi comme accompagnement : riz");
    	                break;
    	            default:
    	                System.out.println("Vous n'avez pas choisi d'accompagnement parmi les choix proposés");
    	                break;
    	        }
    	    } else {
    	        switch (nbSide) {
    	            case 1:
    	                System.out.println("Vous avez choisi comme accompagnement : riz");
    	                break;
    	            case 2:
    	                System.out.println("Vous avez choisi comme accompagnement : pas de riz");
    	                break;
    	            default:
    	                System.out.println("Vous n'avez pas choisi d'accompagnement parmi les choix proposés");
    	                break;
    	        }
    	    }
    	}
    
    
    /**
     * Run asking process for a menu.
     */
    public void runMenu() {
        this.displayAvailableMenu();
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        this.displaySelectedMenu(nb);
        this.displayAvailableSide(nb);
        Scanner sc1 = new Scanner(System.in);
        int nbSide = sc1.nextInt();
        this.displaySelectedSide(nbSide, allSidesEnable);
    }
}
