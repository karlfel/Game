import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private DetailsPanel detailsPanel;

    public MainFrame (String title){
        super(title);


        BorderLayout layout = new BorderLayout();
        setLayout(layout);

        detailsPanel = new DetailsPanel();

        JButton ones            = new JButton("ONES");
        JButton twoes           = new JButton("TWOES");
        JButton threes          = new JButton("THREES");
        JButton fours         = new JButton("FOURS");
        JButton fives           = new JButton("FIVES");
        JButton sixes           = new JButton("SIXES");
    /*    JButton threeOfaKind    = new JButton("THREE OF A KIND");
        JButton fourOfaKind     = new JButton("FOUR OF A KIND");
        JButton fullHouse       = new JButton("FULL HOUSE");
        JButton SmStraight      = new JButton("SMALL STRAIGHT");
        JButton LgStraight      = new JButton("LARGE STRAIGHT");
        JButton yahtzee         = new JButton("YAHTZEE");*/

        Container c = getContentPane();

        c.add(detailsPanel, BorderLayout.WEST);
    /*    c.add(ones);
        c.add(twoes);
        c.add(threes);
        c.add(fours);
        c.add(fives);
        c.add(sixes);
         c.add(threeOfaKind);
        c.add(fourOfaKind);
        c.add(fullHouse);
        c.add(SmStraight);
        c.add(LgStraight);
        c.add(yahtzee);*/

     /*   layout.putConstraint(SpringLayout.NORTH, twoes, 20, SpringLayout.SOUTH, ones);
        layout.putConstraint(SpringLayout.NORTH, threes, 20, SpringLayout.SOUTH, twoes);
        layout.putConstraint(SpringLayout.NORTH, fours, 20, SpringLayout.SOUTH, threes);
        layout.putConstraint(SpringLayout.NORTH, fives, 20, SpringLayout.SOUTH, fours);
        layout.putConstraint(SpringLayout.NORTH, sixes, 20, SpringLayout.SOUTH, fives);
        layout.putConstraint(SpringLayout.NORTH, threes, 15, SpringLayout.SOUTH, twoes);
        layout.putConstraint(SpringLayout.NORTH, fours, 15, SpringLayout.SOUTH, threes);
        layout.putConstraint(SpringLayout.NORTH, fives, 15, SpringLayout.SOUTH, fours);
        layout.putConstraint(SpringLayout.NORTH, threes, 15, SpringLayout.SOUTH, twoes);
        layout.putConstraint(SpringLayout.NORTH, fours, 15, SpringLayout.SOUTH, threes);
        layout.putConstraint(SpringLayout.NORTH, fives, 15, SpringLayout.SOUTH, fours);*/



    }
}
