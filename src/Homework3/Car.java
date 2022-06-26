package Homework3;

public class Car {
    private String name;
    private double  weight;
    private CarColor carColor;
    /**
     * empty constructor
     */
    public Car(){
        System.out.println("This is an empty class!");
    }
    /**
     * constructor with parameter
     */
    public Car(CarColor carColor){
        this.carColor = carColor;
    }
    public Car (double weight, CarColor carColor){
        this.carColor = carColor;
        this.weight = weight;
    }
    public String toString(){
        return "name= " + name+
                ", weight= " + weight + '\''+
                ", color = " + carColor + '\'';
    }
}
