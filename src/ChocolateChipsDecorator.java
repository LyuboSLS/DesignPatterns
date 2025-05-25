public class ChocolateChipsDecorator extends IceCreamDecorator {
    public ChocolateChipsDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String serve() {
        return iceCream.serve() + " с шоколадови пръчици";
    }
}
