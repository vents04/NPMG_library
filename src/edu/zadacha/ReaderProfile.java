package edu.zadacha;

import java.util.InputMismatchException;

public class ReaderProfile {
    public String firstName, lastName, phone;
    public char _class;
    public int grade, currentlyTakenBooks;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public char get_class() {
        return _class;
    }

    public String getPhone() {
        return phone;
    }

    public int getGrade() {
        return grade;
    }

    public int getCurrentlyTakenBooks() {
        return currentlyTakenBooks;
    }

    public void setFirstName(String firstName) {
        if(firstName == null || firstName.length() == 0) {
            throw new InputMismatchException("First name must not be null or zero length");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if(lastName == null || lastName.length() == 0) {
            throw new InputMismatchException("Last name must not be null or zero length");
        }
        this.lastName = lastName;
    }

    public void set_class(char _class) {
        this._class = _class;
    }

    public void setPhone(String phone) {
        if(phone == null || phone.length() == 0) {
            throw new InputMismatchException("Phone number must not be null or zero length");
        }
        if(phone.length() < 8 || phone.length() > 15) {
            throw new InputMismatchException("Phone number length must be between 8 and 15 to be valid");
        }
        this.phone = phone;
    }

    public void setGrade(int grade) {
        if(grade < 1 || grade > 12) {
            throw new InputMismatchException("Grade should be between 1 and 12");
        }
        this.grade = grade;
    }

    public void setCurrentlyTakenBooks(int currentlyTakenBooks) {
        if(currentlyTakenBooks < 0) {
            throw new InputMismatchException("Currently taken books cannot be less than 0");
        }
        this.currentlyTakenBooks = currentlyTakenBooks;
    }

    public ReaderProfile(String firstName, String lastName, String phone, char _class, int grade, int currentlyTakenBooks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this._class = _class;
        this.grade = grade;
        this.currentlyTakenBooks = currentlyTakenBooks;
    }

    public ReaderProfile(String firstName, String lastName, String phone, char _class, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this._class = _class;
        this.grade = grade;
        this.setCurrentlyTakenBooks(0);
    }

    @Override
    public String toString() {
        return "ReaderProfile{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", _class=" + _class +
                ", grade=" + grade +
                ", currentlyTakenBooks=" + currentlyTakenBooks +
                '}';
    }
}
