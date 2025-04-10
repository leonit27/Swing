import javax.swing.*;

public class CapturaTexto {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("PRINCIPAL");

        StringBuilder stringBuilder = new StringBuilder();

        jFrame.setSize(300, 200);
        jFrame.setResizable(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(true);
        textArea.setVisible(true);

        jFrame.add(textArea);

        while (true) {
            String texto = JOptionPane.showInputDialog(null, "Introduce un texto (Escribe FIN para salir):");
            if (texto.equalsIgnoreCase("FIN")) {
                JOptionPane.showMessageDialog(null, "Fin del programa");
                break;
            } else {
                stringBuilder.append(texto + "\n");
                textArea.setText(stringBuilder.toString());
            }
        }
    }
}