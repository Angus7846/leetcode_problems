class Solution {
    public int numberOfSteps(int num) {

        int increments = 0;
        while(num != 0){
            if (num % 2 == 0){
                num = num/2;
            }else{
                num -= 1;
            }
            increments++;
        }
        return increments;
    }
}
