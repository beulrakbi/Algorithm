class Solution {
    public int solution(int angle) {
        int answer = 0;
        if(angle > 0 && angle < 90){
            answer = 1;
        } else if (angle == 90){
            answer = 2;
        } else if( angle > 90 && angle<180){
            answer = 3;
        } else if(angle == 180){
            answer = 4;
        } else {
            System.out.print("잘못된 수 입력");
        }
        return answer;
    }
}