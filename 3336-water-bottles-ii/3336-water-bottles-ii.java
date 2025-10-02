class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int drinkBottles=0;
        int emptyBottles = 0;

        while(numBottles > 0 || emptyBottles >= numExchange){
            drinkBottles += numBottles;
            emptyBottles += numBottles;
            numBottles = 0;
            while(emptyBottles >= numExchange){
                emptyBottles -= numExchange;
                numExchange++;
                numBottles++;
            }
        }
        return drinkBottles;
    }
}