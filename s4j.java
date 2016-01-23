import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Frame extends JFrame  implements ActionListener{
	JButton miBoton1 = new JButton("Presioname");
	JButton miBoton2 = new JButton("A mi también");
	JButton miBoton3 = new JButton("Ni se te ocurra");
	JButton miBoton4 = new JButton("Hola");
	JTextField miText = new JTextField("HOLA!!!!!!!!!!!!!");
	JLabel miLabel = new JLabel("Este es el label de Tapia");
	int cont = 0;
	JTextArea miArea = new JTextArea(String.valueOf(cont));


	public Frame(){
		setTitle("Hola!!!");
		setSize(300,600);
		addWindowListener(new miManejador());

		Container contentpane = getContentPane();
		JPanel panel= new JPanel();
		JPanel panel1 = new JPanel();

		contentpane.add(panel);
		panel.setBackground(Color.yellow);
		
		//GridLayout miGrid = new GridLayout(5,5,2,3);
		FlowLayout miFlow = new FlowLayout(FlowLayout.RIGHT);	
		BorderLayout miBorder = new BorderLayout();

		panel.setLayout(miBorder);
		panel1.setLayout(miFlow);
		
		miBoton1.addActionListener(this);
		miBoton4.addActionListener(this);
		miBoton2.addActionListener(this);
		miText.addActionListener(this);

		panel1.add(miBoton1);
		panel1.add(miLabel);

		//miBoton.setBounds(10,10,100,100);
		panel.add(panel1, BorderLayout.NORTH);
		panel.add(miBoton2, BorderLayout.SOUTH);
		panel.add(miArea, BorderLayout.CENTER);
		panel.add(miBoton4, BorderLayout.EAST);
		panel.add(miText, BorderLayout.WEST);


	}
	
	public void actionPerformed(ActionEvent e){
		if((e.getSource()).equals(miBoton1)){
			miText.setText(miText.getText()+" "+miLabel.getText());
		}else if((e.getSource()).equals(miBoton2)){
			miBoton2.setBackground(Color.YELLOW);
			miBoton2.setText("Un solo idolo tiene el Ecuador");
		}else if((e.getSource()).equals(miBoton4)){
			cont++;
			miArea.append(String.valueOf(cont)+"\n");
		}else{
			miLabel.setText(miText.getText());		
		}
		
	}
}

class miManejador extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		System.out.println("sali");
		System.exit(0);
	}
}

public class s4j{
	public static void main (String[] args){
		JFrame frame = new Frame();
		frame.show();
	}
}
