import java.util.List;

public class StringRecipe {
    private List<StringTransformer> transformers;

    public StringRecipe(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }

    public List<StringTransformer> getTransformers() {
        return transformers;
    }

    public void setTransformers(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }

    public void mix(StringDrink drink){
        for(StringTransformer stringTransformer:transformers){
            stringTransformer.execute(drink);
        }
    }
}
