package dp.java14.feture.switchs;

public class SwitchStatement {
	public static void main(String[] args) {
		String sport = "Football";
        String bestPlayer = switch (sport) {
            case "Football":
                yield "XXX";
            case "Tennis":
                yield "YYY";
            case "Cricket":
                yield "ZZZ";
            case "F1":
                yield "AAA";
            default:
                yield "Unknown";
        };

        System.out.println(bestPlayer);
	}
}
