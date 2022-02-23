class Arrays() {

    /**
     * Time complexity is O(n²) because of n the array is used a for loop within a for loop
     */
    fun twoNumberSum(array: MutableList<Int>, targetSum: Int): List<Int> {
        for (i in 0 until array.size) {
            for (j in 1 until array.size) {
                if (array[i] != array[j] && targetSum == array[i] + array[j]) {
                    return listOf(array[i], array[j])
                }
            }
        }
        return listOf()
    }
}