package vo;

public class Achievement {
	private String id;
	private String name;
	private String content;
	public String getId() {
		return id;
	}
	public Achievement setId(String id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public Achievement setName(String name) {
		this.name = name;
		return this;
	}
	public String getContent() {
		return content;
	}
	public Achievement setContent(String content) {
		this.content = content;
		return this;
	}
}
