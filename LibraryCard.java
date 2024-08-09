public class LibraryCard {
    private Student1 owner;/*ประกาศออบเจ็กต์  owner ซึ่งอยุ่ในคลาส student1 */
    private int borrowcnt;
    public LibraryCard(){
        owner = null;
        borrowcnt = 0;

    }
    public void checkout(int numOfBooks){
    borrowcnt = borrowcnt + numOfBooks;
    }
    public void setOwnerName(Student1 student1){
  /*เมธอดกำหน้ดผู้ยืม โดยจะรับข้อมูล */
  owner = student1;
    }
    public int getNumberOfBooks(){
        return borrowcnt;
    }
    public String getOwnerName(){
        return owner.getName();
    }
    public String toString(){
        return "owner Name: " +owner.getName() +"\n"+"Email : " +owner.getEmail()
        +"\n"+"Books Borroener : " +borrowcnt;
}
}