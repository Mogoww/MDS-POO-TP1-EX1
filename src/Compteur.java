public class Compteur {
    //L’attribut val de type int.
    private int val;
    // Un constructeur qui initialise val à 0.
    public Compteur() {
        val = 0;
    }
    // La méthode void clic() qui incrémente le compteur.
    public void clic() {
        val++;
    }

    //La méthode void raz() qui réinitialise le compteur à 0.
    public void raz() {
        val = 0;
    }
    // La méthode int getValeur() qui retourne la valeur du compteur.
    public int getValeur() {
        return val;
    }

}
