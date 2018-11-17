package oo_op;

public class Main {

    public static void main(String[] args) {

        Four petitFour = new Four();
  //      petitFour.puissance = 100;
//        petitFour.capacite = 30;

        Aliment cack = new Aliment();
        cack.name = "pain aux raisins";
        System.out.println(" Hi i am PetitFour :");
        System.out.println(" -------------------");

        petitFour.couir(cack);

        cack.manger();


    }
}
