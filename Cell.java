package Assignment4;

import java.util.ArrayList;
import java.util.List;

public class Cell {

        private int number;
        private double size;
        private int maxAnimals;
        private List<Animal> animals;

        public Cell(int number, double size, int maxAnimals) {
            this.number = number;
            this.size = size;
            this.maxAnimals = maxAnimals;
            this.animals = new ArrayList<>();
        }


        public int getNumber() {
            return number;
        }

        public double getSize() {
            return size;
        }

        public int getMaxAnimals() {
            return maxAnimals;
        }

        public List<Animal> getAnimals() {
            return animals;
        }


        public void addAnimal(Animal animal) {
            if (animals.size() < maxAnimals) {
                animals.add(animal);
                animal.setCell(this);
            } else {
                System.out.println("Cell is full. Cannot add more animals.");
            }
        }


        public void removeAnimal(Animal animal) {
            animals.remove(animal);
            animal.setCell(null);
        }


        public int getCurrentNumberOfAnimals() {
            return animals.size();
        }

        @Override
        public String toString() {
            return "Cell: " + number + ", Size: " + size + ", Max Animals: " + maxAnimals + ", Current Animals: " + getCurrentNumberOfAnimals();
        }

    }
