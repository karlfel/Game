import javax.swing.*;
import java.lang.Boolean;

// TODO: Buttons toggle, if button is clicked action should be performed
// TODO: At the bottom of the window should be displayed rolled dices and next roll
// TODO: User should be able to choose from rolled dices, which to keep and which to discard
// TODO: Three rolls logic -> After that should implement user choice, which points to take and how much is their sum
// TODO: Update score
// TODO: Buttons alignment and design, maybe instead of text put pictures on buttons
// TODO: Window scaling - if window size is changed then buttons size should also be automatically changed
// TODO:
public class Main {

    public static void main(String args[]) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new MainFrame("Yahtzee");

                frame.setSize(500, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });



        // Whole game loop
        /*for (int i = 0; i < 10; i++) {
            // Here are three rolls
            for (int j = 0; j < 3; j++) {

            }

        }

    }*/
    }
}

