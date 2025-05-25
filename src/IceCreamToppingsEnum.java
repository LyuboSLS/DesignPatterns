public enum IceCreamToppingsEnum {
    NO_TOPPING("Без добавки"),
    CHOCOLATE_COATING("Шоколадова глазура"),
    CHOCOLATE_CHIPS("Шоколадови пръчици");

    private final String topping;
    IceCreamToppingsEnum(String topping) {
        this.topping = topping;
    }
    public String getTopping() {
        return topping;
    }
}
