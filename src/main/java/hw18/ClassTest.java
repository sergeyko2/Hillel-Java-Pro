package hw18;

public class ClassTest {

    @BeforeSuite
    public void beforeTest() {
        System.out.println("Before test");
    }

    @Test
    public void test1() {
        System.out.println("Test #1");
    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("Test #2");
    }

    @Test(priority = 3)
    public void test3() {
        System.out.println("Test #3");
    }

    @Test(priority = 8)
    public void test4() {
        System.out.println("Test #4");
    }

    @Test(priority = 2)
    public void test5() {
        System.out.println("Test #5");
    }

    @Test(priority = 4)
    public void test6() {
        System.out.println("Test #6");
    }

    @AfterSuite
    public void afterTest() {
        System.out.println("After test");
    }
}
