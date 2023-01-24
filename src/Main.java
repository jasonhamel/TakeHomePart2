import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        I don't remember exactly what this question was. My memory is that it was to find the single largest
        positive difference between two closing days of a stock price. The stock price was saved in a List if
        my memory is to be trusted. Assuming both of those things, here's my solution.
         */
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(7);
        list.add(4);
        list.add(7);
        list.add(4);
        list.add(2);

        int gainz = 0;

        for (int i  = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) > list.get(i)) {
                if (list.get(i + 1) - list.get(i) > gainz) {
                    gainz = list.get(i + 1) - list.get(i);
                }
            }
        }

        System.out.println(gainz);
    }
}