import java.util.Random;

// Custom exception class that extends Exception and includes iteration count
class IterationException extends Exception {
    private final int iterationCount;

    public IterationException(String message, int iterationCount) {
        super(message);
        this.iterationCount = iterationCount;
    }

    public int getIterationCount() {
        return iterationCount;
    }
}

public class RandomExceptionExample {

    // Method that throws ArithmeticException at a random iteration
    public void randomIteration(int iteration) throws IterationException {
        Random random = new Random();
        if (random.nextBoolean()) {
            throw new IterationException("ArithmeticException occurred", iteration);
        }
    }

    // Calling method that performs a for loop and calls randomIteration method
    public void performIterations(int numIterations) {
        for (int i = 0; i < numIterations; i++) {
            try {
                randomIteration(i);
            } catch (IterationException e) {
                System.out.println("Exception caught at iteration: " + e.getIterationCount());
                System.out.println("Exception message: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        RandomExceptionExample example = new RandomExceptionExample();
        example.performIterations(10); // Perform 10 iterations
    }
}
