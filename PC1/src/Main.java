import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
        SucursalA exeA = new SucursalA();
        SucursalB exeB = new SucursalB();
        SucursalC exeC = new SucursalC();
		
		
		/*for (int i = 0; i < 20; i++) {
			System.out.println(
					clienteA[i].getNombre() + " " + clienteA[i].getDireccion() + " " + clienteA[i].getTipo_Cliente());
		}*/
		
      exeA.ejecutar();
      exeB.ejecutar();
      exeC.ejecutar();
	}

}
