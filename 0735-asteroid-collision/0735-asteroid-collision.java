class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i : asteroids){
            if(i > 0){
                st.push(i);
            } else{
                while(!st.isEmpty() && st.peek() > 0 && Math.abs(i) > st.peek()){
                    st.pop();
                }
                if(st.isEmpty() || st.peek() < 0){
                    st.push(i);
                } else if(i + st.peek() == 0){
                    st.pop();
                }
            }
        }
        int[] arr = new int[st.size()];
        for(int i =arr.length - 1;i >= 0;i--){
            arr[i] = st.pop();
        } 
        return arr;
    }
}