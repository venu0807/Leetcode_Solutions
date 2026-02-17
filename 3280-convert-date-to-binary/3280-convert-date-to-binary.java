class Solution {
    public String convertDateToBinary(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        
        String ybin = Integer.toBinaryString(year);
        String mbin = Integer.toBinaryString(month);
        String dbin = Integer.toBinaryString(day);
        
        return ybin + "-" + mbin + "-" + dbin;
    }
}
