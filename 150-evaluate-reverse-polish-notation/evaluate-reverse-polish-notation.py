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
                    sign=1
                    if pop1*pop2<0:
                        sign=-1
                        pop1=abs(pop1)
                        pop2=abs(pop2)
                    res=pop2//pop1
                    res=sign*res
                stack.append(res)
            else:
                stack.append(int(ch))
        return stack[-1]

