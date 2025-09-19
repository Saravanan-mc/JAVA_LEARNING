
class Exception_Handling1{
    public static void main(String[] args) {

        try{
        System.out.println(1/0);
         }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("It alwasys run because it's finally");
        }

        System.out.println("The code is run ");
    }
}