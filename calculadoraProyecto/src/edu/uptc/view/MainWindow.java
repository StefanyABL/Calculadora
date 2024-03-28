package edu.uptc.view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import edu.uptc.management.Management;

public class MainWindow extends JFrame implements KeyListener {

	private JPanel panel_principal;
	private JPanel panel_botones;
	public JTextField txtExample;
	private JButton boton[];
	private Management mg;
	public MainWindow(){
		this.setTitle("Calculadora co Arboles Binarios");
		this.setSize(300,300);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.begin();
		this.setVisible(true);
	}
	public JPanel getPanel_principal() {
		return panel_principal;
	}
	public void setPanel_principal(JPanel panel_principal) {
		this.panel_principal = panel_principal;
	}
	public JPanel getPanel_botones() {
		return panel_botones;
	}
	public void setPanel_botones(JPanel panel_botones) {
		this.panel_botones = panel_botones;
	}

	public JButton[] getBoton() {
		return boton;
	}
	public void setBoton(JButton[] boton) {
		this.boton = boton;
	}
	public void begin(){
		beginCompnents();
		addComponents();
	}
	private void beginCompnents() {

		mg= new Management();

		panel_principal = new JPanel();
		panel_principal.setLayout(new BorderLayout());
		txtExample = new JTextField();
		panel_principal.add("North",txtExample);
		panel_botones = new JPanel();
		panel_botones.setLayout(new GridLayout(5,4));
		panel_principal.add("Center",panel_botones);
		getContentPane().add(panel_principal);
	}

	private void addComponents() {
		boton = new JButton[20];
		boton[0]=new JButton("CE");
		boton[1]=new JButton("");
		boton[2]=new JButton("");
		boton[3]=new JButton("MOD");
		boton[4]=new JButton("7");
		boton[5]=new JButton("8");
		boton[6]=new JButton("9");
		boton[7]=new JButton("/");
		boton[8]=new JButton("4");
		boton[9]=new JButton("5");
		boton[10]=new JButton("6");
		boton[11]=new JButton("*");
		boton[12]=new JButton("1");
		boton[13]=new JButton("2");
		boton[14]=new JButton("3");
		boton[15]=new JButton("-");
		boton[16]=new JButton("0");
		boton[17]=new JButton(".");
		boton[18]=new JButton("=");
		boton[19]=new JButton("+");
		//////////////////////////////////////////////////////////////////////////////////////
		panel_botones.add(boton[0]);	
		panel_botones.add(boton[1]);
		panel_botones.add(boton[2]);
		panel_botones.add(boton[3]);
		panel_botones.add(boton[4]);
		panel_botones.add(boton[5]);
		panel_botones.add(boton[6]);
		panel_botones.add(boton[7]);
		panel_botones.add(boton[8]);
		panel_botones.add(boton[9]);
		panel_botones.add(boton[10]);
		panel_botones.add(boton[11]);
		panel_botones.add(boton[12]);
		panel_botones.add(boton[13]);
		panel_botones.add(boton[14]);
		panel_botones.add(boton[15]);
		panel_botones.add(boton[16]);
		panel_botones.add(boton[17]);
		panel_botones.add(boton[18]);
		panel_botones.add(boton[19]);
		boton[18].addKeyListener(this);

		for (int i = 0; i < boton.length; i++) {
			boton[i].setBackground(Color.PINK);;
		}
		boton[19].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				try{
					txtExample.setText(txtExample.getText()+"+");
				}catch(Exception err){}

			}
		});

		boton[15].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				try{

					txtExample.setText(txtExample.getText()+"-");
				}catch(Exception err){}
			}
		});
		boton[11].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				try{

					txtExample.setText(txtExample.getText()+"*");
				}catch(Exception err){}
			}
		});
		boton[7].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				try{

					txtExample.setText(txtExample.getText()+"/");
				}catch(Exception err){}
			}
		});

		boton[4].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){

				txtExample.setText(txtExample.getText()+"7");
			}
		});
		boton[3].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){

				txtExample.setText(txtExample.getText()+"%");
			}
		});
		boton[5].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){

				txtExample.setText(txtExample.getText()+"8");
			}
		});
		boton[6].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){

				txtExample.setText(txtExample.getText()+"9");
			}
		});
		boton[8].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){

				txtExample.setText(txtExample.getText()+"4");
			}
		});
		boton[9].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){

				txtExample.setText(txtExample.getText()+"5");
			}
		});
		boton[10].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){

				txtExample.setText(txtExample.getText()+"6");
			}
		});
		boton[12].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){

				txtExample.setText(txtExample.getText()+"1");
			}
		});
		boton[13].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){

				txtExample.setText(txtExample.getText()+"2");
			}
		});
		boton[14].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){

				txtExample.setText(txtExample.getText()+"3");
			}
		});
		boton[16].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){

				txtExample.setText(txtExample.getText()+"0");

			}
		});
		boton[17].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				txtExample.setText(txtExample.getText()+".");

			}
		});

		boton[18].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				mg.construirArbol(txtExample.getText());
				txtExample.setText(mg.calcular(mg.construirArbol(txtExample.getText())));

				System.out.println("TECLADO--->"+txtExample.getText());
			}
		});

		boton[0].addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				txtExample.setText("");

			}
		});

	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getKeyCode() == KeyEvent.VK_ENTER){
			System.out.println("presiono enter");
			boton[18].doClick();

		}

	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}



}
