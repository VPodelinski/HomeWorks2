package by.Vitali.HomeWorks.WB2Builder.AutoParts;


/**
  * Типы двигателей
  */
public enum Engine {
    DIESEL(100, 160), PETROL(120, 180), TURBOPETROL(180, 220);
    private int power;
    private int maxSpeed;

    Engine(int power,int maxSpeed){
        this.power = power;
        this.maxSpeed = maxSpeed;
    }

    public int getPower() {
        return power;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
}

