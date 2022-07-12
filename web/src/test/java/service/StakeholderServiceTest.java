package service;

import com.example.App;
import com.example.entity.Student;
import com.example.service.StakeholderService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = App.class)
class StakeholderServiceTest {

    @Mock
    @Autowired
    StakeholderService service;

    @Test
    void addStakeholder() {
        var student = new Student();
        student.setName("Timmy Tester");
        var response = service.addStakeholder(student);
        assertEquals("Timmy Tester", response.getName());
    }

    @Test
    void addStakeholders() {
        var s1 = new Student(1L, "s1", "e1", "id1");
        var s2 = new Student(2L, "s2", "e2", "id2");
        var s3 = new Student(3L, "s3", "e3", "id3");
        var s4 = new Student(4L, "s4", "e4", "id4");
        var response = service.addStakeholders(s1, s2, s3, s4);
        assertEquals(4, response.size(), "Unexpected response list size");
        assertTrue(response.stream().anyMatch(stakeholder ->
                stakeholder.getName().equals("s3")), "Test name 's3' not found");
    }
}