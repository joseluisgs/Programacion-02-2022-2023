class AmbitoVariables {

  public static int c = 12;

  public static void main(String args[]) {
    int a = 0;
    System.out.println(a);
    System.out.println(c);


    while(a < 10) {
      // int a = 10; // No me deja
      int b = 0;
      b = b + 1;
      a = a + 1;
    }

     while(a < 20) {
      int b = 0;
      b = b + 1;
      a = a + 1;
    }

    int b = 0;
    System.out.println(b);

  }

  public static void funcion(int a) {
    int b = 0;
    System.out.println("a = " + a);
    System.out.println("b = " + b);
  }
}