// class Solution {
//     public String reverseWords(String s) {
//        StringBuilder res = new StringBuilder();
//        int si = s.length()-1; //"the sky is blue"
//     while(si>=0){
//         while(si>=0 && s.charAt(si)==' '){
//             si--;
//         }
//             if(si<0){
//                 break;
//             }
//             int ei = si;
//             while(si>=0 && s.charAt(si)!=' '){

//                 si--;
//             }
//             if(res.length()==0){
//                 res.append(s.substring(si+1,ei+1));
//             }
//             else{
//                 res.append(" ");
//                 res.append(s.substring(si+1,ei+1));
//             }
//         }
//       return res.toString();
// }
// }

class Solution {
    public String reverseWords(String str) {
        str = str.trim(); // Remove leading/trailing spaces
        String[] words = str.split("\\s+"); // Split by one or more spaces
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
