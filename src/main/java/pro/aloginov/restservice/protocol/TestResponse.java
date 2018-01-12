package pro.aloginov.restservice.protocol;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestResponse {

    @JsonProperty("id")
    public final int id;
    @JsonProperty("status")
    public final String status;

    public TestResponse(int id, String status) {
        this.id = id;
        this.status = status;
    }
}
