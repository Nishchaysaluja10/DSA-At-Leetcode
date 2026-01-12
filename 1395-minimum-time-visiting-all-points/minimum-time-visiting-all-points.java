class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int res =0;
        int a ,b;
        a=points[0][0];
        b=points[0][1];
        for(int i=1 ; i < points.length ; i++){
            int x=Math.abs(points[i][0]-a);
            int y=Math.abs(points[i][1]-b);
            int z = Math.abs(x-y)+(Math.min(x,y));
            res+=z;
            a=points[i][0];
            b=points[i][1];
        }
        return res; 
    }
}