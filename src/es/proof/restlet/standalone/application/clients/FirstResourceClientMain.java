/**
 * Copyright 2005-2012 Restlet S.A.S.
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: Apache 2.0 or LGPL 3.0 or LGPL 2.1 or CDDL 1.0 or EPL
 * 1.0 (the "Licenses"). You can select the license that you prefer but you may
 * not use this file except in compliance with one of these Licenses.
 * 
 * You can obtain a copy of the Apache 2.0 license at
 * http://www.opensource.org/licenses/apache-2.0
 * 
 * You can obtain a copy of the LGPL 3.0 license at
 * http://www.opensource.org/licenses/lgpl-3.0
 * 
 * You can obtain a copy of the LGPL 2.1 license at
 * http://www.opensource.org/licenses/lgpl-2.1
 * 
 * You can obtain a copy of the CDDL 1.0 license at
 * http://www.opensource.org/licenses/cddl1
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://www.restlet.com/products/restlet-framework
 * 
 * Restlet is a registered trademark of Restlet S.A.S.
 */

package es.proof.restlet.standalone.application.clients;

import java.io.IOException;

import org.restlet.data.Form;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import es.proof.restlet.standalone.base.resources.Item;

public class FirstResourceClientMain {

    public static void main(String[] args) throws IOException,
            ResourceException {
        // Define our Restlet client resources.
        ClientResource itemsResource = new ClientResource(
                "http://localhost:8182/firstResource/items");
        ClientResource itemResource = null;

        // Create a new item
        Item item = new Item("item1", "this is an item.");
        try {
            Representation r = itemsResource.post(getRepresentation(item));
            itemResource = new ClientResource(r.getLocationRef());
        } catch (ResourceException e) {
            System.out.println("Error  status: " + e.getStatus());
            System.out.println("Error message: " + e.getMessage());
        }
        // Consume the response's entity which releases the connection
        itemsResource.getResponseEntity().exhaust();

        if (itemResource != null) {
            // Prints the representation of the newly created resource.
            get(itemResource);

            // Prints the list of registered items.
            get(itemsResource);

            // Update the item
            item.setDescription("This is an other description");
            itemResource.put(getRepresentation(item));

            // Prints the list of registered items.
            get(itemsResource);

            // delete the item
            itemResource.delete();

            // Print the list of registered items.
            get(itemsResource);
        }
    }

    /**
     * Prints the resource's representation.
     * 
     * @param clientResource
     *            The Restlet client resource.
     * @throws IOException
     * @throws ResourceException
     */
    public static void get(ClientResource clientResource) throws IOException,
            ResourceException {
        try {
            clientResource.get().write(System.out);
        } catch (ResourceException e) {
            System.out.println("Error  status: " + e.getStatus());
            System.out.println("Error message: " + e.getMessage());
            // Consume the response's entity which releases the connection
            clientResource.getResponseEntity().exhaust();
        }
    }

    /**
     * Returns the Representation of an item.
     * 
     * @param item
     *            the item.
     * 
     * @return The Representation of the item.
     */
    public static Representation getRepresentation(Item item) {
        // Gathering informations into a Web form.
        Form form = new Form();
        form.add("name", item.getName());
        form.add("description", item.getDescription());
        return form.getWebRepresentation();
    }

}
