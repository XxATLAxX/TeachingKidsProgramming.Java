package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class KnottedRing
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    ColorWheel.addColor(Colors.Pinks.HotPink);
    ColorWheel.addColor(Colors.Reds.Red);
    ColorWheel.addColor(Colors.Purples.Fuchsia);
    ColorWheel.addColor(Colors.Oranges.Orange);
    ColorWheel.addColor(Colors.Pinks.DeepPink);
    ColorWheel.addColor(Colors.Purples.MediumVioletRed);
    ColorWheel.addColor(Colors.Reds.Crimson);
    ColorWheel.addColor(Colors.Reds.Tomato);
    for (int i = 1; i <= 30; i++)
    {
      Tortoise.setPenColor(Colors.getRandomColor());
      //              drawOctagonWithOverlap (recipe below) --#8
      //              ------------- Recipe for drawOctagonWithOverlap --#7
    }
    for (int i = 1; i <= 9; i++)
    {
      Tortoise.move(110);
      Tortoise.turn(45);
      Tortoise.turn(45);
    }
    //              ------------- End of drawOctagonWithOverlap recipe --#7
    Tortoise.turn(12);
    Tortoise.turn(17);
    Tortoise.turn(17);
    //       Repeat 
  }
}
