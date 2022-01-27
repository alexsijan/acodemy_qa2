package homework_4;

/**  related to class "Animal" */

public class TypesOfAnimals {
    public static void main(String[] args) {

        Animal cat = new Animal();
        cat.typeOfAnimal = "Cat";
        cat.weightInKg = 2.4;
        cat.heightInMeter = 0.3;
        cat.color = "grey";
        cat.numberOfPaws = 4;
        cat.numberOfTeeth = 30;
        cat.horns = false;
        cat.hooves = false;
        System.out.println("===============================");
        System.out.println("typeOfAnimal: " + cat.typeOfAnimal);
        System.out.println("weightInKg: " + cat.weightInKg + " kilo");
        System.out.println("heightInMeter: " + cat.heightInMeter + " meters");
        System.out.println("color: " + cat.color);
        System.out.println("numberOfPaws: " + cat.numberOfPaws);
        System.out.println("numberOfTeeth: " + cat.numberOfTeeth);
        System.out.println("horns: " + cat.horns);
        System.out.println("hooves: " + cat.hooves);
        System.out.println("===============================");

        Animal mouse = new Animal();
        mouse.typeOfAnimal = "Mouse";
        mouse.weightInKg = 0.019;
        mouse.heightInMeter = 0.05;
        mouse.color = "grey";
        mouse.numberOfPaws = 4;
        System.out.println("===============================");
        System.out.println("typeOfAnimal: " + mouse.typeOfAnimal);
        System.out.println("weightInKg: " + mouse.weightInKg + " kilo");
        System.out.println("heightInMeter: " + mouse.heightInMeter + " meters");
        System.out.println("color: " + mouse.color);
        System.out.println("numberOfPaws: " + mouse.numberOfPaws);
        System.out.println("===============================");

        Animal deep = new Animal("Deep", 50.3, 1.92, "spotted", 4, 50, true, true);

        Animal york = new Animal("Dog", 2.8, 0.25, "gray-haired", 4, 42, false, false);

        Animal cow = new Animal("Cow", 500, 1.30, "dark brown", true);

        Animal lion = new Animal("lion", 190.0, 1.20, "red", false);

        System.out.println("\n");

/**  Оставляю для посмеяться */

        boolean night = true;

        if (night) {
            System.out.println("animal - sleep");
        } else {
            System.out.println("animal - walking");
        }

        System.out.println();

        int energyCharge = 4;

        System.out.println((workingAnimal(trainedAnimal(playingAnimal(walkingAnimal(energyCharge))))));

        if (workingAnimal(trainedAnimal(playingAnimal(walkingAnimal(energyCharge)))) == 0) {
            System.out.println(eatingAnimal(workingAnimal(trainedAnimal(playingAnimal(walkingAnimal(energyCharge))))));
        } else {
            System.out.println("Run some more");
        }
    }

    public static int walkingAnimal(int energyCharge) {
        energyCharge -= 1;

        return energyCharge;
    }

    public static int playingAnimal(int energyCharge) {
        energyCharge -= 1;
        return energyCharge;
    }

    public static int trainedAnimal(int energyCharge) {
        energyCharge -= 1;
        return energyCharge;
    }

    public static int workingAnimal(int energyCharge) {
        energyCharge -= 1;
        return energyCharge;

    }

    public static int eatingAnimal(int energyCharge) {
        energyCharge += 4;
        return energyCharge;
    }


}
