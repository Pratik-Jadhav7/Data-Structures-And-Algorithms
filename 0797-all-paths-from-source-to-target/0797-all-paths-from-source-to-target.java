class Solution {
public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    Map<Integer, List<List<Integer>>> map = new HashMap<>();

    return dfsSearch(graph, 0, map);   
}

private List<List<Integer>> dfsSearch(int[][] graph, int node, Map<Integer, List<List<Integer>>> map) {
    if (map.containsKey(node)) {
        return map.get(node);
    }

    List<List<Integer>> res = new ArrayList<>();
    if (node == graph.length - 1) {
        List<Integer> path = new LinkedList<>();
        path.add(node);
        res.add(path);
    } else {
        for (int nextNode : graph[node]) {
            List<List<Integer>> subPaths = dfsSearch(graph, nextNode, map);
            for (List<Integer> path : subPaths) {
                LinkedList<Integer> newPath = new LinkedList<>(path);
                newPath.addFirst(node);
                res.add(newPath);
            }
        }
    }

    map.put(node, res);
    return res;
}
}