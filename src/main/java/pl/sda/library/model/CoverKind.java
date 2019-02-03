package pl.sda.library.model;

public enum CoverKind {

    SOFT("miękka"),HARD("twarda");

    private String name;

    CoverKind(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
