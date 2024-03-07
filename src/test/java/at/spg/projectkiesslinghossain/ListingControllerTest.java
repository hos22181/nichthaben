package at.spg.projectkiesslinghossain;

import at.spg.projectkiesslinghossain.domain.ProductCondition;
import at.spg.projectkiesslinghossain.domain.PropertyType;
import at.spg.projectkiesslinghossain.domain.VehicleCondition;
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
public class ListingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetPropertyListing() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/listing")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].type").value(PropertyType.APARTMENT.toString()))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].area").value(100.0))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].rooms").value(4))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].address").value("Meidlinger Hauptstraße 23, 1120 Wien"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].buildYear").value(1977));
    }

    //this test does not work
    @Test
    public void testGetProductListing() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/listing")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].productName").value("iPhone 12 Pro"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].condition").value(ProductCondition.NEW.toString()))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].manufacturer").value("Apple"));
    }

    // this test does not work
    @Test
    public void testGetVehicleListing() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/listing")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$[2].manufacturer").value("Mercedes AMG"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[2].model").value("Audi"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[2].constructionYear").value(2020))
                .andExpect(MockMvcResultMatchers.jsonPath("$[2].mileage").value(120))
                .andExpect(MockMvcResultMatchers.jsonPath("$[2].vehicleCondition").value(VehicleCondition.NEW_LIKE.toString()))
                .andExpect(MockMvcResultMatchers.jsonPath("$[2].fuelType").value("Electric"));
    }


}
