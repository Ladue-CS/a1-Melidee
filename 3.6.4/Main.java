import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Horse> horses = new HorseBarn().getSpaces();
        horses = RandomPermutationInPlace.next(horses);
        while (horses.size() > 0) {
            try {
                System.out.println(horses.get(0).getName() + " and " + horses.get(1).getName());
                horses.remove(0);
                horses.remove(1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println(horses.get(0).getName() + " has no partner");
                horses.remove(0);
            }
            
        }
    }
}