package pack;

import java.util.ArrayList;

public class Car {
    public Car(String marca, String model, String an_fabricatie) {
        this.m_marca = marca;
        this.m_model = model;
        this.an_fabricatie = an_fabricatie;
    }

    private String m_marca;
    private String m_model;
    private String an_fabricatie;

    private ArrayList<Car> cars;


    public void addCar(Car c){
            cars.add(c);
    }
}
