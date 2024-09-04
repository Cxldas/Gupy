import java.util.Scanner;

public class Quinto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero para inverter: ");
        String entrada = sc.nextLine();
        sc.close();

                String invertida = inveterString(entrada);
        System.out.print("String invertida:" + invertida);

    }

    Public static String inveterString(String entrada) {
        String resultado= "";
        for (int i = String.length(); i--) {
            resultado += String.charAt(i);
        }
        return resultado;
    }

}
