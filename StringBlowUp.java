/****************************************************************************
 *
 * Plagrized by: Teddy Sannan which was plagirized by James Lee
 * Created on: Feb 18 2019
 * Created for: ICS4U
 * This program returns a version of the original string as follows:
 * each number from 0-9 that appears in the original string is replaced by how
 * many occurrences of the character to the right of the digit
 *
 ****************************************************************************/

import java.util.Scanner;

public class stringBlowup
{

    public static void main(String[] args)
    {
        String output;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Word or String to Blow up:");
        String userInput = scanner.nextLine();

        output = blowUp(userInput);
        System.out.printf("%s%n", output);
    }

    public static String blowUp(String str)
    {
        // A buffer is like a string that can be modified
        StringBuffer buffer = new StringBuffer();

        // Check to see if string exists
        if (str.length() == 0)
        {
            String errorStr = "Error: Not A Valid Input";
            buffer.append(errorStr);
        }
        else
        {
            // Cycle through the string buffer and process
            for (int index = 0; index < str.length(); index++)
            {

                // Get character at current index
                char character = str.charAt(index);

                // Checks to see if character is a digit at current index
                if (Character.isDigit(character))
                {
                    // Checks to see if current index is not the last index of the string
                    if (index < str.length()-1)
                    {
                        // Convert character into integer
                        int numOfRepeats = Integer.parseInt(Character.toString(character));

                        // Get next element
                        char next = str.charAt(index + 1);

                        // Appends next character numOfRepeats times
                        for (int repeat = 0; repeat < numOfRepeats; repeat++)
                        {
                            buffer.append(next);
                        }
                    }
                }
                // Appends character at current index if not digit
                else
                {
                    buffer.append(character);
                }
            }

        }

        return buffer.toString();
    }
}
