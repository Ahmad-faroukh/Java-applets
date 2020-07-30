package Archive.Mall;
public interface BookIF extends ProductIF {
    public String getPublisher();
    public void setPublisher(String publisher);
    public int getYearPublished();
    public void setYearpublished();
}
