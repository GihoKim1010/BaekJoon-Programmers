public class Main {

	public static void main(String[] args) {

		StringBuilder result = new StringBuilder();
		result.append("SHIP NAME      CLASS          DEPLOYMENT IN SERVICE").append("\n");
		result.append("N2 Bomber      Heavy Fighter  Limited    21        ").append("\n");
		result.append("J-Type 327     Light Combat   Unlimited  1         ").append("\n");
		result.append("NX Cruiser     Medium Fighter Limited    18        ").append("\n");
		result.append("N1 Starfighter Medium Fighter Unlimited  25        ").append("\n");
		result.append("Royal Cruiser  Light Combat   Limited    4         ");
		System.out.println(result.toString());
	}
}