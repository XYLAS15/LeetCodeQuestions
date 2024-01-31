/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    // Initialize a variable j to 1 (assuming the first element is always unique).
    let j = 1;

    // Iterate through the elements of the array starting from the second element.
    for (let i = 1; i < nums.length; i++) {
        // Check if the current element is different from the previous one.
        if (nums[i] !== nums[i - 1]) {
            // If different, update the array at index j with the current element.
            nums[j] = nums[i];
            // Increment j to mark the next position for a unique element.
            j++;
        }
    }

    // The final value of j represents the length of the array without duplicates.
    return j;
};
