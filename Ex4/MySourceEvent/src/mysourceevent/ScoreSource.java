package mysourceevent;
import java.util.ArrayList;

public class ScoreSource {
        String source;
	ArrayList<ScoreListener> listeners;
	public ScoreSource() {
		listeners = new ArrayList<>();
	}
	public void setScoreLine(String score) {
		source = score;
		fireMyEvent(new ScoreEvent(this, source));
	}
	public String getSource() {
		return source;
	}
	public void addMyListener(ScoreListener l) {
		listeners.add(l);
	}
	public void removeMyListener(ScoreListener l) {
		listeners.remove(l);
	}
	public void fireMyEvent(ScoreEvent e) {
      for(int i = 0; i < listeners.size(); i++) {
			ScoreListener l = listeners.get(i);
			l.scoreChange(e);
		}
	}
}
