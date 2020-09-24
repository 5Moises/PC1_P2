
public class CajeroB extends Thread{
	private String Nombre;
	private String Direccion;
	private String Tipo_Cajero;
	
	public CajeroB()
	{
		
	}
	
	public CajeroB(String nombre, String direccion, String tipo_Cajero) {
		super();
		Nombre = nombre;
		Direccion = direccion;
		Tipo_Cajero = tipo_Cajero;
	}
	public void RealizarRetiro()
	{
		
	}
	public void RealizarDeposito()
	{
		
	}
	@Override
	public void run()
	{  
		
		  if(Tipo_Cajero=="Preferencial")
		  {
			  System.out.println(Nombre+" "+Direccion+" "+Tipo_Cajero+"\t");
		  }
		  
	}
	
}
