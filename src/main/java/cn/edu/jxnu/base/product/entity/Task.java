package cn.edu.jxnu.base.product.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "task_tbl")
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private Long notificationId;

    private String pluginName;

    private Integer finishedOrderCount;

    private Integer totalOrderCount;

    private Date startTime;

    private Date finishTime;
    
    @OneToMany(mappedBy="task")
    private Set<Task> task = new HashSet<>();
    
    @ManyToOne
    @JoinColumn(name="id")
    private NotiFication notiFication;
    

    
    
	public Set<Task> getTask() {
		return task;
	}

	public void setTask(Set<Task> task) {
		this.task = task;
	}

	public NotiFication getNotiFication() {
		return notiFication;
	}

	public void setNotiFication(NotiFication notiFication) {
		this.notiFication = notiFication;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(Long notificationId) {
		this.notificationId = notificationId;
	}

	public String getPluginName() {
		return pluginName;
	}

	public void setPluginName(String pluginName) {
		this.pluginName = pluginName;
	}

	public Integer getFinishedOrderCount() {
		return finishedOrderCount;
	}

	public void setFinishedOrderCount(Integer finishedOrderCount) {
		this.finishedOrderCount = finishedOrderCount;
	}

	public Integer getTotalOrderCount() {
		return totalOrderCount;
	}

	public void setTotalOrderCount(Integer totalOrderCount) {
		this.totalOrderCount = totalOrderCount;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", notificationId=" + notificationId + ", pluginName=" + pluginName
				+ ", finishedOrderCount=" + finishedOrderCount + ", totalOrderCount=" + totalOrderCount + ", startTime="
				+ startTime + ", finishTime=" + finishTime + "]";
	}

   
    
}