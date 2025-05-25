public enum DeliveryTypeEnum {
    EXPRESS("Експресна доставка"),
    STANDARD("Стандартна доставка");

    private final String description;
    DeliveryTypeEnum(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
