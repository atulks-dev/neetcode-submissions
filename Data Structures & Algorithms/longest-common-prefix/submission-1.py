class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        # Main Refrence Point , 1st Loop 
        for i in range(len(strs[0])):
            for s in strs[1:]:
                if i>=len(s) or s[i] != strs[0][i]:
                    return strs[0][:i]
        return strs[0]

        