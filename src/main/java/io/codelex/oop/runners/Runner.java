package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(61, 80),
    INTERMEDIATE(41, 60),
    ADVANCED(1, 40);

    int minMarathonRunTime;
    int maxMarathonRunTime;

    Runner(int minMarathonRunTime, int maxMarathonRunTime) {
        this.minMarathonRunTime = minMarathonRunTime;
        this.maxMarathonRunTime = maxMarathonRunTime;
    }

    public static Runner getFitnessLevel(int userRunInput) {
        if (isAdvanced(userRunInput)) {
            return ADVANCED;
        } else if (isIntermediate(userRunInput)) {
            return INTERMEDIATE;
        } else {
            return BEGINNER;
        }
    }

    private static boolean isAdvanced(int userRunInput) {
        return userRunInput <= ADVANCED.maxMarathonRunTime && userRunInput >= ADVANCED.minMarathonRunTime;
    }

    private static boolean isIntermediate(int userRunInput) {
        return userRunInput <= INTERMEDIATE.maxMarathonRunTime && userRunInput >= INTERMEDIATE.minMarathonRunTime;
    }
}
