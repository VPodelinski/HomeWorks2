package by.Vitali.HomeWorks.WB2Builder;

import by.Vitali.HomeWorks.WB2Builder.AutoParts.CarInterior;
import by.Vitali.HomeWorks.WB2Builder.AutoParts.Engine;
import by.Vitali.HomeWorks.WB2Builder.AutoParts.Transmission;

/**
 * Класс описывающий комплектацию автомобиля
 */
public class ModelCar {

    private String complectation;
    private CarInterior carInterior;
    private Engine engine;
    private int wheels;
    private String conditioner;
    private Transmission transmission;

    public void setComplectation(String complectation) {
        this.complectation = complectation;
    }

    public void setCarInterior(CarInterior carInterior) {
        this.carInterior = carInterior;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setConditioner(String conditioner) {
        this.conditioner = conditioner;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Комплектация автомобиля " + complectation + ". В комплекте: салон - "+
                carInterior + ", двигатель - " + engine +" (мощность - " + engine.getPower()+
                " л.с. max скорость - "+ engine.getMaxSpeed()+"),\nдиаметр колес - "+ wheels +
                ", наличие кондиционера - "+ conditioner +", коробка передач " + transmission +"\n";
    }
}
