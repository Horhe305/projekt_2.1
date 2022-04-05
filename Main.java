class Main {
  public static void main(String[] args)
  {
    String znak = "*";

    for (int x = 0; x < 5; x++)
      {
        for (int y = 0; y < 5; y++)
          {
            if (y < (5 - x) || y > (5 + x))
            {
              System.out.print(" ");
            }
            else
            {
              System.out.print(znak);
            }
          }
        System.out.println();
      }
    for (int x = 0; x < 5; x++)
      {
        for (int y = 0; y < 5; y++)
          {
            if (y < (5 - x) || y > (5 + x))
            {
              System.out.print(" ");
            }
            else
            {
              System.out.print(znak);
            }
          }
        System.out.println();
      }
  }
}