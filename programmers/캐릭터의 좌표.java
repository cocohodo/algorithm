class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        for(int a=0;a<keyinput.length;a++) {
            if(keyinput[a].equals("left")) {
                if(answer[0]==(board[0]/2) * -1) continue;
                answer[0] -= 1;
            }
            else if(keyinput[a].equals("right")) {
                if(answer[0]==(board[0]/2)) continue;
                answer[0] += 1;
            }
            else if(keyinput[a].equals("up")) {
                if(answer[1]==(board[1]/2)) continue;
                answer[1] += 1;
            }
            else {
                if(answer[1]==(board[1]/2) * -1) continue;
                answer[1] -= 1;
            }
            
        }
        return answer;
    }
}