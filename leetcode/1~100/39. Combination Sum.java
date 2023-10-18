class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        sum(candidates,target,0);
        return answer;
    }
    public void sum(int[] candidates, int target,int start) {
        //target이 0이 될 때 정답에 리스트 추가
        if(target==0) {
            answer.add(new ArrayList(list));
            return;
        }
        //빈 리스트에서 시작해서 전체 후보에 대해 target보다 작으면 리스트에 넣고 재귀 시행 후 리스트에서 삭제하고 반복
        for(int i = start;i < candidates.length;i++) {
            if(candidates[i]<=target) {
                list.add(candidates[i]);
                sum(candidates,target-candidates[i],i);
                list.remove(list.size()-1);
            }
        }
    }
}