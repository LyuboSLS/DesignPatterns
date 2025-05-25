public class ChocolateCoatingDecorator extends IceCreamDecorator{
    public ChocolateCoatingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String serve() {
        return iceCream.serve() + " с шоколадова глазура";
    }
}
