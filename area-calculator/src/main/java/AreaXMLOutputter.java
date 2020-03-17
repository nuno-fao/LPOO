public class AreaXMLOutputter  {
    private SumProvider sumProvider;

    public SumProvider getAreaAggregator() {
        return sumProvider;
    }

    public void setAreaAggregator(SumProvider sumProvider) {
        this.sumProvider = sumProvider;
    }

    public AreaXMLOutputter(SumProvider sumProvider) {
        this.sumProvider = sumProvider;
    }

    public String output(){
        return "<area>" + sumProvider.sum() + "</area>";
    }
}
