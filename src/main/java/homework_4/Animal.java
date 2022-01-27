package homework_4;

/**  related to class "TypesOfAnimals" */

public class Animal {
    public String typeOfAnimal;
    public double weightInKg;
    public double heightInMeter;
    public String color;
    public int numberOfPaws;
    public int numberOfTeeth;
    public boolean horns;
    public boolean hooves;


    public Animal() {
        this.typeOfAnimal = typeOfAnimal;
        this.weightInKg = weightInKg;
        this.heightInMeter = heightInMeter;
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.numberOfTeeth = numberOfTeeth;
        this.horns = horns;
        this.hooves = hooves;
    }


    public Animal(String typeOfAnimal, double weightInKg, double heightInMeter, String color, int numberOfPaws, int numberOfTeeth, boolean horns, boolean hooves) {
        this.typeOfAnimal = typeOfAnimal;
        this.weightInKg = weightInKg;
        this.heightInMeter = heightInMeter;
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.numberOfTeeth = numberOfTeeth;
        this.horns = horns;
        this.hooves = hooves;
        System.out.println("===============================");
        System.out.println("typeOfAnimal: " + this.typeOfAnimal);
        System.out.println("weightInKg: " + this.weightInKg + " kilo");
        System.out.println("heightInMeter: " + this.heightInMeter + " meters");
        System.out.println("color: " + this.color);
        System.out.println("numberOfPaws: " + this.numberOfPaws);
        System.out.println("numberOfTeeth: " + this.numberOfTeeth);
        System.out.println("horns: " + this.horns);
        System.out.println("hooves: " + this.hooves);
        System.out.println("===============================");
    }

    public Animal(String typeOfAnimal, double weightInKg, double heightInMeter, String color, boolean horns) {
        this.typeOfAnimal = typeOfAnimal;
        this.weightInKg = weightInKg;
        this.heightInMeter = heightInMeter;
        this.color = color;
        this.horns = horns;
        System.out.println("===============================");
        System.out.println("typeOfAnimal: " + this.typeOfAnimal);
        System.out.println("weightInKg: " + this.weightInKg + " kilo");
        System.out.println("heightInMeter: " + this.heightInMeter + " meters");
        System.out.println("color: " + this.color);
        System.out.println("horns: " + this.horns);
        System.out.println("===============================");
    }

}


