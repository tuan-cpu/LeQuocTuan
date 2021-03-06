package Lab01.Lab03;

public class DigitalVideoDisc {
    String title;
    String category;
    String director;
    int length;
    float cost;
    public DigitalVideoDisc(String xtitle,String xcategory,String xdirector,int xlength,float xcost){
        this.title = xtitle;
        this.category = xcategory;
        this.director = xdirector;
        this.length = xlength;
        this.cost = xcost;
    }
    public DigitalVideoDisc(String xtitle,String xcategory,float xcost){
        this.title = xtitle;
        this.category = xcategory;
        this.cost = xcost;
        this.director = null;
        this.length = 0;
    }
    public DigitalVideoDisc(String xtitle,String xcategory,String xdirector,float xcost){
        this.title = xtitle;
        this.category = xcategory;
        this.director = xdirector;
        this.cost = xcost;
        this.length = 0;
    }
}
