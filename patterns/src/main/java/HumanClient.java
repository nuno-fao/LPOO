public class HumanClient implements Client {
    private OrderingStrategy orderingStrategy;

    public HumanClient(OrderingStrategy orderingStrategy) {
        this.orderingStrategy = orderingStrategy;
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        orderingStrategy.wants(drink, recipe, bar);
    }

    @Override
    public void happyHourStarted(Bar bar) {
        orderingStrategy.happyHourStarted((StringBar) bar);
    }

    @Override
    public void happyHourEnded(Bar bar) {
        orderingStrategy.happyHourEnded((StringBar) bar);
    }


}
