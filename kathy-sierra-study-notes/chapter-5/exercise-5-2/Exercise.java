class Exercise {
    public static void main(String[] args) {
        int age = 0;
        outer: while (age <= 21) {
            age++;
            if (age == 16) {
                System.out.println("get your driver's license");
                continue outer;
            }
            System.out.println("Another year");
        }
    }
}
