package fop.w3array;

public class GamesWithArrays {
  public static boolean contains(int[] arr, int target){
    for(int el : arr){
      if(el == target) return true;
    }
    return false;
  }

  public static int[] otherSort(int[] arr, int[] arr2) {
    int[] res = new int[arr.length];
    int index = 0;
    for (int k : arr2) {
      for (int j : arr) {
        if (k == j) {
          res[index] = j;
          index++;
        }
      }
    }

    for(int el : arr){
      if(!contains(arr2, el)){
        res[index] = el;
        index++;
      }
    }

    return res;  }

//  public static int[] fairFriends(int[] arr, int[] arr2) {
//	// TODO
//  }
//
//  public static boolean alps(int[] arr) {
//    	// TODO
//  }

  public static int[] plancton(int[] arr) {
    int max = Integer.MIN_VALUE;
    int buy = 0;
    int sell = 0;
    for(int i = 0; i < arr.length; i++){
      for(int j = i+1; j < arr.length; j++) {
        int comp = arr[j] - arr[i];
        if (max < comp) {
          max = comp;
          buy = i;
          sell = j;
        }
      }
    }
    max = Math.max(0, max);

    if(max == 0){
      return new int[] {0, 0, 0};
    } else {
      return new int[] {buy, sell, max};
    }  }

//  public static int pinguFriends(int[] arr) {
//    	// TODO
//  }
}
