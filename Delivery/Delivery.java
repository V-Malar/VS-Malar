import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class KeyValue {
	String key;
	int value;

	public KeyValue(String key, int value) {
		this.key = key;
		this.value = value;
	}
}

class DeliveryTime {
	// String userInput;
//	DeliveryTime(String userInput)
//	{
//		this.userInput = userInput;
//	}
	public void deliveryTime(String userInput) {
		ArrayList<KeyValue> keyValuePairs = new ArrayList<KeyValue>();
		LocalDateTime newDateTime;
		long result = 0;
		DateTimeFormatter day_formatter;
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy hh:mm:ss a");
		LocalDateTime parsedDateTime = LocalDateTime.parse(userInput, formatter);
		System.out.println("Parsed date and time: " + parsedDateTime + " " + parsedDateTime.format(DateTimeFormatter.ofPattern("EEEE")));

		DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
		DateTimeFormatter timeCheck = DateTimeFormatter.ofPattern("hh:mm:ss a");
		LocalDateTime checkTime = LocalDateTime.parse(userInput, formatter);
		
		String formattedCheckTime = checkTime.format(timeCheck);

		keyValuePairs.add(new KeyValue("DP", 2));
		keyValuePairs.add(new KeyValue("NP", 2));
		keyValuePairs.add(new KeyValue("NP", 8));
		keyValuePairs.add(new KeyValue("NP", 10));
		keyValuePairs.add(new KeyValue("NP", 2));
		newDateTime = parsedDateTime.plusHours(result);
		day_formatter = DateTimeFormatter.ofPattern("EEEE");
		String dayOfWeek = newDateTime.format(day_formatter);
		String formattedDate = newDateTime.format(outputFormatter);

		if (dayOfWeek.equalsIgnoreCase("Saturday") || dayOfWeek.equalsIgnoreCase("Sunday") || formattedCheckTime.equalsIgnoreCase("11:30:00 PM")) {
			System.out.println("Destination stopped..");
		} else if (formattedDate.equalsIgnoreCase("August 15, 2023")
				|| formattedDate.equalsIgnoreCase("January 01, 2023")) {
			if (parsedDateTime.getHour() < 24) {
				System.out.println(newDateTime.getHour() + " Your leave is still ON..");
			} else {
				System.out.println(newDateTime.getHour() + " Leave Over..Work starts..");
			}
		} else {

			for (KeyValue keyValue : keyValuePairs) {
				result += keyValue.value;
				newDateTime = parsedDateTime.plusHours(result);
				System.out.println("\n\"" + keyValue.key + "\" - Travel Time: " + keyValue.value + " Hr");
				formattedDate = newDateTime.format(outputFormatter);
				newDateTime = parsedDateTime.plusHours(result);

				if (dayOfWeek.equalsIgnoreCase("Saturday") || dayOfWeek.equalsIgnoreCase("Sunday") || formattedCheckTime.equalsIgnoreCase("11:30:00 PM")) {
					System.out.println("Current Date & Time: " + newDateTime.toString() + " Day: " + dayOfWeek);
					System.out.println("Destination stopped..");
				} else {
					System.out.println("Current Date & Time: " + newDateTime.toString() + " Day: " + dayOfWeek);
					System.out.println("Destination reached..");
				}
				System.out.println();
				day_formatter = DateTimeFormatter.ofPattern("EEEE");
				dayOfWeek = newDateTime.format(day_formatter);
			}

		}
	}
}

public class Delivery {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter date and time (MMMM d, yyyy hh:mm:ss a)-August 19, 2023 11:30:00 PM");
		String userInput = scanner.nextLine();
		scanner.close();
		new DeliveryTime().deliveryTime(userInput);
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E");
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEEE");
//        DateTimeFormatter day_formatter = DateTimeFormatter.ofPattern("EEEE");
//        DateTimeFormatter time_formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
//        String dayOfWeek = currentDateTime.format(day_formatter);
//        newDateTime = currentDateTime.plusHours(26);
//        String newdayOfWeek = newDateTime.format(day_formatter);
//        String formattedTime = currentDateTime.format(time_formatter);
//        String newformattedTime = newDateTime.format(time_formatter);
//        System.out.println("Current day of the week: " + dayOfWeek + " Date: " + formattedTime);
//		System.out.println("Current day of the week: " + newdayOfWeek + " Date: " + newformattedTime);
//		if (!dayOfWeek.equalsIgnoreCase("Saturday"))
//		{
//			System.out.println("Destination reached..");
//		}
	}

}
