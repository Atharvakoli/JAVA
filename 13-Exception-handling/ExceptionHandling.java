public class ExceptionHandling {
    public static void main(String[] args) {

        // What is an exception
        // -> Imagine that you wrote the login for your online store, and the content
        // managers may now upload information about products to your program manager,
        // store information about products and specific files with GSV format that is
        // comma separated values format that is widely used in transferring and storing
        // data will face with files of such format in the near future will not focus on
        // the specificfile format just imagine that managers can upload information
        // with products to your program, by passing a specific file And what if manager
        // parse the file name and file past that does not exist on the file system at
        // all That is exceptional case. Your program does nothave predefined logic by
        // default to handle that is called exception. Your program can't predict that
        // users who will interact with your program will pass invalid link to the file.
        // It is not an issue of your application that is technical limitations at all
        // Users should respect. But what to do in this case, they have to catch this
        // exceptional case and write a code that will tell what to do next

        // Hierarchy of exceptions
        // -> Error - OutOfMemoryError - ThreadDeath - StackOverflowError
        // Throwable -> Exceptions -> RuntimeException - NullPointerException -
        // lllegalArgumentException - NoSuchElementException - ArithmeticException -
        // ClassCastException - ArrayIndexOutOfBoundsException -> IOException ->
        // SQLException

        // Checked/Unchecked exceptions

        // Exceptions handling
        // How to catch exceptions
        // try - catch block exceptions
        // try - catch block
        // try- catch block with multiply catch clause
        // try- catch block with multiply catch blocks
        // Unreachable catch block
        // try - catch - finally block
        // try - finally
        // when finally is not executed
        // throws
        // throws and inheritance
        // throw an exception
        // throw wrapped checked exception
        // throwable API
        // create own exception
    }
}