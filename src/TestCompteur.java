public class TestCompteur {
    public static void main(String[] args){
        Compteur c = new Compteur();
        c.clic();
        c.clic();
        System.out.println("la valeur est : " + c.getValeur());
        c.raz();
        System.out.println("la valeur est : " + c.getValeur());
    }
}
