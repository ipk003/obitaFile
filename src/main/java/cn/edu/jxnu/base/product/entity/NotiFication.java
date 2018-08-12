package cn.edu.jxnu.base.product.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;





@Entity
@Table(name = "notification_tbl")
public class NotiFication {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String l0ProductPath;

    private String l0ProductName;

    private String subDirName;

    private Byte produceType;

    private Date createTime;

    private Date notifyTime;

    private Date finishTime;

    private Byte priority;

    private String status;
    
    @OneToMany(mappedBy="notiFication")
    private Set<NotiFication> notiFication = new HashSet<>();

    
    
	public Set<NotiFication> getNotiFication() {
		return notiFication;
	}

	public void setNotiFication(Set<NotiFication> notiFication) {
		this.notiFication = notiFication;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getL0ProductPath() {
		return l0ProductPath;
	}

	public void setL0ProductPath(String l0ProductPath) {
		this.l0ProductPath = l0ProductPath;
	}

	public String getL0ProductName() {
		return l0ProductName;
	}

	public void setL0ProductName(String l0ProductName) {
		this.l0ProductName = l0ProductName;
	}

	public String getSubDirName() {
		return subDirName;
	}

	public void setSubDirName(String subDirName) {
		this.subDirName = subDirName;
	}

	public Byte getProduceType() {
		return produceType;
	}

	public void setProduceType(Byte produceType) {
		this.produceType = produceType;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getNotifyTime() {
		return notifyTime;
	}

	public void setNotifyTime(Date notifyTime) {
		this.notifyTime = notifyTime;
	}

	public Date getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public Byte getPriority() {
		return priority;
	}

	public void setPriority(Byte priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "NotiFication [id=" + id + ", l0ProductPath=" + l0ProductPath + ", l0ProductName=" + l0ProductName
				+ ", subDirName=" + subDirName + ", produceType=" + produceType + ", createTime=" + createTime
				+ ", notifyTime=" + notifyTime + ", finishTime=" + finishTime + ", priority=" + priority + ", status="
				+ status + "]";
	}


    
}