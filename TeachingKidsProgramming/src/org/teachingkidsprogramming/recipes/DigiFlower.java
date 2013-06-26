package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class DigiFlower
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    //    Make the background silver --#8
    Tortoise.getBackgroundWindow(Colors.Grays.Silver);
    Tortoise.setPenWidth(3);
    //    createColorPalette (recipe below) --#9
    ColorWheel.addColor(Colors.Blues.Blue);
    //    Do the following 15 times --#19
    //      drawOctogon (recipe below) --#10
    Tortoise.turn(24);
    //    Repeat
    //    ------------- Recipe for createColorPalette --#9
    Tortoise.setPenColor(Colors.Purples.DarkSlateBlue);
    //    Color 2 is dark orange --#11
    //    Color 3 is gold --#12
    //    Color 4 is yellow --#13
    //    Add color 2 to the color wheel --#11.1
    ColorWheel.addColor(Colors.Purples.BlueViolet);
    //    Add color 3 to the color wheel --#12.1
    //    Add color 4 to the color wheel --#13.1
    //    Add color 4 to the color wheel --#14
    //    Add color 3 to the color wheel --#15
    //    Add color 2 to the color wheel --#16
    //    Add color 1 to the color wheel --#17
    //    ------------- Recipe for drawOctogon --#18
    Tortoise.
    for (int i = 1; i <= 8; i++)
    {
      Tortoise.move(50);
      Tortoise.turn(45);
    }
  }
}
