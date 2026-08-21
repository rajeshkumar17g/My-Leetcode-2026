class Solution {

    public void backtracking(int[] nums, List<Integer> subset, int index, List<List<Integer>> res){

        if(index==nums.length){ //crr_state==solution state
            res.add(new ArrayList<>(subset)); //add a copy into result
            return;
        }

        subset.add(nums[index]); //pick the element
        backtracking(nums,subset,index+1,res); //move to next stage
        subset.remove(subset.size()-1); // not picking the element
        backtracking(nums,subset,index+1,res);//move to next stage

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();

        backtracking(nums,subset,0,res);

        return res;
    }
}

/*

 // checking if crr_state==solution state
        if(index==nums.length){ // 1==3? X  2==3? X  3==3?  YEs
            res.add(new ArrayList<>(subset)); //we will change this   //we need add a copy of crr state in final ans //res=[[a,b,c]]
            return;
        }

        //make the choice
        subset.add(nums[index]);//adding a ==> [a] //adding b ==> [a,b] //adding c ==> [a,b,c] 
        backtracking(nums,subset,index+1,res); //=> nums,[a],1,[] // nums,[a,b,c],3,[]
        subset.remove(subset.size()-1);// undo the choice nums,[a,b],2,[[a,b,c]]
        backtracking(nums,subset,index+1,res);// nums,[a,b],3,[[a,b,c],[a,b]]

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();

        backtracking(nums,subset,0,res); // [a,b,c],[],0,

        return res;
    }

    */