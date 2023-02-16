
public class Principal {

	public static void main(String[] args) {
		int num1, num2;
		
		num1 = 6;
		num2 = 6;
		
		/* por ser pós-fixado, o num1 está executando o valor original (6) 
		 * e acrescentando mais um */
		System.out.println(num1++); 
		System.out.println(num1);
		
		System.out.println(++num2);
		
		System.out.println(++num1 - num2++);
		
		num1--;
		--num2;
	
		System.out.println(num1);
		System.out.println(num2);
	}

}
