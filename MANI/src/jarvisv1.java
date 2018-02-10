import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class jarvisv1 {
	final static double unexpectedValue = 912142323.3242471;

	public static void main(String[] args) throws IOException {

		String[] typeOfVariable = { "v", "u", "a", "t" };
		String[] respectedEquation = { "1 2 3 * +", "0 2 3 * -", "0 1 - 3 /",
				"0 1 - 2 /" };

		String Equation = "v = u + a * t";
		runJarvis(typeOfVariable, respectedEquation, Equation);
	}

	private static void runJarvis(String[] typeOfVariable,
			String[] respectedEquation, String myEquation) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double[] respectedValues = new double[typeOfVariable.length];
		double[] unorderedValues = new double[typeOfVariable.length];
		int unknownVariableIndex = -1;

		// get input
		System.out
				.println("Sir, Please give your problem statement regarding this equation ("
						+ myEquation + "). I will solve it for you Sir.");
		String s, x, updatedSentence = " ";
		s = br.readLine();
		s = s.replaceAll("=", " = ");

		// get values from sentence
		StringTokenizer st;
		st = new StringTokenizer(s);

		int index = 0, no = st.countTokens();
		for (int i = 0; i < no; i++) {
			try {
				x = st.nextToken();
				x = x.trim();
				x = x.replaceAll("\\.+$", "");
				x = x.replaceAll(",+$", "");
				updatedSentence += x + " ";
				unorderedValues[index] = Double.parseDouble(x);
				index++;
			} catch (Exception e) {
				// do nothing
			}
		}

		// intialize array of given variable
		for (int i = 0; i < respectedValues.length; i++) {
			respectedValues[i] = unexpectedValue;
		}

		st = new StringTokenizer(updatedSentence);
		no = st.countTokens();
		index = 0;
		for (int i = 0; i < no; i++) {
			x = st.nextToken();
			x.trim();
			for (int j = 0; j < typeOfVariable.length; j++) {
				if (typeOfVariable[j].equals(x))
					respectedValues[j] = unorderedValues[index++];
			}
		}

		int countunknow = 0;
		for (int i = 0; i < respectedValues.length; i++) {
			if (respectedValues[i] == unexpectedValue) {
				unknownVariableIndex = i;
				countunknow++;

			}
		}

		if (countunknow != 1) {
			System.out
					.println("Sorry Sir, You are giving me wrong problem. Its not fair Sir.");
			return;
		}

		// do some calculation
		st = new StringTokenizer(respectedEquation[unknownVariableIndex]);
		no = st.countTokens();
		double temp, a, b;

		Stack<Double> equation = new Stack<Double>();

		try {
			for (int i = 0; i < no; i++) {
				x = st.nextToken();
				switch (x) {
				case "+":
					a = equation.pop();
					b = equation.pop();
					equation.push(a + b);
					break;
				case "-":
					a = equation.pop();
					b = equation.pop();
					equation.push(b - a);
					break;
				case "*":
					a = equation.pop();
					b = equation.pop();
					equation.push(a * b);
					break;
				case "/":
					a = equation.pop();
					b = equation.pop();
					equation.push(b / a);
					break;
				case "%":
					a = equation.pop();
					b = equation.pop();
					equation.push(b % a);
					break;
				case "root2":
					a = equation.pop();
					equation.push(Math.sqrt(a));
					break;
				case "sin":
					a = equation.pop();
					equation.push(Math.sin(a));
					break;
				case "cos":
					a = equation.pop();
					equation.push(Math.cos(a));
					break;
				case "tan":
					a = equation.pop();
					equation.push(Math.tan(a));
					break;

				default:
					temp = respectedValues[Integer.parseInt(x)];
					equation.push(temp);
				}
			}
		} catch (Exception e) {
			System.out.println("Sir, some of variable cannot be zero.");
			return;

		}

		System.out.println("Sir, Value of "
				+ typeOfVariable[unknownVariableIndex] + " is : "
				+ equation.peek());

	}

}
