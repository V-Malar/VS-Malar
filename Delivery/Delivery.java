
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Set destination point and next point in the ArrayList
 */
class KeyValue {
	String key;
	int value;

	public KeyValue(String key, int value) {
		this.key = key;
		this.value = value;
	}
}

/**
 * The Delivery class represents a delivery schedule calculation based on user
 * input.
 */
public class Delivery {
	/**
	 * Calculates the delivery time and prints relevant information.
	 *
	 * @param userInput The user-input date and time in the format "MMMM d, yyyy
	 *                  hh:mm:ss a".
	 */
	public void deliveryTime(String userInput) {
		ArrayList<KeyValue> keyValuePairs = new ArrayList<KeyValue>();
		LocalDateTime newDateTime;
		long result = 0;
		DateTimeFormatter day_formatter;

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy hh:mm:ss a");
		LocalDateTime parsedDateTime = LocalDateTime.parse(userInput, formatter);
		System.out.println("Parsed date and time: " + parsedDateTime + " "
				+ parsedDateTime.format(DateTimeFormatter.ofPattern("EEEE")));

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
		System.out.println(checkTime.getHour());
		if (dayOfWeek.equalsIgnoreCase("Saturday") || dayOfWeek.equalsIgnoreCase("Sunday")
				|| formattedCheckTime.equalsIgnoreCase("11:30:00 PM")) {
			System.out.println("Destination stopped..");
		}
		else if(dayOfWeek.equalsIgnoreCase("Friday") && (checkTime.getHour() >= 20))
		{
			System.out.println("Destination stopped.." + newDateTime);
		}
		else { if (formattedDate.equalsIgnoreCase("August 15, 2023")
				|| formattedDate.equalsIgnoreCase("January 01, 2023")) {
			if (parsedDateTime.getHour() < 24) {
				System.out.println(newDateTime.getHour() + " Your leave is still ON..");
			} else {
				System.out.println(newDateTime.getHour() + " Leave Over..Work starts..");
			}
		} else {
			try {

				{
					for (KeyValue keyValue : keyValuePairs) {
						result += keyValue.value;
						newDateTime = parsedDateTime.plusHours(result);
						System.out.println("\n\"" + keyValue.key + "\" - Travel Time: " + keyValue.value + " Hr " + newDateTime.format(day_formatter));
						formattedDate = newDateTime.format(outputFormatter);
						newDateTime = parsedDateTime.plusHours(result);
						day_formatter = DateTimeFormatter.ofPattern("EEEE");
						dayOfWeek = newDateTime.format(day_formatter);

						if (dayOfWeek.equalsIgnoreCase("Saturday")) {
							System.out.println("Current **Day: " + newDateTime.getDayOfWeek());
							System.out.println(newDateTime.getHour());
							System.out.println(result);
							newDateTime = parsedDateTime.plusHours(48+result);
							System.out.println("Destination stopped..Delivered on: " + newDateTime.format(formatter) + " " + newDateTime.getDayOfWeek());
							break;
						} 
						if (dayOfWeek.equalsIgnoreCase("Sunday"))
						{
							System.out.println("Current Date & Time: " + newDateTime.format(formatter) + " Day: " + newDateTime.getDayOfWeek());
							System.out.println(newDateTime.getHour());
							newDateTime = parsedDateTime.plusHours(result);
						    System.out.println("Destination stopped..Delivered on: " + newDateTime.plusHours(result).format(formatter) + " " + newDateTime.plusHours(result).getDayOfWeek());
						}
						else {
							System.out.println("Current Date & Time: " + newDateTime.format(formatter) + " Day: " + newDateTime.getDayOfWeek());
							System.out.println("Destination reached..");
						}
						System.out.println();
						//day_formatter = DateTimeFormatter.ofPattern("EEEE");
						//dayOfWeek = newDateTime.format(day_formatter);August 18, 2023 09:30:00 PM
						//+newDateTime.getHour()
					}

				}
			}catch (Exception e) {
				throw new DateTimeParseException("Invalid Input..", userInput, 0);
			}}}
	}
/**
 * Calculates the delivery time and prints relevant information.
 *
 * @param userInput The user-input date and time in the format "MMMM d, yyyy
 *                  hh:mm:ss a".
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter date and time (MMMM d, yyyy hh:mm:ss a)-August 19, 2023 11:30:00 PM");
		String userInput = scanner.nextLine();
		scanner.close();
		new Delivery().deliveryTime(userInput);
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
	}}


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Set destination point and next point in the ArrayList 
 */
class KeyValue {
	String key;
	int value;

	public KeyValue(String key, int value) {
		this.key = key;
		this.value = value;
	}
}
/**
 * The Delivery class represents a delivery schedule calculation based on user input.
 */
public class Delivery {
  /**
     * Calculates the delivery time and prints relevant information.
     *
     * @param userInput The user-input date and time in the format "MMMM d, yyyy hh:mm:ss a".
     */
	public void deliveryTime(String userInput) {
		ArrayList<KeyValue> keyValuePairs = new ArrayList<KeyValue>();
		LocalDateTime newDateTime;
		long result = 0;
		DateTimeFormatter day_formatter;

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy hh:mm:ss a");
		LocalDateTime parsedDateTime = LocalDateTime.parse(userInput, formatter);
		System.out.println("Parsed date and time: " + parsedDateTime + " "
				+ parsedDateTime.format(DateTimeFormatter.ofPattern("EEEE")));

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

		if (dayOfWeek.equalsIgnoreCase("Saturday") || dayOfWeek.equalsIgnoreCase("Sunday")
				|| formattedCheckTime.equalsIgnoreCase("11:30:00 PM")) {
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

				if (dayOfWeek.equalsIgnoreCase("Saturday") || dayOfWeek.equalsIgnoreCase("Sunday")
						|| formattedCheckTime.equalsIgnoreCase("11:30:00 PM")) {
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
  /**
     * Calculates the delivery time and prints relevant information.
     *
     * @param userInput The user-input date and time in the format "MMMM d, yyyy hh:mm:ss a".
     */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter date and time (MMMM d, yyyy hh:mm:ss a)-August 19, 2023 11:30:00 PM");
		String userInput = scanner.nextLine();
		scanner.close();
		new Delivery().deliveryTime(userInput);
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
