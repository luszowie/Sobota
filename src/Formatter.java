public enum Formatter {
    CALM {
        @Override
        public String format(String massege) {
            return "To jest Twoja Wiadomość" + massege;
        }
    },
    NERVOUS {
        @Override
        public String format(String massege) {
            return "Przestań" + massege;
        }
    };

    public abstract String format (String massege);
}
