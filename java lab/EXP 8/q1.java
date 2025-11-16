import java.lang.Throwable;
class CheckArgumentSingle{
    static class CheckArgumentException extends Exception{
        CheckArgumentException(String message){
                                    super(message);
    }
}
public static void main(String args[]){
      try{
          if(args.length<5){
                   throw new CheckArgumentException("Error: You must enter at least 5 integer arguments.");
          }
      int sum=0;
      for(String arg:args){
            sum+=Integer.parseInt(arg);
      }
      System.out.println("Sum of all arguments = "+sum);
      }
      catch(CheckArgumentException e){
               System.out.println(e);
       }
      catch(NumberFormatException e){
               System.out.println("Error:Enter valid integers only.");
      }
      finally{
             System.out.println("Raghav 24csu168"); }
      }}
