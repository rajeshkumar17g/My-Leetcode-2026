class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        for ch in s:
            if ch in '([{':
                stack.append(ch)
                continue
            elif ch==')' and (stack==[] or stack[-1]!='('):
                return False
            elif ch==']' and (stack==[] or stack[-1]!='['):
                return False
            elif ch=='}' and (stack==[] or stack[-1]!='{'):
                return False
            stack.pop()
        if stack==[]: return True
        else: return False