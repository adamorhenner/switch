public class Package {

    private String IpOrigin;

    private String IpDestiny;

    private String MacOrigin;

    private String MacDestiny;

    private String Payload;

    public String getIpOrigin() {
        return IpOrigin;
    }

    public void setIpOrigin(String ipOrigin) {
        IpOrigin = ipOrigin;
    }

    public String getIpDestiny() {
        return IpDestiny;
    }

    public void setIpDestiny(String ipDestiny) {
        IpDestiny = ipDestiny;
    }

    public String getMacOrigin() {
        return MacOrigin;
    }

    public void setMacOrigin(String macOrigin) {
        MacOrigin = macOrigin;
    }

    public String getMacDestiny() {
        return MacDestiny;
    }

    public void setMacDestiny(String macDestiny) {
        MacDestiny = macDestiny;
    }

    public String getPayload() {
        return Payload;
    }

    public void setPayload(String payload) {
        Payload = payload;
    }

    public Package(String ipOrigin, String ipDestiny, String macOrigin, String macDestiny, String payload) {
        IpOrigin = ipOrigin;
        IpDestiny = ipDestiny;
        MacOrigin = macOrigin;
        MacDestiny = macDestiny;
        Payload = payload;
    }
}
