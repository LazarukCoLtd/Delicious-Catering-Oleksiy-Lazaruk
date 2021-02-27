package BLL.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Event {

    private Integer id;

    private String theme;

    private Integer paxAdults;

    private Integer paxChildren;

    private boolean decorateVenue;

    private List<Decoration> decorations;

    private LocalDate eventDate;

    private LocalTime eventTimeStart;

    private LocalTime eventTimeEnd;

    private String eventAddress;

    private List<FoodSelections> foodSelections;

    private Statuses eventStatus;

    public Event(Integer id, String theme, Integer paxAdults, Integer paxChildren, boolean decorateVenue,
                 List<Decoration> decorations, LocalDate eventDate, LocalTime eventTimeStart,
                 LocalTime eventTimeEnd, String eventAddress, List<FoodSelections> foodSelections,
                 Statuses eventStatus) {
        this.id = id;
        this.theme = theme;
        this.paxAdults = paxAdults;
        this.paxChildren = paxChildren;
        this.decorateVenue = decorateVenue;
        this.decorations = decorations;
        this.eventDate = eventDate;
        this.eventTimeStart = eventTimeStart;
        this.eventTimeEnd = eventTimeEnd;
        this.eventAddress = eventAddress;
        this.foodSelections = foodSelections;
        this.eventStatus = eventStatus;
    }

    public Statuses getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(Statuses eventStatus) {
        this.eventStatus = eventStatus;
    }

    public Event() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Integer getPaxAdults() {
        return paxAdults;
    }

    public void setPaxAdults(Integer paxAdults) {
        this.paxAdults = paxAdults;
    }

    public Integer getPaxChildren() {
        return paxChildren;
    }

    public void setPaxChildren(Integer paxChildren) {
        this.paxChildren = paxChildren;
    }

    public boolean isDecorateVenue() {
        return decorateVenue;
    }

    public void setDecorateVenue(boolean decorateVenue) {
        this.decorateVenue = decorateVenue;
    }

    public List<Decoration> getDecorations() {
        return decorations;
    }

    public void setDecorations(List<Decoration> decorations) {
        this.decorations = decorations;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public LocalTime getEventTimeStart() {
        return eventTimeStart;
    }

    public void setEventTimeStart(LocalTime eventTimeStart) {
        this.eventTimeStart = eventTimeStart;
    }

    public LocalTime getEventTimeEnd() {
        return eventTimeEnd;
    }

    public void setEventTimeEnd(LocalTime eventTimeEnd) {
        this.eventTimeEnd = eventTimeEnd;
    }

    public String getEventAddress() {
        return eventAddress;
    }

    public void setEventAddress(String eventAddress) {
        this.eventAddress = eventAddress;
    }

    public List<FoodSelections> getFoodSelections() {
        return foodSelections;
    }

    public void setFoodSelections(List<FoodSelections> foodSelections) {
        this.foodSelections = foodSelections;
    }
}
