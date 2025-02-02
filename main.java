package Assignment4;

public class main {

        public static void main(String[] args) {

            Zoo zoo = new Zoo("Wildlife Park");


            Cell cell1 = new Cell(1, 100.0, 5);
            Cell cell2 = new Cell(2, 150.0, 10);


            zoo.addCell(cell1);
            zoo.addCell(cell2);


            Animal lion = new Animal("Lion", true);
            Animal tiger = new Animal("Tiger", true);
            Animal zebra = new Animal("Zebra", false);


            cell1.addAnimal(lion);
            cell1.addAnimal(tiger);
            cell2.addAnimal(zebra);


            System.out.println(zoo);


            System.out.println("Animals in Cell 1:");
            for (Animal animal : cell1.getAnimals()) {
                System.out.println(animal);
            }


            Animal foundAnimal = zoo.searchAnimal("Lion");
            if (foundAnimal != null) {
                System.out.println("Found animal: " + foundAnimal);
            } else {
                System.out.println("Animal not found.");
            }
        }
    }

