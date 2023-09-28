import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Time_Converter {
    public static void main(String[] args) {
        // Get the current time in the Indian time zone
        ZoneId indiaTimeZone = ZoneId.of("Asia/Kolkata");
        LocalDateTime indianTime = LocalDateTime.now(indiaTimeZone);
        
        // Convert to America time zone (New York)
        ZoneId americaTimeZone = ZoneId.of("America/New_York");
        ZonedDateTime americaTime = indianTime.atZone(indiaTimeZone).withZoneSameInstant(americaTimeZone);
        
        // Convert to Japan time zone (Tokyo)
        ZoneId japanTimeZone = ZoneId.of("Asia/Tokyo");
        ZonedDateTime japanTime = indianTime.atZone(indiaTimeZone).withZoneSameInstant(japanTimeZone);
        
        // Convert to Russia time zone (Moscow)
        ZoneId russiaTimeZone = ZoneId.of("Europe/Moscow");
        ZonedDateTime russiaTime = indianTime.atZone(indiaTimeZone).withZoneSameInstant(russiaTimeZone);
        
        // Convert to China time zone (Beijing)
        ZoneId chinaTimeZone = ZoneId.of("Asia/Shanghai");
        ZonedDateTime chinaTime = indianTime.atZone(indiaTimeZone).withZoneSameInstant(chinaTimeZone);
        
        // Format the converted times using DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        // Print the converted times
        System.out.println("country        Date      Time\n");
        
        System.out.println("India    :  " + indianTime.format(formatter));
        System.out.println("America  :  " + americaTime.format(formatter));
        System.out.println("Japan    :  " + japanTime.format(formatter));
        System.out.println("Russia   :  " + russiaTime.format(formatter));
        System.out.println("China    :  " + chinaTime.format(formatter));
    }
}
