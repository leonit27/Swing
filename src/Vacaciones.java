import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vacaciones extends JFrame {

    static JTextField campoDestino;
    static JTextField campoNombrePlan;
    static JTextField campoResponsable;

    static JComboBox comboTipoPlan;
    static JTextField campoNombreViajero;
    static JTextField campoAnioNacimiento;
    static JTextField campoAltura;
    static JTextField campoEquipaje;
    static JTextField campoDestinoViajero;

    public static void main(String[] args) {
        Vacaciones frame = new Vacaciones();
        frame.setTitle("Vacaciones");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel();
        final CardLayout cardLayout = new CardLayout();
        panelPrincipal.setLayout(cardLayout);

        JPanel panelGrupo = new JPanel();
        panelGrupo.setLayout(new BorderLayout());

        JPanel panelViajero = new JPanel();
        panelViajero.setLayout(new BorderLayout());

        JPanel formGrupo = new JPanel();
        formGrupo.setLayout(new GridLayout(3, 2));

        formGrupo.add(new JLabel("Destino:"));
        campoDestino = new JTextField();
        formGrupo.add(campoDestino);

        formGrupo.add(new JLabel("Plan:"));
        campoNombrePlan = new JTextField();
        formGrupo.add(campoNombrePlan);

        formGrupo.add(new JLabel("Responsable:"));
        campoResponsable = new JTextField();
        formGrupo.add(campoResponsable);

        JButton btnRegistrarGrupo = new JButton("Registrar Grupo");
        btnRegistrarGrupo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registrarGrupo();
            }
        });

        panelGrupo.add(new JLabel("Grupo de Viaje"), BorderLayout.NORTH);
        panelGrupo.add(formGrupo, BorderLayout.CENTER);
        panelGrupo.add(btnRegistrarGrupo, BorderLayout.SOUTH);

        JPanel formViajero = new JPanel();
        formViajero.setLayout(new GridLayout(6, 2));

        formViajero.add(new JLabel("Tipo:"));
        String[] tipos = {"Relax", "Aventura", "Cultural"};
        comboTipoPlan = new JComboBox(tipos);
        formViajero.add(comboTipoPlan);

        formViajero.add(new JLabel("Nombre:"));
        campoNombreViajero = new JTextField();
        formViajero.add(campoNombreViajero);

        formViajero.add(new JLabel("Año:"));
        campoAnioNacimiento = new JTextField();
        formViajero.add(campoAnioNacimiento);

        formViajero.add(new JLabel("Altura:"));
        campoAltura = new JTextField();
        formViajero.add(campoAltura);

        formViajero.add(new JLabel("Equipaje:"));
        campoEquipaje = new JTextField();
        formViajero.add(campoEquipaje);

        formViajero.add(new JLabel("Destino:"));
        campoDestinoViajero = new JTextField();
        formViajero.add(campoDestinoViajero);

        JButton btnRegistrarViajero = new JButton("Registrar Viajero");
        btnRegistrarViajero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registrarViajero();
            }
        });

        panelViajero.add(new JLabel("Viajero"), BorderLayout.NORTH);
        panelViajero.add(formViajero, BorderLayout.CENTER);
        panelViajero.add(btnRegistrarViajero, BorderLayout.SOUTH);

        panelPrincipal.add(panelGrupo, "Grupo");
        panelPrincipal.add(panelViajero, "Viajero");

        JButton btnGrupo = new JButton("Ver Grupo");
        JButton btnViajero = new JButton("Ver Viajero");

        btnGrupo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelPrincipal, "Grupo");
            }
        });

        btnViajero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelPrincipal, "Viajero");
            }
        });

        JPanel panelBotones = new JPanel();
        panelBotones.add(btnGrupo);
        panelBotones.add(btnViajero);

        frame.add(panelBotones, BorderLayout.NORTH);
        frame.add(panelPrincipal, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    static void registrarGrupo() {
        String destino = campoDestino.getText();
        String plan = campoNombrePlan.getText();
        String responsable = campoResponsable.getText();

        System.out.println("GRUPO DE VIAJE");
        System.out.println("Destino: " + destino);
        System.out.println("Plan: " + plan);
        System.out.println("Responsable: " + responsable);
    }

    static void registrarViajero() {
        String tipo = (String) comboTipoPlan.getSelectedItem();
        String nombre = campoNombreViajero.getText();
        String anio = campoAnioNacimiento.getText();
        String altura = campoAltura.getText();
        String equipaje = campoEquipaje.getText();
        String destino = campoDestinoViajero.getText();

        System.out.println("VIAJERO");
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Año: " + anio);
        System.out.println("Altura: " + altura);
        System.out.println("Equipaje: " + equipaje);
        System.out.println("Destino: " + destino);
    }
}