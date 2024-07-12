import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frm {
    private JFrame frame;
    private JLabel lb_titulo;
    private JLabel lb_usuario;
    private JTextField tf_usuario;
    private JLabel lb_contrasenia;
    private JPasswordField passwordField;
    private JButton bt_ingresar;
    public JPanel panel;

    public Frm() {
        bt_ingresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = tf_usuario.getText();
                String contrasenia = new String(passwordField.getPassword());
                if (usuario.equals("usuario") && contrasenia.equals("123456")) {
                    JFrame frame1 = new JFrame("Biografia");
                    frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame1.setContentPane(new Form_biografia().panel2);
                    frame1.pack();
                    frame1.setSize(500, 300);
                    frame1.setLocationRelativeTo(null);
                    frame1.setVisible(true);


                } else {
                    JOptionPane.showMessageDialog(frame, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
