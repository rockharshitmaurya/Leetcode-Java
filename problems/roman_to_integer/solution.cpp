class Solution {
public:
    int romanToInt(string str) {
       unordered_map<char, int> mp;
    mp['I'] = 1;
    mp['V'] = 5;
    mp['X'] = 10;
    mp['L'] = 50;
    mp['C'] = 100;
    mp['D'] = 500;
    mp['M'] = 1000;
    
    int res = 0;
    
    for(int i = 0; i < str.size(); i++)
    {
        if(i+1 < str.size() && mp[str[i]] < mp[str[i+1]])
        {
            res += mp[str[i+1]] - mp[str[i]];
            i += 1;
        }
        else
        {
            res += mp[str[i]];
        }
    }
    
    return res; 
    }
};