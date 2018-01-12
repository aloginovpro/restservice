package pro.aloginov.restservice;


import pro.aloginov.restservice.protocol.TestRequest;
import pro.aloginov.restservice.protocol.TestResponse;

import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Singleton
@Path("test")
@Produces(MediaType.APPLICATION_JSON)
public class TestController {


    @GET
    @Path("{id}")
    public TestResponse getTest(@PathParam("id") int id) {
        return new TestResponse(id, "ok!");
    }

    @POST
    public String postTest(TestRequest req) {
        return req.id + " - ok";
    }

}
