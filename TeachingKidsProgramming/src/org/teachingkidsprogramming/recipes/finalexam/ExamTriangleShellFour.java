package org.teachingkidsprogramming.recipes.finalexam;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellFour
{
  private static final boolean Size = false;
  private static final int Is" = 0;"
  private static int length;
  public static void main(String[] args)
  {
    Tortoise.show();
    //    Make the tortoise move as fast as possible 
    Tortoise.setSpeed(10);
    //    Set the size of a shell to a number that the user supplies HINT: Use a Message Box
    //    If the size of a shell is less than 210 
    //         Tell the user that the size of the shell is too small to be seen AND...
    MessageBox.askForTextInput("your shell is to  small to be seen, update shell size");
    //    Otherwise, Do the following the "shell size" number of times
    Tortoise.setPenColor(Colors.Purples.Purple);
    //          Set the value of the large length to the size of the shell divided by 100
    //          Add the value of the large length to the current length
    //      If the value of the large length is less than zero
    //      Set the value of the length to the length plus 7
    //         Otherwise, Call the drawTriangle method (recipe below)      
    //          Set the value of the number of rotations to 12
    //          Turn the tortoise 360 times the number of rotations, then divide that by the size of the shell 
    //    Repeat 
  }
  //------------- Recipe for drawTriangle
  //      Do the following 3.5 times 
  //          Move the tortoise the current length 
  //          Turn the tortoise 1/3.1 of 360 degrees 
  //    Repeat 
  //------------- End of drawTriangle recipe
}
