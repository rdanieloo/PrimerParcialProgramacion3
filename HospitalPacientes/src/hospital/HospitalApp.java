//Carlos Ramos 
//0905 23 14141

package hospital;

import java.io.*;
import java.util.*;

public class HospitalApp {
    private static final String ARCHIVO = "pacientes.csv";
    private static List<Paciente> pacientes = new ArrayList<>();

    public static void main(String[] args) {
        cargarDatos();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n========================");
            System.out.println("    HOSPITAL DANMEDIC    ");
            System.out.println("========================");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Agregar tratamiento");
            System.out.println("3. Mostrar tratamientos");
            System.out.println("4. Salir");
            System.out.print("Por favor, Seleccione una opción: ");
            String op = sc.nextLine();

            switch (op) {
                case "1":
                    registrarPaciente(sc);
                    break;
                case "2":
                    agregarTratamiento(sc);
                    break;
                case "3":
                    mostrarTratamientos(sc);
                    break;
                case "4":
                    System.out.println("Saliendo del sistema...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void registrarPaciente(Scanner sc) {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Expediente: ");
        String expediente = sc.nextLine();
        pacientes.add(new Paciente(nombre, expediente));
        guardarDatos();
        System.out.println("Paciente registrado con éxito.");
    }

    private static void agregarTratamiento(Scanner sc) {
        System.out.print("Expediente: ");
        String expediente = sc.nextLine();
        Paciente p = buscarPaciente(expediente);

        if (p == null) {
            System.out.println("Paciente no encontrado. ¿Desea registrarlo? (S/N)");
            String respuesta = sc.nextLine().trim().toUpperCase();
            if (respuesta.equals("S")) {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                p = new Paciente(nombre, expediente);
                pacientes.add(p);
            } else {
                return;
            }
        }

        System.out.print("Medicina: ");
        String med = sc.nextLine();
        System.out.print("Dosis: ");
        int dosis = Integer.parseInt(sc.nextLine());
        System.out.print("Días: ");
        int dias = Integer.parseInt(sc.nextLine());

        p.agregarTratamiento(new Tratamiento(med, dosis, dias));
        guardarDatos();
        System.out.println("Tratamiento agregado correctamente.");
    }

    private static void mostrarTratamientos(Scanner sc) {
        System.out.print("Expediente: ");
        String expediente = sc.nextLine();
        Paciente p = buscarPaciente(expediente);

        if (p == null) {
            System.out.println("Uppsss, Paciente no encontrado.");
            return;
        }

        System.out.println("\nTratamientos del paciente: " + p.getNombre());
        System.out.println("----------------------------------");
        for (Tratamiento t : p.getTratamientos()) {
            System.out.println(t.getMedicina() + " - Dosis: " + t.getDosis() + " - Días: " + t.getDias());
        }
        System.out.println("Duración total: " + p.duracionTotal() + " días");
    }

    private static Paciente buscarPaciente(String expediente) {
        for (Paciente p : pacientes) {
            if (p.getExpediente().equalsIgnoreCase(expediente)) {
                return p;
            }
        }
        return null;
    }

    private static void cargarDatos() {
        File f = new File(ARCHIVO);
        if (!f.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String linea = br.readLine();
            if (linea == null || !linea.equals("Expediente,Nombre,Medicina,Dosis,Dias")) return;

            Map<String, Paciente> mapa = new HashMap<>();
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String expediente = datos[0];
                String nombre = datos[1];
                String medicina = datos[2];
                int dosis = Integer.parseInt(datos[3]);
                int dias = Integer.parseInt(datos[4]);

                Paciente p = mapa.getOrDefault(expediente, new Paciente(nombre, expediente));
                p.agregarTratamiento(new Tratamiento(medicina, dosis, dias));
                mapa.put(expediente, p);
            }
            pacientes = new ArrayList<>(mapa.values());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void guardarDatos() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO))) {
            bw.write("Expediente,Nombre,Medicina,Dosis,Dias");
            bw.newLine();
            for (Paciente p : pacientes) {
                for (Tratamiento t : p.getTratamientos()) {
                    bw.write(p.getExpediente() + "," + p.getNombre() + "," + t.getMedicina() + "," + t.getDosis() + "," + t.getDias());
                    bw.newLine();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
