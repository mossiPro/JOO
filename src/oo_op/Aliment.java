package oo_op;

public class Aliment {

    String name;
    boolean estCuit = false;

    public void manger(){
        if (estCuit)
            System.out.println("Yam yam !!! cet aliment  " + "*"+name + "*" + " est bien cuit :)");
        else
            System.out.println("Beeeeeeeeerk !!! cet aliment " + "*"+name + "*"+ " est cruuuuuuuu!!!");
    }

}
