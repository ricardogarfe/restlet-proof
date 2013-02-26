package es.proof.restlet.standalone.base.resource;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;

/**
 * Resource which has only one representation.
 * 
 */
public class HelloWorldResource extends ServerResource {

    @Get
    public String handleGet() {
        return "HTTP GET - Hello World";
    }
 
    @Post
    public String handlePost() {
        return "HTTP POST - Hello World.";
    }
 
    @Put
    public String handlePut() {
        return "HTTP PUT - Hello World.";
    }
 
    @Delete
    public String handleDelete() {
        return "HTTP DELETE - Hello World.";
    }
}
   
