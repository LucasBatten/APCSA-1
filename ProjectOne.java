public class ProjectOne {
   public static int MAX_LINE_INDEX = 6;
   public static int SPACES_STARS_LENGTH = 7;
   public static int SLASH_BACKSLASH_LENGTH = 12;
   public static void main( String[] args ){
      // print the line
      for( int i = MAX_LINE_INDEX; i >= 0; i-- ) {         
         // print the beginning stars
         for( int j = i; j > 0; j-- ){
            System.out.print( "*" );
         }
         
         // print the beginning spaces
         for( int j = 0; j < (SPACES_STARS_LENGTH - i); j++ ){
            System.out.print( " " );
         }
         
         // print the slashes
         for( int j = 0; j < (i*2); j++ ){
            System.out.print("/");
         }
         
         // print the backslashes
         for( int j = 0; j < SLASH_BACKSLASH_LENGTH - (i*2); j++ ){
            System.out.print("\\");
         } 
         
         // print the ending spaces
         for( int j = 0; j < (SPACES_STARS_LENGTH - i); j++ ){
            System.out.print( " " );
         }
                  
         // print the ending stars
         for( int j = i; j > 0; j-- ){
            System.out.print( "*" );
         }
                  
         System.out.println();
      }
   }
}