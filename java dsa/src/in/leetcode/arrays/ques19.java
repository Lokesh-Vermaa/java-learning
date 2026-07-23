package in.leetcode.arrays;

public class ques19 {
    public int maximumPopulation(int[][] logs) {

    int[] population = new int[101];

    for (int[] log : logs) {
        for (int year = log[0]; year < log[1]; year++) {
            population[year - 1950]++;
        }
    }

    int max = 0;
    int ans = 1950;

    for (int i = 0; i < 101; i++) {
        if (population[i] > max) {
            max = population[i];
            ans = i + 1950;
        }
    }

    return ans;
}
//faster approach
public int maximumPopulation1(int[][] logs) {

    int[] diff = new int[101];

    for (int[] log : logs) {
        diff[log[0] - 1950]++;
        diff[log[1] - 1950]--;
    }

    int max = 0;
    int population = 0;
    int ans = 1950;

    for (int i = 0; i < 101; i++) {
        population += diff[i];

        if (population > max) {
            max = population;
            ans = i + 1950;
        }
    }

    return ans;
}
}
