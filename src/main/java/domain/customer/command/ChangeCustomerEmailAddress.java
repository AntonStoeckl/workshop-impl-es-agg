/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.customer.command;

import domain.customer.value.EmailAddress;
import domain.customer.value.Hash;
import domain.customer.value.ID;

/**
 *
 * @author Konrad Renner
 */
public class ChangeCustomerEmailAddress {
    private final ID id;
    private final Hash confirmationHash;
    private final EmailAddress emailAddress;

    private ChangeCustomerEmailAddress(ID id, Hash confirmationHash, EmailAddress emailAddress) {
        this.id = id;
        this.confirmationHash = confirmationHash;
        this.emailAddress = emailAddress;
    }

    public static ChangeCustomerEmailAddress build(ID id, Hash confirmationHash, EmailAddress emailAddress) {
        return new ChangeCustomerEmailAddress(id, confirmationHash, emailAddress);
    }

    public ID getId() {
        return id;
    }

    public Hash getConfirmationHash() {
        return confirmationHash;
    }

    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "ChangeCustomerEmailAddress{" + "id=" + id + ", confirmationHash=" + confirmationHash + ", emailAddress=" + emailAddress + '}';
    }

}