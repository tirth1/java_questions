/*Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
Your algorithm's runtime complexity must be in the order of O(log n).
If the target is not found in the array, return [-1, -1].

Example 1:
	Input: nums = [5,7,7,8,8,10], target = 8
	Output: [3,4]

Example 2:
	Input: nums = [5,7,7,8,8,10], target = 6
	Output: [-1,-1]
*/

int* searchRange(int* nums, int numsSize, int target, int* returnSize) {
    int *temp = malloc(sizeof(int) * 2);
    int i = 0;
    temp[0] = -1;
    temp[1] = -1;
    for(i = 0; i < numsSize && target >= nums[i];  i++)
    {
        if(nums[i] == target)
        {
            if(-1 == temp[0])
            {
                temp[0] = i;
            }
            {
                temp[1] = i;
            }
        }
    }
    *returnSize = 2;
    return temp;
    
}