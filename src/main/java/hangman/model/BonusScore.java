package hangman.model;

public class BonusScore implements GameScore{
	
	@Override
	public int calculateScore(int correcCount, int incorrectCount) {
		int Score = 0 ; 
		if (correcCount >0 ) {
			Score = Score + (correcCount*10) ;
		}
		if (incorrectCount > 0 && Score >0){
			Score = Score - (incorrectCount*5);
		}
		return Score;
	}
	
}