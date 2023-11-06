// PartyGarmentProcessor object that represents all garments of party type
public class PartyGarmentProcessor implements GarmentProcessor{
    @Override
    public Top createTop(){
        return new PartyTop();
    }
    @Override
    public Pant createPant(){
        return new PartyPant();
    }
    @Override
    public Shoe createShoe(){
        return new PartyShoe();
    }
}
