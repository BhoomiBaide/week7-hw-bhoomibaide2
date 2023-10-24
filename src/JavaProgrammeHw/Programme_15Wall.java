package JavaProgrammeHw;

/**
 * 15. Wall Area
 */
public class Programme_15Wall {
    public class Wall {
        private double width;
        private double height;

        // First constructor (no-arg constructor)
        public Wall() {
            this.width = 0.0;
            this.height = 0.0;
        }

        // Second constructor with parameters
        public Wall(double width, double height) {
            if (width < 0) {
                this.width = 0.0;
            } else {
                this.width = width;
            }

            if (height < 0) {
                this.height = 0.0;
            } else {
                this.height = height;
            }
        }

        // Getter for width
        public double getWidth() {
            return this.width;
        }

        // Getter for height
        public double getHeight() {
            return this.height;
        }

        // Setter for width
        public void setWidth(double width) {
            if (width < 0) {
                this.width = 0.0;
            } else {
                this.width = width;
            }
        }

        // Setter for height
        public void setHeight(double height) {
            if (height < 0) {
                this.height = 0.0;
            } else {
                this.height = height;
            }
        }

        // Method to calculate and return the area of the wall
        public double getArea() {
            return this.width * this.height;
        }
    }


        }

