package aircraft;

import builders.AircraftBuilder;
import lombok.Data;


public class F16 extends IAircraft implements IAircraftPrototype {

    @Override
    public void fly() {
        System.out.println("F-16 flying...");
    }

    @Override
    public IAircraftPrototype clone() {
        return new F16();
    }


    public void setEngine(String engine) {
        super.setEngine(engine);
    }

    public static class F16Builder extends AircraftBuilder {

        private String engine;
        private String wings;
        private String cockpit;

        @Override
        public F16Builder buildCockpit(String cockpit) {
            this.cockpit = "f16 Cockpit";
            return this;
        }

        @Override
        public F16Builder buildEngine() {
            this.engine = "f16 Engine";
            return this;
        }


        @Override
        public F16Builder buildWings() {
            this.wings = "F16 wings";
            return this;
        }


        public F16 build() {
            if (this.cockpit == null || this.engine == null || this.wings == null) {
                throw new RuntimeException("All required properties are not present.");
            }
            F16 f16 = new F16();
            f16.setEngine(engine);
            f16.setWings(wings);
            f16.setCockpit(cockpit);
            return f16;
        }
    }

}
