
public class SucursalC {

	public String NameS = "Sucarita_3";
	public int telefono = 969696;
	public String Direccion = "Av. Arriba";

	public String getNameS() {
		return NameS;
	}

	public void setNameS(String nameS) {
		NameS = nameS;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public void ejecutar() {
		CajeroA hila1 = new CajeroA();
		CajeroB hila2 = new CajeroB();
		CajeroC hila3 = new CajeroC();
		String Name;
		String Direccion;
		Client clienteA[] = new Client[20];	
		String Tipo_cliente = " ";
		for (int i = 0; i < clienteA.length; i++) {
			Name = "Juan" + i;
			Direccion = "Av.Parra";
			if (i >= 0 && i <= 2) {
				Tipo_cliente = "Banca Esclusiva";
			}
			if (i >= 3 && i <= 4) {
				Tipo_cliente = "Preferencial";
			}
			if (i >= 5 && i <= 15) {
				Tipo_cliente = "Normal";
			}
			clienteA[i] = new Client(Name, Direccion, Tipo_cliente);
			hila1=new CajeroA(Name,Direccion,Tipo_cliente);
			hila2=new CajeroB(Name,Direccion,Tipo_cliente);
			hila3=new CajeroC(Name,Direccion,Tipo_cliente);
			hila1.start();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
			hila2.start();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
			hila3.start();
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
