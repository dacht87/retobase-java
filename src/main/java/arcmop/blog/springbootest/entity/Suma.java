package arcmop.blog.springbootest.entity;

//import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "suma")
public class Suma {

	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
	
@Column(name="sumando01")
private int sumando01;
	
@Column(name="sumando02")
private int sumando02;

@Column(name="resultado")
private int resultado;

public Suma(int sumando01, int sumando02, int resultado) {
	super();
	this.sumando01 = sumando01;
	this.sumando02 = sumando02;
	this.resultado = resultado;
}


}
