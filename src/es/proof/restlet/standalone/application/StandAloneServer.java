package es.proof.restlet.standalone.application;

import org.restlet.Server;
import org.restlet.data.Protocol;

import es.proof.restlet.standalone.base.resource.HelloWorldResource;

public class StandAloneServer {
    public static void main(String[] args) throws Exception {
        new Server(Protocol.HTTP, 8182, 
                HelloWorldResource.class).start();
    }
}