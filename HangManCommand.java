import java.util.*; 

public class HangManCommand {

   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in); 
      String word; 
      StringBuilder build = new StringBuilder(); 
      String[] words = {"republican", "democrat", "liberal","conservative", "libertarian", "smarmy"};
      
      while(true){
         word = words[(int)(Math.random() * 6)]; 
         build.delete(0, build.length()); 
         
         for(int i = 0; i < word.length(); i++){
         build.append("*"); 
         }//end for loop
         
         while(!word.equals(build.toString())){
            System.out.println("Enter a letter in " + build);
            char userInput = input.next().charAt(0); 
       
            for(int i = 0; i < word.length(); i++){
               if(userInput == word.charAt(i))
                build.setCharAt(i, userInput); 
            }//end for loop
         }//end while loop
         
         System.out.println("The word was " + word + "! Good Job!");
         System.out.println("Would you like to play again? Type y or n: ");
         char cont = input.next().charAt(0);
         
         if(cont == 'n')
            System.exit(1); 
         
      }//end while true
   
   }//end main method 

}//end class 