public class car {

    private String color;
    private int numberOfDoors;
    private String style;

    public String getColor() {
        return color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getStyle() {
        return style;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public car() {
    }

    // constructor with  2 arguments
    public car(String color, String style) {

        this.color = color;
        this.style = style;
    }

    public car(String color, int numberOfDoors, String style) {

        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.style = style;
    }

    public boolean isStop() {
        return false;
    }

    public String driving() {
        return "The car is on the road and moving";
    }
}
