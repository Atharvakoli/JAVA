
public class TimeStandards {
    public static void main(String[] args) {

        // Time Standards, Date, Calendar, & TimeZone from java.util package

        // What is GMT and UTC time
        // java.util.Calender
        // java.util.Date
        // Unix Epoch / Unix Time
        // Convert Date and Calendar between each other
        // Date parsing
        // Date formatting
        // java.text.SimpleDateFormat
        // java.util.TimeZone
        // Overview of drawbacks of Date and Calendar
        // Disadvantage - Thread safety - The Date and Calendar classes are not thread
        // safe
        // API design and ease of understanding
        // Zoned date and time

        // java.time pakage
        // java.time pakage Overview
        // Api includes - Date and Time, Date without Time, Time without Date, Offset
        // from UTC, Time Zone, Durations, Periods, Formatting and parsing, A selection
        // of calendar systems
        // JSR-310
        // java.time classes classification -> Mahine-Scale Time --> Instant on the
        // time-line, Duration - A duration of time
        // Human-Scale Time - LocalDate - A date, with no time, LocalTime - A time, with
        // no date, LocalDateTime - A date-time, OffsetTime (13:45:30.123456789+02:00
        // Europe/Paris) - A date-time, zone-offset and time-zone, ZoneOfset - An offset
        // from the time in UTC/GMT, Zoneld - A time-zone identifier, used to find the
        // underlying rules
        // Api Naming Convention -> get - Gets the specified value, with - Returns a
        // copy of the object with the specified value changed. e.g such methods as
        // withHour, withSecond that set the specific value to a particular time unit,
        // plus/minus - Returns a copy of the object with the specified value
        // added/negated, to - converts the object to another related type, at - Returns
        // a new object consisting of this date-time at the specified argument, acting
        // as the builder pattern, of - Factory methods that don't involve data
        // conversion, from - Factory methods that do involve data conversion
        // java.time.instant
        // java.time.temporal package
        // Comparing dates
        // java.time.ZonedDateTime
        // java.time.LocalDateTime
        // java.OffsetDateTime
        // java.time.Clock
        // java.time.Duration
        // java.time.Period
    }
}
