

public interface Host {

    public abstract void receberPacote(Package aPackage) ;

    public abstract void sendPackage(Package package1);

    public abstract Boolean getItsMe(String ip);
}
