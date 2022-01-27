package homework_4;

import lombok.extern.slf4j.Slf4j;

@Slf4j

/**  related to class "Dog" */

public class Dog {
    private String name;
    private int chargeEnergy = 4;
    public boolean isNotSleeping = true;

    public Dog(String name, int chargeEnergy) {
        this.name = name;
        this.chargeEnergy = chargeEnergy;
    }

    public void playingAnimal() {
        log.info("testing");
    chargeEnergy--;
        System.out.println("After playing,Artur's Energy: " + chargeEnergy);
        if (chargeEnergy == 0) {
            System.out.println("I'm hungry, please feed me");
            feedingAnimal();
        }
    }

    public void trainingAnimal() {
        log.info("testing");
        chargeEnergy--;
        System.out.println("After training, Artur's Energy: " + chargeEnergy);
        if (chargeEnergy == 0) {
            System.out.println("I'm hungry, please feed me");
            feedingAnimal();
        }
    }

    public void walkingAnimal() {
        log.info("testing");
        chargeEnergy--;
        System.out.println("After walking, Artur's Energy: " + chargeEnergy);
        if (chargeEnergy == 0) {
            System.out.println("I'm hungry, please feed me");
            feedingAnimal();
        }
    }

    public void bathingAnimal() {
        log.info("testing");
        chargeEnergy--;
        System.out.println("After bathing, Arthur's energy: " + chargeEnergy);
        if (chargeEnergy == 0) {
            System.out.println("I'm hungry, please feed me");
            System.out.println("Holy shit, talking dog!!!");
            feedingAnimal();
        }
    }

    public void feedingAnimal() {
        log.info("testing");
        if (chargeEnergy == 0) {
            System.out.println("thank you, kind man!");
            chargeEnergy += 4;
            System.out.printf("After feeding, Arthur's energy: %d\n", chargeEnergy);
        }
    }

    public void getUp() {
        log.info("testing");
        System.out.println("I'm getting up, so the devils take you!");
        feedingAnimal();
        System.out.printf("Artur's Energy:%2d\n", chargeEnergy);
    }

}
