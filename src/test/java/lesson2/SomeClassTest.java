package lesson2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;


//test Jednostkowy mokito

//adnotacja aby moc korzystać z mokito
@ExtendWith(MockitoExtension.class)
class SomeClassTest {
    //adnotacja określająca, która klasa jest testowana, najcześseij Servis jest testowany
    @InjectMocks
    private SomeClass someClass;

    //adnotacja zaślepki
    @Mock
    private SomeOtherClass someOtherClass;

    @Test
    void someTest() {
        //co ma zwrocic mokowana metoda
        Mockito.when(someOtherClass.showName()).thenReturn("Ania");
        //testowana metoda
        someClass.interactionSomeOtherMethod();


    }
}
