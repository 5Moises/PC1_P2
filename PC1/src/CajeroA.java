
public class CajeroA extends Thread{
	private String Nombre;
	private String Direccion;
	private String Tipo_Cajero;
	
	public CajeroA()
	{
		
	}
	
	public CajeroA(String nombre, String direccion, String tipo_Cajero) {
		super();
		Nombre = nombre;
		Direccion = direccion;
		Tipo_Cajero = tipo_Cajero;
	}

	public String RealizarRetiro()
	{
		String AccionR = null;
		return AccionR;
		
	}
	public String RealizarDeposito()
	{
		String AccionD = null;
		return AccionD;
		
	}
	@Override
	public  void run()
	{
		
	  if(Tipo_Cajero=="Banca Esclusiva")
	  {
		  System.out.println(Nombre+" "+Direccion+" "+Tipo_Cajero+"\t");
	  }
	}
	
}
