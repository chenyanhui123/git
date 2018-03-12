package pojo;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class Emp {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer eid;
	private String ename;
	@ManyToOne
	@JoinColumn(name="did")
	private Dept dept;
	private String sex;
	private String card;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date brith;
	private String jiguan;
	private String xueli;
	private String minzhu;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public Date getBrith() {
		return brith;
	}
	public void setBrith(Date brith) {
		this.brith = brith;
	}
	public String getJiguan() {
		return jiguan;
	}
	public void setJiguan(String jiguan) {
		this.jiguan = jiguan;
	}
	public String getXueli() {
		return xueli;
	}
	public void setXueli(String xueli) {
		this.xueli = xueli;
	}
	public String getMinzhu() {
		return minzhu;
	}
	public void setMinzhu(String minzhu) {
		this.minzhu = minzhu;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", eid=" + eid + ", ename=" + ename + ", dept=" + dept + ", sex=" + sex + ", card="
				+ card + ", brith=" + brith + ", jiguan=" + jiguan + ", xueli=" + xueli + ", minzhu=" + minzhu + "]";
	}
	
	

}
