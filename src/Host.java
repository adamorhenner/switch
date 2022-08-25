public abstract class Host {
    String Ip;

    String MacAdress;

    public Host(String ip, String macAdress) {
        Ip = ip;
        MacAdress = macAdress;
    }

    public Host() {

    }

    public abstract void getPackage() ;

    public abstract void sendPackage(Package package1);

}
