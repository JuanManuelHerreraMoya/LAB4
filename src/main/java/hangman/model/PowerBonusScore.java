package hangman.model;
public class PowerBonusScore implements GameScore{
	
	
	@Override
	public int calculateScore(int correcCount, int incorrectCount) {
		int Score = 0 ;
		if (incorrectCount >0) {
			Score = Score - (8*incorrectCount);
		}
		if (Score <500) {
			for (int i= 0; i <correcCount;i++) {
				Score +=  Math.pow(5,i+1);;
			}
		}
		if (Score < 0) {
			Score = 0;
			return Score;
		}
		if (Score >= 500) {
			return 500;
		}
		return Score;
	}
	
}