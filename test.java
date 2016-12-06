
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class test
{
    public static void main (String [] args) {
          Random rand = new Random();
          int[][] array = new int[3][4];
          for (int i=0; i<array.length;i++){
              for (int j=0; j<array[i].length;j++){
                array[i][j] = rand.nextInt(9)+1;  
              }
          }
          for (int i=0; i<array.length;i++){
              System.out.printf("\n");
              for (int j=0; j<array[i].length;j++){
                System.out.printf("%d ", array[i][j]);
              }
          }
          
    }
}
