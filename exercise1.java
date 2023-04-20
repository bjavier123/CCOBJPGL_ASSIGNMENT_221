public class exercise1 {

    static boolean iWillWin = true;
    static boolean iWillNotCheat = true;
    
    public static void main(String[] args) throws Exception {
    
       assert iWillWin == true: "mananalo ako";

       enterCompetition();

       assert iWillNotCheat == true: "hindi ako mandadaya";

    }

    static void enterCompetition(){

        iWillWin = false;

    }
    
    }
 

