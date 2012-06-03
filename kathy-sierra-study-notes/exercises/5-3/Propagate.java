class Propagate {
    static String reverse(String s) throws Exception {
        if (s.length() == 0)
            throw new Exception("Tried to reverse an string of length 0.");

        String reverseStr = "";

        for (int i = s.length() - 1; i >= 0; --i)
            reverseStr += s.charAt(i);

        return reverseStr;

    }

    public static void main(String[] args) {
        try {
            System.out.println(reverse("Cris"));
            System.out.println(reverse(""));
        }
        catch(Exception e) {
            System.out.println("Exception caught.");
        }
        finally {
            System.out.println("End of Propagate.");
        }
    }
}
