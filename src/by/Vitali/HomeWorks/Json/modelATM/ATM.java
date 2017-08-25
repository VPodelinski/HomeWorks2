package by.Vitali.HomeWorks.Json.modelATM;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by viivpo2010 on 14.8.17.
 */
public class ATM {
    private Bank bank;
    private Map<Integer , Integer> mapCash ;// map для хранения банкнот
    private Set<String> setBanks = new HashSet();// set для названий банков карточек которые могут обслуживаться

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Set<String> getSetBanks() {
        return setBanks;
    }

    public void setSetBanks(Set<String> setBanks) {
        this.setBanks = setBanks;
    }

    public Map<Integer, Integer> getMapCash() {
        return mapCash;
    }

    public void setMapCash(Map<Integer, Integer> mapCash) {
        setBanks.add("BelarusBank");
        setBanks.add("BPSBank");
        setBanks.add("BelInvestBank");
        this.mapCash = mapCash;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ATM atm = (ATM) o;

        if (bank != null ? !bank.equals(atm.bank) : atm.bank != null) return false;
        if (mapCash != null ? !mapCash.equals(atm.mapCash) : atm.mapCash != null) return false;
        return setBanks != null ? setBanks.equals(atm.setBanks) : atm.setBanks == null;
    }

    @Override
    public int hashCode() {
        int result = bank != null ? bank.hashCode() : 0;
        result = 31 * result + (mapCash != null ? mapCash.hashCode() : 0);
        result = 31 * result + (setBanks != null ? setBanks.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "bank=" + bank +
                ", mapCash=" + mapCash +
                ", setBanks=" + setBanks +
                '}';
    }
}
