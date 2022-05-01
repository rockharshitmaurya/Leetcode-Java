class Solution {
public:
    bool backspaceCompare(string s, string t) {
        vector<char> temp;
        vector<char> temp1;
        int i=0;
        while(i<s.size())
        {
            if(s[i]!='#')
             temp.push_back(s[i]);
            else
             if(temp.size())
              temp.pop_back();
            i++;
        }
        i=0;
        while(i<t.size())
        {
            if(t[i]!='#')
             temp1.push_back(t[i]);
            else
             if(temp1.size())
              temp1.pop_back();
            i++;
        }
        string ans1="",ans2="";
        while(temp.size()!=0){ ans1=ans1+temp[temp.size()-1]; temp.pop_back(); }
        while(temp1.size()!=0){ ans2=ans2+temp1[temp1.size()-1]; temp1.pop_back(); }
        
        return ans1==ans2;
    }
};