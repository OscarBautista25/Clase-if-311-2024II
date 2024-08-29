import javax.swing.*;
public class MainJOP {
    public static void main(String[] args) {
        String salarioSinAjusteMje = JOptionPane.showInputDialog("Ingrese el salario sin ajuste: ");
        String porcentajeAumentoMje = JOptionPane.showInputDialog("Ingrese el porcentaje del aumento(si es el 15% ingresar 0.15): ");
        float salarioSinAjuste = Float.parseFloat(salarioSinAjusteMje);
        float porcentajeAumento = Float.parseFloat(porcentajeAumentoMje);
        EjercicioIf pruebaJOP = new EjercicioIf(salarioSinAjuste, porcentajeAumento, 0);
        float salarioAjustado = pruebaJOP.calcularSalario();
        JOptionPane.showMessageDialog(null,"El salario con ajuste es " +salarioAjustado);
        
    }
}
