package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private final List<Ball> answers;
    

    public Balls(List<Integer> answers) {
        this.answers = mapBall(answers);
    }

    private static List<Ball> mapBall(List<Integer> answers) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            balls.add(new Ball(i+1, answers.get(i)));
        }
        return balls;
    }

    public PlayResult play(List<Integer> balls){
        Balls userBalls = new Balls(balls);
        PlayResult result = new PlayResult();
        for (Ball answer : answers) {
            BallStatus status = userBalls.play(answer);
            result.report(status);
            
        }
        return result;

    }

    public BallStatus play(Ball userBall) {
       return answers.stream()
                .map(answer -> answer.play(userBall)) // balls가 가진 ball의 play 메서드를 이용해 BallStatus를 반환한다.
                .filter(BallStatus::isNotNothing) // NOTHING이 아닌 경우만 필터링
                .findFirst()// NOTHING이 아닌 첫번째를 값을 찾음
                .orElse(BallStatus.NOTHING); // 값이 없을 경우 NOTHING을 리턴


    }
}
