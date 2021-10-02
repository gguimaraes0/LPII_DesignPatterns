public class Vestir {
    public static void main (String[] args){
        Vestimenta vestimenta = new Camiseta();
        System.out.println(vestimenta.retornaRoupa());

        vestimenta = new Jaqueta(vestimenta);
        System.out.println(vestimenta.retornaRoupa());

        vestimenta = new Cachecol(vestimenta);
        System.out.println(vestimenta.retornaRoupa());
    }
}
