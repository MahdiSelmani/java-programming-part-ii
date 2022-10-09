
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        //int randomNum = (int) this.random.nextInt(40);

        while (this.numbers.size() < 7) {
            int randomNum = new Random().nextInt(40)+1;
            if (!this.numbers.contains(randomNum)) {

                this.numbers.add(randomNum);

            }

        }

        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}
