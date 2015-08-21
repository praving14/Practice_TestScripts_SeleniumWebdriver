/**
 * Created by Pravin on 8/17/2015.
 */
public class MakingCoffee {

    public enum Flavors{
        BOLD,MILD,MOCHA
    }
    public enum CupSize{
        SMALL,MEDIUM, LARGE
    }

    public  Flavors cofeeFlavors;
    public CupSize sizeOfCoffee;

    public MakingCoffee(Flavors cofeeFlavors, CupSize sizeOfCoffee){
        this.cofeeFlavors = cofeeFlavors;
        this.sizeOfCoffee = sizeOfCoffee;
    }

    public void heatWater() {
        System.out.println("Fristly, Heat the water.");
    }

    public void addCream(){
        System.out.println("Add some cream");
    }

    public void stirIt(){
        System.out.println("Stir the cream and water using a spoon");
    }
    public void addFlavor(){
        System.out.println("Add the "+ cofeeFlavors +" on the coffee");
    }

    public void  pourIt(){
        System.out.println("After few minutes, pur the coffee in you " + sizeOfCoffee + " Cup");
    }




    public static void main(String[] args) {
        MakingCoffee cofeeMaker =  new MakingCoffee(Flavors.MOCHA, CupSize.LARGE);
        cofeeMaker.heatWater();
        cofeeMaker.addCream();
        cofeeMaker.stirIt();
        cofeeMaker.addFlavor();
        cofeeMaker.pourIt();



    }

}
