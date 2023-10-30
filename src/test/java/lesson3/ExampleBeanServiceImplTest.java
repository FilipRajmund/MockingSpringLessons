package lesson3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ExampleBeanServiceImplTest {

    @InjectMocks
    private ExampleBeanServiceImpl exampleBeanService;

    @Mock
    private InjectedBeanService injectedBeanService;

    @Test
    void sampleMethod() {

        //given
        Mockito.when(injectedBeanService.anotherSampleMethod(ArgumentMatchers.any())).thenReturn("my value");

        //When
        String result = exampleBeanService.sampleMethod("val1");
        String result2 = exampleBeanService.sampleMethod("val2");
        String result3 = exampleBeanService.sampleMethod("val3");
        //then
        assertEquals ("my value",result);
        assertEquals ("my value",result2);

    }

}