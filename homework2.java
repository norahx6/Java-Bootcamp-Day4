package Day3;

public class homework2 {

    public static void main(String[] args) {

// EX 1
        int arr [] = createArray(3,8,9,5,3,9,8,10);
        try {
            System.out.println(arr[9]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }


// EX 2
        try {
        number(2);
        } catch (ArithmeticException e) {
            System.out.println("ERROR");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }// end

// EX 1 Method
        public static int[] createArray (int num0, int num1, int num2, int num3 , int num4, int num5, int num6,int num7){
        int arr[] = {num0,num1,num2,num3,num4,num5,num6,num7} ;
        return arr;
 }

// EX 1 Method
        public static void number (int num1) throws Exception {
            if (num1 % 5 == 0) {
                System.out.println("But another number");
            } else {
                throw new RuntimeException();
            }


        }
} // end
