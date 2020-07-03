class Solution {
        // public int[] prisonAfterNDays(int[] cells, int N) {
        //      Map<String,Integer> map = new HashMap();
        //     for(int i = 0;i<N;i++){
        //         String s = Arrays.toString(cells);
        //         if(map.containsKey(s)){   // occured
        //             int looplength = i-map.get(s);
        //             int remainingdays = (N-i)%looplength;
        //             return prisonAfterNDays(cells,remainingdays);
        //         }
        //         else{
        //             map.put(s,i);
        //             int prev = cells[0];
        //             for(int j = 1;j<7;j++){
        //                 int next = cells[j+1];
        //                 int curr = cells[j];
        //                 cells[j] = 1-(prev^next);
        //                 prev = curr;
        //             }
        //         }
        //         cells[0] = 0;
        //         cells[7] = 0;
        //     }
        //     return cells;
        // }

    
    public int[] prisonAfterNDays(int[] cells, int N) {
        N = (N - 1) % 14 + 1;
        for (int i = 0; i < N; i++)
            cells = nextDayState(cells);
        return cells;
    }
    
    private int[] nextDayState(int[] cells) {
        int[] next = new int[cells.length];
        for(int i = 1; i < cells.length - 1; i++)
            next[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
        return next;
    }
}
