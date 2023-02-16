import java.util.Arrays;
public class OrdenandoArray {
	public static void main(String[] args) {
		float[] resultadoArray = {
				(float) 71.3,
				(float) 35.2,
				(float) 45.7,
				(float) 62.9,
				(float) 12.5
		};
		System.out.println("Matriz antes da ordenação: " +Arrays.toString(resultadoArray));
		Arrays.sort(resultadoArray);
		System.out.println("Matriz depois da ordenação: " +Arrays.toString(resultadoArray));
	}
}
