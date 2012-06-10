/*
 * This exercise appears in Exam Lab Final Exam.
 *
 * Result: when trying to serialize an non-serializable object, the problem
 * will happen in runtime, not compile time.
 */
import java.io.*;

public class Forest implements Serializable {
    private static Tree tree = new Tree();
    public static void main(String []args) throws Exception {
        Forest f = new Forest();
        try {
            FileOutputStream fs = new FileOutputStream("Forest.Ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(tree); os.close();
        } catch (Exception ex) { throw ex; }
    }
}

class Tree{ }
