package de.ssc.restjpa.jpadi;

import java.util.List;

import de.ssc.restjpa.entity.BankEntity;

public interface BankSc {

    BankEntity add(int bankNumber, String description, String serverAdress);

    List<BankEntity> list();

}
