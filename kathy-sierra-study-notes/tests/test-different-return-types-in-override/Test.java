/*
 * Test if a different return type would be valid in overridding.
 *
 * Result: it isn't. The return type must be compatible (child class).
 */
class Parent {
    public void doIt() {
        
    }
}

public class Test extends Parent {
    public String doIt(){
        
    }
}
