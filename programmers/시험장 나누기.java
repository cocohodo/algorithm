class Solution {
    int limit = 0;
    int max =0;
    int[] sum = new int[10001];
    public int solution(int k, int[] num, int[][] links) {
        int[] parent = new int[num.length];
        int root=0;
        int all = 0;
        int divide = 0;
        int low = 0, high = 0, maxnum = 0;
        
        //전체 num 더하기
        for(int i = 0; i<num.length;i++) {
            all += num[i];
            if(maxnum<num[i]) maxnum = num[i];
        }
        if(k==1) {
            return all;
        }
        else if(k==num.length) {
            for(int i = 0; i<num.length; i++) {
                if(max<num[i]) max = num[i];
            }
            return max;
        }
        else {
            limit = all/k;
        }
        //부모배열 -1로 초기화
        for(int i = 0; i<parent.length;i++) {
            parent[i] = -1;
        }
        //부모배열 채우기
        for(int i = 0; i<parent.length;i++) {
            if(links[i][0]!=-1) {
                parent[links[i][0]] = i;
            }
            if(links[i][1]!=-1) {
                parent[links[i][1]] = i;
            }
        }
        //루트찾기
        for(int i = 0; i < parent.length; i++) {
            if(parent[i]==-1) root = i;
        }
        low=maxnum;
        high=all;
        while(low<=high) {
            divide=0;
            limit=(low+high)/2;
            divide = search(links,num,root);
            divide++;
            if (divide<=k) {
                high = limit - 1;
            }
            else {
                low = limit + 1;
            }
        }
        
        return high + 1;
    }
    int search(int[][] links, int[] num, int root) {
        int plus = 0;
        int k = 0;
        int number = 0;
        int left = 0;
        int right = 0;
        if(links[root][0] != -1) {
            k += search(links,num,links[root][0]);
            left = sum[links[root][0]];
        }
        if(links[root][1] != -1) {
            k += search(links,num,links[root][1]);
            right = sum[links[root][1]];
        }
        if (num[root] + left + right <= limit) {
            sum[root] = num[root] + left + right;
        }
        else if (num[root] + Math.min(left, right) <= limit) {
            k++;
            sum[root] = num[root] + Math.min(left, right);
        }
        else {
            k+=2;
            sum[root] = num[root];
        }
        return k;
    }
}