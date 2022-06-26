package Homework3;

import java.time.Year;
import java.util.Calendar;


public class House {
    private int numberOfStoreys;
    private static int dateOfConstruction;
    private String name;
    private static Calendar nowadays = Calendar.getInstance();

    public House(int numberOfStoreys, int dateOfConstruction, String name) {
        this.numberOfStoreys = numberOfStoreys;
        this.dateOfConstruction = dateOfConstruction;
        this.name = name;
    }
    public String toString(){
        return "Комплекс " + name + " имеет " + numberOfStoreys +
                " этажей и построен в " + dateOfConstruction +
                " году";
    }
    public static void howOld (){
       if (dateOfConstruction < nowadays.get(Calendar.YEAR)){
           System.out.println("Возраст дома: "+ (nowadays.get(Calendar.YEAR)-dateOfConstruction));
        } else {
           System.err.println("Ошибка ввода данных!");
       }
    }

    public int getNumberOfStoreys() {
        return numberOfStoreys;
    }

    public void setNumberOfStoreys(int numberOfStoreys) {
        this.numberOfStoreys = numberOfStoreys;
    }

    public int getDateOfConstruction() {
        return dateOfConstruction;
    }

    public void setDateOfConstruction(int dateOfConstruction) {
        this.dateOfConstruction = dateOfConstruction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
