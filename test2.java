import java.util.Random;
public class test2
{
   public static int[][] array = new int[3][4];
   public static void main (String [] args) {
          populate();
          printArray();
   }
   public static void populate(){
     Random rand = new Random();
     for (int i=0; i<array.length;i++){
              for (int j=0; j<array[i].length;j++){
                array[i][j] = rand.nextInt(10);  
              }
          } 
   }
   public static void printArray(){
    for (int i=0; i<array.length;i++){
              System.out.printf("\n");
              for (int j=0; j<array[i].length;j++){
                System.out.printf("%d ", array[i][j]);
              }
          }
   }     
}
