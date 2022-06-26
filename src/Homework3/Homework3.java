package Homework3;

import java.time.LocalDate;
import java.util.Calendar;

public class Homework3 {
    public static void main(String[] args) {
        /**
         * first task
         */
        Study JavaProgram = new Study("Изучение Java - это просто!");
        System.out.println(JavaProgram);
        /**
         * second task
         */
        Car BMW = new Car(CarColor.WHITE);
        Car Nissan = new Car(1520.4, CarColor.RED);
        Car Lada = new Car();

        System.out.println(Lada);
        System.out.println(BMW);
        System.out.println(Nissan);
        /**
         * third task
         */
        House firstHouse = new House(10,1925,"Сталинка");
        System.out.println(firstHouse);
        House.howOld ();

        House secondHouse = new House(7, 2025, "Новая Заря");
        System.out.println(secondHouse);
        House.howOld ();
        /**
         * fourth task
         */
        Tree Birch = new Tree(12,"Birch");
        Tree Pine = new Tree(12,true,"Pine");
        Tree Rowan = new Tree();

        System.out.println(Birch);
        System.out.println(Pine);
    }
}

