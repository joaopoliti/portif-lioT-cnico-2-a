import java.util.Scanner;

public class Calc {
   
  static public void main(String args){
  int n1;
  float sqrt, log, fac;
  int op;

  Scanner into = new Scanner(System.in);

  System.out.println("Welcome to the simple math helper.");
  System.out.println("First, what value would you like to calculate?");
  n1 = into.nextInt();

  System.out.println("/////Enter the operation number you would like to calculate??\\\\"); 
  System.out.println("1. Sqrt");
  System.out.println("2. Log");
  System.out.println("3. Factorial");
  op = into.nextInt();


  switch(op){

    case 1:
      if(n1 < 0){
        System.out.println("Invalid operation in reais");
      }
      else{
    sqrt = Float.parseFloat(""+Math.sqrt(n1));
    System.out.println(sqrt);
      }
      break;

    case 2:
      if(n1 <= 0){
        System.out.println("Invalid operation");
      }
      else{
         log = Float.parseFloat(""+ Math.log10(n1));
        System.out.println(log);
      }
    
      break;

    case 3:
      if(n1 < 0){
        System.out.println("Invalid operation");
      }
      else{
      n1 = fat(n1);
        System.out.println(n1);
      }
      break;

    default:
      System.out.println("Invalid operation");
  }
 }
  static public int fat(int n1){
      System.out.println("Informe o numero para calcular");
    int n = n1;
      
    while(n > 1){
    n1 = n1*(n-1);
    n=n-1;
  }
    return n1;
}  
}
