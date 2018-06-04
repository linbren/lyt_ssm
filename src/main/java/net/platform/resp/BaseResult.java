package net.platform.resp;

import java.io.Serializable;


public class BaseResult implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 8335265314476094074L;
	/**
     * 提示编码
     */
    private int ret = RetMsg.API_SUCCESS;
    /**
     * 提示信息
     */
    private String msg = RetMsg.retMsg.get(RetMsg.API_SUCCESS);
	/**
     * 信息主体
     */
    private Object items = null;
    public BaseResult(int ret, String msg) {
        this.ret = ret;
        this.msg = msg;
    }
    public BaseResult(int ret, String msg,Object items) {
        this.ret = ret;
        this.msg = msg;
        this.items = items;
    }    
    public int getRet() {
 		return ret;
 	}
 	public void setRet(int ret) {
 		this.ret = ret;
 	}
 	public String getMsg() {
 		return msg;
 	}
 	public void setMsg(String msg) {
 		this.msg = msg;
 	}
 	public Object getItems() {
 		return items;
 	}
 	public void setItems(Object items) {
 		this.items = items;
 	}

}
