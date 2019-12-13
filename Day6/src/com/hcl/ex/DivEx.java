package com.hcl.ex;

public class DivEx {
    public static void main(String[] args) {
        int a,b, c;
        try {
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            c=a/b;
            System.out.println("division "+c);
        }catch(NumberFormatException e){
            System.out.println("string can not be converted as integer");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("args are not passed");
        }
        catch (ArithmeticException e) {
            // TODO Auto-generated catch block
           System.out.println("division by zero impossible");
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("program by HCL batch");
        }
    }

}
