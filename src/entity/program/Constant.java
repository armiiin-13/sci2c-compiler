package entity.program;

public class Constant{
    private String value;
    private String name;

    public Constant(String value, String name) {
        this.value = value;
        this.name = name;
    }

    private String convertFortranValueToC(String value) {
        if (value == null) {
            return null;
        }

        if (value.startsWith("b`") && value.endsWith("`")) {
            return "0b" + value.substring(2, value.length() - 1);
        }

        if (value.startsWith("o`") && value.endsWith("`")) {
            return "0" + value.substring(2, value.length() - 1);
        }

        if (value.startsWith("z`") && value.endsWith("`")) {
            return "0x" + value.substring(2, value.length() - 1);
        }

        return value;
    }

    public String getValue() {
        return value;
    }

    public String getCValue() {
        return convertFortranValueToC(value);
    }


    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}