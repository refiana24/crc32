/**
 *
 * @author Refiana Monica
 */
package crcmaker;
import java.util.zip.* ;
import java.util.Scanner;

public class CRCMaker {
    public static void main(String [] args) {
        System.out.println("INPUT BILANGAN HEXA");
        Scanner data = new Scanner(System.in);
      String toBeEncoded = new String(data.nextLine()) ;
      CRC32 myCRC = new CRC32( ) ;
      myCRC.update( toBeEncoded.getBytes( ) ) ;
      System.out.println( "The CRC-32 value is : " + Long.toHexString( myCRC.getValue( ) ) + " !" ) ;
   }
        // TODO code application logic here
 }
    

