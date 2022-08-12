class comp implements Comparator<Job>{
    public int compare(Job o1,Job o2){
        if(o1.profit<o2.profit) return 1; // swap
        else if(o1.profit>o2.profit) return -1; // leave as it is
        return 0;
    }
}
// sort profit acc to descending order
class Solution{
    int[] JobScheduling(Job arr[], int n){
        Arrays.sort(arr,new comp());
        int jobs=0,profit=0,maxdeadline=0;
        for(Job j:arr){
            maxdeadline=Math.max(maxdeadline,j.deadline);
        }
        int maxarr[]=new int[maxdeadline+1]; // add index
        Arrays.fill(maxarr,-1);
        for(Job j:arr){
            int deadline=j.deadline;
            for(int k=deadline;k>0;k--){ // not inc zero
                if(maxarr[k]==-1){
                    maxarr[k]=j.deadline;
                    profit+=j.profit;
                    jobs++;
                    break;
                }
            }
        }
        return new int[]{jobs,profit};
    }
}