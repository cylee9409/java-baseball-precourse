package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;

public class StrikeBalls {

    public static final int NUM_BALL_LEN = 3;
    public static final int MIN_BALL_VAL = 1;
    public static final int MAX_BALL_VAL = 9;

    ArrayList<Integer> strikeBalls;

    public StrikeBalls() {
        strikeBalls = new ArrayList<>();
        setStrikeBalls();
    }

    private void setStrikeBalls() {
        while (strikeBalls.size() < NUM_BALL_LEN) {
            int num = Randoms.pickNumberInRange(MIN_BALL_VAL, MAX_BALL_VAL);
            addIfNotExists(num);
        }
    }

    private void addIfNotExists(int num) {
        if (!strikeBalls.contains(num)) {
            strikeBalls.add(num);
        }
    }

    public int getStrikeBall(int index) {
        return strikeBalls.get(index);
    }

}
