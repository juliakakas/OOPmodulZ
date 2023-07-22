package Person;

public enum GENDER {
    MALE("férfi"),
    FEMALE("nő");
    private String hungarian;

    private GENDER(String hungarian) {
        this.hungarian = hungarian;
    }

    public String getHungarian() {
        return hungarian;
    }

    @Override
    public String toString() {
        return hungarian;
    }
}
