package com.houseRent.service;

import com.houseRent.domain.House;

import java.util.Arrays;

// 定义House[],保存 house对象
// 响应 house view的调用
// 完成对房屋信息的各种操作(增删改查)
public class HouseService {
    private int houseNum = 2;
    private int idCounter = 2;
    private House [] houseList;
    private House [] newHouseList;


    public HouseService() {
        // 在这里给数组指定长度
        houseList = new House[houseNum];
        houseList[0] = new House(001, "penny",
                "123456", "Dublin 10",
                1200, "rented");
        houseList[1] = new House(002, "sara",
                "223456", "Dublin 2",
                1400, "waiting");
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public int getIdCounter() {
        return idCounter;
    }

    public void setIdCounter(int idCounter) {
        this.idCounter = idCounter;
    }

    // add a method, return house info list
    public House[] offerHouseList() {
        return houseList;
    }

    // add a method, add new house
    public boolean addHouse(House house) {
//        initial method, control the length of the array
//        if(houseNum >= houseList.length) {
//            return false;
//        }
        // 先赋值,再自增
//        houseList[houseNum++] = house;
        // 先自增,再赋值
//        house.setId(++idCounter);
//        return true;
//        other way to do it, extend the array
        newHouseList = new House[houseList.length + 1];
        for (int i = 0; i < newHouseList.length - 1; i++) {
            newHouseList[i] = houseList[i];
            System.out.println(houseList[i]);
        }
        newHouseList[houseNum++] = house;
        house.setId(++idCounter);
        houseList = newHouseList;
        return true;
    }
    public boolean delHouse(int id) {
        int index = -1;
//        if you find the item that you want to delete
        for (int i = 0; i < houseNum; i++) {
            if(id == houseList[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("did not find");
            return false;
        }
//        从要删除的下标开始,将后一项的值赋给前一项
//        必须要用有效的数组长度,如果用本来的数组长度,并没有删除,而是置为了null
//        再次删除的时候,因为该项为null,所以会报错
        for (int i = index; i < houseNum - 1; i++) {
            houseList[i] = houseList[i + 1];
        }
        //        最后把最后一项赋值为null,删除
        //        房屋总数-1
        houseList[--houseNum] = null;
        return true;
    }

    public House getHouse(int id) {
        for (int i = 0; i < houseNum; i++) {
            if(id == houseList[i].getId()) {
                return houseList[i];
            }
        }
        return null;
    }

//    public House updateHouse(House house) {
//        int index = -1;
//        for (int i = 0; i < houseNum; i++) {
//            if(house.getId() == houseList[i].getId()) {
//                houseList[i] = house;
//                System.out.println(houseList[i]);
//            }
//        }
//        if (index == -1) {
//            return null;
//        }
//        return house;
//    }
    @Override
    public String toString() {
        return "houseList=" + Arrays.toString(houseList);
    }
}
