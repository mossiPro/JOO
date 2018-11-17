package oo_op;

public class Four {

    private int capacite ;
    private int puissance;

    private Resistance resistance;
    private Soufflerie soufflerie;


    public void couir(Aliment aliment){
        System.out.println("Je cuis un alimant " + "'"+  aliment.name + "'");
        System.out.println(" avec ma capacite de " + capacite + " littre");
        System.out.println(" et une puissance de " + puissance + " degrés");
        aliment.estCuit = true;
    }


    public int getCapacite(){
        return capacite;
    }

    public  int getPuissance(){
        return puissance;
    }

    public Resistance getResistance(){
        return resistance;
    }

    public Soufflerie getSoufflerie(){
        return soufflerie;
    }

    public void setCapacite(int capacite){
        System.out.println("La capacité est modifié!");
        this.capacite = capacite;
    }

    public  void setPuissance(int puissance){
        System.out.println("La Puissance est modifié!");
        this.puissance = puissance;
    }

}
