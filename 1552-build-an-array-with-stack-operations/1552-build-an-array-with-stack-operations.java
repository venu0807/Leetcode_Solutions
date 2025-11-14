import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        int current = 1;
        
        for (int number : target) {
            while (current < number) {
                operations.add("Push");
                operations.add("Pop");
                current++;
            }
            operations.add("Push");
            current++;
        }
        
        return operations;
    }
}
