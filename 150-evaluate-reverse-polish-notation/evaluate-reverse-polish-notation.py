class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack=[]
        for ch in tokens:
            if ch in "+-/*":
                pop1=stack.pop()
                pop2=stack.pop()
                if ch=='+':
                    res=pop2+pop1
                elif ch=='-':
                    res=pop2-pop1
                elif ch=='*':
                    res=pop2*pop1
                elif ch=='/':
                    res=int(eval(str(pop2)+"/"+str(pop1)))
                stack.append(res)
            else:
                stack.append(int(ch))
        return stack[-1]

