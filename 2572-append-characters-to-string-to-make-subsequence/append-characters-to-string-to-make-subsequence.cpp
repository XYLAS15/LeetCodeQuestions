class Solution {
public:
    int appendCharacters(string s, string t) {
        int s_i = 0, t_i = 0;
        int s_len = s.length(), t_len = t.length();
        
        while(s_i < s_len && t_i < t_len){
            if(s[s_i] == t[t_i]){
                t_i++;
            }
            s_i++;
        }
        return t_len - t_i;
    }
};