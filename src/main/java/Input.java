import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Input {
    public static void main(String[] args) {
        // Today of date
        LocalDate today = LocalDate.now();
        int YearNow = LocalDate.now().getYear();

        // Input Block
        Scanner input = new Scanner(System.in);
        System.out.println("Введи свою дату рождения? (YYYY-MM-DD):");
        String birthdate = input.nextLine();

        // Convert data (string = type LocalData)

        LocalDate dayDB = LocalDate.parse(birthdate, DateTimeFormatter.ISO_LOCAL_DATE);
        long YourYears = ChronoUnit.YEARS.between(dayDB, today);

        long YourDays = ChronoUnit.DAYS.between(dayDB, today);

        LocalDate lastBirthDay = LocalDate.of(YearNow, dayDB.getMonthValue(), dayDB.getDayOfMonth());
        long DefetentDAY = ChronoUnit.DAYS.between(today, lastBirthDay);

        System.out.println("Чтож, тебе " + YourYears + " лет (" + YourDays + " дней) и до твоего дня рождения осталось " + DefetentDAY + " дня(ей)");

    }
}

