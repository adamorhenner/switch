public class Package {

    private String IpOrigin;

    private String IpDestiny;

    private String MacOrigin;

    private String MacDestiny;

    private String Payload;

    public Package(String ipOrigin, String ipDestiny, String macOrigin, String macDestiny, String payload) {
        IpOrigin = ipOrigin;
        IpDestiny = ipDestiny;
        MacOrigin = macOrigin;
        MacDestiny = macDestiny;
        Payload = payload;
    }
}
