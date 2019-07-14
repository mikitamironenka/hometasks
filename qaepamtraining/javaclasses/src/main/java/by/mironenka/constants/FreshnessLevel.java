package by.mironenka.constants;

public enum FreshnessLevel {

    ONE(1),
    TWO(2),
    THREE(3);

    private final int level;

    FreshnessLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
