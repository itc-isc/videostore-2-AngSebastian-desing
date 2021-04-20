package wsVideoStore;
public class Rental
{
  private Movie movie;
  private int daysRented;

	public Rental (Movie movie, int daysRented) {
		this.movie 		= movie;
		this.daysRented = daysRented;
	}

  public String getTitle(){
    return movie.getTitle();
  }
  
  public int getDaysRented(){
      return daysRented;
  }

  public int getPriceCode(){
     return movie.getPriceCode();
  }

  public Movie getMovie(){
      return movie;
  }

  public double determineAmount(){
    return movie.determineAmount(daysRented);
  }

  public int determineFrequentRenterPoints(){
    return movie.determineFrequentRenterPoints(daysRented);
  }

}