package builders;

import aircraft.IAircraft;

public abstract class AircraftBuilder {

    public AircraftBuilder buildEngine() {
        return this;
    }

    public AircraftBuilder buildWings() {
        return this;
    }

    public AircraftBuilder buildCockpit(String cockpit) {
        return this;
    }

    public AircraftBuilder buildBathrooms() {
        return this;
    }

    abstract public IAircraft build();


}
