// Driver class that displays interfaces & classes working
public class Main {
    public static void main(String[] args) {
        //First GarmentProcessor type
        System.out.println("/***************************************/");
        System.out.println("Testing Garment process");
        GarmentProcessor processor = new CasualGarmentProcessor();

        Top top = processor.createTop();
        Pant pant = processor.createPant();
        Shoe shoe = processor.createShoe();
        System.out.println("Top type: " + top.getType());
        System.out.println("Pant type: " + pant.getType());
        System.out.println("Shoe type: " + shoe.getType());


        //Second GarmentProcessor type
        System.out.println("/***************************************/");
        System.out.println("Testing Garment process2");
        GarmentProcessor processor2 = new ProfessionalGarmentProcessor();

        Top top2 = processor2.createTop();
        Pant pant2 = processor2.createPant();
        Shoe shoe2 = processor2.createShoe();
        System.out.println("Top type: " + top2.getType());
        System.out.println("Pant type: " + pant2.getType());
        System.out.println("Shoe type: " + shoe2.getType());


        //Third GarmentProcessor type
        System.out.println("/***************************************/");
        System.out.println("Testing Garment process3");
        GarmentProcessor processor3 = new PartyGarmentProcessor();

        //Third GarmentProcessor type
        Top top3 = processor3.createTop();
        Pant pant3 = processor3.createPant();
        Shoe shoe3 = processor3.createShoe();
        System.out.println("Top type: " + top3.getType());
        System.out.println("Pant type: " + pant3.getType());
        System.out.println("Shoe type: " + shoe3.getType());
    }
}