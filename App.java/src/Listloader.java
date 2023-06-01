import java.util.ArrayList;
import java.util.List;

public class Listloader{
    List<Integer> list = new ArrayList<>();
    public void loadlist(int startNumber, int lastNumber) {
        for (int i = startNumber; i < lastNumber; i++) {
            list.add(i);

            //System.out.println("number:" + i);
        }
    }
}
