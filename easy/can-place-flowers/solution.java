class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        if(flowerbed.length==1)
        {
            if(flowerbed[0]==0 && n<=1 || n==0)
                return true;
            else
                return false;
        }

        for(int i=0;i<flowerbed.length;i++)
        {
            if(n==0)
            {
                return true;
            }
            if((i==0 && flowerbed[0]==0 && flowerbed[1]==0) || (i==flowerbed.length-1 && flowerbed[i-1]==0 && flowerbed[i]==0))
            {
                n--;
                flowerbed[i]=1;
            }
            else
            {
                if(i!=flowerbed.length-1 && i!=0 && flowerbed[i+1]==0 && flowerbed[i-1]==0 && flowerbed[i]==0)
                {
                    n--;
                    flowerbed[i]=1;
                }
            }
        }

        return !(n>0);
    }
}