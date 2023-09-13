import java.awt.*;
import javax.wing.*;
import java.util.Scanner;
import java.util.function.Consumer;

//Ropaaaaaa

class Ropa
{
	private String talla;
	private String color;
	private int nserie;
	private String marca;
	private int precio;

	public Ropa(int nserie)
	{
		this.nserie=nserie;
	}

	public Ropa(String talla, String color, int nserie, String marca, int precio)
	{
		this.talla=talla;
		this.color=color;
		this.nserie=nserie;
		this.marca=marca;
		this.precio=precio;
	}

	@Override
    public int hashCode() 
    {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ropa other = (Ropa) obj;
        if (this.nserie != other.nserie) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() 
    {
        return "talla=" + talla + ", color=" + color + ", nserie=" + nserie + ", marca=" + marca + ", precio=" + precio;
    }

    public String getTalla() {
        return talla;
    }

    public String getColor() {
        return color;
    }

    public int getNserie() {
        return nserie;
    }

    public String getMarca() {
        return marca;
    }

    public int getPrecio() {
        return precio;
    }

//Ropa--------------------------------Ropa

}

//----------------------------------------------------------Clas cola
class Cola
{

	private class Nodo
	{
		public String cm;

		public Nodo siguente=null;

		public Nodo(String camisas)
		{
			this.cm=camisas;
		}

	}

	private Nodo cima=null;
	private int j=0;
	

	public void apilar(String camisas)
	{
		Nodo nodo = new Nodo(camisas);
		nodo.siguente = cima;
		cima = nodo;
		j++;
	}

	public void desapilar()
	{
		if(cima != null)
		{
			Nodo eliminar = cima;
			cima=cima.siguente;
			eliminar.siguente=null;
			j--;
		}
	}

	public String mostrar_sima()
	{
		if(cima==null)
		{
			return "La Pila esta vacia";
		}
		else
		{
			return cima.cm;
		}
	}
	public String GetCima()
	{
		return cima.cm;
	}

	public boolean brr()
	{
		return j==0;
	}

} 

//-----------------------------------------------------------Class Fila
class Fila
{
	private class Nodo
	{
		public String pla;

		public Nodo siguente=null;

		public Nodo(String pl)
		{
			this.pla=pl;
		}

	}

	private Nodo cima=null;
	int j=0;
	

	public void apilar(String pl)
	{
		Nodo nodo = new Nodo(pl);
		nodo.siguente = cima;
		cima = nodo;
		j++;
	}

	public void desapilar()
	{
		if(cima != null)
		{
			Nodo eliminar = cima;
			cima=cima.siguente;
			eliminar.siguente=null;
			j--;
		}
	}

	public String mostrar_sima()
	{
		if(cima==null)
		{
			return "La Pila esta vacia";
		}
		else
		{
			return cima.pla;
		}
	}
	public String GetCima()
	{
		return cima.pla;
	}

	public boolean Espacio()
	{
		return j==0;
	}
}

//-------------------------------------------------------------------Class Lista
class FFila
{
	private class Nodo
	{
		public String pla;

		public Nodo siguente=null;
		public Nodo anterior=null;

		public Nodo(String pl)
		{
			this.pla=pl;
		}

	}

	private Nodo cima=null;
	private Nodo fn=null;
	private int j=0;

	public void agregarPrincipio(String pl)
	{
		Nodo nodo = new Nodo(pl);
		nodo.siguente = cima;
		cima = nodo;
		j++;
	}

	public void agregarFinal(String pl)
	{
		Nodo nodo = new Nodo(pl);
		nodo.anterior = fn;
		fn = nodo;
		j++;
	}

	public void ContarElementos()
	{
		System.out.println("El numero de playeras son: " + j);
	}

	public void QuitarPrimero()
	{
		Nodo eliminar = cima;
			cima=cima.siguente;
			eliminar.siguente=null;
			j--;
	}

	public void QuitarUltimo()
	{
		Nodo eliminar = fn;
			fn=fn.anterior;
			eliminar.anterior=null;
			j--;
	}
	public String mostrar_sima()
	{
		if(cima==null)
		{
			return "La Pila esta vacia";
		}
		else
		{
			return cima.pla;
		}
	}
	public String mostrar_final()
	{
		if(fn==null)
		{
			return "La Pila esta vacia";
		}
		else
		{
			return fn.pla;
		}
	}
	public boolean lugares()
	{
		return j==0;
	}

	public int GetJ()
	{
		return j;
	}
}

//--------------------------------------------------------------------------------class Principal
public class Extra
{
	public static void main(String[] args) 
	{
		int n=1,n1=0,n2=0;
		String p = null, p1 = null, p2 = null, p3 = null;
		boolean start=false;
		boolean start2= false;
		boolean start3= false;
		Scanner entero= new Scanner(System.in);
		Scanner arreglo=new Scanner(System.in);
		Ropa playeras;
		Fila pilita = new Fila();
		Cola cl=new Cola();
		FFila fl=new FFila();

		while(n>0)
		{
			System.out.println("Menu. 0 = Salir, 1 = Fila, 2 = Pila, 3 = Lista ");
			n=entero.nextInt();
			switch(n)
			{
				//-------------Salir
				case 0:
				System.out.println("Saliendo del programa...");
				break;

				//-----------Fila
				case 1: 
				while(n>0)
				{
					System.out.println("Menu. 0 = Salir, 1 = Crear Fila, 2 = Encolar, 3 = Desencolar, 4 = Mostrar Fila, 5 = Destruir Fila");
					n=entero.nextInt();
					switch(n)
					{
						//------------------Salir
						case 0:
						System.out.println("Regresando al Menu principal....");
						break;

						//--------------Crear
						case 1:
						if(start==false)
						{
							System.out.println("Fila creada");
							start=true;
						}

						else
						{
							System.out.println("Ya existe una Fila, es necesario que la elimines para crear otra");
						}
						break;

                        //---------------------Agregar
						case 2:
						if(start==true)
						{
							System.out.println("vamos a encolar una playera, para eso necesitamos los siguientes datos");

							System.out.println("ingresa el numero de Serie");
							n1=entero.nextInt();   //------------------------------numero de serie
							System.out.println("Ingresa la Marca");
							p=arreglo.nextLine(); //-------------------------------Marca
							System.out.println("Ingresa la Talla");
							p1=arreglo.nextLine(); //------------------------------Talla
							System.out.println("Ingresa el Color");
							p2=arreglo.nextLine(); //------------------------------Color
							System.out.println("Ingresa el precio");
							n2=entero.nextInt();//---------------------------------Precio
							playeras= new Ropa(p1,p2,n1,p,n2);
							pilita.apilar(playeras.toString());
							//System.out.println(pilita.mostrar_sima());
						}
						else
						{
							System.out.println("error, Fila no encontrada, asegurate de crear una Fila primero");
						}
						break;

						//_______________________________-Desapilar
						case 3:
						if(start == true)
						{
							
							if(!pilita.Espacio())
							{
								pilita.desapilar();
								System.out.println("posicion eliminada");
							}
							else
							{
								System.out.println("Fila encontrada pero esta vacia, asegurate de llenar primero el espacio");
								
								
							}
							
						}
						else
						{
							System.out.println("Fila no encontrada. Asegurate de crear primero un Fila.");
						}
						break;

						//------------------------------Mostrar la sima
						case 4:
						if(start == true)
						{
							
							if(!pilita.Espacio())
							{
								System.out.println(pilita.mostrar_sima());
								
							}
							else
							{
								System.out.println("Fila encontrada pero esta vacia, asegurate de llenar primero el espacio");
							}
							
						}
						else
						{
							System.out.println("Fila no encontrada. Asegurate de crear primero un Fila.");
						}	
						break;

						//--------------------------Destruir fila
						case 5:
						if(start == true)
						{ 
							
							while(!pilita.Espacio())
							{
								pilita.desapilar();
							}
							start=false;
							System.out.println("Fila eliminada");
						}
						else
						{
							System.out.println("Fila no encontrada. Asegurate de crear primero un Fila.");
						}
						break;
					}
				}
				break;

				//______________Pilas
				case 2:
				while(n>0)
				{
					System.out.println("Menu 0 = Regresas, 1 = crear Pila, 2 = Apilar, 3 = Desapilar, 4 = Cima de la pila, 5 = Destruir Pila");
					n=entero.nextInt();
					switch(n)
					{
						case 0: //------------Salir
						System.out.println("Regresando al menu principal");
						break;

						case 1://-------------Crear
						if(start2==false)
						{
							System.out.println("Pila creada");
							start2=true;
						}
						else
						{
							System.out.println("Ya hay una lista, asegurate de eliminarla primero antes de querer hacer otra ");
						}
						break;

						//---------------------Agregar
						case 2:
						if(start2==true)
						{
							System.out.println("vamos a encolar una playera, para eso necesitamos los siguientes datos");

							System.out.println("ingresa el numero de Serie");
							n1=entero.nextInt();   //------------------------------numero de serie
							System.out.println("Ingresa la Marca");
							p=arreglo.nextLine(); //-------------------------------Marca
							System.out.println("Ingresa la Talla");
							p1=arreglo.nextLine(); //------------------------------Talla
							System.out.println("Ingresa el Color");
							p2=arreglo.nextLine(); //------------------------------Color
							System.out.println("Ingresa el precio");
							n2=entero.nextInt();//---------------------------------Precio
							playeras= new Ropa(p1,p2,n1,p,n2);
						    cl.apilar(playeras.toString());
							//System.out.println(pilita.mostrar_sima());
						}
						else
						{
							System.out.println("error, Pila no encontrada, asegurate de crear una Pila primero");
						}
						break;

                        //------------------------Desapilar
						case 3:
						if(start2 ==true)
						{
							if(!cl.brr())
							{
								cl.desapilar();
								System.out.println("Posicion eliminada");
							}
							else
							{
								
								System.out.println("no hay elementos para desapilar");
							}

						}
						else
						{
							System.out.println("error, Pila no encontrada, asegurate de crear una Pila primero");
						}
						break;
                        
                        //--------------------Mostrar la sima
						case 4:
						if(start2 ==true)
						{
							if(!cl.brr())
							{
								System.out.println(cl.mostrar_sima());
								
							}
							else
							{
								
								System.out.println("no hay nada en la sima de la Pila");
							}

						}
						else
						{
							System.out.println("error, Pila no encontrada, asegurate de crear una Pila primero");
						}
						break;

						//--------------------Eliminar
						case 5:
						if(start2 ==true)
						{
							while(!pilita.Espacio())
							{
								pilita.desapilar();
							}
							start=false;
							System.out.println("Pila eliminada");

						}
						else
						{
							System.out.println("error, Pila no encontrada, asegurate de crear una Pila primero");
						}
						
						break;

					}
				}
				break;

				//----------Lista
				case 3:
				while(n>0)
				{
					System.out.println("Menu 0 = Regresar, 1 = Crear lista, 2 = insertar al principio, 3 = insertar al final, 4 = Contar elementos, 5 = Eliminar principio, 6 = Eliminar final, 7 = Destruir lista");
					n=entero.nextInt();
					switch(n)
					{
						case 0:
						System.out.println("Regresando al menu principal...");
						break;

//--------------------------------------------------Crear fila
						case 1:
						if(start3==false)
						{
							System.out.println("se ah creado la lista");
							start3=true;
						}

						else
						{
							System.out.println("Lo siento, ya hay una lista, asegurate de eliminarla para poder hacer otra ");
						}
						break;

//---------------------------------------------------
						case 2:
						if(start3==true)
						{
							System.out.println("vamos agregar a la lista una playera, para eso necesitamos los siguientes datos");

							System.out.println("ingresa el numero de Serie");
							n1=entero.nextInt();   //------------------------------numero de serie
							System.out.println("Ingresa la Marca");
							p=arreglo.nextLine(); //-------------------------------Marca
							System.out.println("Ingresa la Talla");
							p1=arreglo.nextLine(); //------------------------------Talla
							System.out.println("Ingresa el Color");
							p2=arreglo.nextLine(); //------------------------------Color
							System.out.println("Ingresa el precio");
							n2=entero.nextInt();//---------------------------------Precio
							playeras= new Ropa(p1,p2,n1,p,n2);
							fl.agregarPrincipio(playeras.toString());
						}
						else
						{
							System.out.println("no hay ninguna lista creada, primero asegurate de crear una lista.");
						}
						break;

						case 3:
						if(start3==true)
						{
							System.out.println("vamos agregar a la lista una playera, para eso necesitamos los siguientes datos");

							System.out.println("ingresa el numero de Serie");
							n1=entero.nextInt();   //------------------------------numero de serie
							System.out.println("Ingresa la Marca");
							p=arreglo.nextLine(); //-------------------------------Marca
							System.out.println("Ingresa la Talla");
							p1=arreglo.nextLine(); //------------------------------Talla
							System.out.println("Ingresa el Color");
							p2=arreglo.nextLine(); //------------------------------Color
							System.out.println("Ingresa el precio");
							n2=entero.nextInt();//---------------------------------Precio
							playeras= new Ropa(p1,p2,n1,p,n2);
							fl.agregarFinal(playeras.toString());
						}

						else
						{
							System.out.println("no hay ninguna lista creada, primero asegurate de crear una lista.");	
						}
						break;

						case 4:
						if(start3==true)
						{
							if(!fl.lugares())
							{
								System.out.println("los elementos en la lista son: "+fl.GetJ());
								System.out.println("La playera que se encuentra al principio es: "+fl.mostrar_sima());
								System.out.println("La playera que se encuentra al final es: " + fl.mostrar_final());
							}
							
						}
						else
						{
							System.out.println("no hay ninguna lista creada, primero asegurate de crear una lista.");	
						}
						break;

						case 5:
						if(start3==true)
						{
							if(!fl.lugares())
							{
								fl.QuitarPrimero();
								System.out.println("La playera que ahora se encuentra al principio es: "+fl.mostrar_sima());
							}
							else
							{
								System.out.println("La lista esta vacia, primero agrega elementos");
							}
						}
						else
						{
							System.out.println("no hay ninguna lista creada, primero asegurate de crear una lista.");	
						}
						break;

						case 6:
						if(start3==true)
						{
							if(!fl.lugares())
							{
								fl.QuitarUltimo();
								System.out.println("La playera que ahora se encuentra al final es: "+ fl.mostrar_final());
							}
							else
							{
								System.out.println("La lista esta vacia, primero agrega elementos");
							}
						}
						else
						{
							System.out.println("no hay ninguna lista creada, primero asegurate de crear una lista.");	
						}
						break;

						case 7:
						if(start3==true)
						{
							while(!fl.lugares())
							{
								fl.QuitarPrimero();
								fl.QuitarUltimo();
							}
							start3=false;
							System.out.println("Se a eliminado la lista");
						}
						else
						{
							System.out.println("no hay ninguna lista creada, primero asegurate de crear una lista.");	
						}
						break;
					}
				}
				break;
			}

		}
	}
}