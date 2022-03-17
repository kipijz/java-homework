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
        if (userRunInput <= ADVANCED.maxMarathonRunTime && userRunInput >= ADVANCED.minMarathonRunTime) {
            return ADVANCED;
        } else if (userRunInput <= INTERMEDIATE.maxMarathonRunTime && userRunInput >= INTERMEDIATE.minMarathonRunTime) {
            return INTERMEDIATE;
        } else {
            return BEGINNER;
        }
    }
}
