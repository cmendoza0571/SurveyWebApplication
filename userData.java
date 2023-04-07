package Survey;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class userData implements Serializable {
    private String Course;
    private String Instructor;
    private String StudentName;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
    private String choice5;
    private String choice6;
    private String choice7;
    private String choice8;
    private String choice9;
    private String choice10;
    private String choice11;
    private String choice12;
    private String choice13;
    private String choice14;
    private String choice15;
    private String choice16;
    private String choice17;
    private String choice18;
    private String choice19;
    private String choice20;
    private String choice21;
    private String choice22;
    private String choice23;
    private String choice24;
    private String choice25;
    private String choice26;
    private String choice27;
    private String comment1;
    private String comment2;
    private String comment3;
    private String comment4;
    private String comment5;
    private String comment6;
    private String comment7;
    private String comment8;
    private String comment9;
    private String comment10;
         
public userData(){

}

public String getCourse(){

return Course;

}

public void setCourse(String Course){

 this.Course= Course;

}


public String getInstructor(){

return Instructor;

}

public void setInstructor(String Instructor){

 this.Instructor= Instructor;

}

public String getStudentName(){

return StudentName;

}

public void setStudentName(String StudentName){

 this.StudentName= StudentName;

}

//choice 1
public String getChoice1(){

return choice1;

}

public void setChoice1(String choice1){

 this.choice1= choice1;

}
//choice 2
public String getChoice2(){

return choice2;

}

public void setChoice2(String choice2){

 this.choice2= choice2;

}
//choice3
public String getChoice3(){

return choice3;

}

public void setChoice3(String choice3){

 this.choice3= choice3;

}
//choice4
public String getChoice4(){

return choice4;

}

public void setChoice4(String choice4){

 this.choice4= choice4;

}
//choice5
public String getChoice5(){

return choice5;

}

public void setChoice5(String choice5){

 this.choice5= choice5;

}
//choice 6
public String getChoice6(){

return choice6;

}

public void setChoice6(String choice6){

 this.choice6= choice6;

}
//choice7
public String getChoice7(){

return choice7;

}

public void setChoice7(String choice7){

 this.choice7= choice7;

}
//choice 8

public String getChoice8(){

return choice8;

}

public void setChoice8(String choice8){

 this.choice8= choice8;

}
//choice 9
public String getChoice9(){

return choice9;

}

public void setChoice9(String choice9){

 this.choice9= choice9;

}
//choice 10
public String getChoice10(){

return choice10;

}

public void setChoice10(String choice10){

 this.choice10= choice10;

}
//choice11
public String getChoice11(){

return choice11;

}

public void setChoice11(String choice11){

 this.choice11= choice11;

}
//choice12
public String getChoice12(){

return choice12;

}

public void setChoice12(String choice12){

 this.choice12= choice12;

}
//choice13
public String getChoice13(){

return choice13;

}

public void setChoice13(String choice13){

 this.choice13= choice13;

}
//choice14
public String getChoice14(){

return choice14;

}

public void setChoice14(String choice14){

 this.choice14= choice14;

}
//choice15
public String getChoice15(){

return choice15;

}

public void setChoice15(String choice15){

 this.choice15= choice15;

}
//choice16
public String getChoice16(){

return choice16;

}

public void setChoice16(String choice16){

 this.choice16= choice16;

}
//choice17
public String getChoice17(){

return choice17;

}

public void setChoice17(String choice17){

 this.choice17= choice17;

}
//choice18
public String getChoice18(){

return choice18;

}

public void setChoice18(String choice18){

 this.choice18= choice18;

}
//choice19
public String getChoice19(){

return choice19;

}

public void setChoice19(String choice19){

 this.choice19= choice19;

}
//choice20
public String getChoice20(){

return choice20;

}

public void setChoice20(String choice20){

 this.choice20= choice20;

}
//choice21
public String getChoice21(){

return choice21;

}

public void setChoice21(String choice21){

 this.choice21= choice21;

}
//choice22
public String getChoice22(){

return choice22;

}

public void setChoice22(String choice22){

 this.choice22= choice22;

}
//choice23
public String getChoice23(){

return choice23;

}

public void setChoice23(String choice23){

 this.choice23= choice23;

}
//choice24
public String getChoice24(){

return choice24;

}

public void setChoice24(String choice24){

 this.choice24= choice24;

}
//choice25
public String getChoice25(){

return choice25;

}

public void setChoice25(String choice25){

 this.choice25= choice25;

}
//choice26
public String getChoice26(){

return choice26;

}

public void setChoice26(String choice26){

 this.choice26= choice26;

}
//choice27
public String getChoice27(){

return choice27;

}

public void setChoice27(String choice27){

 this.choice27= choice27;

}

//comment1
public String getComment1(){

return comment1;

}

public void setComment1(String comment1){

 this.comment1= comment1;

}
//comment2
public String getComment2(){

return comment2;

}

public void setComment2(String comment2){

 this.comment2= comment2;

}

//comment3
public String getComment3(){

return comment3;

}

public void setComment3(String comment3){

 this.comment3= comment3;

}


//comment4
public String getComment4(){

return comment4;

}

public void setComment4(String comment4){

 this.comment4= comment4;

}


//comment5
public String getComment5(){

return comment5;

}

public void setComment5(String comment5){

 this.comment5= comment5;

}

//comment6
public String getComment6(){

return comment6;

}

public void setComment6(String comment6){

 this.comment6= comment6;

}

//comment7
public String getComment7(){

return comment7;

}

public void setComment7(String comment7){

 this.comment7= comment7;

}
//comment8
public String getComment8(){

return comment8;

}

public void setComment8(String comment8){

 this.comment8= comment8;

}
//comment9
public String getComment9(){

return comment9;

}

public void setComment9(String comment9){

 this.comment9= comment9;

}

public String getComment10(){

return comment10;

}

public void setComment10(String comment10){

 this.comment10= comment10;

}

public String save(){
     
  String insertTable = "INSERT INTO surveyanswers" + 
             "(studentname,course,instructor,answerchoice1,answerchoice2,answerchoice3,answerchoice4,answerchoice5,answerchoice6,answerchoice7,answerchoice8,answerchoice9,answerchoice10,answerchoice11,answerchoice12,answerchoice13,answerchoice14,answerchoice15,answerchoice16,answerchoice17,answerchoice18,answerchoice19,answerchoice20,answerchoice21,answerchoice22,answerchoice23,answerchoice24,answerchoice25,answerchoice26,answerchoice27,comment1,comment2,comment3,comment4,comment5,comment6,comment7,comment8,comment9,comment10 )VALUES"
             + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsurveys?autoReconnect=true&useSSL=false","root","root");
    PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(insertTable);
    preparedStmt.setString(1, this.getStudentName());
    preparedStmt.setString(2,this.getCourse());
    preparedStmt.setString(3,this.getInstructor());
    preparedStmt.setString(4,this.getChoice1());
    preparedStmt.setString(5,this.getChoice2());
    preparedStmt.setString(6,this.getChoice3());
    preparedStmt.setString(7,this.getChoice4());
    preparedStmt.setString(8,this.getChoice5());
    preparedStmt.setString(9,this.getChoice6());
    preparedStmt.setString(10,this.getChoice7());
    preparedStmt.setString(11,this.getChoice8());
    preparedStmt.setString(12,this.getChoice9());
    preparedStmt.setString(13,this.getChoice10());
    preparedStmt.setString(14,this.getChoice11());
    preparedStmt.setString(15,this.getChoice12());
    preparedStmt.setString(16,this.getChoice13());
    preparedStmt.setString(17,this.getChoice14());
    preparedStmt.setString(18,this.getChoice15());
    preparedStmt.setString(19,this.getChoice16());
    preparedStmt.setString(20,this.getChoice17());
    preparedStmt.setString(21,this.getChoice18());
    preparedStmt.setString(22,this.getChoice19());
    preparedStmt.setString(23,this.getChoice20());
    preparedStmt.setString(24,this.getChoice21());
    preparedStmt.setString(25,this.getChoice22());
    preparedStmt.setString(26,this.getChoice23());
    preparedStmt.setString(27,this.getChoice24());
    preparedStmt.setString(28,this.getChoice25());
    preparedStmt.setString(29,this.getChoice26());
    preparedStmt.setString(30,this.getChoice27());
    preparedStmt.setString(31,this.getComment1());
    preparedStmt.setString(32,this.getComment2());
    preparedStmt.setString(33,this.getComment3());
    preparedStmt.setString(34,this.getComment4());
    preparedStmt.setString(35,this.getComment5());
    preparedStmt.setString(36,this.getComment6());
    preparedStmt.setString(37,this.getComment7());
    preparedStmt.setString(38,this.getComment8());
    preparedStmt.setString(39,this.getComment9());
    preparedStmt.setString(40,this.getComment10());
    
    preparedStmt.executeUpdate();
    conn.close();
    System.out.println("Uploaded to Database");
    return "Thank You.xhtml";
   } 
         

 catch(SQLException e){
     System.err.println("Error Occured");
     System.err.println(e.getMessage());
   }    
    catch (ClassNotFoundException ex) {
            Logger.getLogger(userData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Thank You.xhtml";
}
}
