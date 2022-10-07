class ValorReferencia {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        
        int res = sumar(num1, num2);

        System.out.println("El resultado de la suma " + num1 + " + " + num2 + " = " + res);
        int numero = 10;
        res = pasoValor(numero);
        System.out.println("3.- paso por valor: " + res);
        System.out.println(numero);

        int[] numeros = new int[1];
        numeros[0] = 10;
        System.out.println(numeros[0]);
        res = pasoReferencia(numeros);
        System.out.println("3.- paso por valor: " + res);
        System.out.println(numeros[0]);
    }

    public static int sumar(int a, int b) {
      a = 200;
      System.out.println("Funcion sumar");
      System.out.println("a: " + a);
      System.out.println("b: " + b);
      return a + b;
    }

    public static int pasoValor(int num) {
      System.out.println("Paso valor");
      // int res = num * 2;
      // return res;
      
      // num = num * 2;
      // return num;

      // Esto sí deja, si queremos modificar el valor debemos copiarlo a una variable local
      // val res = num * 2
      // return res

      // Esto también
      return num * 2;
  }

  public static int pasoReferencia(int[] num) {
    System.out.println("Paso referencia");
    num[0] = num[0] + 2;
    return num[0];
  }
}