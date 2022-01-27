package homework_4;

/**  related to class "Dog" */

public class Arturo {
    public static void main(String[] args) {

        Dog arturo = new Dog("Arturo", 4);

        if (arturo.isNotSleeping) {
            arturo.playingAnimal();
            arturo.walkingAnimal();
            arturo.trainingAnimal();
            arturo.bathingAnimal();
            arturo.bathingAnimal();
            arturo.playingAnimal();
            arturo.walkingAnimal();
            arturo.trainingAnimal();
            arturo.feedingAnimal();
            arturo.walkingAnimal();
            arturo.playingAnimal();
            arturo.trainingAnimal();
            arturo.playingAnimal();
        } else {
            System.out.println("Leave me alone, I'm sleeping" + "\n");
            System.out.println("Dog, wakey!");
            arturo.getUp();
        }

    }


}
