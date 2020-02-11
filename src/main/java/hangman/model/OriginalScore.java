package hangman.model;

public class  OriginalScore implements GameScore{
	

	@Override
	public int calculateScore(int correcCount, int incorrectCount) {
		//	@param correcCount, incorrectCount
		int Score = 100;
		Score = Score - (10*incorrectCount);
		if (Score > 0) {
			return Score;
		}
		Score = 0;
		return Score;
	}
	
}
                                                