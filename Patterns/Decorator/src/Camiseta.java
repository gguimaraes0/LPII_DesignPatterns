public class Camiseta extends Vestimenta{
    public Camiseta (Vestimenta vestimentaInterface){
        super(vestimentaInterface);
    }

    public Camiseta(){

    }

    @Override
    protected String roupaEspecifica() {
        return "Camiseta";
    }
}
