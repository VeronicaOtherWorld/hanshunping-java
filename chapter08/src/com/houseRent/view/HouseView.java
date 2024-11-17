package com.houseRent.view;

import com.houseRent.utils.Utility;

public class HouseView {
    private boolean loop = true;
    private char key = ' ';

//    main menu
    public void mainMenu(){
        do {
            System.out.println("============house rent system menu============");
            System.out.println("\t\t 1. add new house");
            System.out.println("\t\t 2. check the house");
            System.out.println("\t\t 3. delete house information");
            System.out.println("\t\t 4. update house information");
            System.out.println("\t\t 5. show house information");
            System.out.println("\t\t 6. exit");
            System.out.println("enter your choice(1-6):  ");
            key = Utility.readChar();
            switch (key){
                case '1':
                    System.out.println("\t\t 1. add new house");
                    break;
                case '2':
                    System.out.println("\t\t 2.check the house");
                    break;
                case '3':
                    System.out.println("\t\t 3.delete house information");
                    break;
                case '4':
                    System.out.println("\t\t 4. update house information");
                    break;
                case '5':
                    System.out.println("\t\t 5. show house information");
                    break;
                case '6':
                    System.out.println("\t\t 6. exit");
                    break;
                default:
                    break;
            }
        }while (loop);
    }

}
