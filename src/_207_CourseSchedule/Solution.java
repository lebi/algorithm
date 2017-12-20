package _207_CourseSchedule;

/**
 * Created by Administrator on 2017/12/20 0020.
 */
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] graph = new int[numCourses][numCourses];
        for(int[] arr : prerequisites){
            graph[arr[0]][arr[1]] = 1;
        }
        for(int[] arr : prerequisites){
            if(graph[arr[0]][arr[1]] == 1){
                graph[arr[0]][arr[1]] = -1;
                if(!dfs(graph, arr[1]))
                    return false;
                graph[arr[0]][arr[1]] = 2;
            }
        }
        return true;
    }

    boolean dfs(int[][] graph, int j){
        for(int i =0 ;i < graph[j].length; i++){
            if(graph[j][i] == -1)
                return false;
            if(graph[j][i] == 1){
                graph[j][i] = -1;
                if(!dfs(graph, i))
                    return false;
                graph[j][i] = 2;
            }
        }
        return true;
    }

}
