public class ShopSingleton {
    private static ShopSingleton instance;

    private ShopSingleton() {
    }

    public static ShopSingleton getInstance() {

        synchronized (ShopSingleton.class) {
            if (instance == null) {
                instance = new ShopSingleton();
            }
        }
        return instance;
    }
    public IceCream orderIceCream(IceCreamFlavorsEnum flavor, IceCreamToppingsEnum topping) {
        IceCream iceCream = IceCreamFactory.createIcecream(flavor);
        return switch (topping) {
            case NO_TOPPING -> iceCream;
            case CHOCOLATE_COATING -> new ChocolateCoatingDecorator(iceCream);
            case CHOCOLATE_CHIPS -> new ChocolateChipsDecorator(iceCream);
            default -> throw new IllegalStateException("Не предлагаме добавка " + topping);
        };
    }
}
