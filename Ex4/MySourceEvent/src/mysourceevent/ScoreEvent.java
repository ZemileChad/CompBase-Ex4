package mysourceevent;
import java.util.*;
public class ScoreEvent extends EventObject {
	private String score;
        
    public ScoreEvent(Object obj, String score) {
        super(obj);
        this.score = score;
    }
    
    public String getScore() {
        return score;
    }
}