package com.example.problemsolver.framework.solution;

import com.example.problemsolver.framework.graph.Vertex;
import com.example.problemsolver.framework.problem.Problem;

/**
 * This class represents an A* solver by extending the StateSpaceSolver
 * class.
 * @author Sydney Hutchens
 */
public class AStarSolver extends StateSpaceSolver {

    /**
     * Creates an A* solver.
     * This constructor should set the queue to a priority queue (PQ)
     * and set the statistics header.
     * @param problem
     */
    public AStarSolver(Problem problem) {
        super(problem);
//        super.setQueue(new PriorityQueue<>(11,getComparator()));
        super.getStatistics().setHeader("A* Search");

    }

    /**
     * Adds a vertex to the PQ.
     * @param v the vertex to be added
     */
    @Override
    public void add(Vertex v) {
        this.getQueue().add(v);
    }


}
