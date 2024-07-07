public class Input_output_Interview {
    // ? Part 1: Java I/O Interview - Questions and Answers
    // WHAT TYPES OF I/O STREAMS ARE THERE?

    // I/O streams are used to transfer data to file streams, to the console, or to
    // network connections. There are two kinds of I/O streams: byte and character.

    // WHAT IS THE DIFFERENCE BETWEEN I/O AND NIO?

    // I / O (input / output, input-output) - the interaction between the
    // information processor and its provider and / or recipient. Input is the
    // signal or data received by the handler, and output is the signal or data sent
    // by (or from) it.

    // NIO (/*in the context of Java*/ Non-blocking I/O, New I/O) is a collection of
    // application programming interfaces for the Java language designed to
    // implement high-performance I/O operations.

    // WHAT FEATURES OF NIO DO YOU KNOW?

    // Key features of NIO:

    // Channels and Selectors: NIO supports various types of channels. A pipe is an
    // abstraction of lower-level file system objects (such as memory-mapped files
    // and file locks) that allow data to be transferred at a faster rate. Channels
    // are non-blocking, and therefore Java provides other tools such as a selector,
    // which allows you to choose a ready channel for data transfer, and a socket,
    // which is a tool for blocking.

    // Buffers: Java 7 introduced buffering for all primitive wrapper classes
    // (except Boolean). An abstract Buffer class has appeared, which provides
    // operations such as clear, flip, mark, etc. Its subclasses provide methods for
    // getting and setting data.

    // Encodings: Java 7 introduced encodings (java.nio.charset), encoders and
    // decoders for displaying Unicode bytes and characters.

    // NAME THE MAIN CLASSES OF I/O STREAMS.

    // Byte streams: java.io.InputStream, java.io.OutputStream;

    // Character streams: java.io.Reader, java.io.Writer;

    // HOW ARE OUTPUTSTREAM, INPUTSTREAM, WRITER AND READER DIFFERENT?

    // The OutputStream class is an abstract class that defines streaming byte
    // output. This category contains classes that define whether your data is going
    // into a byte array (but not directly to a String; you are supposed to be able
    // to create it from a byte array), to a file, or to a pipe.

    // The base class InputStream represents classes that receive data from various
    // sources:

    // byte array

    // string

    // file

    // channel (pipe): data is placed at one end and retrieved from the other

    // a sequence of different streams that can be combined into a single stream

    // other sources (for example, internet connection)

    // Character streams have two main abstract classes, Reader and Writer, that
    // manage streams of Unicode characters. The Reader class is an abstract class
    // that defines character stream input. The Writer class is an abstract class
    // that defines character stream output. In case of errors, all methods of the
    // class throw an IOException.

    // WHICH SUBCLASSES OF THE INPUTSTREAM BASE CLASS DO YOU KNOW WHAT THEY ARE FOR?

    // Popular Subclasses of the base InputStream class:

    // StringBufferInputStream - turns a string (String) into an InputStream.

    // SequenceInputStream - merges two or more InputStreams into a single stream.

    // PushbackInputStream - an input stream that supports a one-byte return to the
    // input stream.

    // PipedInputStream - implements the concept of an input channel.

    // ObjectInputStream - input stream for objects.

    // InputStream is an abstract class that describes an input stream.

    // FilterInputStream is an abstract class that provides an interface for add-on
    // classes that add useful properties to existing streams.

    // FileInputStream - for reading information from a file.

    // DataInputStream - An input stream that includes methods for reading standard
    // Java data types.

    // ByteArrayInputStream - allows you to use an in-memory buffer (byte array) as
    // the data source for the input stream.

    // BufferedInputStream - buffered input stream.

    // WHAT DO YOU KNOW ABOUT RANDOMACCESSFILE?

    // RandomAccessFile is a class that inherits directly from Object and does not
    // inherit from the I/O base classes above. Designed to work with files,
    // supporting random access to their contents.

    // Working with the RandomAccessFile class is similar to using the
    // DataInputStream and DataOutputStream streams combined in the same class (they
    // implement the same DataInput and DataOutput interfaces). In addition, the
    // seek() method allows you to move to a specific position and change the value
    // stored there.

    // When using RandomAccessFile, you need to know the structure of the file. The
    // RandomAccessFile class contains methods for reading and writing UTF-8
    // primitives and strings.

    // WHAT FILE ACCESS MODES DO RANDOMACCESSFILE HAVE?

    // RandomAccessFile can be opened in read ("r") or read/write ("rw") mode. There
    // is also an "rws" mode where the file is opened for read/write operations and
    // every change to the file's data is immediately written to the physical
    // device.

    // WHICH SUBCLASSES OF THE BASE CLASS OUTPUTSTREAM DO YOU KNOW WHAT THEY ARE
    // FOR?

    // The OutputStream class is an abstract class that defines streaming byte
    // output.

    // This category contains classes that define whether your data is going to a
    // byte array (but not directly to a String; you are supposed to be able to
    // create it from a byte array), to a file, or to a pipe.

    // Subclasses of the base class OutputStream:

    // PipedOutputStream - implements the concept of an output channel.

    // ObjectOutputStream - output stream for objects

    // FilterOutputStream is an abstract class that provides an interface for add-on
    // classes that add useful properties to existing streams.

    // FileOutputStream - send data to a file on disk. Implementation of the
    // OutputStream class.

    // DataOutputStream - An output stream that includes methods for writing
    // standard Java data types.

    // ByteArrayOutputStream - Creates an in-memory buffer. All data sent to this
    // stream is placed in the created buffer.

    // BufferedOutputStream - buffered output stream.

    // WHAT IS PUSHBACKINPUTSTREAM USED FOR?

    // A type of buffering that reads a byte and then returns it to the stream. The
    // PushbackInputStream class provides a mechanism to "look" into the input
    // stream and see what will come from there next time without extracting
    // information.

    // The class has an additional unread() method.

    // WHAT IS SEQUENCEINPUTSTREAM USED FOR?

    // The SequenceInputStream class allows multiple instances of the InputStream
    // class to be chained together. The constructor takes as an argument either a
    // pair of objects of the InputStream class or the Enumeration interface.

    // During operation, the class makes requests to read from the first object of
    // the InputStream class to the end, and then switches to the second. When using
    // the interface, work will continue on all objects of the InputStream class.
    // When the end of each file is reached, the associated stream is closed.
    // Closing a stream created by an object of the SequenceInputStream class closes
    // all open streams.

    // WHICH SUBCLASS OF THE READER BASE CLASS DO YOU KNOW WHAT THEY ARE FOR?

    // Subclasses of the Reader base class:

    // StringReader is an input stream reading from a string.

    // Reader is an abstract class that describes character input.

    // PushbackReader is an input stream that allows characters to be pushed back
    // into the stream.

    // PipedReader - input channel.

    // LineNumberReader - an input stream that counts lines.

    // InputStreamReader - an input stream that translates bytes into characters.

    // FilterReader - filter reader.

    // FileReader is an input stream that reads a file.

    // CharArrayReader - an input stream that reads from a character array.

    // BufferedReader - buffered input character stream.

    // WHICH SUBCLASSES OF THE WRITER BASE CLASS DO YOU KNOW WHAT THEY ARE FOR?

    // Subclasses of the Writer base class:

    // Writer - an abstract class that describes character output

    // StringWriter - the output stream writing to the string

    // PrintWriter - output stream including print() and println() methods

    // PipedWriter - the output pipe

    // OutputStreamWriter - output stream that translates bytes into characters

    // FilterWriter - filter writer

    // FileWriter - the output stream that writes to the file

    // CharArrayWriter - the output stream that writes to the character array

    // BufferedWriter - buffered output character stream

    // ? Part 2: Java I/O Interview - Questions and Answers

    // WHAT IS THE ABSOLUTE PATH AND RELATIVE PATH?

    // An absolute path is a path that points to the same location in the file
    // system, regardless of the current directory. The full path always starts from
    // the root directory.

    // A relative path is a path relative to the current working directory.

    // IN WHAT PACKAGES DO THE I/O CLASSES BE IN?

    // The standard I/O classes in Java are in the java.io.* package. JDK 7 added a
    // more modern way of working with threads called Java NIO or Java New IO, these
    // classes are in the java.nio.* package. To work with archives, classes from
    // the java.util.* package are used.

    // WHAT DO YOU KNOW ABOUT I/O WRAPPER CLASSES?

    // I/O wrapper classes are classes that add useful additional properties to
    // existing streams.

    // Class examples: BufferedOutputStream, BufferedInputStrem, BufferedWriter ,
    // BufferedReader - buffer the stream and improve performance.

    // WHICH CLASS ALLOWS READING DATA FROM INPUT BYTESTREAM IN THE FORMAT OF
    // PRIMITIVE DATA TYPES?

    // To read byte data (not strings), use the DataInputStream class. In this case,
    // you must use the classes from the InputStream group.

    // The getBytes() method is provided in the String class to convert a string
    // into an array of bytes suitable for putting into a ByteArrayInputStream. The
    // resulting ByteArrayInputStream is an InputStream suitable for passing the
    // DataInputStream.

    // When reading characters byte-by-byte from a formatted DataInputStream using
    // the readByte() method, any value received will be considered valid, so the
    // return value is not applicable to identify the end of the stream. Instead,
    // you can use the available() method, which tells you how many characters are
    // left.

    // The DataInputStream class allows you to read primitive data types from a
    // stream through the DataInput interface, which defines methods that convert
    // elementary values ​​to a sequence of bytes. Such streams make it easy to
    // store binary data in a file.

    // WHICH CLASS-SUPPLIERS ALLOW TO ACCELERATE READ/WRITE BY USE OF THE BUFFER?

    // For this, classes are used that allow buffering the stream:

    // java.io.BufferedInputStream - buffered input stream. Constructors:
    // BufferedInputStream(InputStream in), BufferedInputStream(InputStream in, int
    // size).

    // java.io.BufferedOutputStream - buffered output stream. Constructors:
    // BufferedOutputStream(OutputStream out), BufferedOutputStream(OutputStream
    // out, int size).

    // java.io.BufferedReader - buffered input character stream. Constructors:
    // BufferedReader(Reader r), BufferedReader(Reader in, int sz).

    // java.io.BufferedWriter - buffered output character stream. Constructors:
    // BufferedWriter(Writer out), BufferedWriter(Writer out, int sz).

    // WHAT IS THE DIFFERENCE OF THE PRINTWRITER CLASS FROM PRINTSTREAM?

    // First of all, the PrintWriter class uses an improved way of working with
    // UNICODE characters and a different output buffering mechanism.

    // In the PrintStream class, the output buffer was flushed whenever the print or
    // println method was called. When using the PrintWriter class, you can disable
    // automatically flushing buffers by doing it explicitly with the flush method.

    // The PrintWriter class provides two constructors that allow you to work with
    // the output streams of the OutputStream class:

    // public PrintWriter(OutputStream out); - creates a stream without
    // automatically flushing buffers.

    // public PrintWriter(OutputStream out, boolean autoFlush); - the way buffers
    // are flushed when using the second constructor depends on the value of the
    // autoFlush parameter. If it is true, automatic flushing of buffers is
    // performed, and if it is false, it is not.

    // The set of implementations of the main print and println methods of the
    // PrintWriter class is similar to the set of implementations of these methods
    // of the PrintStream class.

    // WHICH CLASS IS INTENDED TO WORK WITH FILE SYSTEM ELEMENTS?

    // Unlike most I/O classes, the File class does not work with streams, but
    // directly with files. This class allows you to get information about the file:
    // access rights, time and date of creation, directory path. And also to
    // navigate through the hierarchies of subdirectories.

    // The java.io.File class can represent the name of a specific file, as well as
    // the names of a group of files found in a directory. If the class represents a
    // directory, then its list() method returns an array of strings with the names
    // of all the files.

    // You can use one of the following constructors to create objects of the File
    // class.

    // File(File dir, String name) - you specify object of class File (the directory
    // where file is located) and file name are specified

    // File(String path) - specify the path to the file without specifying the file
    // name

    // File(String dirPath, Sring name) - specifies the path to the file and the
    // file name

    // File(URI url) - specifies the URI object describing the file

    // WHICH CHARACTER IS THE DIVIDER FOR A PATH IN A FILE SYSTEM?

    // The delimiter symbol differs for different systems. You can pull it out from
    // the property of the static field File.separator. For Windows it is "\".

    // WHICH FILE CLASS METHODS DO YOU KNOW?

    // The File class has a lot of methods, let's list some of them.

    // getAbsolutePath() - the absolute path of the file, starting from the system
    // root. In Android, the root element is the slash character (/)

    // canRead() - verifies whether the file is available for reading

    // canWrite() - available for writing

    // exists() - file exists or not

    // getName() - returns the file name

    // getParent() - returns the name of the parent directory

    // getPath() - path

    // lastModified() - last modified date

    // isFile() - the object is a file, not a directory

    // isDirectory() - the object is a directory

    // isAbsolute() - returns true if the file has an absolute path

    // renameTo(File newPath) - Renames a file. The parameter specifies the name of
    // the new file name. If the rename was unsuccessful, then false is returned.

    // delete() - deletes a file. You can also delete an empty directory

    // WHAT DO YOU KNOW ABOUT THE FILEFILTER INTERFACE?

    // The FileFilter interface is used to check if a File object matches a certain
    // condition. This interface contains a single boolean accept(File pathName)
    // method. This method must be overridden and implemented.

    // WHICH CLASSES ALLOW OBJECTS TO ARCHIVE?

    // DeflaterOutputStream, InflaterInputStream, ZipInputStream, ZipOutputStream,
    // GZIPInputStream, GZIPOutputStream.

    // WHAT IS SERIALIZATION?

    // Serialization is the process of reading or writing an object. It is the
    // process of saving the state of an object and reading that state. To implement
    // serialization, you need to implement an interface - the Serializable marker
    // interface. The reverse operation - translating bytes into an object, is
    // called deserialization.

    // HOW TO EXCLUDE FIELDS FROM SERIALIZATION?

    // In order to exclude fields from the serializable stream, it is necessary to
    // mark the field with the transient modifier.

    // TRANSIENT WHAT DOES IT MEAN?

    // Class properties marked with the transient modifier are not serialized.
    // Typically, such fields store the intermediate state of the object, which, for
    // example, is easier to calculate than to serialize and then deserialize.
    // Another example of such a field is a reference to an instance of an object
    // that does not require or cannot be serialized.

    // WHAT IS THE ROLE OF THE SERIALVERSIONUID FIELD IN SERIALIZATION?

    // The private static final long serialVersionUID field contains the unique
    // version identifier of the serialized class. It is calculated from the
    // contents of the class - the fields, their declaration order, the methods,
    // their declaration order. Accordingly, with any change in the class, this
    // field will change its value.

    // This field is written to the stream when the class is serialized. By the way,
    // this is perhaps the only known case when a static field is serialized.

    // WHAT CLASSES ALLOW TO CONVERT BYTE STREAMS TO CHARACTER AND BACK?

    // The OutputStreamWriter is a bridge between the OutputStream class and the
    // Writer class. Characters written to the stream are converted to bytes.

    // InputStreamReader - analogue for reading. Using the methods of the Reader
    // class, bytes are read from the InputStream and then converted into
    // characters.

    // HOW TO CHANGE THE STANDARD SERIALIZATION/DESERIALIZATION BEHAVIOR?

    // In most cases, we do not define behavior manually, but rely on the standard
    // implementation, and it is very inconvenient to constantly override some
    // serialization methods + constantly monitor the addition of new fields, add
    // them to methods. Well and specially for these purposes - there is
    // Externalizable.

    // However, we know that you can change the default behavior of serialization by
    // predefining and placing two methods in your class files:

    // private void writeObject(ObjectOutputStream out) throws IOException;

    // private void readObject(ObjectInputStream in) throws IOException,
    // ClassNotFoundException;

    // Note that both methods are declared private as this ensures that the methods
    // are not overridden or overloaded. The whole trick is that the virtual
    // machine, when calling the corresponding method, automatically checks if they
    // were declared in the object class. The virtual machine can call the private
    // methods of your class at any time, but other objects cannot. This ensures the
    // integrity of the class and the normal operation of the serialization
    // protocol.

    // HOW TO CREATE YOUR OWN SERIALIZATION PROTOCOL?

    // Instead of implementing the Serializable interface, you can implement the
    // Externalizable interface, which contains two methods:

    // public void writeExternal(ObjectOutput out) throws IOException;

    // public void readExternal(ObjectInput in) throws IOException,
    // ClassNotFoundException;

    // To create your own protocol, you just need to override these two methods.
    // Unlike the other two serialization options, nothing is done automatically
    // here. The protocol is completely in your hands. Although this is the most
    // difficult method, it is also brings you the most controll over serialization
    // process.

    // WHAT IS THE PROBLEM OF SERIALIZING SINGLETON OBJECTS?

    // The problem is that after deserialization we will get another object. So
    // serialization makes it possible to create a Singleton again, which is not
    // what we want when we design singleton. Of course, you can forbid serializing
    // Singletons, but this, in fact, is an avoidance of the problem, not a solution
    // to it.

    // The solution is the following. The class defines a method with the following
    // signature:

    // <ANY_ACCESS_MODIFIER> readResolve() throws ObjectStreamException;

    // The access modifier can be private, protected, and default. The purpose of
    // this method is to return a replacement object instead of the object on which
    // it is called.
}
