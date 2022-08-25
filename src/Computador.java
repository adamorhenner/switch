import java.util.ArrayList;

public class Computador extends Host{

    private ArrayList<TableMac>  tableMac = new ArrayList();

    public Computador(String ip, String macAdress) {
        super(ip, macAdress);
    }

    @Override
    public void getPackage() {

    }

    @Override
    public void sendPackage(Package package1) {

    }


    public void sendMessage(String message, String hostIp) {
        String ipOrigin = this.Ip;
        String ipDestiny = hostIp;
        String macOrigin = this.MacAdress;
        String macDestiny = this.getMacDestiny();
        String payload = message;


        Package package1 = new Package(ipOrigin, ipDestiny,macOrigin, macDestiny, payload);

        sendPackage(package1);

    }

    private String getMacDestiny() {

        return null;
    }
}
