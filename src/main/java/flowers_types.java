public enum flowers_types {
    Romashka("Ромашка"), Troyanda("Троянда"), Tulpan("Тюльпан"), Rosa("Роза");
    private String Type;

    flowers_types( String Type) {
        this.Type = Type;
    }

    public String getType() {
        return Type;
    }

    @Override
    public String toString() {
        return "flowers_types{" +
                "Type='" + Type + '\'' +
                '}';
    }
}
