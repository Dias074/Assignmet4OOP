package Assignment4;

public class Animal {

    private String name;
        private boolean predator;
        private Cell cell;

        public Animal(String name, boolean predator) {
            this.name = name;
            this.predator = predator;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isPredator() {
            return predator;
        }

        public void setPredator(boolean predator) {
            this.predator = predator;
        }

        public Cell getCell() {
            return cell;
        }

        public void setCell(Cell cell) {
            this.cell = cell;
        }

        @Override
        public String toString() {
            return "Animal: " + name + ", Predator: " + predator;
        }
    }

