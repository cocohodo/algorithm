import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        String[] answer;
        String[] temp;
        String answerName ="";
        HashMap<String, String> name = new HashMap<String, String>();
        int count = 0;
        for(int a=0;a<record.length;a++) {
            temp = record[a].split(" ");
            if(temp[0].equals("Enter")) {
                name.put(temp[1],temp[2]);
                count++;
            }
            else if(temp[0].equals("Change")) {
                name.put(temp[1],temp[2]);
            }
            else {
                count++;
            }
        }
        answer = new String[count];
        //정답배열채우기
        int num2=0;
        for(int a=0;a<record.length;a++) {
            temp = record[a].split(" ");
            answerName = name.get(temp[1]);
            
            if(temp[0].equals("Enter")) {
                answer[num2++]=answerName+"님이 들어왔습니다.";
            }
            else if(temp[0].equals("Leave")) {
                answer[num2++]=answerName+"님이 나갔습니다.";
            }
        }
        return answer;
    }
}