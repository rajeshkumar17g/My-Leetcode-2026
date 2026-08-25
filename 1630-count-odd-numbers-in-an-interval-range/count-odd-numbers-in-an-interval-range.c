int countOdds(int low, int high){
       
       if(low%2==0 && high%2==0){
           return (high-low)/2;
       }
       return (high-low)/2+1;
}

/*

 int count=0;
        for(int num=low;num<=high;num++){
            if(num%2==1){
                count++;
            }
        }

        return count;
*/