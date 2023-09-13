import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.awt.GridLayout;
import javax.swing.JSpinner;
import java.util.*;

class Boton extends JButton
{
	int id;
	public Boton(String s, int n)
	{
		super(s);
		id=n;
	}
	public int getId()
	{
		return id;
	}
}


public class curp implements KeyListener, ActionListener
{
	JSpinner control,control1,control2;
	SpinnerNumberModel nm,nm1,nm2;
	JFrame ventana;
	Boton generar,sexo,sexo1;
	Label res1,res2,res3,res4,res5,res6,res7,res8,res9,res10,res11;
	Panel panel, panel1,panel2;
	JTextField s,p,q,a,c,i,o;
	char l1,l2,l3,l4,m1,m2,m3,m4,m5,m6,m7,m8;
	char c1,c2,c3,c4,c5,c6;
	char o1,o2,o3,o4,o5,w;
	String calis,esta;
	String curiosas[]={"BUEI","CACA","CAGA","CAKA","COGE","COJE","COJO","FETO","JOTO","KAGO","KOJO","KULO","MAMO","MEAS","MION","MULA","PEDO","PUTA","QULO","RUIN","BUEY","CAGO","KACO","COJA","COJI","CULO","GUEY","KAGA","KOGE","KAKA","MAME","MEAR","MEON","MOCO","PEDA","PENE","PUTO","RATA"};
	String estados[]={"AS","BS","CL","CS","DF","GT","HG","MC","MS","NL","PL","QR","SL","TC","TL","YN","NE","BC","CC","CM","CH","DG","GR","JC","MN","NT","OC","QT","SP","SR","TS","VZ","ZS"};
	String estados1[]={"AGUASCALIENTES","BAJA CALIFORNIA SUR","COAHUILA","CHIAPAS","DISTRITO FEDERAL","GUANAJUATO","HIDALGO","MEXICO","MORELOS","NUEVO LEON","PEUBLA","QUINTANA ROO","SINALO","TABASCO","TLAXCALA","YUCATAN","EXTRANJERO","BAJA CALIFORNIA NORTE","CAMPECHE","COLIMA","CHIHUAHUA","DURANGO","GUERRERO","JALISCO","MICHOACAN","NAYARIT","OAXACA","QUERETARO","SAN LUIS ","SONORA","TAMAULIPAS","VERACRUZ","ZACATECAS"};
	int key, key2,dia,mes,ano,key3;
	String paterno,materno,nombre,secun,nacimiento,estado;
	String p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,l5,l6,l7,l8,l9,l10,l11,l12;
	String comparacion,comparacion1;

	
	public curp()
	{
		//declaramos las vaiables
		panel=new Panel();
		control=new JSpinner();
		nm=new SpinnerNumberModel();
		control1=new JSpinner();
		nm1=new SpinnerNumberModel();
		control2=new JSpinner();
		nm2=new SpinnerNumberModel();
		ventana=new JFrame("Curp");
		generar=new Boton("Generar",1);
		sexo=new Boton("HOMBRE",2);
		sexo1=new Boton("MUJER",3);	
		o=new JTextField(9);
		s=new JTextField(9);
		p=new JTextField(9);
		q=new JTextField(9);
		c=new JTextField(9);
		res1=new Label("Tu Curp es:");
		res2=new Label("Paterno");
		res3=new Label("Materno");
		res4=new Label("Nombre");
		res5=new Label("2 Nombre");
		res6=new Label("Dia");
		res7=new Label("Mes");
		res8=new Label("Year");
		res9=new Label("Estado");
		res10=new Label("SEXO");
		comparacion=new String("AEIOU");
		comparacion1=new String("BCDFGHJKLMÑPQRSTVWXYZ");

		

		//añadimos los sensores
		generar.addActionListener(this);
		sexo.addActionListener(this);
		sexo1.addActionListener(this);
		o.addKeyListener(this);
		s.addKeyListener(this);
		p.addKeyListener(this);
		q.addKeyListener(this);
		c.addKeyListener(this);
		//ajustamos los parmatros de los spinner
		nm.setMaximum(31);
		nm.setMinimum(0);
		nm1.setMaximum(12);
		nm1.setMinimum(0);
		nm2.setMaximum(99);
		nm2.setMinimum(0);
		control.setModel(nm);
		control1.setModel(nm1);
		control2.setModel(nm2);	
		//acomodamos el panel
		panel.setLayout(null);     
		generar.setBounds(130,330,100,20);//boton
		res2.setBounds(5,5,100,18);
		o.setBounds(5,30,110,20);//paterno
		res3.setBounds(220,5,100,18);
		s.setBounds(220,30,110,20); //materno
		res4.setBounds(5,80,100,18);
		p.setBounds(5,100,110,20);//nombre
		res5.setBounds(220,80,100,18);
		q.setBounds(220,100,110,20);//segundo
		res6.setBounds(100,140,20,20);
		control.setBounds(100,160,40,20);//Spinner
		res7.setBounds(155,140,30,20);
		control1.setBounds(155,160,40,20);//mes
		res8.setBounds(210,140,30,20);
		control2.setBounds(210,160,40,20);//año
		res9.setBounds(5,195,100,20);
		c.setBounds(5,215,100,20);//estado
		res10.setBounds(160,260,100,20);
		sexo.setBounds(50,280,100,20);
		sexo1.setBounds(200,280,100,20); 
		res1.setBounds(130,360,180,20);
		panel.add(res2);
		panel.add(res3);
		panel.add(res4);
		panel.add(res5);
		panel.add(res6);
		panel.add(res7);
		panel.add(res8);
		panel.add(res9);
		panel.add(res10);
		panel.add(o);
		panel.add(s);
		panel.add(p);
		panel.add(q);
		panel.add(control);
		panel.add(control1);
		panel.add(control2);
		panel.add(c);
		panel.add(sexo);
		panel.add(sexo1);
		panel.add(generar);
		panel.add(res1); //agregamos el boton al panel
		//armamos la ventana

		ventana.add(panel);

		ventana.setSize(400,600);
		ventana.setVisible(true);
	}

	public void keyPressed(KeyEvent e)  //eventos con el teclado
	{
	}
	public void keyReleased(KeyEvent e)
	{

	}
	public void keyTyped(KeyEvent e)
	{
		w = e.getKeyChar();
		if (Character.isLowerCase(w))
		{
			String w1=(""+w).toUpperCase();
			w=w1.charAt(0);
			e.setKeyChar(w);
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		
		if(((Boton)e.getSource()).getId()==2)
		{
			p6=new String("H");
			((Boton)e.getSource()).setEnabled(false);
		}

		if(((Boton)e.getSource()).getId()==3)
		{
			p6=new String("M");
			((Boton)e.getSource()).setEnabled(false);
		}
		if(((Boton)e.getSource()).getId()==1)
		{
			paterno=o.getText();//se pasa el texto del textfield a un string
			l1=paterno.charAt(0);// estoy pasando el string a un char
			p1=String.valueOf(l1); //se pasa el char a la variable string para la primera letra del apellido paterno
			l2=paterno.charAt(1);
			for(int i=0; i<5; i++)//ESTE FOR es para declarar la primera vocal y la primera consonante
			{
				c1=comparacion.charAt(i);
				if(l2==c1)
				{
					System.out.println("entro al if");
					m3=paterno.charAt(2);
					p8=String.valueOf(m3); //aqui suponemos que la tercera letra es consonante por que la segunda es vocal
					l2=paterno.charAt(1);
					p2=String.valueOf(l2);

				}
				else
				{
					System.out.println("entro al else");
					l2=paterno.charAt(2);
					if(l2==c1)
					{   m3=paterno.charAt(1);
						p8=String.valueOf(m3);//si entro aqui es por que la segunda letra no es vocal, entonces la segunda letra es consonante
						l2=paterno.charAt(2);
						p2=String.valueOf(l2);
					}
					else
					{
						System.out.println("entro al else");
						l2=paterno.charAt(3);
						if(l2==c1)
						{   m3=paterno.charAt(1);
							p8=String.valueOf(m3);
							l2=paterno.charAt(3);
							p2=String.valueOf(l2);
						}
		
					}
				}
				
			}
			//p8=("HOLA");
			materno=s.getText();  //se declara la tercera letra, es la primera letra del apellido materno
			l3=materno.charAt(0);
			p3=String.valueOf(l3);
			o1=materno.charAt(1);
			p9=String.valueOf(o1);
			for(int i=0; i<5; i++)
			{

				o2=comparacion.charAt(i);
				if (o1==o2)
				{
					o1=materno.charAt(2);
					p9=String.valueOf(o1);
				}

			}

			nombre=p.getText();  //se declara las cuarta letra, es la primera letra del nombre
			secun=q.getText();
			l4=nombre.charAt(0);
			o3=nombre.charAt(1);
			for(int i=0;i<5;i++)
			{
				o4=comparacion.charAt(i);
				if(o4==o3)
				{
					o3=nombre.charAt(2);
				}
			}
			if(nombre.equals("JOSE"))
			{
				l4=secun.charAt(0);
				o3=secun.charAt(1);
				for(int i=0;i<5;i++)
				{
					o4=comparacion.charAt(i);
					if(o3==o4)
					{
						o3=secun.charAt(2);
						if(o3==o4)
						{
							o3=secun.charAt(3);
						}
					}
				}
			}
			if(nombre.equals("MARIA"))
			{
				l4=secun.charAt(0);
				o3=secun.charAt(1);
				for(int i=0;i<5;i++)
				{
					o4=comparacion.charAt(i);
					if(o3==o4)
					{
						o3=secun.charAt(2);
						if(o3==o4)
						{
							o3=secun.charAt(3);
						}
					}
				}
			}
			p4=String.valueOf(l4); //comparamos las iniciales del nombre para que no sea una palabra "curiosa"
			p10=String.valueOf(o3);
			calis=p1+p2+p3+p4;
			System.out.println(calis);
			for(int i=0;i<37;i++)
			{

				if(calis.equals(curiosas[i]))
				{
					System.out.println("comparando");
					l4='X';
					p4=String.valueOf(l4);
				}
			}
			
			l5=control.getValue().toString();
			l9=control1.getValue().toString();
			l10=control2.getValue().toString();
			ano=Integer.parseInt(l10);
			mes=Integer.parseInt(l9);
			dia=Integer.parseInt(l5);
			l6=String.valueOf(dia);
			l7=String.valueOf(mes);
			l8=String.valueOf(ano);
			for(int i=0; i<9; i++)
			{
				if(dia==i)
				{
					System.out.println("comparo");
					l6=String.valueOf("0"+dia);
				}
				if (mes==i)
				{
					l7=String.valueOf("0"+mes);
				}
				if (ano==i) 
				{
					l8=String.valueOf("0"+ano);
				}

			}
			System.out.println(l6);
			p5=(l8+""+l7+""+l6);
			//p5=String.valueOf(dia);
			estado=c.getText();
			for(int i=0; i<32;i++)
			{
				if(estado.equals(estados1[i]))
				{
					System.out.println("comparando");
					p7=estados[i];
				}
			}
			//System.out.println(p6);
			

		key=(int)(Math.random()*10);
		key2=(int)(Math.random()*10);
		p11=String.valueOf(key+""+key2);

			res1.setText(p1+p2+p3+p4+p5+p6+p7+p8+p9+p10+p11);

		}
	}

	public static void main(String[] args)
	{
		curp obj=new curp();
	}
}