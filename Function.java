package supermarket2;

public abstract class Function {
    Function(){

    }

    boolean illegalUserTextInput(String text){
        if(text.equals("")){
            return true;
        }

        return false;
    }

}


