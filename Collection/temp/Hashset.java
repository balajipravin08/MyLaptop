public class Hashset {

    // Coordinate mappings for a 3x3 grid (0-indexed)
    private static final int[][] coordinates = {
        {0, 0}, {0, 1}, {0, 2},
        {1, 0}, {1, 1}, {1, 2},
        {2, 0}, {2, 1}, {2, 2}
    };

    // Given sequence to check
    private static final int[] sequence = {1, 5, 9, 3}; // Example sequence

    public static void main(String[] args) {
        if (canFormPattern(sequence)) {
            System.out.println("Pattern can be formed.");
        } else {
            System.out.println("Pattern cannot be formed.");
        }
    }

    private static boolean canFormPattern(int[] sequence) {
        if (sequence == null || sequence.length < 2) {
            return true; // A single digit or empty sequence is trivially valid
        }

        // Check if all digits in the sequence are valid (1-9)
        for (int digit : sequence) {
            if (digit < 1 || digit > 9) {
                return false;
            }
        }

        // Validate adjacency of each consecutive pair in the sequence 
        for (int i = 1; i < sequence.length; i++) {
            if (!areAdjacent(sequence[i - 1], sequence[i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean areAdjacent(int digit1, int digit2) {
        int[] coord1 = coordinates[digit1 - 1];
        int[] coord2 = coordinates[digit2 - 1];

        int x1 = coord1[0], y1 = coord1[1];
        int x2 = coord2[0], y2 = coord2[1];

        // Check if digit2 is within one move from digit1
        return (Math.abs(x1 - x2) <= 1 && Math.abs(y1 - y2) <= 1);
    }
}

