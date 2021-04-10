package org.limadelrey;

import org.limadelrey.logging.Log;

import javax.naming.OperationNotSupportedException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Log
@Path("")
@Produces(MediaType.TEXT_PLAIN)
public class GreetingResource {

    /**
     * Get greeting from server.
     *
     * @return Greeting response in plain text
     */
    @GET
    @Path("/hello")
    public final String hello() {
        return "Hello";
    }

    /**
     * Get exception from server.
     *
     * @return Error response in plain text
     */
    @GET
    @Path("/error")
    public final String error() throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Operation is temporarily unavailable");
    }

}
