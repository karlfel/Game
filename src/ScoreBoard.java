import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;



public class ScoreBoard {
    // Overall scoreboard in whole game
    HashMap<String,Integer> scoreboard =
            new HashMap<String, Integer>();

int generateNumbers(){
    Random rand = new Random();

    int generatedNumber = rand.nextInt(50) + 1;

    return generatedNumber;
}

}
