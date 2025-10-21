package co.edu.uco.nose.dto;

import java.util.UUID;

import co.edu.uco.nose.crosscuting.helper.TextHelper;
import co.edu.uco.nose.crosscuting.helper.UUIDHelper;

public class UserDto extends Dto {
	
    private UUID id;
    private IdTypeDto idType;
    private String idNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private String secondLastName;
    private CityDto residenceCity;
    private String email;
    private String cellPhoneNumber;
    private boolean emailConfirmed;
    private boolean cellPhoneNumberConfirmed;
    private boolean emailConfirmedDefaultValue;
    private boolean cellPhoneNumberConfirmedDefaultValue;

    public UserDto() {
        super(UUIDHelper.getUUIDHelper().getDefault());
        setId(UUIDHelper.getUUIDHelper().getDefault());
        setIdType(IdTypeDto.getDefault());
        setIdNumber(TextHelper.getDefault());
        setFirstName(TextHelper.getDefault());
        setMiddleName(TextHelper.getDefault());
        setLastName(TextHelper.getDefault());
        setSecondLastName(TextHelper.getDefault());
        setResidenceCity(new CityDto());
        setEmail(TextHelper.getDefault());
        setCellPhoneNumber(TextHelper.getDefault());
        setCellPhoneNumberConfirmed(false);
        setCellPhoneNumberConfirmedDefaultValue(true);
        setEmailConfirmed(false);
        setEmailConfirmedDefaultValue(true);
    }

    public UserDto(final UUID id) {
        super(id);
        setId(id);
        setIdType(IdTypeDto.getDefault());
        setIdNumber(TextHelper.getDefault());
        setFirstName(TextHelper.getDefault());
        setMiddleName(TextHelper.getDefault());
        setLastName(TextHelper.getDefault());
        setSecondLastName(TextHelper.getDefault());
        setResidenceCity(new CityDto());
        setEmail(TextHelper.getDefault());
        setCellPhoneNumber(TextHelper.getDefault());
        setCellPhoneNumberConfirmed(false);
        setCellPhoneNumberConfirmedDefaultValue(true);
        setEmailConfirmed(false);
        setEmailConfirmedDefaultValue(true);
    }


    private UserDto(UUID id, IdTypeDto idType, String idNumber, String firstName, String middleName,
                    String lastName, String secondLastName, CityDto residenceCity, String email,
                    String cellPhoneNumber, boolean emailConfirmed, boolean cellPhoneNumberConfirmed,
                    boolean emailConfirmedDefaultValue, boolean cellPhoneNumberConfirmedDefaultValue) {
        super(id);
        setId(id);
        setIdType(idType);
        setIdNumber(idNumber);
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
        setSecondLastName(secondLastName);
        setResidenceCity(residenceCity);
        setEmail(email);
        setCellPhoneNumber(cellPhoneNumber);
        setEmailConfirmed(emailConfirmed);
        setCellPhoneNumberConfirmed(cellPhoneNumberConfirmed);
        setEmailConfirmedDefaultValue(emailConfirmedDefaultValue);
        setCellPhoneNumberConfirmedDefaultValue(cellPhoneNumberConfirmedDefaultValue);
    }

    // 🔹 Getters y Setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public IdTypeDto getIdType() {
        return idType;
    }

    public void setIdType(IdTypeDto idType) {
        this.idType = idType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public CityDto getResidenceCity() {
        return residenceCity;
    }

    public void setResidenceCity(CityDto residenceCity) {
        this.residenceCity = residenceCity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public boolean isEmailConfirmed() {
        return emailConfirmed;
    }

    public void setEmailConfirmed(boolean emailConfirmed) {
        this.emailConfirmed = emailConfirmed;
    }

    public boolean isCellPhoneNumberConfirmed() {
        return cellPhoneNumberConfirmed;
    }

    public void setCellPhoneNumberConfirmed(boolean cellPhoneNumberConfirmed) {
        this.cellPhoneNumberConfirmed = cellPhoneNumberConfirmed;
    }

    public boolean isEmailConfirmedDefaultValue() {
        return emailConfirmedDefaultValue;
    }

    public void setEmailConfirmedDefaultValue(boolean emailConfirmedDefaultValue) {
        this.emailConfirmedDefaultValue = emailConfirmedDefaultValue;
    }

    public boolean isCellPhoneNumberConfirmedDefaultValue() {
        return cellPhoneNumberConfirmedDefaultValue;
    }

    public void setCellPhoneNumberConfirmedDefaultValue(boolean cellPhoneNumberConfirmedDefaultValue) {
        this.cellPhoneNumberConfirmedDefaultValue = cellPhoneNumberConfirmedDefaultValue;
    }
}
