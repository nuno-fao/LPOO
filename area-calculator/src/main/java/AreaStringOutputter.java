public class AreaStringOutputter {
    private SumProvider sumProvider;

    public SumProvider getAreaAggregator() {
        return sumProvider;
    }

    public void setAreaAggregator(SumProvider sumProvider) {
        this.sumProvider = sumProvider;
    }

    public AreaStringOutputter(SumProvider sumProvider) {
        this.sumProvider = sumProvider;
    }

    public String output() {
        return "Sum of areas: " + sumProvider.sum();
    }
}
