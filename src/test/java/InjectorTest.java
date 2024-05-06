import org.example.Injector;
import org.example.SomeBean;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

public class InjectorTest {
    @Test
    public void testInject() throws Exception {
        String filePath = "propertiesFile.properties";
        Injector injector = new Injector(filePath);

        SomeBean sb = injector.inject(new SomeBean());

        assertNotNull(sb);
        assertNotNull(sb.getField1());
        assertNotNull(sb.getField2());
    }
}
