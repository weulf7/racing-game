package org.example;

//"is-a relationship (inheritance)"
public class Car extends AutoVehicle {


    private int doorCount;


    public Car(Engine engine) {
        super(engine);
    }

    //contructor overloading
    public Car(){
        this(new Engine());
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}
