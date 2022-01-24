import aircraft.Boeing747;
import aircraft.F16;
import aircraft.IAircraft;
import aircraft.IAircraftPrototype;

public class Client {

    public static void main(String[] args) {

        F16 f16 = new F16.F16Builder()
                .buildCockpit("C")
                .buildEngine()
                .buildWings()
                .build();

        Boeing747 boeing = new Boeing747.Boeing747Builder()
                .buildCockpit("B")
                .buildEngine()
                .buildWings()
                .buildBathrooms()
                .build();

        IAircraftPrototype prototype = new F16();

        // Create F16-A
        IAircraftPrototype f16A = prototype.clone();
        f16A.setEngine("F52");

        // Create F16-B
        IAircraftPrototype f16B = prototype.clone();
        f16A.setEngine("F62");


        System.out.println(f16.getCockpit() + " " + f16.getEngine() + " " + f16.getWings());

        System.out.println(boeing.getCockpit() + " " + boeing.getEngine() + " " + boeing.getWings() + " " + boeing.getBathrooms());

//        System.out.println(f16A.getCockpit() + " " + f16A.getEngine() + " " + f16A.getWings());
//
//        System.out.println(f16B.getCockpit() + " " + f16B.getEngine() + " " + f16B.getWings() + " " + f16B.getBathrooms());

    }

}
