package com.houseRent.view;

import com.houseRent.domain.House;
import com.houseRent.service.HouseService;
import com.houseRent.utils.Utility;

public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseService service = new HouseService();
    private String name, address, phone, status;
    private double rent;
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
                    addHouse();
                    System.out.println("\t\t 1. add new house");
                    break;
                case '2':
                    System.out.println("\t\t 2.check the house");
                    checkHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    getHouseList();
                    break;
                case '6':
                    exitSys();
                    break;
                default:
                    break;
            }
        }while (loop);
    }

    // get the list of house
    public void getHouseList(){
        House[] houses =  service.offerHouseList();
        System.out.println("-----------*start checking house*----------");
        System.out.printf("%-8s %-10s %-12s %-15s %-10s %-10s%n","id","tname","phone","address","rent","status");
        for (int i = 0; i < houses.length ; i++) {
            if(houses[i] == null) break;
            System.out.println(houses[i]);
        }
        System.out.println("-----------*end checking house*----------");

    }

    // add a new house
    public void addHouse(){
        System.out.println("-----------*start adding house*----------");
        System.out.println("enter your name");
        name = Utility.readString(8);
        System.out.println("enter your phone number");
        phone = Utility.readString(11);
        System.out.println("enter your address");
        address = Utility.readString(20);
        System.out.println("enter your rent");
        rent = Utility.readInt(4);
        System.out.println("enter your status");
        status = Utility.readString(15);
        House newHouse = new House(0,name,phone,address,rent,status);
        if(service.addHouse(newHouse)){
            System.out.println("~~~house added~~~~");
        } else  {
            System.out.println("~~~house not added~~~~");
        }
    }
    //  delete a house
    public void delHouse(){
        System.out.println("-----------*start deling house*----------");
        System.out.println("enter the id of the house(-1 exit)");
        int delId = Utility.readInt();
        if(delId == -1) {
            System.out.println("~~~house not deleted~~~~");
            return;
        }
        System.out.println("please enter y/n: ");
        char choice = Utility.readConfirmSelection();
        if(choice == 'Y'){
            if(service.delHouse(delId)){
                System.out.println("~~~house deleted~~~~");
            } else {
                System.out.println("~~~house not deleted~~~~");
            }
        } else {
            System.out.println("~~~house not deleted~~~~");
        }
    }

    public void exitSys(){
        char c = Utility.readConfirmSelection();
        if(c == 'Y'){
            loop = false;
        }
    }

    public void checkHouse(){
        System.out.println("-----------*start checking house*----------");
        System.out.println("enter the id of the house you want to check");
        int checkId = Utility.readInt();
        House checkHouse = service.getHouse(checkId);
        if(checkHouse != null) {
            System.out.println(checkHouse);
            return;
        }
        System.out.println("~~~house not found~~~~");
    }

    public void updateHouse(){
        System.out.println("-----------*start updating house*----------");
        System.out.println("enter the id of the house you want to update(-1 exit)");
        int updateId = Utility.readInt();
        if(updateId == -1) {
            System.out.println("~~~house not updated~~~~");
            return;
        }
        House updateHouse = service.getHouse(updateId);
        if(updateHouse == null) {
            System.out.println("~~~house not found~~~~");
            return;
        }
        System.out.println("~~~~~please enter new information~~~~");
        System.out.println("name (" + updateHouse.getName() + "): ");
        // 用户会车,表示不修改改信息,默认为“”
        name = Utility.readString(8, "");
//      引用类型会直接影响修改原数组中的值
        if(!"".equals(name)) {
            updateHouse.setName(name);
        }
        System.out.println("phone (" + updateHouse.getPhone() + "): ");
        phone = Utility.readString(11, "");
        if(!"".equals(phone)) {
            updateHouse.setPhone(phone);
        }
        System.out.println("address (" + updateHouse.getAddress() + "): ");
        address = Utility.readString(20, "");
        if(!"".equals(address)) {
            updateHouse.setAddress(address);
        }
        System.out.println("rent (" + updateHouse.getRent() + "): ");
        rent = Utility.readInt(-1);
        if(rent == -1) {
            updateHouse.setRent(rent);
        }
        System.out.println("status (" + updateHouse.getStatus() + "): ");
        status = Utility.readString(15, "");
        if(!"".equals(status)) {
            updateHouse.setStatus(status);
        }
        System.out.println("~~~~~house updated~~~~");
    }
}
