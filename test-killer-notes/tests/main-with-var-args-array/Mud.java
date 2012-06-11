/*
 * Can an var-arg method be defined without the space between
 * the ellipsis and the arg name?
 *
 * Result: yes, this is valid!
 */
class Mud {
    public static void main(String...args) {
        System.out.println("hi");
    }
}
