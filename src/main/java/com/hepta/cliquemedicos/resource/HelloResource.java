package main.java.com.hepta.cliquemedicos.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.Path;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

@Path("/v1")
@Api(tags = {"Hello"})
public class HelloResource extends Application {

    @Path("/hello")
    @ApiOperation(
            produces="application/json",
            value = "Fetch employee details",
            httpMethod="GET",
            notes = "<br>This service fetches Employee details",
            response = String.class)
    @ApiResponses(
            value = {
                    @ApiResponse(
                            code = 200,
                            response = String.class,
                            message = "Successful operation"),
                    @ApiResponse(
                            code = 400,
                            message = "Bad Request",
                            response = Error.class),
                    @ApiResponse(
                            code = 422,
                            message = "Invalid data",
                            response = Error.class),
                    @ApiResponse(code = 500,
                            message = "Internal Server Error",
                            response = Error.class)
            })
    public Response hello() {
        return Response.ok().entity("Hello").build();
    }
}
