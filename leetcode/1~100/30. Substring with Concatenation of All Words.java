class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> answer = new ArrayList<>();
        Map<String,Integer> word = new HashMap<>();
        int len = words[0].length();
        //맵에 (단어,개수) 입력
        for(int i=0;i<words.length;i++) {
            word.put(words[i],word.getOrDefault(words[i],0)+1);
        }

        for(int i=0;i<s.length()-(len*words.length)+1;i++) {
            int j = 0;//단어가 맞는 횟수
            Map<String,Integer> checked = new HashMap<>();//확인한 단어 개수
            for(int k = i; j<words.length;) {
                String str = s.substring(k,k+len);
                if(word.containsKey(str)) {  //단어가 있는 경우
                    checked.put(str,checked.getOrDefault(str,0)+1);
                    if (checked.get(str) > word.getOrDefault(str, 0))  break;
                    j++;
                }
                else {  break;  } //단어가 없는 경우
                k+=len;
            }
            if(j==words.length) answer.add(i);
        }

        return answer;
        
    }
}