import static java.lang.Character.*;

public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder out = new StringBuilder();
        String aux = drink.getText();
        for(int i=0;i<aux.length();i++){
            if(isLowerCase(aux.charAt(i))){
                out.append(toUpperCase(aux.charAt(i)));
            }
            else{
                out.append(toLowerCase(aux.charAt(i)));
            }
        }
        drink.setText(out.toString());
    }

    public void undo(StringDrink drink){
        execute(drink);
    }
}
