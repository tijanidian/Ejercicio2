
public class Salario {

	String tipo;
	float ventasMes;
	float horasExtra;

	public Salario() {
		this.tipo = null;
		this.ventasMes = 0;
		this.horasExtra = 0;
	}

	public Salario(String tipo, float ventasMes, float horasExtra) {
		this.tipo = tipo;
		this.ventasMes = ventasMes;
		this.horasExtra = horasExtra;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getVentasMes() {
		return ventasMes;
	}

	public void setVentasMes(float ventasMes) {
		this.ventasMes = ventasMes;
	}

	public float getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(float horasExtra) {
		this.horasExtra = horasExtra;
	}

	public String toString() {
		return ("tipo," + tipo + " Ventas del mes" + ventasMes + " Horas extra trabajadas " + horasExtra);
	}

	public static float calcularSalarioBruto(String tipo, float ventasMes, float horasExtra) {
		float resultado = 0;
		double salarioBase = 0;

		
		String trabajador = null;
		switch (trabajador) {

		case "vendedor":
			salarioBase = 1000;
			System.out.println("Su salario base es de: " + salarioBase);
			if (ventasMes >= 1000) {
				salarioBase = salarioBase + 100;
			} else if (ventasMes >= 1000) {
				salarioBase = salarioBase + 200;
			}

			break;
		case "encargado":
			salarioBase = 1500;
			System.out.println("Su salario base es de: " + salarioBase);
			if (ventasMes >= 1000) {
				salarioBase = salarioBase + 100;
			} else if (ventasMes >= 1000) {
				salarioBase = salarioBase + 200;

			}
			break;

		default:
			break;
		}
		return resultado;

	}
	
	public static float calcularSalarioNeto(float salarioBruto) {
		float resultado =0;
		if (salarioBruto<100) {
			
		}else if (salarioBruto >100 && salarioBruto<1500) {
			salarioBruto=(float) (salarioBruto*0.16);
		}
		else if (salarioBruto>1500) {
			salarioBruto=(float) (salarioBruto*0.18);
			System.out.println(salarioBruto);
		}
		
		return resultado;
	}

}
