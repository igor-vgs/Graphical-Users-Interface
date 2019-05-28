import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrainForm {
    private JPanel mainPanel;
    private JSpinner tubeSpinner;
    private JTextField areaField;
    private CanvasPanel canvasPanel1;
    private JSpinner spinner1;
    private JComboBox comboBox1;
    

    public TrainForm () {
        String[] color = {"red", "yellow","black","blue"};
        comboBox1.addItem(color[0]);
        comboBox1.addItem(color[1]);
        comboBox1.addItem(color[2]);
        comboBox1.addItem(color[3]);

        tubeSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int radius = (int) tubeSpinner.getValue();
                canvasPanel1.setTubes(radius);
            }
        });

        spinner1.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int radius = (int) spinner1.getValue();
                canvasPanel1.setWheels(radius);
            }
        });
        comboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = (String) comboBox1.getSelectedItem();
                if(str.compareTo("black") == 0){
                    canvasPanel1.setColor(1);
                }
                if(str.compareTo("blue") == 0){
                    canvasPanel1.setColor(2);
                }
                if(str.compareTo("red") == 0){
                    canvasPanel1.setColor(3);
                }
                if(str.compareTo("yellow") == 0){
                    canvasPanel1.setColor(4);
                }


            }
        });
        canvasPanel1.setWheels(3);
        spinner1.setValue(3);
        canvasPanel1.setTubes(1);
        tubeSpinner.setValue(1);
        comboBox1.setSelectedIndex(0);
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Окружность");
        frame.setContentPane(new TrainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
