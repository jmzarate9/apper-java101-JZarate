public class CategoryEnum {

    public static void main(String[] args) {
        Category chosenCategory = Category.GRANDPA;
        double price = 0;

        switch (chosenCategory) {
            case MEN:
                price = 13.57;
                break;
            case WOMEN:
                price = 20.45;
                break;
            case KID:
                price = 45.6;
                break;
            case GRANDMA:
                price = 56.67;
                break;
            case GRANDPA:
                price = 3.56;
                break;
        }

        System.out.println("The price for " +  chosenCategory + " is " + price);

    }

    public enum Category {
        MEN, WOMEN, KID, GRANDMA, GRANDPA
    }

}
