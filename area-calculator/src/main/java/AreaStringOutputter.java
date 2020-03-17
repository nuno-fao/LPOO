public class AreaStringOutputter {
    private AreaAggregator areaAggregator;

    public AreaAggregator getAreaAggregator() {
        return areaAggregator;
    }

    public void setAreaAggregator(AreaAggregator areaAggregator) {
        this.areaAggregator = areaAggregator;
    }

    public AreaStringOutputter(AreaAggregator areaAggregator) {
        this.areaAggregator = areaAggregator;
    }

    public String output() {
        return "Sum of areas: " + areaAggregator.sum();
    }
}
