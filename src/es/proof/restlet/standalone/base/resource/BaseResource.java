package es.proof.restlet.standalone.base.resource;

import java.util.concurrent.ConcurrentMap;

import org.restlet.resource.ServerResource;

import es.proof.restlet.standalone.application.FirstResourceApplication;
import es.proof.restlet.standalone.base.resources.Item;

/**
 * Base resource class that supports common behaviours or attributes shared by
 * all resources.
 * 
 */
public abstract class BaseResource extends ServerResource {

    /**
     * Returns the map of items managed by this application.
     * 
     * @return the map of items managed by this application.
     */
    protected ConcurrentMap<String, Item> getItems() {
        return ((FirstResourceApplication) getApplication()).getItems();
    }

}
