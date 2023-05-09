package zoo;

public class Animals {
    //--- instance variable ---
        // all instance variable should be in private for best practice
    private String name;
    private String type;
    private String food;

    //--- default constructor ---
    public Animals() {};
    //--- parametrized constructor ---
    public Animals(String name, String type, String food) {
        this.name = name;
        this.type = type;
        this.food = food;
    }

    public void animalSound() {
        // code here
    }
    public void chewFood() {
        // code here
    }

}
