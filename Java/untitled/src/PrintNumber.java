public class PrintNumber {
        public static void main(String[] args) {
            long startTime = System.currentTimeMillis();

            for (long i = 1; i <= 1_000_00L; i++) {
                System.out.println(i);
            }

            long endTime = System.currentTimeMillis();

            double timeTakenInSeconds = (endTime - startTime) / 1000.0;
            System.out.printf("Time taken: %.2f seconds%n", timeTakenInSeconds);
        }
    }
