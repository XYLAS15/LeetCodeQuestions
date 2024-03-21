/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    s = s.replace(/[^a-z0-9]/gi,"").toLowerCase();
    let leftPointer=0;
    let rightPointer=s.length-1;

    while(leftPointer<rightPointer){
        let leftChar=s.charAt(leftPointer);
        let rightChar=s.charAt(rightPointer);

        if(leftChar!=rightChar) return false

        leftPointer++;
        rightPointer--
    }

    return true;
};