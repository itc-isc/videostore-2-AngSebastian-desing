package wsVideoStore;

public abstract class Movie
{
	private String title;
    static final int REGULAR = 1;
    static final int NEW_RELEASE = 2;
    static final int CHILDRENS = 3;


	public Movie(String title) {
		this.title 		= title;
	}
		
	public String getTitle () {
		return title;
	}
		public int getPriceCode()
		{
	
			if(getTitle().toLowerCase().contains("regular"))
				return REGULAR;
			else
				if(getTitle().toLowerCase().contains("new_release"))
					return NEW_RELEASE;
				else
					if(getTitle().toLowerCase().contains("newrelease"))
						return NEW_RELEASE;
					else
						if(getTitle().toLowerCase().contains("new release"))
							return NEW_RELEASE;
						else
						if(getTitle().toLowerCase().contains("childrens"))
							return CHILDRENS;
	
			return 0;
	
		}
		
	  public abstract double determineAmount(int daysRented);
	
	  public abstract int determineFrequentRenterPoints(int daysRented);
	
	}