package by.Vitali.HomeWorks.WB2Builder.Builders;

import by.Vitali.HomeWorks.WB2Builder.AutoParts.CarInterior;
import by.Vitali.HomeWorks.WB2Builder.AutoParts.Engine;
import by.Vitali.HomeWorks.WB2Builder.AutoParts.Transmission;

/**
  * Создание базовой комплектации
  */
public class BaseCarBuilder extends ModelCarBuilder {

    @Override
    public void buildComplectation() {
        modelCar.setComplectation("Base");
    }

    @Override
    public void buildCarInterior() {
        modelCar.setCarInterior(CarInterior.SINTHETICLASE);
    }

    @Override
    public void buildEngine() {
        modelCar.setEngine(Engine.PETROL);
    }

    @Override
    public void buildWheels() {
        modelCar.setWheels(17);

    }

    @Override
    public  void buildConditioner() {
        modelCar.setConditioner("yes");
    }

    @Override
    public void buildTransmission() {
        modelCar.setTransmission(Transmission.AUTO);
    }
}
