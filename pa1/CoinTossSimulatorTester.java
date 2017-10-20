// only for testing by myself, the style can be improved by implementing a private method.

//Name: Linfeng Hua
//USC NetID: 8120282947
//CS 455 PA1
//Fall 2017

/**
* class CoinTossSimulatorTester
* 
* Test the CoinTossSimulator class.Because the variables of CoinTossSimulator class are private, 
* we have to access the variables by methods. And it is non-interactive and console-based. 
* 
*/
public class CoinTossSimulatorTester {

	public static void main(String[] args) {
		//I use the totalTrails to track the number of total trail times, and numTrials to track the trail times this moment.
		int totalTrials = 0;
		int numTrials = 0;
		//After Constructor
		CoinTossSimulator coinplay = new CoinTossSimulator();

		System.out.println("After Constrcutor:");
		System.out.println("Number of trials [exp:" + totalTrials + "]:" + coinplay.getNumTrials());
		System.out.println("Two-head tosses: " + coinplay.getTwoHeads());
		System.out.println("Two-tail tosses: " + coinplay.getTwoTails());
		System.out.println("One-head one-tail tosses:" + coinplay.getHeadTails());
		System.out.println("Tosses add up correctly? " + (coinplay.getNumTrials() == (coinplay.getTwoHeads() + coinplay.getTwoTails() + coinplay.getHeadTails())));
		System.out.println();
		
		//After run(1)
		numTrials = 1;
		totalTrials += numTrials;
		System.out.println("After run(" + numTrials + "):");
		coinplay.run(numTrials);
		System.out.println("Number of trials [exp:" + totalTrials + "]:" + coinplay.getNumTrials());
		System.out.println("Two-head tosses: " + coinplay.getTwoHeads());
		System.out.println("Two-tail tosses: " + coinplay.getTwoTails());
		System.out.println("One-head one-tail tosses:" + coinplay.getHeadTails());
		System.out.println("Tosses add up correctly? " + (coinplay.getNumTrials() == (coinplay.getTwoHeads() + coinplay.getTwoTails() + coinplay.getHeadTails())));
		System.out.println();
		
		//After run(10)
		numTrials = 10;
		totalTrials += numTrials;
		System.out.println("After run(" + numTrials + "):");
		coinplay.run(numTrials);
		System.out.println("Number of trials [exp:" + totalTrials + "]:" + coinplay.getNumTrials());
		System.out.println("Two-head tosses: " + coinplay.getTwoHeads());
		System.out.println("Two-tail tosses: " + coinplay.getTwoTails());
		System.out.println("One-head one-tail tosses:" + coinplay.getHeadTails());
		System.out.println("Tosses add up correctly? " + (coinplay.getNumTrials() == (coinplay.getTwoHeads() + coinplay.getTwoTails() + coinplay.getHeadTails())));
		System.out.println();
		
		//After run(100)
		numTrials = 100;
		totalTrials += numTrials;
		System.out.println("After run(" + numTrials + "):");
		coinplay.run(numTrials);
		System.out.println("Number of trials [exp:" + totalTrials + "]:" + coinplay.getNumTrials());
		System.out.println("Two-head tosses: " + coinplay.getTwoHeads());
		System.out.println("Two-tail tosses: " + coinplay.getTwoTails());
		System.out.println("One-head one-tail tosses:" + coinplay.getHeadTails());
		System.out.println("Tosses add up correctly? " + (coinplay.getNumTrials() == (coinplay.getTwoHeads() + coinplay.getTwoTails() + coinplay.getHeadTails())));
		System.out.println();
		
		//After reset
		totalTrials = 0;
		coinplay.reset();
		System.out.println("After reset");
		System.out.println("Number of trials [exp:" + totalTrials + "]:" + coinplay.getNumTrials());
		System.out.println("Two-head tosses: " + coinplay.getTwoHeads());
		System.out.println("Two-tail tosses: " + coinplay.getTwoTails());
		System.out.println("One-head one-tail tosses:" + coinplay.getHeadTails());
		System.out.println("Tosses add up correctly? " + (coinplay.getNumTrials() == (coinplay.getTwoHeads() + coinplay.getTwoTails() + coinplay.getHeadTails())));
		System.out.println();
		
		//After run(1000)
		numTrials = 1000;
		totalTrials += numTrials;
		System.out.println("After run(" + numTrials + "):");
		coinplay.run(numTrials);
		System.out.println("Number of trials [exp:" + totalTrials + "]:" + coinplay.getNumTrials());
		System.out.println("Two-head tosses: " + coinplay.getTwoHeads());
		System.out.println("Two-tail tosses: " + coinplay.getTwoTails());
		System.out.println("One-head one-tail tosses:" + coinplay.getHeadTails());
		System.out.println("Tosses add up correctly? " + (coinplay.getNumTrials() == (coinplay.getTwoHeads() + coinplay.getTwoTails() + coinplay.getHeadTails())));
		System.out.println();
		
	}

}
