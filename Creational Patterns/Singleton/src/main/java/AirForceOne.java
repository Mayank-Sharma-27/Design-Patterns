
public class AirForceOne {

    private static volatile AirForceOne onlyInstance;

    private AirForceOne() {

    }

    public static AirForceOne getInstance() {
        if (onlyInstance == null) {
            synchronized (AirForceOne.class) {
                onlyInstance = new AirForceOne();
            }
        }
        return onlyInstance;
    }

}
