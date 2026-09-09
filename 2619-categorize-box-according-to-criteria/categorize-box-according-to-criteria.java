class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        
        long volume=length*width*height;
        boolean b=false,h=false;

        if(length>=10000 || width>=10000 || height>=1000){
            b=true;
        }
        else if(volume>=Math.pow(10,9)){
            b=true;
        }


        if(mass>=100){
            h=true;
        }

        if( b==true && h==true){
            return "Both";
        }
        else if(b==false && h==false){
            return "Neither";
        }
        else if(b==true && h==false){
            return "Bulky";
        }
        else{
            return "Heavy";
        }



    }
}