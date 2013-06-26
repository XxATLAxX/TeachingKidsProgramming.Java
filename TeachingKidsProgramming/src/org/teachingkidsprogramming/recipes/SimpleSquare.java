package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.setSpeed(1);
    Tortoise.setPenColor(Colors.Blues.Blue);
    Tortoise.move(60);
    Tortoise.turn(90);
    Tortoise.setPenColor(Colors.Blues.Blue);
    Tortoise.move(60);
    Tortoise.turn(90);
    Tortoise.setPenColor(Colors.Blues.Blue);
    Tortoise.move(60);
    Tortoise.turn(90);
    Tortoise.setPenColor(Colors.Blues.Blue);
    Tortoise.move(60);
    Tortoise.turn(90);
  }
}
