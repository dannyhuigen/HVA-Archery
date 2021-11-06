package nl.hva.ict.ads;

public class Archer {
    public static int MAX_ARROWS = 3;
    public static int MAX_ROUNDS = 10;


    private int id;
    private String firstName;
    private String lastName;

    // TODO add instance variable(s) to track the scores per round per arrow

    /**
     * Constructs a new instance of Archer and assigns a unique id to the instance.
     * Each new instance should be assigned a number that is 1 higher than the last one assigned.
     * The first instance created should have ID 135788;
     *
     * @param firstName the archers first name.
     * @param lastName the archers surname.
     */
    public Archer(String firstName, String lastName) {
        // TODO initialise the new archer
        //  generate and assign an new unique id
        //  initialise the scores of the archer
    }

    /**
     * Registers the points for each of the three arrows that have been shot during a round.
     *
     * @param round the round for which to register the points. First round has number 1.
     * @param points the points shot during the round, one for each arrow.
     */
    public void registerScoreForRound(int round, int[] points) {
        // TODO register the points into the archer's data structure for scores.
    }


    /**
     * Calculates/retrieves the total score of all arrows across all rounds
     * @return
     */
    public int getTotalScore() {
        // TODO calculate/get the total score that the archer has earned across all arrows of all registered rounds

        return 0;
    }

    /**
     * compares the scores/id of this archer with the scores/id of the other archer according to
     * the scoring scheme: highest total points -> least misses -> earliest registration
     * The archer with the lowest id has registered first
     * @param other     the other archer to compare against
     * @return  negative number, zero or positive number according to Comparator convention
     */
    public int compareByHighestTotalScoreWithLeastMissesAndLowestId(Archer other) {
        // TODO compares the scores/id of this archer with the other archer
        //  and return the result according to Comparator conventions

        return 0;
    }

    /**
     * Get id of the archer
     * @return id of the archer
     */
    public int getId() {
        return id;
    }

    /**
     * Set id
     * @param id the id to set
     */
    public void setId(int id) {
        //If id is not set (0) it is allowed to be assigned
        this.id = (this.id == 0) ? id : this.id;
    }

    /**
     * Get first name of archer
     * @return first name of archer
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Get last name of archer
     * @return last name of archer
     */
    public String getLastName() {
        return lastName;
    }

    // TODO provide a toSting implementation to format archers nicely
}
