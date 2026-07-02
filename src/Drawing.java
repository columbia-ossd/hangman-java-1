public class Drawing {
    private static final String[] STAGES = {
        """
        _________
        |
        |
        |
        |
        |
        |_______________________
        """,

        """
        _________
        |       |
        |       O
        |
        |
        |
        |_______________________
        """,

        """
        _________
        |       |
        |       O
        |       |
        |
        |
        |_______________________
        """,

        """
        _________
        |       |
        |       O
        |     --|
        |
        |
        |_______________________
        """,

        """
        _________
        |       |
        |       O
        |     --|--
        |
        |
        |_______________________
        """,

        """
        _________
        |       |
        |       O
        |     --|--
        |      /
        |     /
        |_______________________
        """,

        """
        _________
        |       |
        |       O
        |     --|--
        |      / \
        |     /   \
        |_______________________
        """
    };

    public static String getDrawing(int numberOfErrors) {
        if (numberOfErrors < 0 || numberOfErrors >= STAGES.length) {
            throw new IllegalArgumentException("Invalid number of errors: " + numberOfErrors);
        }

        return STAGES[numberOfErrors];
    }
}