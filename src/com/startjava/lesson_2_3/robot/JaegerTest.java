package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {

        Jaeger bracerPxoenix = new Jaeger();
        bracerPxoenix.setModelName("Bracer Pxoenix");
        bracerPxoenix.setMark("Mark-5");
        bracerPxoenix.setOrigin("USA");
        bracerPxoenix.setHeight(70.7f);
        bracerPxoenix.setWeight(2.1f);
        bracerPxoenix.setStrength(8);
        bracerPxoenix.setArmor(9);

        Jaeger coyoteTango = new Jaeger("Coyote Tango", "Mark-1", "Japan", 85.34f, 2.3f, 7, 4);

// просто вызывать методы и показывать переменные слишком скучно, поэтому я увлекся и решил 
// при помощи этой программы сравнить характеристики 2-х роботов. Надеюсь не переборщил ^_^
        System.out.println(" Внимание! Сравнение характеристик боевых роботов: \n " + 
                bracerPxoenix.getModelName() + " " + bracerPxoenix.getMark() + " " + 
                bracerPxoenix.getОrigin() + "\n    VS  \n " + coyoteTango.getModelName() + " " +
                coyoteTango.getMark() + " " + coyoteTango.getОrigin() + "\n");
        if (bracerPxoenix.getHeight() > coyoteTango.getHeight()) {
            System.out.println (" " + bracerPxoenix.getModelName() + " выше чем " + 
                    coyoteTango.getModelName());
        } else if (bracerPxoenix.getHeight() < coyoteTango.getHeight()) {
            System.out.println (" " + coyoteTango.getModelName() + " выше чем " + 
                    bracerPxoenix.getModelName());
        } else {
            System.out.println (" Роботы равны по высоте");
        }
        if (bracerPxoenix.getWeight() > coyoteTango.getWeight()) {
            System.out.println (" " + bracerPxoenix.getModelName() + " массивнее чем " + 
                    coyoteTango.getModelName());
        } else if (bracerPxoenix.getWeight() < coyoteTango.getWeight()) {
            System.out.println (" " + coyoteTango.getModelName() + " массивнее чем " + 
                    bracerPxoenix.getModelName());
        } else {
            System.out.println (" Роботы одинаково массивны");
        }
        if (bracerPxoenix.getStrength() > coyoteTango.getStrength()) {
            System.out.println (" " + bracerPxoenix.getModelName() + " мощнее чем " + 
                    coyoteTango.getModelName());
        } else if (bracerPxoenix.getStrength() < coyoteTango.getStrength()) {
            System.out.println (" " + coyoteTango.getModelName() + " мощнее чем " + 
                    bracerPxoenix.getModelName());
        } else {
            System.out.println (" Боевая мощь роботов одинакова");
        }
        if (bracerPxoenix.getArmor() > coyoteTango.getArmor()) {
            System.out.println (" " + bracerPxoenix.getModelName() + " более бронированный чем " + 
                    coyoteTango.getModelName());
        } else if (bracerPxoenix.getArmor() < coyoteTango.getArmor()) {
            System.out.println (" " + coyoteTango.getModelName() + " более бронированный чем " + 
                    bracerPxoenix.getModelName());
        } else {
            System.out.println (" Броня роботов одинакова");
        }
        System.out.println (" Тест драйв робота " + bracerPxoenix.getModelName());
        bracerPxoenix.move();
        bracerPxoenix.useWeapon();
        System.out.println(" Статус дрифта: " + bracerPxoenix.drift());
        System.out.println(" Статус сканера: " + bracerPxoenix.scaning());
        System.out.println (" Тест драйв робота " + coyoteTango.getModelName() + "\n");
        coyoteTango.move();
        coyoteTango.useWeapon();
        System.out.println(" Статус дрифта: " + coyoteTango.drift());
        System.out.println(" Статус сканера: " + coyoteTango.scaning() + "\n");
        System.out.println(" Модифицируем робота " + coyoteTango.getModelName() + 
                " : текущая броня = " + coyoteTango.getArmor());
        coyoteTango.setArmor(coyoteTango.getArmor() + 2);
        System.out.println(" Произведено усиление брони " + coyoteTango.getModelName() + 
                " : текущая броня = " + coyoteTango.getArmor());
    }
}