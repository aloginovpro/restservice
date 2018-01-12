package pro.aloginov.restservice.protocol;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TestRequest {

    public final int id;

    @JsonCreator
    public TestRequest(@JsonProperty("id") int id) {
        this.id = id;
    }
}
