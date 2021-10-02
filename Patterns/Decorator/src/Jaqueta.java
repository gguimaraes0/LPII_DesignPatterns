public class Jaqueta extends Vestimenta {
    public Jaqueta(Vestimenta vestimentaInterface){
        super(vestimentaInterface);
    }

    public Jaqueta(){

    }

    @Override
    protected String roupaEspecifica() {
        return "Jaqueta";
    }
}