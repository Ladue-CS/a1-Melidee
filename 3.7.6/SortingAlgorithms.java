import java.util.ArrayList;
import java.util.Collections;

public class SortingAlgorithms {

  public static ArrayList<Integer> selectionSortInt(ArrayList<Integer> intList) {
    for (int i = 0; i < intList.size() - 1; i++) {
      int min = i;
      for (int j = i + 1; j < intList.size(); j++) {
        if (intList.get(j) < intList.get(min))
          min = j;
      }
      Collections.swap(intList, i, min);
    }
    return intList;
  }

  public static ArrayList<Integer> insertionSortInt(ArrayList<Integer> intList) {
    for (int i = 1; i < intList.size(); i++) {
      int valueToSort = intList.get(i);
      int prevIndex = i - 1;
      while (prevIndex >= 0) {
        int sortedValue = intList.get(prevIndex);
        if (sortedValue > valueToSort) {
          intList.set(prevIndex + 1, sortedValue);
          intList.set(prevIndex, valueToSort);
        }
        prevIndex--;
      }
    }
    return intList;
  }

  public static ArrayList<Double> selectionSortDouble(ArrayList<Double> doubleList) {
    for (int i = 0; i < doubleList.size() - 1; i++) {
      int min = i;
      for (int j = i + 1; j < doubleList.size(); j++) {
        if (doubleList.get(j) < doubleList.get(min))
          min = j;
      }
      Collections.swap(doubleList, i, min);
    }
    return doubleList;
  }

  public static ArrayList<Double> insertionSortDouble(ArrayList<Double> doubleList) {
    for (int i = 1; i < doubleList.size(); i++) {
      double valueToSort = doubleList.get(i);
      int prevIndex = i - 1;
      while (prevIndex >= 0) {
        double sortedValue = doubleList.get(prevIndex);
        if (sortedValue > valueToSort) {
          doubleList.set(prevIndex + 1, sortedValue);
          doubleList.set(prevIndex, valueToSort);
        }
        prevIndex--;
      }
    }
    return doubleList;
  }
}

