package fop.w3array;

public class GamesWithArrays {

  public static int[] otherSort(int[] arr, int[] arr2) {
	// TODO
  }

  public static int[] fairFriends(int[] arr, int[] arr2) {
    int sum1 = 0, sum2 = 0;
    for (int i = 0; i < arr.length; i++) {
      sum1 += arr[i];
    }

    for (int i = 0; i < arr2.length; i++) {
      sum2 += arr2[i];
    }
    int delta = (sum2 - sum1) / 2;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        if (arr2[j] == arr[i] + delta) {
          return new int[]{arr[i], arr[i] + delta};
        }
      }
    }
    return new int[]{0, 0};
  }

  public static boolean alps(int[] arr) {
    if (arr.length < 3) {
      return false;
    }
    boolean declining = false;

    for (int i = 1; i < arr.length; i++) {
      if (!declining && arr[i] < arr[i -1] && i != 1) {
        declining = true;
      } else if (declining && arr[i] >= arr[i -1]) {
        return false;
      } else if (!declining && arr[i] == arr[i -1] || !declining && arr[i] < arr[i -1] && i == 1) {
        return false;
      }
    }
    if (!declining) {
      return false;
    }
    return true;
  }

  public static int[] plancton(int[] arr) {
    int maxProfit, maxI, maxJ;
    maxI = 0;
    maxJ = 0;
    maxProfit = 0;
    for(int i = 0; i < arr.length; i++) {
      for(int j = i; j < arr.length; j++) {
        if (arr[j] - arr[i]  > maxProfit ) {
          maxI = i;
          maxJ = j;
          maxProfit = arr[j] - arr[i];
        }
      }
    }
    return new int[]{maxI, maxJ, maxProfit};
  }

  public static int pinguFriends(int[] arr) {
    int[] freq = new int[100];
    for (int i = 0; i < arr.length; i++) {
      freq[arr[i]]++;
    }

    boolean valid;
    for (int i = arr.length; i >= 2; i--) {
      valid = true;
      for(int j = 0; j < freq.length; j++) {
        if (freq[j] % i != 0) {
          valid = false;
          break;
        }
      }
      if (valid) {
        return i;
      }
    }
    return 0;
  }
}
