class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        sum(candidates,target,0);
        return answer;
    }
    public void sum(int[] candidates, int target,int start) {
        //target이 0이 될 때 정답에 리스트 추가
        if(target==0) {
            answer.add(new ArrayList(list));
            return;
        }
        //빈 리스트에서 시작해서 전체 후보에 대해 target보다 작으면 리스트에 넣고 그 다음 인덱스부터 재귀시행 후
        for(int i = start;i < candidates.length;i++) {
            if(i!=start&&candidates[i]==candidates[i-1]) continue;
            //처음 시작한 인덱스 숫자가 같으면 추가하고 그 다음 부터는 같은 숫자 넘김
            //같은 숫자가 나왔을 때 한 번씩만 넣고 진행
            if(candidates[i]<=target) {
                list.add(candidates[i]);
                sum(candidates,target-candidates[i],i+1);
                list.remove(list.size()-1);
            }
        }
    }
}