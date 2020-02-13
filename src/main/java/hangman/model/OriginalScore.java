package hangman.model;

import com.google.inject.Inject;

public class  OriginalScore implements GameScore{
	private int Score;
	
	@Inject
	public OriginalScore() {
		Score = 100;
	}
	
	@Override
	public int calculateScore(int correcCount, int incorrectCount) {
		//	@param correcCount, incorrectCount
		Score = Score - (10*incorrectCount);
		if (Score > 0) {
			return Score;
		}
		Score = 0;
		return Score;
	}
	
}
                                                