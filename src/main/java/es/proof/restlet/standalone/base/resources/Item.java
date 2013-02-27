package es.proof.restlet.standalone.base.resources;

public class Item {

    private String name;
    private String description;

    public Item() {
    }

    public Item(String name) {
        super();
        this.name = name;
    }

    public Item(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
