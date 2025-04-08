import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrimerasVentanas {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("PRINCIPAL");
        JFrame jFrame2 = new JFrame("SECUNDARIA");

        jFrame.setSize(300, 200);
        jFrame.setResizable(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

        jFrame2.setSize(300, 200);
        jFrame2.setResizable(true);
        jFrame2.setLocationRelativeTo(null);
        jFrame2.setVisible(true);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button = new JButton("Abrir ventana secundaria");

        button.setVisible(true);
        jFrame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame2.setVisible(true);
            }
        });

        JTextField textField = new JTextField("Esta es la ventana secundaria");;

        jFrame2.add(textField);
    }
}