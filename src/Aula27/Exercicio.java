package Aula27;

public class Exercicio {
	public static void main(String[] args){
		
		double x=3.0, y=4.0, z=-5.0, a,b,c;
		
		a=Math.sqrt(x); // Math.sqrt() � a fun��o usada para raiz quadrada. 
		b=Math.sqrt(y);
		c=Math.sqrt(Math.abs(z)); // Math.abs() � usado para considerar apenas o valor positivo de um n�mero.
		System.out.println("Raiz quadrada de "+x+" = "+a);
		System.out.println("Raiz quadrada de "+y+" = "+b);
		System.out.printf("Raiz quadrada de "+z+" = %.3f\n",c);
		
		a=Math.pow(x, y); // Math.pow() � usado para exponencia��o
		b=Math.pow(y, x);
		c=Math.pow(Math.abs(z), y);
		System.out.println(x+" elevado � quarta pot�ncia = "+a);
		System.out.println(y+" elevado ao cubo  = "+b);
		System.out.println(Math.abs(z)+" elevado � quarta pot�ncia � = "+c);
		
		// F�rmula de B�scara em java
		
		double delta;
		delta=Math.pow(y,2.0)-4*x*z; // usando x,y e z do exemplo acima
		System.out.println("delta = "+delta);
		
	}
}
