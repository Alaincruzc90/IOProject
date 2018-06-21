package event;

import java.util.Comparator;

public class EventComparator implements Comparator<Event> {

    @Override
    public int compare(Event o1, Event o2) {

        if(o1.getEndTime() <= o2.getEndTime()) {
            return -1;
        } else {
            return 1;
        }
    }
}
