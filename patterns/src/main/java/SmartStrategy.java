import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy {
    private List<StringDrink> drinks;
    private List<StringRecipe> recipes;

    public SmartStrategy(){
        drinks=new ArrayList<>();
        recipes=new ArrayList<>();
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if(bar.isHappyHour()){
            recipe.mix(drink);
        }
        else{
            drinks.add(drink);
            recipes.add(recipe);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        while(!drinks.isEmpty()){
            recipes.get(0).mix(drinks.get(0));
            recipes.remove(0);
            drinks.remove(0);
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
