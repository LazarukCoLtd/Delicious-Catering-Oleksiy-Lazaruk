package BLL.domain;

public class Decoration {

    private String id;

    private String description;

    private String colour;


    public Decoration() {
    }

    public Decoration(String id, String description, String colour) {
        this.id = id;
        this.description = description;
        this.colour = colour;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
