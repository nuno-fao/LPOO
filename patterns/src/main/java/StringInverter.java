public class StringInverter implements StringTransformer {

    public StringInverter() {}

    @Override
    public void execute(StringDrink drink) {
        drink.setText(new StringBuilder(drink.getText()).reverse().toString());
    }
}
