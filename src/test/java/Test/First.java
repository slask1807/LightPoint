package Test;

import org.junit.Test;

public class First extends TestBase {
    @Test
    public void firstTest() throws InterruptedException {
        main.goTo();
        main.chooseTask();
        taskOne.checkPageIsCorrect();
    }
}
