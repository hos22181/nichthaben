package at.spg.projectkiesslinghossain;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetUserList() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/user")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$").isArray())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].userId").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].username").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].email").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].firstName").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].lastName").exists());
    }

    //dieser test funktioniert nicht
    @Test
    public void testFindUserById() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/findUser")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Benutzer mit ID 21 nicht gefunden"));
    }

    @Test
    public void testFindUserByIdWithValidId() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/findUser")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(MediaType.TEXT_PLAIN))
                .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("paulo")));
    }
}
