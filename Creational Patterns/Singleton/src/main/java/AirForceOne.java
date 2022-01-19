
public class AirForceOne {

    private static volatile AirForceOne onlyInstance;
    //Volatile keyword in Java is used as an indicator to Java compiler and Thread that do not cache value of this variable and always read it from main memory

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
