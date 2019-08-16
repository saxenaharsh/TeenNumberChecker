public class TeenNumber {

    public static boolean hasTeen(int numOne, int numTwo, int numThree){
        if((numOne >= 13 && numOne <=19) || (numTwo >=13 && numTwo <=19) || (numThree >=13 && numThree <=19)){
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }
    }

    public static boolean isTeen(int num){
        if(num >= 13 && num  <= 19){
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }
    }
}
