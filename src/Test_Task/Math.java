public class Math {
    public static int Solution(int a, int b, String operation){
        int result = 0;
        if(operation.equals("+")){
            result = a + b;
        }
        if(operation.equals("-")){
            result = a - b;
        }
        if(operation.equals("*")){
            result = a * b;
        }
        if(operation.equals("/")){
            result = a / b;
        }

        return result;
    }
}
