class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
       for(int i =0;i<n;i++){
           for(int j = 0;j<m;j++){
               if(grid[i][j] == 0){continue;}
                   count += 4;    //== incrementing the count just when we enter 
                                  //the loop so that we don't have to check for edge cases
              if(i>0){count -= grid[i-1][j];}
               if(i<n-1){count -= grid[i+1][j];}
               if(j>0){count -= grid[i][j-1];}
               if(j<m-1){count -= grid[i][j+1];}
           }
       }
        return count;
    }
}
