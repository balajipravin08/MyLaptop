public class MaxSubArrayPve {

    public static void main(String[] args) {
        int[] a = {-11, 11, 15, -1, 30,-2};

        int l=0,r=0,sum=0,max=0,s=0,e=0;

        while (r!=a.length) {
            if (a[r]<0) {
                if (sum>max) {
                    max = sum;
                    s=l;
                    e=r; 
                }
                sum = 0;
                l=r+1;
                r++;
                continue;
            }
            sum += a[r];
            if (sum>max) {
                max = sum;
                s=l;
                e=r;
            }
            r++;
        }
        //max = Math.max(max, sum);
        System.out.println(max+" "+s+" "+e);
    }
}
