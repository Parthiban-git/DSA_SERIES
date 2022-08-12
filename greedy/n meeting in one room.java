class meeting{
    int start,end,pos;
    meeting(int start,int end,int pos){
        this.start=start;
        this.end=end;
        this.pos=pos;
    }
}

class meetingcomp implements Comparator<meeting>{
    public int compare(meeting o1,meeting o2){
         if (o1.end < o2.end)
            return -1;
        else if (o1.end > o2.end)
            return 1;
        else if(o1.pos < o2.pos)
            return -1;
        return 1; 
    }
}

class Solution {
    public static int maxMeetings(int start[], int end[], int n){
        ArrayList<meeting> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new meeting(start[i],end[i],i+1));
        }
        Collections.sort(list,new meetingcomp());
        int count=1;int en=list.get(0).end;
        for(int i=1;i<n;i++){
            int star=list.get(i).start;
            if(star>en){
                count++;
                en=list.get(i).end;
            }
        }
        return count;
    }
}
