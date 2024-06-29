package com.javafruit.service;

import com.javafruit.model.Destination;
import com.javafruit.repository.DestinationRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DestinationServiceTests {

    @Mock
    private DestinationRepository destinationRepository;

    @InjectMocks
    private DestinationService destinationService;

    @Test
    void testFindById() {
        // Given
        Long id = 1L;
        Destination mockDestination = new Destination();
        mockDestination.setId(id);
        mockDestination.setName("Paris");

        when(destinationRepository.findById(id)).thenReturn(Optional.of(mockDestination));

        // When
        Destination foundDestination = destinationService.findById(id);

        // Then
        assertEquals(id, foundDestination.getId());
        assertEquals("Paris", foundDestination.getName());
    }

    @Test
    void testFindAll() {
        // Given
        Destination destination1 = new Destination();
        destination1.setId(1L);
        destination1.setName("Paris");

        Destination destination2 = new Destination();
        destination2.setId(2L);
        destination2.setName("Tokyo");

        List<Destination> mockDestinations = Arrays.asList(destination1, destination2);

        when(destinationRepository.findAll()).thenReturn(mockDestinations);

        // When
        List<Destination> foundDestinations = destinationService.findAll();

        // Then
        assertEquals(2, foundDestinations.size());
        assertEquals("Paris", foundDestinations.get(0).getName());
        assertEquals("Tokyo", foundDestinations.get(1).getName());
    }

    @Test
    void testSave() {
        // Given
        Destination newDestination = new Destination();
        newDestination.setName("London");

        when(destinationRepository.save(newDestination)).thenReturn(newDestination);

        // When
        Destination savedDestination = destinationService.save(newDestination);

        // Then
        assertEquals("London", savedDestination.getName());
        verify(destinationRepository, times(1)).save(newDestination);
    }

    @Test
    void testDeleteById() {
        // Given
        Long id = 1L;

        // When
        destinationService.deleteById(id);

        // Then
        verify(destinationRepository, times(1)).deleteById(id);
    }
}
