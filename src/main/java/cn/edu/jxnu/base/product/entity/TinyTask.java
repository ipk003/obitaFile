package cn.edu.jxnu.base.product.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "tiny_task_tbl")
public class TinyTask {
	@Id
    private Long id;

    private Long taskId;

    private String orderName;

    private String status;

    private Date startTime;

    private Date finishTime;

    private String executeNode;
    
    @ManyToOne
    @JoinColumn(name="id")
    private Task task;

    
	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getExecuteNode() {
		return executeNode;
	}

	public void setExecuteNode(String executeNode) {
		this.executeNode = executeNode;
	}

	@Override
	public String toString() {
		return "TinyTask [id=" + id + ", taskId=" + taskId + ", orderName=" + orderName + ", status=" + status
				+ ", startTime=" + startTime + ", finishTime=" + finishTime + ", executeNode=" + executeNode + "]";
	}

    
    
}