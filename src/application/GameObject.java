package application;

public enum GameObject {
	ROCK, PAPER, SCISSORS;
	
	private GameObject beats;
	
	/* this is an initialization block, it is run before
	 * any constructor is run, and it initializes the 
	 * the beats variable above
	 */
	static {
		//each object can only beat one other object
		//Here you're assigning values to these instance
		//variables in the form object.variable = value
		ROCK.beats = SCISSORS;
		PAPER.beats = ROCK;
		SCISSORS.beats = PAPER;
	}
	/*
	private static int[][] comparison = {
			{0, -1, 1},
			{1, 0, -1},
			{-1, 1, 0}
	};
	
	private static String[][] compareText = {
			{"Rock matches rock", "Rock gets wrapped", "Rock smashes scissors"},
			{"Paper wraps rock", "Paper matches paper", "Paper gets cut"},
			{"Scissors get smashed", "Scissors cut paper", "Scissors match scissors"}
	};
	*/
	
	boolean beats(GameObject other) {
		// it is allowed to have a method with the same name as a variable
		return this.beats == other;
		/* basically, this means that if other == ROCK.beats as defined
		 * above, then the result is true
		 */
	}
	/*
	public String compareText(GameObject other) {
		return compareText[this.ordinal()][other.ordinal()];
	}
	
	public int compare(GameObject other) {
		return comparison[this.ordinal()][other.ordinal()];
	}
	*/
}
