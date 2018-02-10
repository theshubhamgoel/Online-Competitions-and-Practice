import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class drawCircle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Sir please give the circle equation in this format ");
		System.out.println("===================================================");
		System.out.println("( x - a )^2 + ( y - b )^2 = r ^2");
		String equation = br.readLine();
		int centerX, centerY, radius;

		String temp[] = equation.split(" ");
		centerX = Integer.parseInt(temp[3]);
		centerY = Integer.parseInt(temp[9]);
		radius = Integer.parseInt(temp[12]);

		int xlen = Math.abs(centerX) + radius;
		int ylen = Math.abs(centerY) + radius;
		xlen = 81;
		ylen = 81;

		String graph[][] = new String[2 * ylen][xlen * 2];

		// inizaialize Graph
		for (int i = 0; i < graph.length; i++) {
			Arrays.fill(graph[i], " ");
		}

		for (int i = 0; i < xlen; i++) {
			graph[ylen / 2][i] = "* ";
		}

		for (int i = 0; i < ylen; i++) {
			graph[i][xlen - 1] = "*";
		}

		// set center
		graph[ylen / 2 - centerY][xlen + 2 * centerX - 1] = "*";

		// print all the point
		int tempX, tempY;
		for (int i = 0; i < 360; i += 20) {
			tempX = (int) Math.round(centerX + radius * Math.cos(i * Math.PI / 180));
			tempY = (int) Math.round(centerY + radius * Math.sin(i * Math.PI / 180));

			graph[ylen / 2 - tempY][xlen + 2 * tempX - 1] = "*";
		}

		drawGraph(graph);

	}

	private static void drawGraph(String[][] graph) {

		for (int i = 0; i < graph.length/2+1; i++) {
			for (int j = 0; j < graph[i].length; j++) {
				System.out.print(graph[i][j]);
			}
			System.out.println();
		}
	}
}
