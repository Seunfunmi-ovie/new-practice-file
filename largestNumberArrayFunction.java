public static int getLargest(int[]array) {
int largestNumber = array[0];
for(int counter = 1; counter < array.length; counter++) {
    if (array[counter] > largestNumber) {
        largestNumber = array[counter];
        }
    }
    return largestNumber;
}
