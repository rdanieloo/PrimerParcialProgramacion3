package tarea;

public class RegistroEstudiantesGUI {
	
	import javax.swing.*;
	import javax.swing.table.DefaultTableModel;
	import java.awt.*;
	import java.util.ArrayList;

	/**
	 * Interfaz para registrar estudiantes en una lista (ArrayList) y mostrar en una JTable.
	 */
	public class RegistroEstudiantesGUI extends JFrame {

	    private JTextField txtNombre;
	    private JTextField txtEdad;
	    private JButton btnGuardar;
	    private DefaultTableModel tableModel;
	    private JTable table;
	    private ArrayList<Estudiante> lista;

	    public RegistroEstudiantesGUI() {
	        super("Registro de estudiantes");
	        lista = new ArrayList<>();
	        initComponents();
	    }

	    private void initComponents() {
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(480, 360);
	        setLocationRelativeTo(null);
	        setLayout(new BorderLayout(8,8));

	        // Panel superior con campos y botón
	        JPanel panelTop = new JPanel(new GridBagLayout());
	        GridBagConstraints c = new GridBagConstraints();
	        c.insets = new Insets(6,6,6,6);
	        c.fill = GridBagConstraints.HORIZONTAL;

	        c.gridx=0; c.gridy=0;
	        panelTop.add(new JLabel("Nombre:"), c);
	        c.gridx=1;
	        txtNombre = new JTextField(20);
	        panelTop.add(txtNombre, c);

	        c.gridx=0; c.gridy=1;
	        panelTop.add(new JLabel("Edad:"), c);
	        c.gridx=1;
	        txtEdad = new JTextField(5);
	        panelTop.add(txtEdad, c);

	        c.gridx=0; c.gridy=2; c.gridwidth=2;
	        btnGuardar = new JButton("Guardar");
	        panelTop.add(btnGuardar, c);

	        add(panelTop, BorderLayout.NORTH);

	      
	        tableModel = new DefaultTableModel(new Object[]{"Nombre","Edad"},0) {
	            @Override public boolean isCellEditable(int row, int col) { return false; } // no editable
	        };
	        table = new JTable(tableModel);
	        add(new JScrollPane(table), BorderLayout.CENTER);

	        
	        btnGuardar.addActionListener(e -> guardarEstudiante());
	        txtEdad.addActionListener(e -> guardarEstudiante()); 
	    }

	 
	    private void guardarEstudiante() {
	        String nombre = txtNombre.getText().trim();
	        String sEdad = txtEdad.getText().trim();

	        if (nombre.isEmpty()) {
	            JOptionPane.showMessageDialog(this, "Ingrese el nombre del estudiante.", "Error", JOptionPane.ERROR_MESSAGE);
	            return;
	        }

	        int edad;
	        try {
	            edad = Integer.parseInt(sEdad);
	            if (edad < 0 || edad > 120) throw new NumberFormatException();
	        } catch (NumberFormatException ex) {
	            JOptionPane.showMessageDialog(this, "Ingrese una edad válida (entero).", "Error", JOptionPane.ERROR_MESSAGE);
	            return;
	        }

	        Estudiante est = new Estudiante(nombre, edad);
	        lista.add(est); 
	        tableModel.addRow(new Object[]{est.getNombre(), est.getEdad()}); // se muestra en la tabla

	     
	        txtNombre.setText("");
	        txtEdad.setText("");
	        txtNombre.requestFocus();
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> new RegistroEstudiantesGUI().setVisible(true));
	    }
 

}
