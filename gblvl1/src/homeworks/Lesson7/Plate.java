package homeworks.Lesson7;

public class Plate {
    public int food;
    public Plate(int food) {
        this.food = food;
    }
<<<<<<< Updated upstream
    public boolean decreaseFood(int n) {
        if (n > food) {
            return false;
        }
        food -= n;
        return true;
=======
    public void decreaseFood(int n) {
        food -= n;
>>>>>>> Stashed changes
    }


    public void additionFood(int food) {
        this.food +=food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

}

