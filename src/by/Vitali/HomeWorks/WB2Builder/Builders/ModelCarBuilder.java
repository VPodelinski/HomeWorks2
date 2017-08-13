package by.Vitali.HomeWorks.WB2Builder.Builders;

import by.Vitali.HomeWorks.WB2Builder.ModelCar;

/**
  * Абстрактный класс для строителя типа комплектации
  */
public abstract class ModelCarBuilder {
    ModelCar modelCar;

    public void createModelCar(){
        modelCar = new ModelCar();
    }

    public abstract void buildComplectation();
    public abstract void buildCarInterior();
    public abstract void buildEngine();
    public abstract void buildWheels();
    public abstract void buildConditioner();
    public abstract void buildTransmission();

    public ModelCar getModelCar(){
        return modelCar;
    }
}
