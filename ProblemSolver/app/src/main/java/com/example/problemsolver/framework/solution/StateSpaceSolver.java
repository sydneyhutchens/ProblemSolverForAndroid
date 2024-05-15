package com.example.problemsolver.framework.solution;

import com.example.problemsolver.framework.graph.Vertex;
import com.example.problemsolver.framework.problem.Mover;
import com.example.problemsolver.framework.problem.Problem;
import com.example.problemsolver.framework.problem.State;
import java.util.List;
import java.util.LinkedList;

/**
 * This class represents a state space solver by extending the abstract
 * Solver class.
 * @author Sydney Hutchens
 */
public class StateSpaceSolver extends Solver {

    /**
     * Creates a BFS or DFS state space solver.
     * This constructor should set the queue to a double-ended queue
     * (DEQUE) like the GraphSolver.
     * @param problem the problem being solved
     */
    public StateSpaceSolver(Problem problem) {
        super(problem);
        super.setQueue(new LinkedList<>());
    }

    /**
     * This method implements the expand operation required by the
     * state space search algorithm.
     * @param u the vertex being expanded
     * @return the children of u in the state space search tree
     */
    @Override
    public List<Vertex> expand(Vertex u) {
        List<Vertex> ret = new LinkedList<>();
        List<String> moveNames = getProblem().getMover().getMoveNames();
        for(String s: moveNames) {
            Vertex v = new Vertex(getProblem().getMover().doMove(s, (State)u.getData()));
            if(v.getData() != null) {
                ret.add(v);
            }

        }
        return ret;
    }
}
