package mvc.com.example.model;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {

    public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	
    @Id
	@Column(name = "tid")
    private String tid;
    
    
	@Column(name = "rid")
    private String rid;

    @Column(name = "flat")
    private Integer flat;
    
    @Column(name = "block")
    private String block;
    
    @Column(name = "is_resolved")
    private Integer is_resolved;

    @Column(name = "complaint")
    private String complaint;
    
    @Column(name = "response")
    private String response;
    
    @Column(name = "date_generated")
    private Date date_generated;
     

    public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public Integer getFlat() {
		return flat;
	}

	public void setFlat(Integer flat) {
		this.flat = flat;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public Integer getIs_resolved() {
		return is_resolved;
	}

	public void setIs_resolved(Integer is_resolved) {
		this.is_resolved = is_resolved;
	}

	public String getComplaint() {
		return complaint;
	}

	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public Date getDate_generated() {
		return date_generated;
	}

	public void setDate_generated(Date date_generated) {
		this.date_generated = date_generated;
	}

    
//	@Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  private long id;

//	public long getId() {
//        return id;
//    }
    
    

}