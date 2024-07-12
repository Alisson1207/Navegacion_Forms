import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form_hobbies {
    private JLabel lb_titulo;
    public JPanel panel3;
    private JButton bt_regresar;

    public Form_hobbies() {
        ImageIcon imagen = new ImageIcon("src/img/hobbie.jfif");
        JLabel imagenLabel = new JLabel(imagen);


        panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
        panel3.add(bt_regresar);
        panel3.add(lb_titulo);
        panel3.add(imagenLabel);

        bt_regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame1 = new JFrame("Biografia");
                frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame1.setContentPane(new Form_biografia().panel2);
                frame1.pack();
                frame1.setSize(500, 300);
                frame1.setLocationRelativeTo(null);
                frame1.setVisible(true);


            }
        });
    }

}
