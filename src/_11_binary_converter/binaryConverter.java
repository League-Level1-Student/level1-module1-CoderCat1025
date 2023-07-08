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




public void run() {
	binaryConverter converter = new binaryConverter();
	converter.frame.setVisible(true);
	converter.frame.setTitle("Convert 8 bits of binary to ASCII");
	converter.panel.setVisible(true);
	
	converter.frame.add(converter.panel);
	converter.panel.add(converter.answer);
	converter.panel.add(converter.button);
	converter.panel.add(converter.label);
	
	converter.button.setText("convert");
	converter.button.addActionListener(this);
	
	converter.frame.pack();
	converter.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	converter.label.setText("convert");
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
	String answer2 = answer.getText();
	this.convert(answer2);
}

}
