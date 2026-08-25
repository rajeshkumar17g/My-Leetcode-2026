double* convertTemperature(double celsius, int* returnSize) {
    *returnSize=2;

    static double ans[2];
    ans[0]=celsius+273.15;
    ans[1]=celsius*1.80+32.00;

    return ans;


    
}