<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <jsp:useBean id="m" class="bean.Modal">
            <jsp:setProperty name="m" property="*"/>
            <%   try{   
                //m.Modal(m);
                    m.save1();
                //System.out.println(m.getName());
                //out.println(name);
                out.println("Registered");
            
                java.util.ArrayList al=m.fetch1();
                /*for(int i=0;i<al.size();i++){
                System.out.println(""+al.get(i));
                }*/
                java.util.Iterator i=al.iterator();
                while(i.hasNext())
                {   
                    Object o=i.next();
                    //bean.Modal m1=(bean.Modal) o;
                    out.println("<br> Username: ");
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            %>
        </jsp:useBean>
        
   
    </body>
</html>
