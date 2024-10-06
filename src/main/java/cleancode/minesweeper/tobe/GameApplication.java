package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.gamelevel.Advanced;
import cleancode.minesweeper.tobe.gamelevel.Beginner;
import cleancode.minesweeper.tobe.gamelevel.GameLevel;
import cleancode.minesweeper.tobe.gamelevel.VeryBeginner;
import cleancode.minesweeper.tobe.io.ConsoleInputHandler;
import cleancode.minesweeper.tobe.io.ConsoleOutputHandler;
import cleancode.minesweeper.tobe.io.InputHandler;
import cleancode.minesweeper.tobe.io.OutputHandler;

public class GameApplication {
    public static void main(String[] args) {
        GameLevel gameLevel = new Beginner();
        InputHandler consoleInputHandler = new ConsoleInputHandler();
        OutputHandler consoleOutputHandler = new ConsoleOutputHandler();

        Minesweeper minesweeper = new Minesweeper(gameLevel, consoleInputHandler, consoleOutputHandler);
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
