class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        
        stack=[]
        for ch in tokens:
            if(ch=="+" or ch=="-" or ch=="*" or ch=="/"):
                pop1=stack.pop()
                pop2=stack.pop()

                if(ch=='+'):
                    res=int(pop2)+int(pop1)
                elif(ch=='-'):
                    res=int(pop2)-int(pop1)
                elif(ch=='*'):
                    res=int(pop2)*int(pop1)
                elif(ch=='/'):
                    res=int(eval(str(pop2)+"/"+str(pop1)))
                stack.append(res)
            else:
                stack.append(int(ch))
        return stack[0]