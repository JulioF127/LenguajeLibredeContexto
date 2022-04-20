package com.umg.gramatica;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

public class Ventana extends JFrame {
	//CREACION DE MARCO
	public Ventana() {
		Lamina miLamina = new Lamina();
		add(miLamina);
		miLamina.setLayout(null);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 100, 770, 800);
		setResizable(false);
		setTitle("Pasen Contexto");
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Image icono = mipantalla.getImage("src/com/umg/gramatica/91449910_p0.jpg");
		setIconImage(icono);

	}
}

class Lamina extends JPanel {
	//CREAR AREAS DE TEXTO
	JTextField campoAlfabeto = new JTextField();
	JTextField campoVariables = new JTextField();
	JTextField campoRegla = new JTextField();
	JTextPane vistaReglas = new JTextPane();
	JTextPane campoResultados = new JTextPane();

	//CREAR PANEL
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();

	//SCROLL
	JScrollPane scroll = new JScrollPane(vistaReglas);

	//LABELS
	JLabel igual = new JLabel();
	JLabel igual2 = new JLabel();
	JLabel igual3 = new JLabel();
	JLabel flecha = new JLabel();
	JLabel s = new JLabel();
	JLabel v = new JLabel();
	JLabel l = new JLabel();

	//LISTA
	JComboBox start = new JComboBox();
	JComboBox NoTerminal = new JComboBox();
	JComboBox cantidadPalabras = new JComboBox();

	
	//CREAR BOTONES
	JButton botonEnviar = new JButton("Aceptar");
	JButton botonEnviarS = new JButton("Aceptar");
	JButton botonCls = new JButton("Reinicio");
	JButton botonNull = new JButton("ε");
	JButton botonERe = new JButton("Enviar");
	JButton botonBorrar = new JButton("Borrar");
	JButton botonBorrarTodo = new JButton("Limpiar");
	JButton botonGenerar = new JButton("Generar");

	JButton bClOs = new JButton();

	public Lamina() {


		Font fuente = new Font ("HP Simplified", Font.BOLD, 16);
		Font fuente2 = new Font("Arial", Font.BOLD , 19);
		Color color2 = new Color(140, 94, 84);
		Color color1 = new Color(242, 211, 153);
		Color color6 = new Color(126, 203, 220);
		Color color7 = new Color(254, 244, 238);
		Color color4 = new Color(214, 72, 101);
		Color color5 = new Color(250, 229, 222);

		Color color3 = new Color(237, 220, 245);
		Color color8 = new Color(86, 74, 99);
		Color color9 = new Color(124, 87, 154);
		Color color10 = new Color(253, 229, 59);
		Color color11 = new Color(223, 221, 232);
		Color color12 = new Color(171, 136, 188);
		Color color13 = new Color(180, 87, 242);

		setBackground(color7);


		// PROPIEDADES TEXTOS
		add(campoAlfabeto);
		campoAlfabeto.setBounds(100, 30, 350, 40);
		campoAlfabeto.setFont(fuente);
		campoAlfabeto.setBorder(null);
		campoAlfabeto.setBackground(color6);
		campoAlfabeto.setForeground(Color.white);

		add(campoVariables);
		campoVariables.setBounds(100, 100, 350, 40);
		campoVariables.setFont(fuente);
		campoVariables.setBorder(null);
		campoVariables.setBackground(color4);
		campoVariables.setForeground(Color.white);

		add(campoRegla);
		campoRegla.setBounds(180, 270, 150, 40);
		campoRegla.setFont(fuente2);
		campoRegla.setBorder(null);
		campoRegla.setBackground(color6);
		campoRegla.setForeground(Color.white);

		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(500,200,200,250);
		scroll.setViewportView(vistaReglas);
		scroll.getViewport().add(vistaReglas);
		add(scroll);
		scroll.getVerticalScrollBar().setBackground(color2);
		scroll.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
			@Override
			protected void configureScrollBarColors() {
				this.thumbColor = color5;
			}
		});

//		add(vistaReglas);
//		vistaReglas.setBounds(500, 170, 200, 350);
		vistaReglas.setFont(fuente2);
		vistaReglas.setForeground(color2);
		vistaReglas.setBorder(null);
		vistaReglas.setBackground(color1);
		vistaReglas.setPreferredSize(new Dimension(490,240));

		vistaReglas.setEditable(false);


		add(campoResultados);
		campoResultados.setBounds(50, 550, 650, 150);
		campoResultados.setFont(fuente2);
		campoResultados.setBorder(null);
		campoResultados.setBackground(color1);
		campoResultados.setForeground(color2);
		campoResultados.setEditable(false);


		//PROPIEDADES LISTA
		add(start);
		start.setBounds(130, 200, 60,40);
		start.setFont(fuente);
		start.setBorder(null);
		start.setBackground(color1);
		start.setForeground(color2);

		add(NoTerminal);
		NoTerminal.setBounds(60, 270, 60,40);
		NoTerminal.setFont(fuente);
		NoTerminal.setBorder(null);
		NoTerminal.setBackground(color1);
		NoTerminal.setForeground(color2);

		add(cantidadPalabras);
		cantidadPalabras.setBounds(50, 500, 60,40);
		cantidadPalabras.setFont(fuente);
		cantidadPalabras.setBorder(null);
		cantidadPalabras.setBackground(color6);
		cantidadPalabras.setForeground(Color.white);
		for (int i=1; i<=20; i++) {
			cantidadPalabras.addItem(i);
		}

		// ANADIR BOTONES
		add(botonEnviar);
		add(botonCls);
		add(botonNull);
		add(botonERe);
		add(botonBorrar);
		add(botonEnviarS);
		add(botonBorrarTodo);
		add(botonGenerar);
		
		add(bClOs);

		
		// PROPIEDADES BOTONES
		botonEnviar.setBounds(500, 30, 90, 40);
		botonCls.setBounds(610, 30, 90, 40);
		botonNull.setBounds(350, 267, 45, 45);
		botonERe.setBounds(180,330,90,40);
		botonBorrar.setBounds(290,410,90,40);
		botonBorrarTodo.setBounds(180,410,90,40);
		botonEnviarS.setBounds(210,200,90,40);
		botonGenerar.setBounds(130,500,90,40);

		
		botonEnviar.setFont(fuente);
		botonCls.setFont(fuente);
		botonNull.setFont(fuente2);
		botonERe.setFont(fuente);
		botonBorrar.setFont(fuente);
		botonBorrarTodo.setFont(fuente);
		botonEnviarS.setFont(fuente);
		botonGenerar.setFont(fuente);

		
		botonEnviar.setForeground(color2);
		botonCls.setForeground(Color.WHITE);
		botonNull.setForeground(Color.WHITE);
		botonERe.setForeground(color2);
		botonBorrar.setForeground(Color.white);
		botonBorrarTodo.setForeground(color2);
		botonEnviarS.setForeground(Color.white);
		botonGenerar.setForeground(Color.white);
		botonEnviar.setBorderPainted(false);
		
		botonEnviar.setBackground(color1);
		botonCls.setBackground(color2);
		botonNull.setBackground(color2);
		botonERe.setBackground(color1);
		botonBorrar.setBackground(color2);
		botonBorrarTodo.setBackground(color1);
		botonEnviarS.setBackground(color2);
		botonGenerar.setBackground(color4);

		
//		botonEnviar.setBorderPainted(false);
//		botonCls.setBorderPainted(false);
//		botonNull.setBorderPainted(false);


		//PROPIEDAD PANELES

		add(panel1);
		panel1.setBounds(40, 170, 690, 310);
		panel1.setBackground(color5);
		panel1.setBorder(BorderFactory.createTitledBorder("Reglas"));
		panel1.setLayout(null);

		panel1.add(panel2);
		panel2.setBounds(20,30,40,40);
		panel2.setBackground(color2);
		panel2.setLayout(null);
		panel2.add(s);
		s.setText("S");
		s.setFont(fuente);
		s.setForeground(Color.white);
		s.setBounds(16,10,20,20);

		add(panel3);
		panel3.setBounds(40,30,40,40);
		panel3.setBackground(color2);
		panel3.setLayout(null);
		panel3.add(l);
		l.setText("Σ");
		l.setFont(fuente2);
		l.setForeground(Color.white);
		l.setBounds(16,10,20,20);

		add(igual2);
		igual2.setText("=");
		igual2.setBounds(85,30,20,40);
		igual2.setFont(fuente);

		add(panel4);
		panel4.setBounds(40,100,40,40);
		panel4.setBackground(color2);
		panel4.setLayout(null);
		panel4.add(v);
		v.setText("V");
		v.setFont(fuente);
		v.setForeground(Color.white);
		v.setBounds(16,10,20,20);

		add(igual3);
		igual3.setText("=");
		igual3.setBounds(85,100,20,40);
		igual3.setFont(fuente);


		add(panel1);
		panel1.add(igual);
		igual.setText("=");
		igual.setBounds(70,30,20,40);
		igual.setFont(fuente);

		panel1.add(flecha);
		flecha.setText("→");
		flecha.setBounds(100,100,20,40);
		flecha.setFont(fuente2);



		//BOTON MODO OSCURO
		bClOs.setBounds(500, 100, 200, 40);
		ImageIcon clOs = new ImageIcon("src/com/umg/gramatica/Modo.png");
		bClOs.setIcon(new ImageIcon (clOs.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
		bClOs.setBackground(color1);
		bClOs.setBorderPainted(false);
		bClOs.addActionListener(e -> {

			if (contadorClaOs %2==0) {
				 setBackground(color8);

				 botonCls.setBackground(color9);

				 botonEnviar.setBackground(color11);
				 botonEnviar.setForeground(color9);

				 bClOs.setBackground(color11);

				 botonBorrarTodo.setBackground(color11);
				 botonBorrarTodo.setForeground(color9);

				 botonERe.setForeground(color9);
				 botonERe.setBackground(color11);

				 botonEnviarS.setBackground(color9);
				 botonEnviarS.setForeground(Color.white);

				 botonBorrar.setBackground(color9);
				 botonBorrar.setForeground(Color.white);

				 botonNull.setBackground(color9);
				 botonNull.setForeground(Color.white);

				 botonGenerar.setBackground(color10);
				 botonGenerar.setForeground(color8);

				 campoAlfabeto.setBackground(color3);
				 campoAlfabeto.setForeground(color8);

				 campoVariables.setBackground(color12);
				 campoVariables.setForeground(Color.white);

				 campoResultados.setBackground(color3);
				 campoResultados.setForeground(color8);

				 campoRegla.setBackground(color13);

				 panel1.setBackground(color12);

				 panel2.setBackground(color9);

				 panel3.setBackground(color9);

				 panel4.setBackground(color9);

				 igual.setForeground(color11);

				 igual2.setForeground(color11);

				 igual3.setForeground(color11);

				 flecha.setForeground(color11);

				 start.setBackground(color11);
				 start.setForeground(color8);

				 NoTerminal.setBackground(color11);
				 NoTerminal.setForeground(color8);

				 cantidadPalabras.setBackground(color13);

				 vistaReglas.setBackground(color3);
				 vistaReglas.setForeground(color8);

				scroll.getVerticalScrollBar().setBackground(color8);
				scroll.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
					@Override
					protected void configureScrollBarColors() {
						this.thumbColor = color9;
					}
				});

				 contadorClaOs++;
			}else {


				setBackground(color7);

				botonCls.setBackground(color2);

				botonEnviar.setBackground(color1);
				botonEnviar.setForeground(color2);

				bClOs.setBackground(color1);

				botonBorrarTodo.setBackground(color1);
				botonBorrarTodo.setForeground(color2);

				botonERe.setForeground(color2);
				botonERe.setBackground(color1);

				botonEnviarS.setBackground(color1);
				botonEnviarS.setForeground(color2);

				botonBorrar.setBackground(color1);
				botonBorrar.setForeground(color2);

				botonNull.setBackground(color1);
				botonNull.setForeground(color2);

				botonGenerar.setBackground(color4);
				botonGenerar.setForeground(Color.white);

				campoAlfabeto.setBackground(color6);
				campoAlfabeto.setForeground(Color.white);

				campoVariables.setBackground(color4);
				campoVariables.setForeground(Color.white);

				campoResultados.setBackground(color1);
				campoResultados.setForeground(color2);

				campoRegla.setBackground(color6);

				panel1.setBackground(color5);

				panel2.setBackground(color2);

				panel3.setBackground(color2);

				panel4.setBackground(color2);

				igual.setForeground(Color.black);

				igual2.setForeground(Color.black);

				igual3.setForeground(Color.black);

				flecha.setForeground(Color.black);

				start.setBackground(color1);
				start.setForeground(color2);

				NoTerminal.setBackground(color1);
				NoTerminal.setForeground(color2);

				cantidadPalabras.setBackground(color6);

				vistaReglas.setBackground(color1);
				vistaReglas.setForeground(color2);

				scroll.getVerticalScrollBar().setBackground(color2);
				scroll.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
					@Override
					protected void configureScrollBarColors() {
						this.thumbColor = color5;
					}
				});

				contadorClaOs++;

			}

	});
		

		//INSTANCIAS METODOS PARA CADA BOTON
		Operaciones enviar = new Operaciones("e");
		Operaciones cls = new Operaciones("cl");
		Operaciones nulo = new Operaciones("n");
		Operaciones enviarS = new Operaciones("es");
		Operaciones enviarR = new Operaciones("er");
		Operaciones limpiarR = new Operaciones("lr");
		Operaciones borrarR = new Operaciones("br");
		Operaciones generar = new Operaciones("g");



		
		
		//ANADIR EVENTO DE BOTON A CADA INSTANCIA CORRESPONDIENTE
		botonEnviar.addActionListener(enviar);
		botonCls.addActionListener(cls);
		botonNull.addActionListener(nulo);
		botonEnviarS.addActionListener(enviarS);
		botonERe.addActionListener(enviarR);
		botonBorrarTodo.addActionListener(limpiarR);
		botonBorrar.addActionListener(borrarR);
		botonGenerar.addActionListener(generar);

	}

	public static String alfabeto = "";
	public static  String variables = "";
	public static String reglas = "";
	public static  String alfabetoCortado = "";
	public static  String variableCortada = "";
	public static  String startSeleccionado = "";
	public static  String primerasLetras = "";
	public static  String almacenRegla = "";
	public static  String produccionElegidaAl = "";
	public static  String copiaPalabra = "";
	public static int contadorClaOs =0;
	public static int contadorElse=0;
	public int contadorEvaluacion = 0;
	public int randomizador = 0;
	public int contadorBrdr = 0;
	public int repeticion = 0;
	public ArrayList <String> copiaVistaR = new ArrayList<>();
	public ArrayList <String> listaNoTerminales = new ArrayList<>();
	public ArrayList <String> arrayAlfabeto = new ArrayList<>();
	public ArrayList <String> arrayVariables = new ArrayList<String>();
	public ArrayList <String> arrayReglas = new ArrayList<String>();
	public ArrayList <String> terminalesAceptados = new ArrayList<String>();
	public ArrayList <String> noTerminalesAceptados = new ArrayList<String>();
	public ArrayList <String> palabras = new ArrayList<String>();

	public StringBuffer palabra = new StringBuffer();


	private class Operaciones implements ActionListener {

		public Operaciones(String s) {

			letra = s;

		}

		public void actionPerformed(ActionEvent e) {
			switch (letra) {
				case "e":
					alfabeto = campoAlfabeto.getText().toLowerCase()+",";
					for (int i=0; i<alfabeto.length(); i++){
						char cortador = alfabeto.charAt(i);
							if (cortador != ',') {
								alfabetoCortado =alfabetoCortado + String.valueOf(cortador);

						} else {
								arrayAlfabeto.add(alfabetoCortado);
								alfabetoCortado = "";
							}
					}

					variables =campoVariables.getText().toUpperCase()+",";
					for (int i=0; i<variables.length(); i++){
						char cortador = variables.charAt(i);
						if (cortador != ',') {
							variableCortada = variableCortada + String.valueOf(cortador);

						} else {
							arrayVariables.add(variableCortada);
							variableCortada = "";
							contadorElse++;
						}

					}
					for (int j=0; j<contadorElse; j++){
						start.addItem(arrayVariables.get(j).toString());
						NoTerminal.addItem(arrayVariables.get(j).toString());
					}


					campoAlfabeto.setEditable(false);
					campoVariables.setEditable(false);
					botonEnviar.setEnabled(false);





					break;

				case "cl":
					arrayVariables.clear();
					arrayAlfabeto.clear();
					arrayReglas.clear();
					listaNoTerminales.clear();
					terminalesAceptados.clear();
					noTerminalesAceptados.clear();
					palabras.clear();
					copiaVistaR.clear();
					campoAlfabeto.setEditable(true);
					campoVariables.setEditable(true);
					campoRegla.setEditable(true);
					botonEnviar.setEnabled(true);
					botonEnviarS.setEnabled(true);
					botonBorrarTodo.setEnabled(true);
					botonBorrar.setEnabled(true);
					botonERe.setEnabled(true);
					campoVariables.setText("");
					campoAlfabeto.setText("");
					campoRegla.setText("");
					vistaReglas.setText("");
					campoResultados.setText("");
					start.setEnabled(true);
					NoTerminal.setEnabled(true);
					contadorElse=0;
					contadorEvaluacion=0;
					contadorBrdr=0;
					contadorElse=0;
					contadorClaOs=0;
					randomizador=0;
					repeticion=0;
					variables="";
					alfabeto="";
					reglas="";
					primerasLetras="";
					copiaPalabra="";
					alfabetoCortado="";
					almacenRegla="";
					variableCortada="";
					copiaPalabra="";
					startSeleccionado="";
					palabra.delete(0,palabra.length());
					NoTerminal.removeAllItems();
					start.removeAllItems();

					break;
				case "n":
					reglas= campoRegla.getText() + "ε";
					campoRegla.setText(reglas);
					break;

				case "es":
					startSeleccionado = start.getSelectedItem().toString();
//					campoResultados.setText(startSeleccionado);

					break;
				case "er":
					reglas = NoTerminal.getSelectedItem().toString() + " --> " + campoRegla.getText();
					listaNoTerminales.add(NoTerminal.getSelectedItem().toString());
					copiaVistaR.add(vistaReglas.getText());
					vistaReglas.setText(vistaReglas.getText() + reglas+"\n");
					arrayReglas.add(reglas);
					contadorBrdr++;
					campoRegla.setText("");

					break;
				case "lr":
					arrayReglas.clear();
					copiaVistaR.clear();
					campoRegla.setText("");
					vistaReglas.setText("");
					contadorElse=0;
					contadorBrdr=0;
					startSeleccionado="";
					reglas="";


					break;

				case "br":
					arrayReglas.remove(arrayReglas.size()-1);
					listaNoTerminales.remove(listaNoTerminales.size()-1);
					contadorBrdr--;
					vistaReglas.setText(copiaVistaR.get(contadorBrdr));


					break;

				case "g":
					for	(int i = 0; i < Integer.parseInt(Objects.requireNonNull(cantidadPalabras.getSelectedItem()).toString()); i++) {
						palabra.delete(0,palabra.length());
						contadorEvaluacion = 0;
						//Iniciador de la cadena
						while (contadorEvaluacion < 1) {

							for (int j = 0; j < arrayReglas.size(); j++) {
								almacenRegla = arrayReglas.get(j);
								String primerasLetras = almacenRegla.substring(0, startSeleccionado.length());

								if (primerasLetras.equals(startSeleccionado)) {
									terminalesAceptados.add(almacenRegla);


								} else {
									campoResultados.setText("Las Producciones no contienen el Simbolo Inicial");
								}

							}
							for (int k = 0; k < terminalesAceptados.size(); k++) {
								almacenRegla = terminalesAceptados.get(k); //Produccion completa
								almacenRegla = almacenRegla.substring(startSeleccionado.length()+5, terminalesAceptados.get(k).length());//Corte produccion
								terminalesAceptados.set(k, almacenRegla);//Reemplazo completo por recorte


							}
							randomizador = (int) (Math.random() * terminalesAceptados.size());
							produccionElegidaAl = terminalesAceptados.get(randomizador);
							terminalesAceptados.clear();

							contadorEvaluacion++;

						}
						if (contadorEvaluacion==1){
							palabra.append(produccionElegidaAl);
						}






						//Construccion Palabras
						while (!produccionElegidaAl.equals("ε")) {

							for (int j = 0; j < arrayReglas.size(); j++){
								almacenRegla = arrayReglas.get(j);
								primerasLetras = almacenRegla.substring(0, listaNoTerminales.get(j).length());

								for(int k = 0; k < (produccionElegidaAl.length() - listaNoTerminales.get(j).length())+1; k++) {
//									campoResultados.setText(campoResultados.getText()+ "prueba" +k);
									if (primerasLetras.equals(produccionElegidaAl.substring(k,primerasLetras.length()+k))){ //Automatizar seleccion del substring **Posiblemente solucionado**
										terminalesAceptados.add(almacenRegla);
										noTerminalesAceptados.add(primerasLetras);

									}


								}

							}
							for(int l = 0; l < terminalesAceptados.size(); l++){
								almacenRegla = terminalesAceptados.get(l);
								almacenRegla = almacenRegla.substring(noTerminalesAceptados.get(l).length()+5, terminalesAceptados.get(l).length());
								terminalesAceptados.set(l, almacenRegla);
							}
							randomizador = (int) (Math.random() * terminalesAceptados.size());
							produccionElegidaAl = terminalesAceptados.get(randomizador);
							int longitud = palabra.length();
//							System.out.println(longitud);
							longitud = (longitud - noTerminalesAceptados.get(randomizador).length());
//							System.out.println(longitud);
//							System.out.println(produccionElegidaAl);
//							System.out.println(palabra);
							palabra.append(".");
							copiaPalabra = String.valueOf(palabra);



							for(int m = 0; m <= longitud; m++){
//								System.out.println(palabra);
								System.out.println(copiaPalabra.substring(m, noTerminalesAceptados.get(randomizador).length()+m) + " " + noTerminalesAceptados.get(randomizador));

								if (noTerminalesAceptados.get(randomizador).equals(copiaPalabra.substring(m, noTerminalesAceptados.get(randomizador).length()+m)))
									palabra.replace(m, noTerminalesAceptados.get(randomizador).length()+m, produccionElegidaAl);
							}
//							System.out.println(palabra);
							palabra.delete(palabra.length()-1,palabra.length());




							terminalesAceptados.clear();
							noTerminalesAceptados.clear();


						}
						for(int k = 0; k < palabras.size(); k++){
//							System.out.println(palabra +" " +palabras.get(k));
							if (String.valueOf(palabra).equals(palabras.get(k))){

							 repeticion ++;
							}
						}


						if (repeticion == 0){
							palabras.add(palabra.toString());

							campoResultados.setText("");
							for(int j = 0; j < palabras.size(); j++){
								campoResultados.setText(campoResultados.getText() +" "+ palabras.get(j));
							}
						} else {
							repeticion=0;
							i--;
						}




					}

					botonEnviar.setEnabled(false);
					botonBorrar.setEnabled(false);
					botonERe.setEnabled(false);
					botonBorrarTodo.setEnabled(false);
					botonEnviarS.setEnabled(false);
					campoRegla.setEditable(false);
					start.setEnabled(false);
					NoTerminal.setEnabled(false);

					break;

			}



		}

		private String letra;

	}

}


		

