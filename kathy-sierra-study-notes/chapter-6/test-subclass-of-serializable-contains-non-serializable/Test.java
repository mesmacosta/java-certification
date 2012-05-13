/*
 * Test the behavior of a child class that has a non-serializable
 * propety if it extends a Serializable parent.
 *
 * Result: Everything compiles ok. Of course, when the class would
 * be serialized, I would get a runtime exception.
 */

import java.io.*;

class Parent implements Serializable {
    
}

class NotSerializable {}

public class Test extends Parent {
    public NotSerializable notSerializable;
}
