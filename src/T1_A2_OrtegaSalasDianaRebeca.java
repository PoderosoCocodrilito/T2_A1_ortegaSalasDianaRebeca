import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;
class VentanaPrincipal extends JFrame {
	public VentanaPrincipal () {
		getContentPane().setLayout(null );
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Layout NULO" );
		setSize(730,430);
		setLocationRelativeTo(null);
		setVisible(true);

		JLabel txtFormulario = new JLabel ("The Classic Form includes all visible fields for ");
		txtFormulario.setBounds(20,10 , 270, 15);
		txtFormulario.setFont(new Font("Arial", Font.BOLD, 9));
		add(txtFormulario);
		
		JLabel txtFormulario1 = new JLabel ("this list.");
		txtFormulario1.setBounds(20,25 , 100, 15);
		txtFormulario1.setFont(new Font("Arial", Font.BOLD, 9));
		add(txtFormulario1);
		
		JLabel txtOpcionesFormulario = new JLabel ("Form options");
		txtOpcionesFormulario.setBounds(20,45 , 80, 15);
		txtOpcionesFormulario.setFont(new Font("Arial", Font.BOLD, 12));
		add(txtOpcionesFormulario);
		
		JLabel txtIncluyaLoSiguiente = new JLabel ("Include the following:");
		txtIncluyaLoSiguiente.setBounds(20,60 , 100, 15);
		txtIncluyaLoSiguiente.setFont(new Font("Arial", Font.BOLD, 9));
		add(txtIncluyaLoSiguiente);
		
		JCheckBox cajaTituloParaTuFormulario = new JCheckBox ("a title for your form ");
		cajaTituloParaTuFormulario.setBounds(16,75 , 130, 15);
		cajaTituloParaTuFormulario.setFont(new Font("Arial", Font.BOLD, 9));
		add(cajaTituloParaTuFormulario);
		
		//FALTA 
		JTextField cajaSuscribase = new JTextField(10);
		cajaSuscribase.setText("Subscribe to our mailing list");
		cajaSuscribase.setBounds(20,95 , 210, 15);
		cajaSuscribase.setFont(new Font("Arial", Font.BOLD, 9));
		add(cajaSuscribase);
		
		
		ButtonGroup bg = new ButtonGroup();
		
		JRadioButton op1 = new JRadioButton ("only required fields");
		op1.setBounds(16,130 , 130, 15);
		op1.setFont(new Font("Arial", Font.BOLD, 9));
		bg.add(op1);
		add(op1);
		
		JRadioButton op2 = new JRadioButton ("all fields");
		op2.setBounds(16,145 , 130, 15);
		op2.setFont(new Font("Arial", Font.BOLD, 9));
		bg.add(op2);
		add(op2);
		
		JLabel txtOp3 = new JLabel ("(edit required fields in the form builder)");
		txtOp3.setBounds(27,160 , 230, 15);
		txtOp3.setFont(new Font("Arial", Font.BOLD, 9));
		add(txtOp3);
		
		JCheckBox cuadro1 = new JCheckBox ("interest group fields ");
		cuadro1.setBounds(16,190 , 120, 15);
		cuadro1.setFont(new Font("Arial", Font.BOLD, 9));
		add(cuadro1);
		
		JCheckBox cuadro2 = new JCheckBox ("required field indicators");
		cuadro2.setBounds(16,205 , 120, 15);
		cuadro2.setFont(new Font("Arial", Font.BOLD, 9));
		add(cuadro2);
		
		JLabel txtAnchoFormulario = new JLabel ("Set form width");
		txtAnchoFormulario.setBounds(20,228 , 140, 15);
		txtAnchoFormulario.setFont(new Font("Arial", Font.BOLD, 9));
		add(txtAnchoFormulario);
		
		JTextField caja2 = new JTextField(10);
		caja2.setBounds(20,240 , 210, 15);
		caja2.setFont(new Font("Arial", Font.BOLD, 9));
		add(caja2);
		
		
		JLabel txtMejoraTuForma = new JLabel ("Enhance your form");
		txtMejoraTuForma.setBounds(20,270 , 140, 15);
		txtMejoraTuForma.setFont(new Font("Arial", Font.BOLD, 9));
		add(txtMejoraTuForma);
		
		JCheckBox caja1 = new JCheckBox ("enable evil popup mode");
		caja1.setBounds(16,290 , 150, 15);
		caja1.setFont(new Font("Arial", Font.BOLD, 9));
		add(caja1);
		
		JCheckBox caja02 = new JCheckBox ("disable all JavaScript Info");
		caja02.setBounds(16,310 , 150, 15);
		caja02.setFont(new Font("Arial", Font.BOLD, 9));
		add(caja02);
		
		JCheckBox caja3 = new JCheckBox ("include archive link Info");
		caja3.setBounds(16,330 , 150, 15);
		caja3.setFont(new Font("Arial", Font.BOLD, 9));
		add(caja3);
		
		JCheckBox caja4 = new JCheckBox ("include Monkey Rewards link");
		caja4.setBounds(16,350 , 160, 15);
		caja4.setFont(new Font("Arial", Font.BOLD, 9));
		add(caja4);
		
		JLabel txtPreview = new JLabel ("Preview");
		txtPreview.setBounds(260,13 , 140, 15);
		txtPreview.setFont(new Font("Arial", Font.BOLD, 12));
		add(txtPreview);
		
		JLabel txtEmail = new JLabel ("Email Address");
		txtEmail.setBounds(270,40 , 140, 15);
		txtEmail.setFont(new Font("Arial", Font.BOLD, 11));
		add(txtEmail);
		
		JTextField cajaEmail = new JTextField();
		cajaEmail.setBounds(270,55 , 420, 20);
		cajaEmail.setFont(new Font("Arial", Font.BOLD, 9));
		add(cajaEmail);
		
		JLabel txtFirsName = new JLabel ("First Name");
		txtFirsName.setBounds(270,80 , 140, 15);
		txtFirsName.setFont(new Font("Arial", Font.BOLD, 11));
		add(txtFirsName);
		
		JTextField cajaFirsName = new JTextField();
		cajaFirsName.setBounds(270,95 , 420, 20);
		cajaFirsName.setFont(new Font("Arial", Font.BOLD, 9));
		add(cajaFirsName);
		
		JLabel txtLastName = new JLabel ("Last Name");
		txtLastName.setBounds(270,120 , 140, 15);
		txtLastName.setFont(new Font("Arial", Font.BOLD, 11));
		add(txtLastName);
		
		JTextField cajaLastName = new JTextField();
		cajaLastName.setBounds(270,135 , 420, 20);
		cajaLastName.setFont(new Font("Arial", Font.BOLD, 9));
		add(cajaLastName);
		

		JButton btnSubscribe = new JButton ("Subscribe");
		btnSubscribe.setBounds(270,160, 100, 20);
		btnSubscribe.setBackground(Color.gray);
		add(btnSubscribe);
		
		JPanel panel = new JPanel();
		panel.setBounds(260, 30, 435, 165);
		panel.setBorder(BorderFactory.createTitledBorder(""));
		add(panel);
		
		JLabel txtCopy = new JLabel ("Copy/paste onto your site");
		txtCopy.setBounds(260,200 , 170, 15);
		txtCopy.setFont(new Font("Arial", Font.BOLD, 12));
		add(txtCopy);
		
		JLabel txt1 = new JLabel ("</form>");
		txt1.setBounds(264,225 , 170, 15);
		txt1.setFont(new Font("Arial", Font.BOLD, 9));
		add(txt1);
		
		JLabel txt2 = new JLabel ("</div>");
		txt2.setBounds(264,240 , 170, 15);
		txt2.setFont(new Font("Arial", Font.BOLD, 9));
		add(txt2);
		
		JLabel txt3 = new JLabel ("<script type='text/javascript\" src=\"//s3.amazonaws.com/downloads.mailchimp.com/js/mc ");
		txt3.setBounds(264,255 , 500, 15);
		txt3.setFont(new Font("Arial", Font.BOLD, 9));
		add(txt3);
		
		JLabel txt4 = new JLabel ("validate js'></script><script type=\"text/javascript> (function($) {window.fnames = new ");
		txt4.setBounds(264,270 , 500, 15);
		txt4.setFont(new Font("Arial", Font.BOLD, 9));
		add(txt4);
		
		JLabel txt5 = new JLabel ("Array(); window.ftypes = new ");
		txt5.setBounds(264,285 , 500, 15);
		txt5.setFont(new Font("Arial", Font.BOLD, 9));
		add(txt5);
		
		JLabel txt6 = new JLabel ("Array(); fnames[0]='EMAIL',ftypes[0]='email' fnames[1]='FNAME\" ftypes[1]='text':fnames[2]=L");
		txt6.setBounds(264,300 , 500, 15);
		txt6.setFont(new Font("Arial", Font.BOLD, 9));
		add(txt6);
		
		JLabel txt7 = new JLabel ("NAME ftypes[2]='text')(jQuery)) var Smcj = jQuery.noConflict(true); </script>");
		txt7.setBounds(264,315 , 500, 15);
		txt7.setFont(new Font("Arial", Font.BOLD, 9));
		add(txt7);
		
		JLabel txt8 = new JLabel ("<1--End mc_embed_signup-->");
		txt8.setBounds(264,330 , 500, 15);
		txt8.setFont(new Font("Arial", Font.BOLD, 9));
		add(txt8);
		
		JPanel pane2 = new JPanel();
		pane2.setBounds(260, 220, 435, 135);
		pane2.setBorder(BorderFactory.createTitledBorder(""));
		add(pane2);
	}
}
public class T1_A2_OrtegaSalasDianaRebeca {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaPrincipal();
			}});

	}//MAIN
}
