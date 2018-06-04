package net.platform.resp;

import java.util.List;
/**
 * 分页封装类
 * 用于做分页查询的基础类，封装了一些分页的相关属性
 * @author 
 * @version v1.0
 * @param <T>
 * PageHelper中带了PageInfo类，此类在mybatis中不用。
 */
public class PageResult<T> {
 
    // 页码
    private int pageNum;
 
    // 每页个数
    private int pageSize;
 
    // 总条数  兼容easyUI
    private int total;
 
    // 总页数
    private int pageCount;
 
    // 记录  兼容easyUI
    private List<T> rows;
 
    public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public int getPageCount() {
        return pageCount;
    }
 
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
 
    public int getPageNo() {
        if (pageNum <= 0) {
            return 1;
        } else{
            return pageNum > pageCount ? pageCount : pageNum;
        }
    }
 
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    } 

    public int getPageSize() {
        return pageSize;
    }
 
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize <= 0 ? 10 : pageSize;
    }
 
    public void resetPageNum() {
    	pageNum = 1;
        pageCount = total % pageSize == 0 ? total / pageSize
                : total / pageSize + 1;
    }
 
}
