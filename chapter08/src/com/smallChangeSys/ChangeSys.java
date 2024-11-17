package com.smallChangeSys;


import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class ChangeSys {
    public static void main(String[] args) {
        int time = 2;
        boolean flag = true;
        int menuNum;
        String details = "------details------";

        // add money
        double income = 0;
        double balance = 0;
        LocalDateTime currentDate;
        DateTimeFormatter formatter;
        String formattedDate;

        // 3 expense
        String comment;
        double expense;
        // 4 exit
        String choice = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("=========== Change Menu ============\n" +
                    "1. Detail\n" +
                    "2. Income\n" +
                    "3. Expense\n" +
                    "4. Exit\n" +
                    "Please choose a number between 1 and 4\n" +
                    "please enter a number: ");
            menuNum = sc.nextInt();
            System.out.println(menuNum);
            switch (menuNum){
                case 1:
                    System.out.println(details);
                    break;
                case 2:
                    System.out.println("enter your income: ");
                    income = sc.nextDouble();
                    balance += income;
                    currentDate = LocalDateTime.now();
                    formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                    formattedDate = currentDate.format(formatter);
                    details += "\nincome:" + income + "\t" + formattedDate + "\t" + "balance: " + balance;
                    System.out.println(details);
                    break;
                case 3:
                    System.out.println("enter your expense type: ");
                    comment = sc.next();
                    System.out.println("enter your expense money: ");
                    expense = sc.nextDouble();
                    balance -= expense;
                    currentDate = LocalDateTime.now();
                    formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                    formattedDate = currentDate.format(formatter);
                    details += "\n" + comment + ":" + expense + "\t"+ formattedDate + "\t" + "balance: " + balance;
                    System.out.println(details);
                    System.out.println("3.expense");
                    break;
                case 4:
                    // when user enter 4, ask them to make sure.
                    // only can enter y or n
                    // otherwise, keep asking
                    while (flag) {
                        System.out.println("do you really want to exit?(y/n): ");
                        choice = sc.next();
                        if (choice.equals("y") || choice.equals("n")) {
                            break;
                        }
                    }
                    if(choice.equals("y")) {
                        flag = false;
                    }
                    System.out.println("you exit");
                    break;
            }
        }while (flag);
    }
}
