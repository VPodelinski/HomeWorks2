package by.Vitali.HomeWorks.WB2Builder;

import by.Vitali.HomeWorks.WB2Builder.Builders.BaseCarBuilder;
import by.Vitali.HomeWorks.WB2Builder.Builders.EconomCarBuilder;
import by.Vitali.HomeWorks.WB2Builder.Builders.LuxCarBuilder;

/**
  * Паттерн строитель (builder)
  * Программа будет строить различные комплектации автомобиля
  * Пример с тремя комплектациями: econom, base, lux
  */
public class Application {

    public static void main(String... args) {
        Director director = new Director();
        director.setModelCarBuilder(new LuxCarBuilder());
        ModelCar car = director.buildmodelCar();
        System.out.println(car);
        director.setModelCarBuilder(new EconomCarBuilder());
        car = director.buildmodelCar();
        System.out.println(car);
        director.setModelCarBuilder(new BaseCarBuilder());
        car = director.buildmodelCar();
        System.out.println(car);
    }
}
