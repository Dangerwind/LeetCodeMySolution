class Solution {
    public int[] canSeePersonsCount(int[] heights) {

        int arrayLength = heights.length;

        int[] retArray = new int[arrayLength];
        for(var j = 0; j< arrayLength - 1; j++) {

            long highMan = 0;
            long myHigh = heights[j];
            int counter = 0;

            for (var i = j + 1; i < arrayLength; i++) {
                if (heights[i] > highMan) {
                    highMan = heights[i];
                    counter ++;
                    if (highMan > myHigh) {
                        i = arrayLength;
                    }
                }
            }
            retArray[j] = counter;
        }
        return retArray;
    }
}
