
public class Main {

	public static void main(String[] args) {
		
		final String nombreEmpresa= "Distribuidora TupperWare";
		double costoUnitario= 45;
		int cantidadProducto= 10;
		double totalDePago= costoUnitario*cantidadProducto;
		double precioDeVenta= 65;
		double IVA= 0.12;
		double totalIvaporUnidad= precioDeVenta*IVA;
		System.out.println("   " + nombreEmpresa );
		System.out.println("______________________________");
		System.out.println("->Costo por unidad: Q" + costoUnitario + "\n" );
		System.out.println("->Cantidad de producto: " + cantidadProducto );
		
		System.out.println("|>El total es de: Q" + totalDePago + "\n");
		System.out.println("--------------------------");
		System.out.println("°Venderse a: Q" + precioDeVenta + "\n");
		System.out.println("°Impuesto establecido: " + IVA + "\n");
		System.out.println("°Impuesto por unidad: Q" + totalIvaporUnidad +"\n");
		System.out.println("-------------------------------");
		
		int cantidadDeProducto = 50;
		double totalCobroSinDescuento = cantidadDeProducto * precioDeVenta;
		double totalDescuento= 0;
		if(cantidadDeProducto >= 50) {
			totalDescuento = totalCobroSinDescuento*0.05;
		} 
		if(cantidadDeProducto >= 100) {
			totalDescuento = totalCobroSinDescuento*0.15;
		}
		if (cantidadDeProducto >= 1000) {
			totalDescuento = totalCobroSinDescuento*0.25;
		}
	
		double totalConDescuento = totalCobroSinDescuento-totalDescuento ;
		double impuestoADeclararPorLaVenta = totalConDescuento*IVA;
		
		double tipoDeDescuento= 0;
		if (cantidadDeProducto >= 50) {
			tipoDeDescuento= 0.05;
		}
		
		if (cantidadDeProducto >= 100) {
			tipoDeDescuento= 0.15;
		}
		if (cantidadDeProducto >= 1000) {
			tipoDeDescuento= 0.25;
		}
		double gananciasObtenidas= totalConDescuento - impuestoADeclararPorLaVenta ;
		
		System.out.println("-Cantidad comprada: " + cantidadDeProducto + "\n");
		System.out.println("-Total sin descuento: Q" + totalCobroSinDescuento + "\n");
		System.out.println("-El descuento debe de ser de: Q" + totalDescuento +"\n");
		System.out.println("-Total con descuento: Q" + totalConDescuento + "\n");
		System.out.println("-IVA a declarar: Q" + impuestoADeclararPorLaVenta + "\n");
		System.out.println("-Tipo de descuento: " + tipoDeDescuento + "\n");
		System.out.println("-Las ganancias obtenidas son de: Q" + gananciasObtenidas );
		
		
	}

}
