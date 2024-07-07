// import java.time.Month;

// public class EnumType {
// public static void main(String[] args) {
// // What is Enum type..?
// // --> An enum type is a special data type that enables for a variable to be
// a
// // set of predefined constants. The variable of enum type always must be
// equal
// // to one of the values that have been predefined for it.
// // When do we need enum types?
// // --> we need enum types to express some set of values that are not
// infinite.
// // you need to use enum for data sets where you know all possible values of
// // compile time.
// // e.g, seasons of the year - Winter, Spring, Summer, Fall
// // There are very low chances that you will need to add additional seasons in
// // your program because no other exists

// Priority priority = Priority.HIGH

// switch(priority) {
// case "HIGH":
// System.out.println("High priority");
// break;
// case "MEDIUM":
// System.out.println("Medium Priority");
// break;
// case "LOW":
// System.out.println("Low priority");
// break;

// Priority priority2 = Priority.valueOf("HIGH");
// System.out.println(priority2);

// priority2 = Priority.valueOf("high");// //
// java.lang.IllegalArgumentException: No enum constant
// com.itbulls.learnit.javacore.enumerations.Priority.high

// System.out.println("Priority.HIGH == Prioruty.HIGH: " + (priority ==
// priority.MEDIUM));
// System.out.println("Priority.HIGH == Priority.HIGH: "
// + (priority == Priority.HIGH));

// System.out.println("Priority.HIGH.ordinal(): " + Priority.HIGH.ordinal());
// System.out.println("Priority.HIGH.ordinal(): " + Priority.MEDIUM.ordinal());

// Priority[] values = Priority.value();

// for(Priority priority3 : values) {
// System.out.println(priority3);
// }

// System.out.println("Month.JANUARY.getDaysAmount(): " +
// Month.JANUARY.getDaysAmount());

// }
// }
// }
