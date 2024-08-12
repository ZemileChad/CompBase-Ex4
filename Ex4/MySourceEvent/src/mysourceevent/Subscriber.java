package mysourceevent;
public class Subscriber implements ScoreListener {

    @Override
    public void scoreChange(ScoreEvent e) {
        System.out.println("live result: " + e.getScore());
    }
    
    
}
