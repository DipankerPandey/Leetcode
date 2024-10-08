class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        int n=nums1.length;
        int m=nums2.length;

        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();

        for(int i : nums1){
            s1.add(i);
        }

        for(int i : nums2){
            s2.add(i);
        }

        List<List<Integer>> fin=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>(); 

        for(int num : s1){ 
            if(!s2.contains(num))
               l1.add(num);
        }

        fin.add(l1); 

         for(int num : s2){
            if(!s1.contains(num))
               l2.add(num);
        }

        fin.add(l2);

        return fin;
    }
}