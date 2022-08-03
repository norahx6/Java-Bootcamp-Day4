package Day4;

public class Customer {

    public static void main(String[] args) {

        try {
            Customer customer1 = new Customer(1234, "norah", 'f');
            if(customer1.gender !='m' && customer1.gender != 'f'){
                throw new Exception("The gender must be m or f");
            }
            System.out.println(customer1.toString());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    } // end
        private int ID;
        private String name;
        private char gender;

        public Customer (int ID , String name , char gender) throws Exception {
            this.ID = ID;
            this.name = name;
            this.gender = gender;

  //          if (gender != 'm' || gender != 'f') {
   //             throw new Exception();
   //         }
   //         else {
  //              this.gender = gender;

  //          }
        }
        public int getID(){
            return ID;
        }
        public String getName(){
            return name;
        }
        public char getGender(){
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Your name is "+name+" " + "Your ID is" +" " + ID + " " +"Gender is" +" " +gender ;
        }
    } // end
