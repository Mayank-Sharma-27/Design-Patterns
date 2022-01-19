package aircraft;

import builders.AircraftBuilder;
import lombok.Data;

@Data
public class F16 extends IAircraft {


    public static F16Builder builder() {
        return new F16Builder();
    }

    public static class F16Builder extends AircraftBuilder {

        private String engine;
        private String wings;
        private String cockpit;

        @Override
        public AircraftBuilder buildCockpit(String cockpit) {
            this.cockpit = "f16 Cockpit";
            return this;
        }

        @Override
        public AircraftBuilder buildEngine() {
            this.engine = "f16 Engine";
            return this;
        }


        @Override
        public AircraftBuilder buildWings() {
            this.wings = "F16 wings";
            return this;
        }


        public IAircraft build() {
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
