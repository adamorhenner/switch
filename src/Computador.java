import java.util.ArrayList;

public class Computador extends Host{

    private ArrayList<TableMac>  tableMac = new ArrayList();

    private Switch aSwitch;

    public Computador(String ip, String macAdress) {
        super(ip, macAdress);
    }

    public ArrayList<TableMac> getTableMac() {
        return tableMac;
    }

    public void setTableMac(ArrayList<TableMac> tableMac) {
        this.tableMac = tableMac;
    }

    public Switch getaSwitch() {
        return aSwitch;
    }

    public void setaSwitch(Switch aSwitch) {
        this.aSwitch = aSwitch;
    }

    @Override
    public void getPackage() {

    }

    @Override
    public void sendPackage(Package package1) {

    }


    public Package sendMessage(String message, String hostIp) {
        String ipOrigin = this.Ip;
        String ipDestiny = hostIp;
        String macOrigin = this.MacAdress;
        String macDestiny = this.getMacDestiny();
        String payload = message;


        Package package1 = new Package(ipOrigin, ipDestiny,macOrigin, macDestiny, payload);

        return package1;

    }

    private String getMacDestiny() {

        return null;
    }
}
