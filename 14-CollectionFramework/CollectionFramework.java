
public class CollectionFramework {
    public static void main(String[] args) {
        // What does JCF consist of -> is a unified name for the group of the types and
        // alogrithms that are developed to stroe elements in them and perform
        // manipulations on the group of the objects, include collection interfaces -->
        // UML/:class diagram, abstract methods, default methods, source code
        // Collection interface extends Iterable interface
        // iterator() : Iterator<T> ---- Collection<E>
        // size() : int
        // isEmpty() : boolean
        // contains(o : Object) : boolean
        // toArray() : Object[]
        // toArray(a:T[]) : T<T>[]
        // add(e:E): boolean
        // remove(o:Oject):void
        // containsAll(c:Collection<?>):boolean
        // addAll(c:Collection<?extendsE>) : boolean
        // removeAll(c : Collection<?>): boolean
        // retainAll(c: Collection<?>) : boolean
        // clear() : void
        // equals(o : Object) : boolean
        // hashCode() : int

        // Methods list --> size, isEmpty, contains, toArray, toArray(T[] arr), add(E
        // element), remove(Object o), containsAll(Collection c),addAll(Collection c),
        // removeAll(Collection c), retainAll(Collection c), clear, equals(Object o),
        // hashCode(), iterator

        // implementation of collection interfaces, map interfaces, implementation of
        // map interfaces, deprecated collections, algorithms, wrappers.
        // These are abtract data types that describes the type that my group, multiple
        // elements in the single unit

        // Collections VS arrays
        // -> Collections: Dynamic size, Algorithms for data manipulations, single api,
        // can work only with refrence types, relatively lower performance
        // -> Arrays: Fixed size, No any behavior, No single api, can work with
        // reference an primitive types, higher performance

        // Advantages of collections over arrays
        // Collection VS Map

        // Interfaces List, Queue, & Set
        // abstract List methods --> get(index : int) : E, set(index : int, element:E) :
        // void, indexOf(o:Object) : int, lastIndexOf(o : Object) : int,
        // listIterator(index: int) : ListIterator<E>, subList(fromIndex : int, toIndex
        // : int) : List<E>
        // List --> implement -> ArrayList class, linkedList class, Stack class, Vector
        // class
        // Set -> implements -> EnumSet class, HashSet class, LinkedHashSet class,
        // TreeSet class
        // Queue -> implements -> ArrayDeque class -> LinkedList class -> priorityQueue
        // class
        // abtract methods -> offer(e : E) : boolean, remove() : E - retrives and
        // removes the head of the queue. Throws an exception if queue is empty, poll()
        // : E -> retrives and removes the head of the queue.If queue is empty - returns
        // null, element() : E - retrieves but doesn't remove the head of the queue.
        // Throws an exception if queue is empty, peek() : E -> retrieves but doesn't
        // remove the head of the queue. Returns null is queue is empty

        // Main descendants of collection interface
        // Class diagram of collection hierarchy
        // list interface
        // Set interface
        // Queue interface
        // FIFO principle

        // List implementation
        // Eclipse - investigate hierarchy, ArrayList, Vector, CopyOnWriteArrayList,
        // Stack, Marker interface : Random Access, Real examples of using list
        // implementation, Comparison of list implementations

        // Advantages of List Interface -> Support of data manipulation by element's
        // index, List implementation may contain duplicates, possiblity to create
        // sub-lits, sorting, wide range of use

        // list hierarchy -> Collection

        // ArrayList extension -> default capacity of arraylist is ten, when arraylist
        // is full - new arralist object is created, elemnets from the original array
        // are copied to the new array, when new array is full - flow repeats

        // Linkedlist vs arraylist
        // When to use ArrayList and LinkedList
        // ArrayList -> we have to opt for ArrayList if we plan add elements to the end
        // of the list and read them by index
        // LinkedList -> We have to opt for LinkedList when we plan to add elements to
        // the beginning of the list and remove them from the beginning of the list

        // how linkedlist works
        // source code review of the linkedlist class
        // how to use generics
        // diamond operator
        // big o notation
        // linkedlist vs arrayList
        // when to use specific list implementation

    }
}
