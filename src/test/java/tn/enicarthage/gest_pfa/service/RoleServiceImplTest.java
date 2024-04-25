package tn.enicarthage.gest_pfa.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import tn.enicarthage.gest_pfa.model.Role;
import tn.enicarthage.gest_pfa.repository.RoleRepository;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RoleServiceImplTest {
    @Mock
    private RoleRepository roleRepository;

    @InjectMocks
    private RoleServiceImpl roleServiceMock;

    @Test
    public void findAll_shouldReturnRolesList() {

        List<Role> expectedRoles = Arrays.asList(
                new Role(),
                new Role()
        );
        when(roleRepository.findAll()).thenReturn(expectedRoles);

        assertThat(roleServiceMock.findAll()).isEqualTo(expectedRoles);
    }

}