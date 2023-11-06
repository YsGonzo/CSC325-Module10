// CasualGarmentProcessor object that represents all garments of casual type
public class CasualGarmentProcessor implements GarmentProcessor{
    @Override
    public Top createTop(){
        return new CasualTop();
    }
    @Override
    public Pant createPant(){
        return new CasualPant();
    }
    @Override
    public Shoe createShoe(){
        return new CasualShoe();
    }
}
