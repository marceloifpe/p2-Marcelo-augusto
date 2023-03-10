//Código corrigido funcionando utilizando Recursão
public class App {
    static int fatorial(int n) {
        if(n == 0){
         return 1;
        }
        else
        {
        return n * fatorial(n-1);
    }
       }

    public static void main(String[] args) throws Exception {
        System.out.println(fatorial(5));
    }
}

/*código 1 erro 
 //código 1
 
public class App {
 static int fatorial(n) {
  return n * fatorial(n-1);
 }

 static ing main(String[] args) {
  System.println(fatorial(5));
 } 
}
 */
