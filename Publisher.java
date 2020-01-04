package jdbc;

public class Publisher
{
	private int pub_id;
	private String name;
	private String nation;
	private int auth_id;



	public Publisher(int pub_id, String name, String nation, int auth_id) {
		super();
		this.pub_id = pub_id;
		this.name = name;
		this.nation = nation;
		this.auth_id = auth_id;
	}



	public int getPub_id() {
		return pub_id;
	}
	public void setPub_id(int pub_id) {
		this.pub_id = pub_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public int getAuth_id() {
		return auth_id;
	}
	public void setAuth_id(int auth_id) {
		this.auth_id = auth_id;
	}



	@Override
	public String toString() {
		return "Publisher [pub_id=" + pub_id + ", name=" + name + ", nation=" + nation + ", auth_id=" + auth_id + "]";
	}




}
