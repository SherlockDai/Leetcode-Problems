class Solution {
    public int numTrees(int n) {
        int[] subTreeTalbe = new int[n+1];
        //intial case
        subTreeTalbe[0] = subTreeTalbe[1] = 1;
        for(int numOfNodes = 2; numOfNodes <= n; numOfNodes++){
            int numOfTress = 0;
            for(int index = 1; index <= numOfNodes; index++){
                subTreeTalbe[numOfNodes] += subTreeTalbe[index -1] * subTreeTalbe[numOfNodes - index];
            }
        }
        return subTreeTalbe[n];
    }
}