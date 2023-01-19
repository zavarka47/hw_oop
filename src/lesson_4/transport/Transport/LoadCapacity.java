package lesson_4.transport.Transport;

public enum LoadCapacity {
    N1(null, 3.5f),
    N2(3.5f, 12f),
    N3(12f, null);
    private Float minCapacity;
    private Float maxCapacity;
    LoadCapacity (Float minCapacity, Float maxCapacity) {
        this.minCapacity = minCapacity;
        this.maxCapacity = maxCapacity;
    }
    @Override
    public String toString() {
        if (minCapacity == null) {
            return "Load Capacity : up to " + maxCapacity + " tons;";
        } else if (maxCapacity == null) {
            return "over " + minCapacity + " tons;";
        } else {
            return "over " + minCapacity + " to " + maxCapacity + " tons;";
        }
    }
}
