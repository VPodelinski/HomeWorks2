package by.Vitali.HomeWorks.WB2Builder;

import by.Vitali.HomeWorks.WB2Builder.Builders.ModelCarBuilder;

/**
 * Director
 */
public class Director {
    ModelCarBuilder modelCarBuilder;

    public void setModelCarBuilder(ModelCarBuilder modelCarBuilder) {
        this.modelCarBuilder = modelCarBuilder;
    }
    // метод создающий комплектацию и возвращающий авто
    ModelCar buildmodelCar(){
        modelCarBuilder.createModelCar();
        modelCarBuilder.buildComplectation();
        modelCarBuilder.buildCarInterior();
        modelCarBuilder.buildConditioner();
        modelCarBuilder.buildEngine();
        modelCarBuilder.buildWheels();
        modelCarBuilder.buildTransmission();
        ModelCar modelCar = modelCarBuilder.getModelCar();
        return modelCar;
    }
}