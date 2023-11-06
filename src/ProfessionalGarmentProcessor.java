// ProfessionalGarmentProcessor object that represents all garments of professional type
public class ProfessionalGarmentProcessor implements GarmentProcessor{
    @Override
    public Top createTop(){
        return new ProfessionalTop();
    }
    @Override
    public Pant createPant(){
        return new ProfessionalPant();
    }
    @Override
    public Shoe createShoe(){
        return new ProfessionalShoe();
    }
}
