package sam.task;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import sam.task.Todo;

public class TodoTest {
    @Test
    void toSaveFormat_newTodo_correctFormat() {
        Todo t = new Todo("Read book");
        String expected = "T | 0 | Read book";
        assertEquals(expected, t.toSaveFormat());
    }

    @Test
    void toSaveFormat_doneTodo_correctFormat() {
        Todo t = new Todo("Read book", true);
        String expected = "T | 1 | Read book";
        assertEquals(expected, t.toSaveFormat());
    }
}