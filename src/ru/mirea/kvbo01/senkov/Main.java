package ru.mirea.kvbo01.senkov;

public class Main {

    public static void main(String[] args) {
        Season mySeason = Season.SUMMER;
        mySeason.info();
        System.out.println(mySeason.srtemp);
        mySeason.iLike();
        mySeason.getDescription();
        /////////////////////
        mySeason=Season.WINTER;
        mySeason.info();
        System.out.println(mySeason.srtemp);
        mySeason.iLike();
        mySeason.getDescription();
    }
}
