//Name : md farhan tanveer sarker
//PRN : 23070126157
//Batch : 2023-2027
// Branch: AIML(b3)

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        ArrayInput Ai = new ArrayInput(scan); // Create ArrayInput object
        ArrayFunctions Af = new ArrayFunctions(); // Create ArrayFunctions object

        int[] userArray = Ai.userInput(); // Get array input from user

        Af.oddEven(userArray); // Perform odd/even separation
        Af.minDif(userArray); // Find minimum consecutive difference
        Af.displayConversions(userArray); // Demonstrate array conversions
    }
}
