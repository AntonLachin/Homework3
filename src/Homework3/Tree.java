package Homework3;

public class Tree {
    private int age;
    private boolean alive;
    private String name;

    public Tree(){
        System.err.println("Пустой конструктор без параметров сработал");
    }

    public Tree(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Tree(int age, boolean alive, String name){
        this.age = age;
        this.alive = alive;
        this.name = name;
    }

    public String toString(){
    return "Возраст = " + age + " ,вид - " + name + " ,"+ alive;
    }
}
