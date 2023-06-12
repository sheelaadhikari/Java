import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button implements ActionListener{
    public Button(){
        JFrame f = new JFrame("Clicked");
        JButton btn = new JButton("Click Me");
        btn.setBounds(600, 300, 150, 25);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn.setBackground(Color.BLUE);
            }
        });
        f.add(btn);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Button();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
