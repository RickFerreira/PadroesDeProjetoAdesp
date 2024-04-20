package br.edu.ifpb.esperanca.pdp.adesp.models;

public enum Schedule {
    SLOT_1("07:00 - 07:50"),
    SLOT_2("07:50 - 08:40"),
    SLOT_3("08:40 - 09:30"),
    SLOT_4("09:50 - 10:40"),
    SLOT_5("10:40 - 11:30"),
    SLOT_6("11:30 - 12:20"),
    SLOT_7("13:00 - 13:50"),
    SLOT_8("13:50 - 14:40"),
    SLOT_9("14:40 - 15:30"),
    SLOT_10("15:50 - 16:40"),
    SLOT_11("16:40 - 17:30");

    private final String timeRange;

    Schedule(String timeRange) {
        this.timeRange = timeRange;
    }

    public String getTimeRange() {
        return timeRange;
    }
}
