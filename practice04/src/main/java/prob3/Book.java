package prob3;

public class Book {
	private int no;
	private String title;
	private String genre;
	private int stateCode; //1: 재고있음, 0: 대여중
	
	public Book(int no,String title,String genre) {
		this.no=no;
		this.title=title;
		this.genre=genre;
		stateCode=1;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void rent() {
		if(stateCode==1) {
			System.out.println(title+"이(가) 대여됐습니다.");
			stateCode=0;
		}
		else {
			System.out.println(title+"은(는) 재고가 없습니다.");
		}
	}
	
	public void print() {
		String stateStr="";
		if(stateCode==1) {
			stateStr="재고있음";
		}
		else {
			stateStr="대여중";
		}
		System.out.println("책 제목: "+title+", 장르:"+genre+", 대여 유무:"+stateStr);
	}
	
}
