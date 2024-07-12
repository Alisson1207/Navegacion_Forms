import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form_biografia {
    private JLabel lb_titulo;
    public JPanel panel2;
    private JTextArea ta_informacion;
    private JButton bt_hobbies;

    public Form_biografia() {
        // Crear los componentes
        lb_titulo = new JLabel("Biografía");
        ta_informacion = new JTextArea();
        ta_informacion.setEditable(false);
        ta_informacion.setText("\nMi nombre es Alisson Viteri tengo 22 años nací el 16 de diciembre del 2001 actualmente" +
                "\nvivo con mis padres, en mi tiempo libre me gusta salir a jugar al parque con mis mascotas" +
                "\ny me gusta aprender nuevas cosas. " );

        panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS)); // Orientación vertical
        panel2.add(lb_titulo);
        panel2.add(ta_informacion);
        panel2.add(bt_hobbies);

        bt_hobbies.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame1 = new JFrame("Hobbies");
                frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame1.setContentPane(new Form_hobbies().panel3);
                frame1.pack();
                frame1.setSize(600, 500);
                frame1.setLocationRelativeTo(null);
                frame1.setVisible(true);

            }
        });
    }
}
