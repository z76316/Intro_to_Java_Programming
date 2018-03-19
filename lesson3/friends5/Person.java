/**
 * Models a person who makes and unmakes friends
 *
 */
// BlueJ project: lesson3/friends5
/**
* 
*/
public class Person
{
    private String name;
    private String friends;
    private int x;
    private int y;
    
    // TODO: Update the person constructor to use the this reference
    //
    // It looks a bit cleaner this way stylistically
    public Person (String name, String pictureName, int x, int y)
    {
         this.name = name;
         Picture picture = new Picture(pictureName);
         this.x = x;
         this.y = y;
         picture.translate(this.x, this.y);
         picture.draw();
         
         // your code here
    }
    
    public void addFriend(Person friend) 
    {
        friends = friends + friend.name + " ";
        SmallCircle circle = new SmallCircle(x,y);
        circle.fill();
        Line line = new Line(x, y, friend.x, friend.y);
        line.draw();
    }
    
    public void unfriend(Person nonFriend)
    {
        friends = friends.replace(nonFriend.name + " ", "");
    }
    
    public String getFriends() 
    {
        return friends;
    }
}