//Name: Linfeng Hua
//USC NetID: 8120282947
//CS 455 PA1
//Fall 2017

/**
 * CoinSimComponent class
 * 
 * Extends from JComponnet class.
 * In this class, we implement the Bar class's method to draw three bars to
 * represent the result of three possible outputs.
 */
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class CoinSimComponent extends JComponent {
	private final Color HEAD_COLOR = Color.RED;
	private final Color HEADTAIL_COLOR = Color.GREEN;
	private final Color TAIL_COLOR = Color.BLUE;
	private final int barWidth = 100;
	private final int vb =50;
	private final int spaceForLabel=15;
	private int numTotal;
	private int numHeads;
	private int numTails;
	private int numHeadTail;
	
/**
 * In this construction, I simulate the coin tossing for i times, and initialize the number of 
 * each output.
 * 
 * @param i the number of total trial times
 */
	public CoinSimComponent(int i) {
		CoinTossSimulator simulator = new CoinTossSimulator();
		simulator.run(i);
		numTotal = simulator.getNumTrials();
		numHeads = simulator.getTwoHeads();
		numTails = simulator.getTwoTails();
		numHeadTail = simulator.getHeadTails();
		
	}
/**
 * I implement the getHeight() and getWidth() method of Graphics2D so that our bat chart can be resized when 
 * the window is resized.
 * In this method, I work out the parameters for Bar class, and create three Bar objects to represent three
 * different outputs. Then I call the draw method of Bar class to display the graphical result.
 * 
 * @param bottom  location of the bottom of the label
 * @param widthBetweenBar  the width between two bars, which depends on the size of window
 * @param totaltall  the tall of 100% bar
 * @param scale  the tall of 1% bar, which is an application unit because the result of tossing is round to 
 * 		  one percent.
 * @param barHeightHeads  the tall of output for two Heads in application unit.
 * @param barHeightTails  the tall of output for two Tails in application unit.
 * @param barHeightHeadTail  the tall of output for one Heads and one tail in application unit.
 * 
 */
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		int bottom = getHeight()-vb;
		int widthBetweenBar = (getWidth() - 3*barWidth) /4;
		int totaltall = getHeight()-vb*2-spaceForLabel;
		double scale = totaltall / 100.0;
		int barHeightHeads = Math.round(((float) numHeads/numTotal)*100);
		int barHeightTails = Math.round(((float) numTails/numTotal)*100);
		int barHeightHeadTail = Math.round(((float) numHeadTail/numTotal)*100);
		Bar Heads = new Bar(bottom, widthBetweenBar, barWidth, barHeightHeads, scale, HEAD_COLOR, "Two Heads:"+numHeads+"("+ barHeightHeads +"%)");
		Bar HeadTail = new Bar(bottom, 2*widthBetweenBar+ barWidth, barWidth, barHeightHeadTail, scale, HEADTAIL_COLOR, "A Head and a Tail:"+numHeadTail+"("+ barHeightHeadTail +"%)");
		Bar Tails = new Bar(bottom, 3*widthBetweenBar+ 2*barWidth, barWidth, barHeightTails, scale, TAIL_COLOR, "Two Tails:"+numTails+"("+ barHeightTails +"%)");
		Heads.draw(g2);
		HeadTail.draw(g2);
		Tails.draw(g2);
	}
	
	

}
