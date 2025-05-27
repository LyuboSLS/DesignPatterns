import java.util.Scanner;

public class StartUpConsoleApp {
    public static void main(String[] args) {

        ShopSingleton shop = createShop();

        IceCreamFlavorsEnum flavor = chooseFlavor();
        IceCreamToppingsEnum toppingChoice = chooseTopping();

        IceCream order = shop.orderIceCream(flavor, toppingChoice);

        showOrder(order);

        delivery(order);
    }

    private static void delivery(IceCream order) {
        System.out.println("\n Доставка на: " + order.serve());
        DeliveryTypeEnum deliveryType = chooseDeliveryType();
        String address = enterAddress();
        executeDelivery(order, deliveryType, address);
    }

    private static void executeDelivery(IceCream order, DeliveryTypeEnum deliveryType, String address) {
        System.out.printf("Успешно направена поръчка на %s, %s на адрес %s",
                order.serve(),
                deliveryType.getDescription(),
                address);
    }

    private static String enterAddress() {
        System.out.println("\nВъведете адрес на доставка");
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        return address;
    }

    private static DeliveryTypeEnum chooseDeliveryType() {
        System.out.println("1. Експресна доставка (2 минути)\n2. Стандартна доставка (20 минути)");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        return switch (choice) {
            case 1 -> DeliveryTypeEnum.EXPRESS;
            case 2 -> DeliveryTypeEnum.STANDARD;
            default -> throw new IllegalStateException("Не предлагаме доставка: " + choice);
        };
    }

    private static void showOrder(IceCream order) {
        System.out.println("\nВашата поръчка:");
        System.out.println(order.serve());
    }

    private static ShopSingleton createShop() {
        ShopSingleton shop = ShopSingleton.getInstance();
        System.out.println("Добре дошли в нашия магазин за сладолед!");
        return shop;
    }

    private static IceCreamToppingsEnum chooseTopping() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nИзберете добавка:");
        System.out.println("0. Без добавка\n1. Шоколадова глазура\n2. Шоколадови пръчици");
        System.out.print("Ваш избор: ");

        int toppingChoice = scanner.nextInt();
        return switch (toppingChoice) {
            case 0 -> IceCreamToppingsEnum.NO_TOPPING;
            case 1 -> IceCreamToppingsEnum.CHOCOLATE_COATING;
            case 2 -> IceCreamToppingsEnum.CHOCOLATE_CHIPS;
            default -> throw new IllegalArgumentException("Не предлагаме такава добавка");
        };
    }

    private static IceCreamFlavorsEnum chooseFlavor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Изберете вкус:");
        System.out.println("1. Ванилия\n2. Шоколад\n3. Ягода");
        System.out.print("Ваш избор: ");

        int choice = scanner.nextInt();
        return switch (choice) {
            case 1 -> IceCreamFlavorsEnum.VANILLA;
            case 2 -> IceCreamFlavorsEnum.CHOCOLATE;
            case 3 -> IceCreamFlavorsEnum.STRAWBERRY;
            default -> throw new IllegalArgumentException("Не предлагаме такъв вкус сладолед");
        };
    }
}
