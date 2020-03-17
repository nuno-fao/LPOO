public class AreaXMLOutputter {
    private AreaAggregator areaAggregator;

    public AreaAggregator getAreaAggregator() {
        return areaAggregator;
    }

    public void setAreaAggregator(AreaAggregator areaAggregator) {
        this.areaAggregator = areaAggregator;
    }

    public AreaXMLOutputter(AreaAggregator areaAggregator) {
        this.areaAggregator = areaAggregator;
    }

    public String output(){
        return "<area>" + areaAggregator.sum() + "</area>";
    }
}
