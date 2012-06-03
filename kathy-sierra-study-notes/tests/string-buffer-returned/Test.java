/*
 * Test if the StringBuilder returned by most methods is the same as
 * the object itself.
 *
 * Result: yes, they are the same. This is nice, because otherwise the memory
 * would be exhausted quickly.
 */
class Test {
    public static void main(String[] args) {
        StringBuilder sb  = new StringBuilder("ola");
        StringBuilder sb2 = sb.append(" mundo");
        System.out.println(sb == sb2);
    }
}
