package com.infosys.irs.exception;

/**
* 
 * This Exception is thrown from RegistrationService class with error
* message RegistrationService.INVALID_PHONE_NUMBER if the given 
 * phone is not matching the constraints given in the regular expression.
* 
 * @author ETA_JAVA
*
*/
public class InvalidPhoneException extends Exception{
                private static final long serialVersionUID = 1L;
                /**
                * 
                 * This Exception is thrown from RegistrationService class with error
                * message RegistrationService.INVALID_PHONE_NUMBER if the given 
                 * phone is not matching the constraints given in the regular expression.
                * 
                 * @author ETA_JAVA
                *
                */
                public InvalidPhoneException(String message)
                {
                                super(message);
                }
}