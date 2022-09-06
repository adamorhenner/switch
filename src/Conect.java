
public class Conect {
    Switch aSwitch;
    Computador computador;

    public Conect(Switch aSwitch, Computador computador) {
        this.aSwitch = aSwitch;
        this.computador = computador;
        this.criarConexao();
    }

    public void criarConexao(){
        this.aSwitch.addHost(computador);
        this.computador.setaSwitch(aSwitch);
    }

    public Switch getaSwitch() {
        return aSwitch;
    }

    public void setaSwitch(Switch aSwitch) {
        this.aSwitch = aSwitch;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }
}
