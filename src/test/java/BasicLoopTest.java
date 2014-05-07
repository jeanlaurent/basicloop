import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BasicLoopTest {


    @Test
    public void should_handle_input() {
        assertThat(new BasicLoop().doSomethingWithInput("foobar")).isEqualTo("< foobar");
    }

}