public class Main{

    public static final String ARG_MSG = "The main method only takes 1 argument: <String input> <Int iteration>";

    public static void main(String[] args){

        String input = args[0];
        String iteration = args[1];
        
        if (args.length > 2 || args.length < 1 ){
            System.out.println(ARG_MSG);
            return;

        }

        Exhauster.start(input,Integer.parseInt(iteration));
        
        }
    }