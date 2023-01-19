package lesson_4.transport.Transport;

public enum BusCapacity {
    EXTRA_SMALL (null, 10),
    SMALL(null, 25),
    MIDDLE(40, 50),
    BIG(60,80),
    EXTRA_BIG(100, 120);
    private Integer minCapacity;
    private Integer maxCapacity;

    BusCapacity(Integer minCapacity, Integer maxCapacity) {
        this.minCapacity = minCapacity;
        this.maxCapacity = maxCapacity;
    }


    @Override
    public String toString() {
        if (minCapacity == null) {
            return "up to " + maxCapacity + " passenger;";
        }  else {
            return "over " + minCapacity + " to " + maxCapacity + " passenger;";
        }
    }
}
