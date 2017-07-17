package userservice.serviceclient;

import java.util.Date;

/**
 * @author: dudu
 * @date: 17 de jul de 2017 05:36:27
 **/

public class UserDTO {

	private long id;
	private String name;
	private Date creationDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
