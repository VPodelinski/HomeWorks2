package by.Vitali.HomeWorks.WB2Builder.Builders;

import by.Vitali.HomeWorks.WB2Builder.AutoParts.CarInterior;
import by.Vitali.HomeWorks.WB2Builder.AutoParts.Engine;
import by.Vitali.HomeWorks.WB2Builder.AutoParts.Transmission;

/**
  * Создание люкс комплектации
  */
public class LuxCarBuilder extends ModelCarBuilder {

    @Override
    public void buildComplectation() {
        modelCar.setComplectation("Lux");
    }
    @Override
    public  void buildCarInterior() {
        modelCar.setCarInterior(CarInterior.NATURALLASE);
    }

    @Override
    public  void buildEngine() {
        modelCar.setEngine(Engine.TURBOPETROL);
    }

    @Override
    public  void buildWheels() {
        modelCar.setWheels(19);

   }

    @Override
    public void buildConditioner() {
        modelCar.setConditioner("yes");
    }

    @Override
    public void buildTransmission() {
        modelCar.setTransmission(Transmission.AUTO);
    }
}
