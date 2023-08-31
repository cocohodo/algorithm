class Solution {
    public int check(int x,int y, int xlength,int ylength,String[] wallpaper,int direction) {
        boolean xcheck = false;
        boolean ycheck = false;
        //x축 파일 체크
        if(direction==0) {
            for(int a = x;a<xlength;a++) {
                if(wallpaper[a].charAt(y)=='#') {
                    xcheck = true;
                }
            }
        }
        else {
            for(int a = xlength-1;a>=0;a--) {
                if(wallpaper[a].charAt(y)=='#') {
                    xcheck = true;
                }
            }   
        }
        if(direction==0) {
            for(int b = y;b<ylength;b++) {
                if(wallpaper[x].charAt(b)=='#') {
                    ycheck = true;
                }
            }
        }
        else {
            for(int b = y;b>=0;b--) {
                if(wallpaper[x].charAt(b)=='#') {
                    ycheck = true;
                }
            }
        }
        if (xcheck&&ycheck) return 3;
        else if (xcheck) return 1;
        else if (ycheck) return 2;
        else return 0;
    }
    public int[] solution(String[] wallpaper) {
        int[] answer = {0,0,0,0};
        int xlength = wallpaper.length;
        int ylength = wallpaper[0].length();
        
        int cx = 0;
        int cy = 0;
        int result = check(cx,cy,xlength,ylength,wallpaper,0);
        while (result!=3) {
            if (result==1) {
                cx++;
            }
            else if (result==2) {
                cy++;
            }
            else {
                cx++;
                cy++;
            }
            result = check(cx,cy,xlength,ylength,wallpaper,0);
        }
        answer[0] = cx;
        answer[1] = cy;
        
        cx=xlength-1;
        cy=ylength-1;
        result = check(cx,cy,xlength,ylength,wallpaper,1);
        while (result!=3) {
            if (result==1) {
                cx--;
            }
            else if (result==2) {
                cy--;
            }
            else {
                cx--;
                cy--;
            }
            result = check(cx,cy,xlength,ylength,wallpaper,1);
        }
        answer[2] = cx+1;
        answer[3] = cy+1;
        
        return answer;
    }
}