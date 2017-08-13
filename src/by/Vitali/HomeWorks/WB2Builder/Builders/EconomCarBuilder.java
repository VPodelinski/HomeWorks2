package by.Vitali.HomeWorks.WB2Builder.Builders;


import by.Vitali.HomeWorks.WB2Builder.AutoParts.CarInterior;
import by.Vitali.HomeWorks.WB2Builder.AutoParts.Engine;
import by.Vitali.HomeWorks.WB2Builder.AutoParts.Transmission;

/**
     * Создание эконом комплектации
    + */
public class EconomCarBuilder extends ModelCarBuilder {

    @Override
    public void buildComplectation() {
        modelCar.setComplectation("Econom");
    }

    @Override
    public void buildCarInterior() {
        modelCar.setCarInterior(CarInterior.VELOUR);
    }

    @Override
    public void buildEngine() {
        modelCar.setEngine(Engine.DIESEL);
    }

    @Override
    public void buildWheels() {
        modelCar.setWheels(15);

    }

    @Override
    public void buildConditioner() {
        modelCar.setConditioner("no");
    }

    @Override
    public void buildTransmission() {
        modelCar.setTransmission(Transmission.MANUAL);
    }
}

