import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prueba extends JFrame {
    private JButton btnAdd;
    private JPanel panelMain;

    int c = 0;


    public Prueba() {

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField txtRun = new JTextField();
                txtRun.setName("txtDynamic" +c++);
                txtRun.setLocation(20,18+(20*c));
                txtRun.setSize(200,25);
                // this.Controls.Add(txtRun);
                btnAdd.add(txtRun);
            }
        });
    }
    public static void main(String args[]){
        JFrame frame = new JFrame("Prueba");
        frame.setContentPane(new Prueba().rootPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
