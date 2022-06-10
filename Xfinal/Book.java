public class Book {
    int id ,noOfCopy;
    String title, subtitle, author ,publisher;
    double price;
    void setBookId(int id){
        this.id = id;
    }
    void setTitle(String title){
        this.title = title;
    }
    void setSubTitle(String subtitle){
        this.subtitle = subtitle;
    }
    void setAuthor(String author){
        this.author = author;
    }
    void setPublisher(String publisher){
        this.publisher = publisher;
    }
    void setPrice(double price){
        this.price = price;
    }
    void setNoOfCopy(int noOfCopy ){
        this.noOfCopy = noOfCopy;
    }
    int getBookId(){
        return id;
    }
    String getTitle(){
        return title;
    }
    String getSubtitle(){
        return subtitle;
    }
    String getAuthor(){
        return author;
    }
    String getPublisher(){
        return publisher;
    }
     double getPrice(){
        return price;
    }
     int getNoOfCopy(){
        return noOfCopy;
    }
    void showInfo(){
        System.out.println("Title: "+ getTitle());
        System.out.println("Id: "+ getBookId());
        System.out.println("Author: "+ getAuthor());
        System.out.println("Publisher: "+ getPublisher());
        System.out.println("NoOfCopy: "+ getNoOfCopy());
        System.out.println("Price: "+ getPrice()+"\n");
    }
}
