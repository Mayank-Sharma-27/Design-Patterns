import aircraft.Boeing747;
import aircraft.F16;
import aircraft.IAircraft;

public class Client {

    public static void main(String[] args) {

        IAircraft f16 = new F16.F16Builder()
                .buildCockpit("C")
                .buildEngine()
                .buildWings()
                .build();

        IAircraft boeing = new Boeing747.Boeing747Builder()
                .buildCockpit("B")
                .buildEngine()
                .buildWings()
                .buildBathrooms()
                .build();


        System.out.println(f16.getCockpit() + " " + f16.getEngine() + " " + f16.getWings());

        System.out.println(boeing.getCockpit() + " " + boeing.getEngine() + " " + boeing.getWings() + " " + boeing.getBathrooms());

    }

}
