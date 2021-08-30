package Array;

import java.util.Arrays;

public class Movie {
	
	private int mid;
	private String moviename;
	private String[] actorlist;
	
	public Movie()
	{
		
	}
	
	public Movie(int mid, String moviename, String[] actorlist) {
		super();
		this.mid = mid;
		this.moviename = moviename;
		this.actorlist = actorlist;
	}
	
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", moviename=" + moviename + ", actorlist=" + Arrays.toString(actorlist) + "]";
	}

	public static void main(String[] args) {
		
		Movie m=new Movie();
		m.mid=101;
		m.moviename="3 idot";
		
		String[] Mlist=new String[3];
		Mlist[0]="Amir khan";
		Mlist[1]="Hrithik roshan";
		Mlist[2]="Salaman Khan";
		
		m.actorlist=Mlist;
	}
}
