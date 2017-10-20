//Name: Linfeng Hua
//USC NetID: 8120282947
//CS 455 PA1
//Fall 2017

/**
 * CoinSimViewer class
 * 
 * Display the bar chart for the result of two coins tossing.
 * The number of trial times depends on the input from users, you have the chance to decide this variable.
 * After you input the number of trial times, there will be a window of result.
 * And if you resize the window, the bar chart will be resized automatically and appropriately.
 * 
 */
import javax.swing.JFrame;
import java.util.Scanner;

public class CoinSimViewer {
    praivte final int wide = 800;
    private final int tall = 500;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please input the times of trials: ");
		int trialTimes = in.nextInt();
		JFrame frame = new JFrame();
		frame.setSize(wide,tall);
		frame.setTitle("The simulation result of two coins tossing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CoinSimComponent component = new CoinSimComponent(trialTimes);
		frame.add(component);
		
		frame.setVisible(true);

	}

}
