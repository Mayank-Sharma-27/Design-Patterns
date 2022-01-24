package aircraft;

public interface IAircraftPrototype {

    void fly();

    IAircraftPrototype clone();

    void setEngine(String engine);

}
