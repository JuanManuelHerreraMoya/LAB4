package hangman.model;
import com.google.inject.*;

public class BonusScore implements GameScore{
	private int Score;
	
	@Inject
	public BonusScore(){
		Score = 0 ; 
	}
	
	@Override
	public int calculateScore(int correcCount, int incorrectCount) {
		if (correcCount >0 ) {
			Score +=  (correcCount*10) ;
		}
		if (incorrectCount > 0){
			Score = Score - (incorrectCount*5);
		}
		if (Score < 0) {
			Score = 0;
			return  Score;
		}
		return Score;
	}
	
}