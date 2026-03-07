package tarea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class CalculadoraGUI extends JFrame {

    private JTextField txtNum1, txtNum2;
    private JLabel lblResultado;
    private Calculadora calc = new Calculadora();
    private DecimalFormat df = new DecimalFormat("#.####");

    public CalculadoraGUI() {
        super("Calculadora básica");
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(360, 220);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(6,6,6,6);
        c.fill = GridBagConstraints.HORIZONTAL;

        c.gridx = 0; c.gridy = 0;
        add(new JLabel("Número 1:"), c);
        c.gridx = 1;
        txtNum1 = new JTextField(10);
        add(txtNum1, c);

        c.gridx = 0; c.gridy = 1;
        add(new JLabel("Número 2:"), c);
        c.gridx = 1;
        txtNum2 = new JTextField(10);
        add(txtNum2, c);

        JPanel panelButtons = new JPanel(new FlowLayout());
        JButton btnSum = new JButton("+");
        JButton btnSub = new JButton("-");
        JButton btnMul = new JButton("×");
        JButton btnDiv = new JButton("÷");
        panelButtons.add(btnSum); panelButtons.add(btnSub); panelButtons.add(btnMul); panelButtons.add(btnDiv);

        c.gridx = 0; c.gridy = 2; c.gridwidth = 2;
        add(panelButtons, c);

        c.gridx = 0; c.gridy = 3; c.gridwidth = 2;
        lblResultado = new JLabel("Resultado: ");
        add(lblResultado, c);

        // Action listener único para las 4 operaciones
        ActionListener opListener = e -> {
            String s1 = txtNum1.getText().trim();
            String s2 = txtNum2.getText().trim();
            double n1, n2;
            try {
                n1 = Double.parseDouble(s1);
                n2 = Double.parseDouble(s2);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            double res;
            try {
                if (e.getSource() == btnSum) res = calc.sumar(n1, n2);
                else if (e.getSource() == btnSub) res = calc.restar(n1, n2);
                else if (e.getSource() == btnMul) res = calc.multiplicar(n1, n2);
                else res = calc.dividir(n1, n2);
                lblResultado.setText("Resultado: " + df.format(res));
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                lblResultado.setText("Resultado: —");
            }
        };

        btnSum.addActionListener(opListener);
        btnSub.addActionListener(opListener);
        btnMul.addActionListener(opListener);
        btnDiv.addActionListener(opListener);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculadoraGUI().setVisible(true);
        });
    }
}

