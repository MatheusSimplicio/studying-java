
public class Principal {

	public static void main(String[] args) {
		int i, j;
		int matriz [][] = {{0,1,2},{3,4,5}};
		
		for(i=0; i<2; i++) {
			for(j=0; j<3; j++) {
				System.out.println(matriz[i][j]);
			}
		}
		String [] objetos = {"garrafa","copo","litro"};
		System.out.println(objetos.length);
		 
        for (int tam = objetos.length - 1; tam >= 0; tam--){

                 System.out.print(objetos[tam] + " ");

        }
	}
}
