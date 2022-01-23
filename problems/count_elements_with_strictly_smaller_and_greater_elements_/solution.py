class Solution:
    def countElements(self, nums: List[int]) -> int:
        p=len(nums)
        maks=max(nums)
        mini=min(nums)
        c=0
        for x in nums:
            if x>mini and x<maks:
                c+=1
        return c
        