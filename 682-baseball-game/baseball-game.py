class Solution:
    def calPoints(self, op: list[str]) -> int:
        st=[]
        for s in op:
            if s=='D':
                st.append(st[-1]*2)
            elif s=='C':
                st.pop()
            elif(s=='+'):
                st.append(st[-1]+st[-2])
            else:
                st.append(int(s))
        return sum(st)