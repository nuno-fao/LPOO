import java.util.List;

public class StringTransformerGroup implements StringTransformer {
    private List<StringTransformer> transformerGroup;

    public StringTransformerGroup(List<StringTransformer> transformerGroup) {
        this.transformerGroup = transformerGroup;
    }

    public List<StringTransformer> getTransformerGroup() {
        return transformerGroup;
    }

    public void setTransformerGroup(List<StringTransformer> transformerGroup) {
        this.transformerGroup = transformerGroup;
    }

    @Override
    public void execute(StringDrink drink){
        for(StringTransformer stringTransformer:transformerGroup){
            stringTransformer.execute(drink);
        }
    }

    @Override
    public void undo(StringDrink drink) {
        //just because it's not needed right now
    }
}
