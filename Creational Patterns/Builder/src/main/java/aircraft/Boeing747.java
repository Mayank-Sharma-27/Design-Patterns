package aircraft;

import builders.AircraftBuilder;
import lombok.Data;

@Data
public class Boeing747 extends IAircraft {

    public static Boeing747Builder builder() {
        return new Boeing747Builder();
    }

    public static class Boeing747Builder extends AircraftBuilder {

        private String engine;
        private String wings;
        private String cockpit;
        private String bathrooms;

        @Override
        public Boeing747Builder buildCockpit(String cockpit) {
            this.cockpit = "Boeing747 Cockpit";
            return this;
        }

        @Override
        public Boeing747Builder buildEngine() {
            this.engine = "Boeing747 Engine";
            return this;
        }


        @Override
        public Boeing747Builder buildWings() {
            this.wings = "Boeing747 wings";
            return this;
        }

        @Override
        public Boeing747Builder buildBathrooms() {
            this.bathrooms = "Boeing747 bathrooms";
            return this;
        }


        public Boeing747 build() {
            if (this.cockpit == null || this.engine == null || this.wings == null) {
                throw new RuntimeException("All required properties are not present.");
            }
            Boeing747 boeing747 = new Boeing747();
            boeing747.setEngine(engine);
            boeing747.setWings(wings);
            boeing747.setCockpit(cockpit);
            boeing747.setBathrooms(bathrooms);
            return boeing747;
        }
    }
}
