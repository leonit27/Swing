import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ElDestructor {
    public static List<JFrame> galletas = new ArrayList<>();
    public static int contadorGalletas = 1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("El Destructor");
        JButton botonCaos = new JButton("Crear caos");
        JButton botonEliminar = new JButton("Eliminar una");

        frame.setVisible(true);
        frame.setSize(300, 400);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        botonCaos.setBackground(new Color(191, 251, 239));
        botonEliminar.setBackground(new Color(252, 255, 189));

        GridLayout layout = new GridLayout(1, 2);
        frame.setLayout(layout);

        frame.add(botonCaos);
        frame.add(botonEliminar);

        botonCaos.addActionListener(_ -> crearGalletas());
        botonEliminar.addActionListener(_ -> eliminarGalletas());
    }

    public static void crearGalletas() {
        JFrame galleta = new JFrame("Galleta " + contadorGalletas);

        JButton botonAutodestruir = new JButton("Autodestruir todo");

        galleta.setVisible(true);
        galleta.setSize(300, 400);
        galleta.setResizable(true);
        galleta.setLocationRelativeTo(null);

        botonAutodestruir.setBackground(new Color(230, 40, 0));
        botonAutodestruir.setForeground(Color.white);

        galleta.add(botonAutodestruir);

        botonAutodestruir.addActionListener(_ -> {
            for (JFrame g : galletas) g.dispose();
        });

        contadorGalletas++;
        galletas.add(galleta);
    }

    public static void eliminarGalletas() {
        if (!galletas.isEmpty()) {
            galletas.getLast().dispose();
            galletas.removeLast();
        }
    }
}
