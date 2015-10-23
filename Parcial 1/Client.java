import java.util.ArrayList;


public class Client {

	private String name;
	private long document;
	private String contact;
	private String type;
	private ArrayList<BankProduct> services;
	private BankProduct service;
	
	public Client(String name, long document, String contact, String type,
			BankProduct service) {
		
		this.name = name;
		this.document = document;
		this.contact = contact;
		this.type = type;
		this.service = service;
	}

	public <BankProduct> Client(String name, long document, String contact, String type,
			ArrayList<BankProduct> services) {
		
		this();
		this.services = new ArrayList<BankProduct>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDocument() {
		return document;
	}

	public void setDocument(long document) {
		this.document = document;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<BankProduct> getServices() {
		return services;
	}

	public void setServices(ArrayList<BankProduct> services) {
		this.services.add(services);
	}

	public BankProduct getService() {
		return service;
	}

	public void setService(BankProduct service) {
		this.service = service;
	}
	
	
	
	
}
