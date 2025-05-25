public class IceCreamFactory {
    public static IceCream createIcecream(IceCreamFlavorsEnum flavor) {

         return switch(flavor) {
            case VANILLA -> new VanillaIceCream();
            case CHOCOLATE -> new ChocolateIceCream();
            case STRAWBERRY -> new StrawberryIceCream();
        };
    }
}
