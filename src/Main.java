import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        I don't remember exactly what this question was. My memory is that it was to find the single largest
        positive difference between two closing days of a stock price. The stock price was saved in a List if
        my memory is to be trusted. Assuming both of those things, here's my solution.
        UPDATED SOLUTION:
        Actual solution is to return the greatest positive difference between any day and its previous days
         */
        List<Integer> list = new ArrayList<>();
        list.add(1);//7
        list.add(2);//1
        list.add(1);//2
        list.add(7);//5
        list.add(4);//5
        list.add(7);//2
        list.add(4);//8
        list.add(2);//7

        int gains = 0;
        int smallestDay = list.get(0);
        for (int i  = 1; i < list.size() - 1; i++) {
            if (list.get(i) < smallestDay) {
                smallestDay = list.get(i);
            }
            if (list.get(i) - smallestDay > gains) {
                gains = list.get(i) - smallestDay;
            }

        }

        System.out.println(gains);
    }
}