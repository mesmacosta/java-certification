/*
 * Test if a class that implemets Serializable must really be serializable.
 *
 * Result: it doesn't.
 */

import java.io.Serializable;
class Unserializable {}

public class Test implements Serializable {
    Unserializable unserializable;
}
