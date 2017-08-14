package by.Vitali.HomeWorks.Json.modelATM;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Клас описывающий кредитную карту
 */
public class Card {
    @JsonProperty("Credit card")
    private  String number;
    private Account account;
    private  Bank bank;
    private  Owner owner;
    @JsonProperty("pin-code")
    private  String pin;
    private boolean block = true;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getNumber() {
        return number;
    }

    public Account getAccount() {
        return account;
    }

    public Bank getBank() {
        return bank;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getPin() {
        return pin;
    }

    public boolean isBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number='" + number + '\'' +
                ", account=" + account +
                ", bank=" + bank +
                ", owner=" + owner +
                ", pin='" + pin + '\'' +
                ", block=" + block +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (block != card.block) return false;
        if (number != null ? !number.equals(card.number) : card.number != null) return false;
        if (account != null ? !account.equals(card.account) : card.account != null) return false;
        if (bank != null ? !bank.equals(card.bank) : card.bank != null) return false;
        if (owner != null ? !owner.equals(card.owner) : card.owner != null) return false;
        return pin != null ? pin.equals(card.pin) : card.pin == null;
    }

    @Override
    public int hashCode() {
        int result = number != null ? number.hashCode() : 0;
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (bank != null ? bank.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (pin != null ? pin.hashCode() : 0);
        result = 31 * result + (block ? 1 : 0);
        return result;
    }
}
