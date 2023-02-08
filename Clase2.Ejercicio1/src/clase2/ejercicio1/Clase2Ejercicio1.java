package clase2.ejercicio1;

import javax.swing.JOptionPane;

public class Clase2Ejercicio1
{
    public static void main(String[] args)
    {
        double n1, n2, n3, n4;
        
        n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el puntaje obtenido en el parcial 1: "));
        n2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el puntaje obtenido en el parcial 2: "));
        n3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el puntaje obtenido en el parcial 3: "));
        
        n4=3-((n1+n2+n3)/4);
        
        JOptionPane.showMessageDialog(null, "Para que la nota final sea igual o mayor a 3, la nota obtenida en el parcial 4 debe ser como minimo: "+n4);
    }   
}
