package Medium.Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Evaluate_Division {
    /*
     * Question
     * You are given an array of variable pairs equations and an array of real
     * numbers values, where equations[i] = [Ai, Bi] and values[i] represent the
     * equation Ai / Bi = values[i]. Each Ai or Bi is a string that represents a
     * single variable.
     * 
     * You are also given some queries, where queries[j] = [Cj, Dj] represents the
     * jth query where you must find the answer for Cj / Dj = ?.
     * 
     * Return the answers to all queries. If a single answer cannot be determined,
     * return -1.0.
     * 
     * Note: The input is always valid. You may assume that evaluating the queries
     * will not result in division by zero and that there is no contradiction.
     * 
     * Note: The variables that do not occur in the list of equations are undefined,
     * so the answer cannot be determined for them.
     * Example 1:
     * 
     * Input: equations = [["a","b"],["b","c"]], values = [2.0,3.0], queries =
     * [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]
     * Output: [6.00000,0.50000,-1.00000,1.00000,-1.00000]
     * Explanation:
     * Given: a / b = 2.0, b / c = 3.0
     * queries are: a / c = ?, b / a = ?, a / e = ?, a / a = ?, x / x = ?
     * return: [6.0, 0.5, -1.0, 1.0, -1.0 ]
     * note: x is undefined => -1.0
     */
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = buildGraph(equations, values);
        double[] result = new double[queries.size()];
        
        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            String start = query.get(0);
            String end = query.get(1);
            
            if (!graph.containsKey(start) || !graph.containsKey(end)) {
                result[i] = -1.0;
            } else {
                result[i] = dfs(start, end, new HashSet<>(), 1.0, graph);
            }
        }
        
        return result;
    }
    
    private double dfs(String src, String dst, Set<String> visited, double product, Map<String, Map<String, Double>> graph) {
        if (visited.contains(src)) {
            return -1.0;
        }
        
        visited.add(src);
        
        if (src.equals(dst)) {
            return product;
        }
        
        Map<String, Double> neighbors = graph.get(src);
        
        for (Map.Entry<String, Double> neighbor : neighbors.entrySet()) {
            String node = neighbor.getKey();
            double val = neighbor.getValue();
            double result = dfs(node, dst, visited, product * val, graph);
            
            if (result != -1.0) {
                return result;
            }
        }
        
        return -1.0;
    }
    
    private Map<String, Map<String, Double>> buildGraph(List<List<String>> equations, double[] values) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        
        for (int i = 0; i < equations.size(); i++) {
            List<String> equation = equations.get(i);
            String u = equation.get(0);
            String v = equation.get(1);
            double val = values[i];
            
            graph.putIfAbsent(u, new HashMap<>());
            graph.putIfAbsent(v, new HashMap<>());
            
            graph.get(u).put(v, val);
            graph.get(v).put(u, 1.0 / val);
        }
        
        return graph;
    }
}
