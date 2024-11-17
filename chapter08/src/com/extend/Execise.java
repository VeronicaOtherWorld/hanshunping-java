package com.extend;

public class Execise {
    public static void main(String arg[]){
       PC pc = new PC();
       NotePad notePad = new NotePad();
        notePad.setHardware("hard");
        notePad.setMemoery(500);
        notePad.setCpu(222);
        System.out.println(pc.getDetail());
        System.out.println(pc.getCpu());
        System.out.println(notePad.getPrint());
    }

}

class Computer {
    private int cpu;
    private int memoery;
    private String hardware;

    public Computer() {
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getMemoery() {
        return memoery;
    }

    public void setMemoery(int memoery) {
        this.memoery = memoery;
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    public String getDetail() {
        return "cpu" + cpu + "memoery" + memoery + hardware;
    }
}

class PC extends Computer {
    private String brand;
    public PC() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

class NotePad extends PC {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrint() {
        String detail = getDetail();
        return detail;
    }
}