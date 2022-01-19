public class Client {

    public static void main(String[] args) {

        AirForceOne airForceOne = AirForceOne.getInstance();
        AirForceOne airForceOne1 = AirForceOne.getInstance();
        System.out.println(airForceOne);
        System.out.println(airForceOne1);

    }
}
