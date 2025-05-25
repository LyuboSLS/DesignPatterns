public class IceCreamFactory {
    public static IceCream createIcecream(IceCreamFlavorsEnum flavor) {

         return switch(flavor) {
            case VANILLA -> new VanillaIceCream();
            case CHOCOLATE -> new ChocolateIceCream();
            case STRAWBERRY -> new StrawberryIceCream();

            default -> throw new IllegalArgumentException("За съжаление все още не предлагаме този вкус");
        };
    }
}
