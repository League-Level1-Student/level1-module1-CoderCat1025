package _11_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binaryConverter implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField answer = new JTextField(20);
JLabel label = new JLabel();
JButton button = new JButton();
String answer2 = "";
String answer3 = "";




public void run() {

	frame.setVisible(true);
	frame.setTitle("Convert 8 bits of binary to ASCII");
	panel.setVisible(true);
	
	frame.add(panel);
	panel.add(answer);
	panel.add(button);
	panel.add(label);
	
	button.setText("convert");
	button.addActionListener(this);
	
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	label.setText(answer3);
}



String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}



@Override
public void actionPerformed(ActionEvent e) {
	answer2 = answer.getText();
	answer3 = this.convert(answer2);
	
	label.setText(answer3);
	frame.pack();
}

}
