class Solution: 
    def smallestTrimmedNumbers(self, nums: List[str], queries: List[List[int]]) -> List[int]: 
        def query_3(x,y): 
            arr = [] 
            for i_1, v_1 in enumerate(nums) : 
                s_1 = v_1[-y:] 
                p_1 = (int(s_1), i_1) 
                bisect.insort(arr, p_1) 
            return arr[x-1][1] 
         
        res = []
        for x_val,y_val in queries :  
            res.append(query_3(x_val,y_val)) 
        return res