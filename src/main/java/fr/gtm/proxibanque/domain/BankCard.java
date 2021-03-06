package fr.gtm.proxibanque.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <h3>Entité représentant une carte bancaire en base de données :</h3>
 * <ul>
 * <li>de type Visa eletron ou premier</li>
 * <li>avec un numéro d'identification (pin) sur 8 chiffres</li>
 * </ul>
 * 
 * @author Adminl
 *
 */
@Entity
public class BankCard implements HbEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String pin;
	private String type;
	private LocalDate expiredOn;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getExpiredOn() {
		return expiredOn;
	}

	public void setExpiredOn(LocalDate expiredOn) {
		this.expiredOn = expiredOn;
	}

}
