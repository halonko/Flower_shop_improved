public enum colours{
    RED("#F00"), BLUE("#00F"), WHITE("#FFF"), BLACK("#000");

    private String rgb;

    colours(String rgb) {
        this.rgb = rgb;
    }

    @Override
    public String toString() {
        return "colours{" +
                "rgb='" + rgb + '\'' +
                '}';
    }

    public String getRgb() {
        return rgb;
    }
}
