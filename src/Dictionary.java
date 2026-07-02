import java.util.Random;

public class Dictionary {
    private static final String[] WORDS = {
        "Seattle", "Spokane", "Tacoma", "Vancouver", "Bellevue", "Kent",
        "Everett", "Renton", "Yakima", "Kirkland", "Bellingham", "Auburn",
        "Redmond", "Lakewood", "Shoreline", "Olympia", "Bothell", "Edmonds",
        "Lynnwood", "Pullman", "Mukilteo", "Monroe", "Snoqualmie",
        "Leavenworth", "Arlington", "Brier", "Snohomish"
    };

    private static final Random RANDOM = new Random();

    public String getRandomWord() {
        return WORDS[RANDOM.nextInt(WORDS.length)];
    }

    public String getCategory() {
        return "Washington State cities";
    }
}