/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ivanbadhidharma.com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



//import java.lang.String;

/**
 *
 * @author yegoris
 */
@WebServlet(name = "DNAdna", urlPatterns = {"/DNAdna"})
public class DNAdna extends HttpServlet {//servlet start


    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DNA</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet DNA at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }//process request end

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        PrintWriter out = response.getWriter(); 
 out.println("<body style=\"background-color:lightblue;margin-left:10\">");
 out.println("<font face=\"Courier New\" size=\"10\" color=\"darkred\">");
 
     String DNAy = request.getParameter("myDNAinput");
     String DNAx =request.getParameter( "myDNAinput1");
     //int minMatch = Integer.parseInt(request.getParameter("MinMatch"));
if (DNAx.length()==0 || DNAy.length()==0){
    out.println("<br>"+"NOTHING TO COMPARE "+"<br>");   
     out.println("<br>"+"press back and enter DNA sequences "+"<br>");}

out.println("<font face=\"Courier New\" size=\"4\" color=\"darkblue\">");     
     if (DNAx.length() < DNAy.length())
     { DNAy = request.getParameter("myDNAinput1");
     DNAx =request.getParameter( "myDNAinput");
     }
    

         
     DNAy=DNAy.toLowerCase();
     DNAx=DNAx.toLowerCase();
     
      
     
     DNAy = Verify(DNAy);
     DNAx =Verify(DNAx);
     out.println("<br>"); 
     
     out.println("your DNAx :"+DNAx+"<br>");
     out.println("your DNAy :"+DNAy+"<br>"); 
     out.println("<br>"); 
     
  // initialize array and generate alignmnet table 
 char[][] Alignment = new char[DNAx.length()][DNAy.length()];
 
 int i=0, j;
  
 while (i<DNAx.length()){
  for (j=0;j<DNAy.length();j++) {
      if (DNAx.charAt(i)==DNAy.charAt(j))
{Alignment[i][j]=DNAx.charAt(i);}
      else
{Alignment[i][j]='-';}
     
  }    
i++; } 
 
 //

 
//print alignmnet table 
//out.println("<center>"); 
 int row, column, colnumber;
// printing final alignment array
 
 //DNAx table header
 out.println("*"+"*");
 for (colnumber=0;colnumber<DNAx.length();colnumber++){
 out.println(DNAx.charAt(colnumber)+" ");}
 out.println("<br>"+"<br>");
 
 //Table (array) output
 for (row=0;row <DNAy.length();row++){
 out.println(DNAy.charAt(row)+"*");

 for (column=0;column<DNAx.length();column++){
 out.println((Alignment[column][row])+"\t");
 
 }
    out.println("<br>");
             }
 


     

//print alignment table
out.println("</font>");
out.println("<div style=\"margin-left:17\">"); 
out.println("<font face=\"Courier New\" size=\"4\" color=\"darkred\">");

out.println("<br>"+"Alignment"+"<br>");
out.println("<br>"+"% is the ratio of match to total number ");
out.println("<br>"+"of nucleotides in DNAy sequence "+"<br>"+"<br>");
 //out.println("<p>");
//char[] TempAlignment = new char [DNAx.length()];
//char[] TempAlignment1 = new char [DNAx.length()];
int xx=0, yy=DNAy.length()-1, nn=0, mm=DNAy.length()-1;
double match=0, mismatch=0;
while ( xx<DNAx.length()){
 while ( yy>-1 /*&& xx<DNAx.length()*/)
 {//out.println("out xx="+xx+"<br>");
 //out.println("out yy="+yy+"<br>");
     
 while (yy < DNAy.length() && xx < DNAx.length())
 {
     //should be verified!!!!!!!!!!!
    // out.println("<p>");
     
         out.println(" "+Alignment[xx][yy]);
         //for (int n=0;n<xx;n++){out.println("-");}
         //out.println(" "+xx);
      //out.println("</p>");
    //TempAlignment[xx] = Alignment[xx][yy];
         
    if(Alignment[xx][yy]!='-' && Alignment[xx][yy]!='n'){match=match+1;}
         else {mismatch=mismatch+1;}
        //out.println("in xx="+xx);
        //out.println("in yy="+yy);
       // out.println("inDNAy.length()="+DNAy.length());
        // out.println("zz="+zz);
         xx++; yy++;
         
 //out.println("after "+Alignment[xx][yy]);
 }
 //out.println("xx="+xx+"<br>");
 //out.println("yy="+yy+"<br>");
    for (int s=mm; s > DNAy.length()- DNAx.length();s--){System.out.println("-");} //filling gaps in left low corner with "-"    
 double homology=match*100/DNAy.length();//calcualate homology
 
         out.println("*"+ Math.round(homology*100.0) / 100.0+"%"+"<br>");
         mm=mm-1; yy=mm;  xx=nn; match=0; mismatch=0;
  }  yy=0; nn++; xx=nn; 
  
  if (xx<DNAx.length())
  {for (int z=0; z<xx; z++){out.println("-");}}//filling gaps in right upper corner with "-" 
  else {break;}
}
//out.println("</p>");
 out.println("<br>");
out.println("</div>");
 //out.println("</body>");

 out.println("<br>");


 

 
//out.println("</center>");
out.println("</font>");
out.println("</body>");
        //try printWeriter end
   processRequest(request, response);
}//doGet end  
             
  

  public String Verify(String one){
     char [] chars  = one.toCharArray();
     
int i = 0;
while (i < one.length()){
        if( one.charAt(i) == 'a'||
            one.charAt(i) =='t'||
            one.charAt(i) =='g'||
            one.charAt(i) =='c' )
        {i++;}else{chars[i] = 'n';i++;}}
one = String.valueOf(chars);  
return one;
     }  
 

      
 
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       
    doGet  (request, response);               
    processRequest(request, response);  }

@Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}//servlet end
 
 

                    




                 
                 
                 
                 
                 
                 
                 
        
        

    
    
   
