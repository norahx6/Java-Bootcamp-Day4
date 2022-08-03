package Day4;

public class homework1 {
    public static void main(String[] args) {


       try {
       int num[] =  {8,9,5,-2};
           System.out.println(getSmallPositve(num));
       }
       catch ( Exception e){
           System.out.println("you can't put negative number");

     }
}//end

       public static int getSmallPositve (int [] num ) throws Exception{
       int number = num [0] ;
           for (int i = 0; i < num.length; i++) {
               if (num[i] < 0) {
                   throw new Exception();
               }
               else {
                   if(num[i]>number){
                       number=num[i];
                   }
               }
            }
           return number;
    }

}//end
