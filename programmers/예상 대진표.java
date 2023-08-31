class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        //a가 홀수이고 a와b가 1차이 나면 만남
        if(a<b) {
        while(!(a%2==1&&b-a==1)){
            if(a%2==0) a/=2;
            else a=a/2+1;
            if(b%2==0) b/=2;
            else b=b/2+1;
            answer++;
        }
        }
        else {
        while(!(b%2==1&&a-b==1)){
            if(a%2==0) a/=2;
            else a=a/2+1;
            if(b%2==0) b/=2;
            else b=b/2+1;
            answer++;
        }
        }

        return answer;
    }
}