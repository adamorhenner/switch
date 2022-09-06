

public abstract class Host {
    String Ip;

    String MacAdress;

    public Host(String ip, String macAdress) {
        Ip = ip;
        MacAdress = macAdress;
    }

    public Host() {

    }

    public String getIp() {
        return Ip;
    }

    public void setIp(String ip) {
        Ip = ip;
    }

    public String getMacAdress() {
        return MacAdress;
    }

    public void setMacAdress(String macAdress) {
        MacAdress = macAdress;
    }

    public abstract void receberPacote(Package aPackage) ;

    public abstract void sendPackage(Package package1);

}
