package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.minesweeper.config.GameConfig;
import cleancode.minesweeper.tobe.minesweeper.gamelevel.Beginner;
import cleancode.minesweeper.tobe.minesweeper.io.ConsoleInputHandler;
import cleancode.minesweeper.tobe.minesweeper.io.ConsoleOutputHandler;
import cleancode.minesweeper.tobe.minesweeper.Minesweeper;

public class GameApplication {
    public static void main(String[] args) {

        GameConfig gameConfig = new GameConfig(
                new Beginner(),
                new ConsoleInputHandler(),
                new ConsoleOutputHandler()
        );

        // 게임 설정이 추가되거나 변경될 수도 있다는 도메인 지식을 발견한다면???
        // 게임 설정이 변경될 때마다 Minesweeper 의 생성자가 계속 바뀌게 되므로, 생성자의 변경이 없도록 게임 설정 객체로 패키징을 해준 것이다.
        // 단, 너무 과하면 역효과가 날 수도 있다.
        Minesweeper minesweeper = new Minesweeper(gameConfig);
        minesweeper.initialize();
        minesweeper.run();
    }

    /**
     * DIP (Dependency Inversion Principle)
     * -> 추상화에 의존해야 한다.
     *
     * DI (Dependency Injection)
     * -> 제 "3" 자가  주입해줘야 한다. 스프링에서는 스프링 컨텍스트가 그 역할을 맡는다.
     *
     * IoC (Inversion of Control)
     * -> 개발의 흐름을 개발자가 아닌 프레임워크가 담당하게 되는 것이다.
     */

}
