import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextArea;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;


public class PassFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassFrame frame = new PassFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PassFrame() {
		// add icon 
		
		
		setTitle("Password Generator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		// basic panel info
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		// add panel to the frame
		setContentPane(contentPane);
		// layout absolute
		contentPane.setLayout(null);
		// label info
		JLabel lblNewLabel = new JLabel("Password length");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		lblNewLabel.setBounds(31, 33, 154, 27);
		// add label
		contentPane.add(lblNewLabel);
		// text area info 
		JTextArea passField = new JTextArea();
		passField.setBackground(SystemColor.info);
		passField.setBounds(42, 83, 112, 22);
		// add text area to panel
		contentPane.add(passField);
		
		// text area info
		JTextArea passField_1 = new JTextArea();
		passField_1.setBackground(UIManager.getColor("MenuBar.highlight"));
		passField_1.setBounds(21, 266, 308, 22);
		// add text area
		contentPane.add(passField_1);
		// button info
		JButton GenerateButton = new JButton("generate Password");
		GenerateButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		// add action to button
		GenerateButton.addActionListener(new ActionListener() {
			// on press
			public void actionPerformed(ActionEvent e) {
				// generate pass
				passGenerator command=new passGenerator();
				String pass = command.excute(passField.getText());
				// show generated pass
				passField_1.setText(pass);
			}
		});
		GenerateButton.setBounds(32, 138, 212, 42);
		// add button
		contentPane.add(GenerateButton);
		// add copy button
		JButton copyButton = new JButton("copy");
		copyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// perform copy command
				ICommand command=new CopyCommand();
				command.excute(passField_1.getText());
				}
		});
		copyButton.setBounds(186, 315, 70, 23);
		contentPane.add(copyButton);
		
	
		
		
		
	}
}
