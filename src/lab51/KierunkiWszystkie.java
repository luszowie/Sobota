package lab51;

public class KierunkiWszystkie {

    public KierunkiWszystkie(String polskaNazwa, String skrót) {
        PolskaNazwa = polskaNazwa;
        Skrót = skrót;
    }

    private String PolskaNazwa;
    private String Skrót;

    public void setPolskaNazwa(String polskaNazwa) {
        PolskaNazwa = polskaNazwa;
    }

    public void setSkrót(String skrót) {
        Skrót = skrót;
    }

    public String getPolskaNazwa() {
        return PolskaNazwa;
    }

    public String getSkrót() {
        return Skrót;
    }
}
