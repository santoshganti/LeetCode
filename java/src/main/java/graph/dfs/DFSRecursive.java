package graph.dfs;

import graph.bfs.GraphNode;

import java.util.ArrayList;

public class DFSRecursive {

    ArrayList<GraphNode> nodeList = new ArrayList<>();

    public DFSRecursive(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<>();

        //create 10 nodes: v1-v10
        for (int i = 1; i < 11; i++) {
            nodeList.add(new GraphNode("V" + i));
        }

        DFSRecursive graph = new DFSRecursive(nodeList);

        //add edges following graph in graph.docx
        graph.addUndirectedEdge(1, 2);
        graph.addUndirectedEdge(1, 4);
        graph.addUndirectedEdge(2, 3);
        graph.addUndirectedEdge(2, 5);
        graph.addUndirectedEdge(3, 6);
        graph.addUndirectedEdge(3, 10);
        graph.addUndirectedEdge(4, 7);
        graph.addUndirectedEdge(5, 8);
        graph.addUndirectedEdge(6, 9);
        graph.addUndirectedEdge(7, 8);
        graph.addUndirectedEdge(8, 9);
        graph.addUndirectedEdge(9, 10);

        //dfs from v1
        System.out.println("Printing DFS from source: V1");
        graph.dfs();
    }

    void dfs() {
        for (GraphNode node : nodeList) {
            if (!node.isVisited()) {
                dfsVisit(node);
            }
        }
    }

    private void dfsVisit(GraphNode node) {
        node.setVisited(true);
        System.out.println(node.getName() + " ");

        for (GraphNode neighbor : nodeList) {
            if (!neighbor.isVisited()) {
                dfsVisit(neighbor);
            }
        }
    }


    public void addUndirectedEdge(int i, int j) {
        GraphNode first = nodeList.get(i - 1);
        GraphNode second = nodeList.get(j - 1);

        first.getNeighbors().add(second);
        second.getNeighbors().add(first);
    }

}