import java.util.ArrayList;

public class Roteador extends Switch {

    private ArrayList<TabelaRotas> tabelaRotas = new ArrayList();

    public Roteador(ArrayList<PortaSwitch> portas) {
        super(portas);
    }
}
