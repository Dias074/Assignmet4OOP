package Assignment4;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

        private String name;
        private List<Cell> cells;

        public Zoo(String name) {
            this.name = name;
            this.cells = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Cell> getCells() {
            return cells;
        }

        public void addCell(Cell cell) {
            cells.add(cell);
        }

        public void removeCell(Cell cell) {
            cells.remove(cell);
        }


        public Animal searchAnimal(String name) {
            for (Cell cell : cells) {
                for (Animal animal : cell.getAnimals()) {
                    if (animal.getName().equals(name)) {
                        return animal;
                    }
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return "Zoo: " + name + ", Cells: " + cells.size();
        }
    }

