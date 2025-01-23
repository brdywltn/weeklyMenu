package com.personal.pantry.menu.model.menu;

public class Menu {
    private Recipe mondayLunch;
    private Recipe mondayDinner;
    private Recipe tuesdayLunch;
    private Recipe tuesdayDinner;
    private Recipe wednesdayLunch;
    private Recipe wednesdayDinner;
    private Recipe thursdayLunch;
    private Recipe thursdayDinner;
    private Recipe fridayLunch;
    private Recipe fridayDinner;
    private Recipe saturdayLunch;
    private Recipe saturdayDinner;
    private Recipe sundayLunch;
    private Recipe sundayDinner;

    public Menu(
            Recipe mondayLunch, Recipe mondayDinner,
            Recipe tuesdayLunch, Recipe tuesdayDinner,
            Recipe wednesdayLunch, Recipe wednesdayDinner,
            Recipe thursdayLunch, Recipe thursdayDinner,
            Recipe fridayLunch, Recipe fridayDinner,
            Recipe saturdayLunch, Recipe saturdayDinner,
            Recipe sundayLunch, Recipe sundayDinner) {
        this.mondayLunch = mondayLunch;
        this.mondayDinner = mondayDinner;
        this.tuesdayLunch = tuesdayLunch;
        this.tuesdayDinner = tuesdayDinner;
        this.wednesdayLunch = wednesdayLunch;
        this.wednesdayDinner = wednesdayDinner;
        this.thursdayLunch = thursdayLunch;
        this.thursdayDinner = thursdayDinner;
        this.fridayLunch = fridayLunch;
        this.fridayDinner = fridayDinner;
        this.saturdayLunch = saturdayLunch;
        this.saturdayDinner = saturdayDinner;
        this.sundayLunch = sundayLunch;
        this.sundayDinner = sundayDinner;
    }

    public Recipe getMondayLunch() {
        return mondayLunch;
    }
    public Recipe getMondayDinner() {
        return mondayDinner;
    }
    public Recipe getTuesdayLunch() {
        return tuesdayLunch;
    }
    public Recipe getTuesdayDinner() {
        return tuesdayDinner;
    }
    public Recipe getWednesdayLunch() {
        return wednesdayLunch;
    }
    public Recipe getWednesdayDinner() {
        return wednesdayDinner;
    }
    public Recipe getThursdayLunch() {
        return thursdayLunch;
    }
    public Recipe getThursdayDinner() {
        return thursdayDinner;
    }
    public Recipe getFridayLunch() {
        return fridayLunch;
    }
    public Recipe getFridayDinner() {
        return fridayDinner;
    }
    public Recipe getSaturdayLunch() {
        return saturdayLunch;
    }
    public Recipe getSaturdayDinner() {
        return saturdayDinner;
    }
    public Recipe getSundayLunch() {
        return sundayLunch;
    }
    public Recipe getSundayDinner() {
        return sundayDinner;
    }

    public void setMondayLunch(Recipe mondayLunch) {
        this.mondayLunch = mondayLunch;
    }
    public void setMondayDinner(Recipe mondayDinner) {
        this.mondayDinner = mondayDinner;
    }
    public void setTuesdayLunch(Recipe tuesdayLunch) {
        this.tuesdayLunch = tuesdayLunch;
    }
    public void setTuesdayDinner(Recipe tuesdayDinner) {
        this.tuesdayDinner = tuesdayDinner;
    }
    public void setWednesdayLunch(Recipe wednesdayLunch) {
        this.wednesdayLunch = wednesdayLunch;
    }
    public void setWednesdayDinner(Recipe wednesdayDinner) {
        this.wednesdayDinner = wednesdayDinner;
    }
    public void setThursdayLunch(Recipe thursdayLunch) {
        this.thursdayLunch = thursdayLunch;
    }
    public void setThursdayDinner(Recipe thursdayDinner) {
        this.thursdayDinner = thursdayDinner;
    }
    public void setFridayLunch(Recipe fridayLunch) {
        this.fridayLunch = fridayLunch;
    }
    public void setFridayDinner(Recipe fridayDinner) {
        this.fridayDinner = fridayDinner;
    }
    public void setSaturdayLunch(Recipe saturdayLunch) {
        this.saturdayLunch = saturdayLunch;
    }
    public void setSaturdayDinner(Recipe saturdayDinner) {
        this.saturdayDinner = saturdayDinner;
    }
    public void setSundayLunch(Recipe sundayLunch) {
        this.sundayLunch = sundayLunch;
    }
    public void setSundayDinner(Recipe sundayDinner) {
        this.sundayDinner = sundayDinner;
    }
}
