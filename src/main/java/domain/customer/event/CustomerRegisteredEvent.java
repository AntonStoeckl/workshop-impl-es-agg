package domain.customer.event;

import domain.customer.value.EmailAddress;
import domain.customer.value.Hash;
import domain.customer.value.ID;
import domain.customer.value.PersonName;

public class CustomerRegisteredEvent implements Event {

    public final Hash confirmationHash;
    public final EmailAddress emailAddress;
    public final ID customerId;
    public final PersonName personName;


    private CustomerRegisteredEvent(Hash confirmationHash, EmailAddress emailAddress, ID customerId, PersonName personName) {
        this.confirmationHash = confirmationHash;
        this.emailAddress = emailAddress;
        this.customerId = customerId;
        this.personName = personName;
    }

    public static CustomerRegisteredEvent build(ID customerID, EmailAddress emailAddress, Hash confirmationHash, PersonName name) {
        return new CustomerRegisteredEvent(confirmationHash, emailAddress, customerID, name);
    }
}