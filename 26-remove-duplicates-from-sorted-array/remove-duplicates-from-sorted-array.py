class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i=0
        j=1
        while j<len(nums):
            if nums[i]==nums[j]:
                while nums.count(nums[i])!=1:
                    nums.remove(nums[i])
                i+=1
                j=i+1
            else:
                i+=1
                j=i+1
            
        
                
            