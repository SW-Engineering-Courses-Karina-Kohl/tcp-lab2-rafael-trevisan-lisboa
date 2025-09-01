import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        JPanel panel = new JPanel();
        
        JTextField campoNum1 = new JTextField(10);
        JTextField campoNum2 = new JTextField(10);
        JButton botaoSomar = new JButton("Calcular");
        JLabel labelResultado = new JLabel("Soma: ");
		JLabel labelResultado2 = new JLabel("Subtracao: ");
		JLabel labelResultado3 = new JLabel("Divisao: ");
		JLabel labelResultado4 = new JLabel("Multiplicacao: ");
        
        botaoSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(campoNum1.getText());
                    int num2 = Integer.parseInt(campoNum2.getText());
                    Calculadora calc = new Calculadora();
					int resultado = calc.somar(num1, num2);
					int resultado2 = calc.subtrair(num1, num2);
					int resultado3 = calc.dividir(num1, num2);
					int resultado4 = calc.multiplicar(num1, num2);
                    labelResultado.setText("Soma: " + resultado);
					labelResultado2.setText("Subtracao: " + resultado2);
					labelResultado3.setText("Divisao: " + resultado3);
					labelResultado4.setText("Multiplicacao: " + resultado4);
                } catch (NumberFormatException ex) {
                    labelResultado.setText("Entrada inválida!");
                }
            }
        });
        
        panel.add(campoNum1);
        panel.add(new JLabel("+"));
        panel.add(campoNum2);
        panel.add(botaoSomar);
        panel.add(labelResultado);
		panel.add(labelResultado2);
		panel.add(labelResultado3);
		panel.add(labelResultado4);
        
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
