public enum IceCreamFlavorsEnum {
    CHOCOLATE("Шоколад"),
    VANILLA("Ванила"),
    STRAWBERRY("Ягода");

    private final String flavor;
    IceCreamFlavorsEnum(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }
}
