import static spark.Spark.*;

/**
 * @Author zp
 * @Date 2019-04-17 11:53
 **/
public class Demo {

    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
