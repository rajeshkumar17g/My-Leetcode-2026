
bool isPerfectSquare(int x) {
    int low=1,high=x;
    while(low<=high){
        long int mid=(low+(high-low)/2);
        if((mid*mid)==x){
            return true;
        }
        else if(mid*mid>x){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    return false;
}