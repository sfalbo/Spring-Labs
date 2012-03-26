package lab1;

/**
 *
 * @author jlombardo
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pet pet = new Cat("Snowpea", 10);
        PetOwner owner = new PetOwner("Jake", pet);

        String petName = owner.getPet().getName();
        int realAge = owner.getPet().getRealAge();
        int adjAge = owner.getPet().getAgeInAnimalYears();

        System.out.println("The pet named "
                + petName + " owned by " + owner.getName()
                + " is really " + realAge + " years old, but "
                + "acts like an animal that is " + adjAge + " years old.");
    }
}
