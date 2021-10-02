public abstract class Vestimenta {
    private Vestimenta vestimenta;

    public Vestimenta (Vestimenta vestimenta){
        this.vestimenta = vestimenta;
    }

    public Vestimenta (){

    }

    protected abstract String roupaEspecifica();

    public String retornaRoupa(){
        if(vestimenta != null)
            return vestimenta.retornaRoupa().concat(" " + roupaEspecifica());
        else
            return roupaEspecifica(); 
    }
}

