public class StringReplacer implements StringTransformer {
    private char target;
    private char newChar;

    public StringReplacer(char target, char newChar) {
        this.target = target;
        this.newChar = newChar;
    }

    public char getTarget() {
        return target;
    }

    public void setTarget(char target) {
        this.target = target;
    }

    public char getNewChar() {
        return newChar;
    }

    public void setNewChar(char newChar) {
        this.newChar = newChar;
    }

    @Override
    public void execute(StringDrink drink) {
       drink.setText(drink.getText().replace(target,newChar));
    }

    public void undo(StringDrink drink){
        drink.setText(drink.getText().replace(newChar,target));
    }
}
