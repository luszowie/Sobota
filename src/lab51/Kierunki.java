package lab51;

public enum Kierunki {
    NORTH("Północ", "N"),
    SOUTH("Południe", "S"),
    WEST("Zachód", "W"),
    EAST("Wschód", "S"),
    NORTHWEST("Północny zachód", "NW" ),
    NORTHEAST("Północny wschód", "NE"),
    SOUTHWEST("Południowy zachód", "SW"),
    SUTHEAST("Południowy wschód", "SE");

    private String PolskaNazwa;
    private String Skrót;

    Kierunki(String polskaNazwa, String skrót) {
        PolskaNazwa = polskaNazwa;
        Skrót = skrót;
    }

    public String getPolskaNazwa() {
        return PolskaNazwa;
    }

    public String getSkrót() {
        return Skrót;
    }
}
