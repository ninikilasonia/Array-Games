package fop.w3array;

import java.util.Arrays;

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

  public static int arrSum(int[] arr, int i){
    if(i >= arr.length) return 0;
    return arr[i] + arrSum(arr, i+1);
  }

  public static int[] fairFriends(int[] arr, int[] arr2) {
    int avg = (arrSum(arr, 0) + arrSum(arr2, 0)) / 2;

    int[] res = new int[2];

      for (int j : arr) {
          for (int k : arr2) {
              if (j + k == avg) {
                  res[0] = j;
                  int comp = arrSum(arr, 0) - j;
                  for (int el : arr2) {
                      if (comp + el == avg) res[1] = el;
                  }
              }
          }
      }
    return res;
  }

  public static int[] isMore(int[] arr, int index, int x){
    if(index >= arr.length-1) return new int[] {x, index};
    else if (arr[index] < arr[index+1]) return isMore(arr, index+1, x);
    else if (arr[index] == arr[index+1]) return new int[] {-1, index};
    else return new int[] {x+1, index};
  }

  public static int[] isLess(int[] arr, int index, int x){
    if(index >= arr.length-1) return new int[] {x, index};
    else if (arr[index] > arr[index+1]) return isLess(arr, index+1, x);
    else if (arr[index] == arr[index+1]) return new int[] {-1,index};
    else return new int[] {x+1, index};
  }


  public static boolean alps(int[] arr) {
    if(arr.length <= 2) return false;
    int[] temp = isMore(arr, 0, 0);
    if(temp[0] == -1 || temp[0] == 0) return false;
    if(temp[0] == 1){
      int[] temp2 = isLess(arr, temp[1]+1, 1);
      if(temp2[0] == -1) return false;
      return temp2[0] == 1;
    }
    return false;
  }

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

  public static int pinguFriends(int[] arr) {
    if (arr.length == 1) return 0;
    int[] sorted = Arrays.stream(arr).sorted().toArray();
    int[] groups = new int[50];
    int group = 1;
    int index = 0;

    for(int i = 0; i < sorted.length-1; i++){
      if(sorted[i] == sorted[i+1]) group++;
      else {
        groups[index] = group;
        index++;
        group = 1;
      }
    }
    groups[index] = group;

    int len = 0;
      for (int j : groups) {
          if (j != 0) len++;
      }
    int[] resArr = new int[len];
    System.arraycopy(groups, 0, resArr, 0, len);


    for (int i = 0; i < len - 1; i++) {
      if ((resArr[i] % resArr[i+1] == 0 || resArr[i+1] % resArr[i] == 0) && resArr[i] != resArr[i+1]) return Math.min(resArr[i], resArr[i+1]);
      if (resArr[i] != resArr[i + 1]) return 0;
    }

    return resArr[0];
  }

  public static void main(String[] args){
//    int[] arr1 = new int[] {2,1};
//    int[] arr2 = new int[] {3, 5, 6, 7, 5, 7, 1};
//    int[] arr3 = new int[] {3, 5, 6, 7, 5, 3, 1};
//
//    System.out.println(alps(arr1));
//    System.out.println(alps(arr2));
//    System.out.println(alps(arr3));

    int[] arr1 = new int[] {1,2,3,4,4,3,2,1};
    int[] arr2 = new int[] {1,1,1,2,2,2,3,3};
    int[] arr3 = new int[] {1};
    int[] arr4 = new int[] {1,1};
    int[] arr5 = new int[] {1,1,2,2,2,2};

    System.out.println(pinguFriends(arr1));
    System.out.println(pinguFriends(arr2));
    System.out.println(pinguFriends(arr3));
    System.out.println(pinguFriends(arr4));
    System.out.println(pinguFriends(arr5));
  }
}