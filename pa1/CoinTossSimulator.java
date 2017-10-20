//Name: Linfeng Hua
//USC NetID: 8120282947
//CS 455 PA1
//Fall 2017

/**
* class CoinTossSimulator
* 
* Simulates trials of tossing two coins and allows the user to access the
* cumulative results.
* 
* NOTE: we have provided the public interface for this class.  Do not change
* the public interface.  You can add private instance variables, constants, 
* and private methods to the class.  You will also be completing the 
* implementation of the methods given. 
* 
* Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
* 
*/
import java.util.Random;

public class CoinTossSimulator {
		
		private int numTwoHeads;
		private int numTwoTails;
		private int numHeadTails;
		
	   /**
	      Creates a coin toss simulator with no trials done yet.
	   */
	   public CoinTossSimulator() {
			numTwoHeads = 0;
			numTwoTails = 0;
			numHeadTails = 0;

	   }
	   
	   /**
	      Runs the simulation for numTrials more trials. Multiple calls to this method
	      without a reset() between them *add* these trials to the current simulation.
	      
	      @param numTrials  number of trials to for simulation; must be >= 1
	    */
	   public void run(int numTrials) {
		   if(numTrials < 1) {
			   System.out.println("Number entered must be greater than 0.");
			   return ;
		   }
		   Random rnd = new Random();
		   for(int i = numTrials;i>0;i--) {
			   int a = rnd.nextInt(2);
			   int b = rnd.nextInt(2);
			   if(a == 0 && b ==0) {
				   numTwoHeads ++;
			   }
			   else if( a==1 && b==1) {
				   numTwoTails ++;
			   }
			   else {
				   numHeadTails ++;
			   }
		   }
	   }


	   /**
	      Get number of trials performed since last reset.
	   */
	   public int getNumTrials() {
	       return getTwoHeads() + getTwoTails() + getHeadTails(); // DUMMY CODE TO GET IT TO COMPILE
	   }


	   /**
	      Get number of trials that came up two heads since last reset.
	   */
	   public int getTwoHeads() {
	       return numTwoHeads; // DUMMY CODE TO GET IT TO COMPILE
	   }


	   /**
	     Get number of trials that came up two tails since last reset.
	   */  
	   public int getTwoTails() {
	       return numTwoTails; // DUMMY CODE TO GET IT TO COMPILE
	   }


	   /**
	     Get number of trials that came up one head and one tail since last reset.
	   */
	   public int getHeadTails() {
	       return numHeadTails; // DUMMY CODE TO GET IT TO COMPILE
	   }


	   /**
	      Resets the simulation, so that subsequent runs start from 0 trials done.
	    */
	   public void reset() {
			numTwoHeads = 0;
			numTwoTails = 0;
			numHeadTails = 0;
	   }

}
