package lessons.com.counterAggregation.service;

import lessons.com.counterAggregation.model.Counter;

import java.util.Arrays;
import java.util.List;

public class CountServ {

    private final List<Counter> counters;

    public CountServ(Counter... counters) {
        this.counters = Arrays.asList(counters);
    }

    public List<Counter> getAllCounters() {
        return counters;
    }


    public void addCounter(Counter counter) {
        this.counters.add(counter);
    }

    public Counter getCounterByName(String name) {
        for (Counter c : counters) {
            if (c.getName().equals(name)) {
                return c;
            }
        }

        return null;
    }

}
