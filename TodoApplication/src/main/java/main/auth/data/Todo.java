package main.auth.data;

public class Todo {
	private int id;
	private String title;
	private int user_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Todo(int id, String title, int user_id) {
		super();
		this.id = id;
		this.title = title;
		this.user_id = user_id;
	}
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", user_id=" + user_id + "]";
	}
	
	
	
}
