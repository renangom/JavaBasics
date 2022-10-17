package classeAnonima;

import javax.swing.JOptionPane;

public class UncheckedException {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Não é possível dividir por zero");
        } finally {
            System.out.println("Chegou no finally!");
        }

    }

    public static int dividir(int a, int b) {
        return a / b;
    }

}
