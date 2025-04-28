import java.util.Random;

public class Problem1 {
  public static void main(String[] args) {
    int arraySize = 10; // size of the array
    int[] randomNumberArray = new int[arraySize];

    // Create a Random object
    Random random = new Random();

    // Generate random numbers and store them in the array
    System.out.println("Random Number Array:");
    for (int i = 0; i < arraySize; i++) {
      randomNumberArray[i] = random.nextInt(100); // generate random numbers between 0 and 99
      System.out.print(randomNumberArray[i] + " ");
    }

    // Perform arithmetic operations
    int sum = 0;
    int product = 1;
    

    for (int i = 0; i < arraySize; i++) {
      sum += randomNumberArray[i];
      product *= randomNumberArray[i];
      
    }

    // Print the results
    System.out.println("\nSum: " + sum);
    System.out.println("Product: " + product);
    
  }
}
