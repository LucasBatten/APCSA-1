public class ProjectOne {
   public static int MAX_LINE_INDEX = 6;
   public static int SPACES_STARS_LENGTH = 7;
   public static void main( String[] args ){
      // print the line
      for( int i = MAX_LINE_INDEX; i >= 0; i-- ) {
         System.out.print( "line: " + i ); // we will remove this later, it helps keep track of where we are for debugging
         
         // print the beginning stars
         for( int j = i; j > 0; j-- ){
            System.out.print( "*" );
         }
         
         // print the beginning spaces
         for( int j = 0; j < (SPACES_STARS_LENGTH - i); j++ ){
            System.out.print( "-" );
         }
         // print the slashes
         // print the backslashes
         // print the ending spaces
         // print the ending stars
         
         System.out.println();
      }
   }
}