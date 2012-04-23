class BadFoodException extends Exception {}

public class MyException {
    public static final String[] GOOD_FOODS = {"Chocolate", "Hamburger", "Bacon"};

    public static void main(String[] args) {
        for(String food: args) {
            try {
                checkFood(food);
                System.out.println(food + " is good food!");
            }
            catch (BadFoodException ex) {
                System.out.println(food + " is bad food!");
            }
        }
    }

    public static void checkFood(String food) throws BadFoodException {
         boolean found = false;

         for(String goodFood: GOOD_FOODS) {
            if(goodFood.equals(food)) {
                found = true;
                break;
            }
         }

         if ( ! found) {
             throw new BadFoodException();
         }
    }
}
