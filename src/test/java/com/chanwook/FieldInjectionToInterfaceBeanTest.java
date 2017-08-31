package com.chanwook;

import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @author chanwook
 */
public class FieldInjectionToInterfaceBeanTest {

    @Test
    public void test() throws Exception {
        final String name = "chanwook";

        final SampleRepository repository = mock(SampleRepository.class);
        when(repository.findByName(name)).thenReturn(new Sample(name));

        final SampleService service = new SampleService();
        ReflectionTestUtils.setField(service, "repository", repository);
        Sample s = service.findOneWithLogic(name);

        assert s != null;
        assert name.equals(s.getName());
    }
}
