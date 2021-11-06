package nl.hva.ict.ads;

import java.util.Comparator;

public class Archer implements Comparator<Archer> {
    public static int MAX_ARROWS = 3;
    public static int MAX_ROUNDS = 10;
    public static int ARCHER_ID_INDEX = 0;

    private final int id;
    private String firstName;
    private String lastName;

    //1st array is the round second array is the arrows
    private int[][] score;

    /**
     * Constructs a new instance of Archer and assigns a unique id to the instance.
     * Each new instance should be assigned a number that is 1 higher than the last one assigned.
     * The first instance created should have ID 135788;
     *
     * @param firstName the archers first name.
     * @param lastName the archers surname.
     */
    public Archer(String firstName, String lastName) {
        this.id = ARCHER_ID_INDEX;
        this.firstName = firstName;
        this.lastName = lastName;
        score = new int[10][2];

        Archer.ARCHER_ID_INDEX++;
    }

    /**
     * Registers the points for each of the three arrows that have been shot during a round.
     *
     * @param round the round for which to register the points. First round has number 1.
     * @param points the points shot during the round, one for each arrow.
     */
    public void registerScoreForRound(int round, int[] points) {
        this.score[round - 1] = points.clone();
        // TODO register the points into the archer's data structure for scores.
    }


    /**
     * Calculates/retrieves the total score of all arrows across all rounds
     * @return
     */
    public int getTotalScore() {
        int totalscore = 0;
        for (int[] round: this.score) {
            for (int score: round) {
                totalscore+= score;
            }
        }
        return totalscore;
    }

    public int getTotalMisses() {
        int totalMisses = 0;
        for (int[] round: this.score) {
            for (int score: round) {
                if (score == 0) {
                    totalMisses++;
                }
            }
        }
        return totalMisses;
    }

    /**
     * compares the scores/id of this archer with the scores/id of the other archer according to
     * the scoring scheme: highest total points -> least misses -> earliest registration
     * The archer with the lowest id has registered first
     * @param other     the other archer to compare against
     * @return  negative number, zero or positive number according to Comparator convention
     */
    public int compareByHighestTotalScoreWithLeastMissesAndLowestId(Archer other) {
        int a1TotalScore = this.getTotalScore();
        int a2TotalScore = other.getTotalScore();
        if (a1TotalScore != a2TotalScore) return a2TotalScore - a1TotalScore;
        int a1TotalMisses = this.getTotalMisses();
        int a2TotalMisses = other.getTotalMisses();
        if (a1TotalMisses != a2TotalMisses) return a1TotalMisses - a2TotalMisses;
        else return this.getId() - other.getId();
    }

    /**
     * Get id of the archer
     * @return id of the archer
     */
    public int getId() {
        return id;
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

    @Override
    public String toString() {
        return this.getId()
                + " (" + this.getTotalScore() + ") "
                + this.getFirstName() + " " + this.getLastName();
    }

    @Override
    public int compare(Archer a1, Archer a2) {
        int a1TotalScore = a1.getTotalScore();
        int a2TotalScore = a2.getTotalScore();
        if (a1TotalScore != a2TotalScore) return a1TotalScore - a2TotalScore;
        int a1TotalMisses = a1.getTotalMisses();
        int a2TotalMisses = a2.getTotalMisses();
        if (a1TotalMisses != a2TotalMisses) return a1TotalMisses - a2TotalMisses;
        else return a1.getId() - a2.getId();
    }
}
