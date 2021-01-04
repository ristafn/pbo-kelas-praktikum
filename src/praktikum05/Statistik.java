package praktikum05;

import java.util.Arrays;

public class Statistik {
    // fungsi mean
    public static double mean(int a[], int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a[i];

        return (double)sum / (double)n;
    }

    // fungsi median
    public static double median(int a[], int n)
    {
        // mengurutkan array
        Arrays.sort(a);

        // mengecek jika panjang array tidak sama dengan nol
        if (n % 2 != 0)
            return (double)a[n / 2];

        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }

    // fungsi modus
    public static double modus(int a[], int n){
        int maxValue = 0, maxCount = 0, i, j;

        for (i = 0; i < n; i++) {
            int count = 0;
            for (j = 0; j < n; j++) {
                if (a[j] == a[i])
                    count++;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = a[i];
            }
        }
        return maxValue;
    }
}
