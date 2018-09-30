package org.mackenzie;

import java.util.ArrayList;
import java.util.List;

public class LengthOfMaxTurbulence {

    public enum Direction {
        UP,
        DOWN,
        SAME
    }

    public int solution(int[] A) {
        List<List<Direction>> directions = new ArrayList<>();
        List<Direction> current = new ArrayList<>();
        Direction lastDirection = Direction.SAME;
        for(int i = 0; i < A.length - 1; i++) {
            if(A[i] < A[i+1] && !lastDirection.equals(Direction.UP)) {
                current.add(Direction.UP);
                lastDirection = Direction.UP;
            } else if(A[i] < A[i+1] && lastDirection.equals(Direction.UP)) {
                directions.add(current);
                current = new ArrayList<>();
                current.add(Direction.UP);
                lastDirection = Direction.UP;
            } else if (A[i] > A[i+1] && !lastDirection.equals(Direction.DOWN)) {
                current.add(Direction.DOWN);
                lastDirection = Direction.DOWN;
            } else if (A[i] > A[i+1] && lastDirection.equals(Direction.DOWN)) {
                directions.add(current);
                current = new ArrayList<>();
                current.add(Direction.DOWN);
                lastDirection = Direction.DOWN;
            } else {
                directions.add(current);
                current = new ArrayList<>();
                lastDirection = Direction.SAME;
            }
        }
        return directions.stream()
                .map(direction -> direction.size() + 1)
                .max(Integer::compareTo)
                .orElse(A.length);
    }
}
