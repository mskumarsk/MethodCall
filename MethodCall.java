
public class MethodCall {
     public static void main(String[] args){
       MethodCall methodCall=new MethodCall();
       methodCall.mainMethod();
      }

      public void mainMethod(){
          ParentClass parentClass= new ParentClass();
          ChildClass childClass=new ChildClass();
          parentClass.parentMethod(childClass);
      }
}

class ParentClass{
    public void parentMethod(ChildClass childClass){
        childClass.childMethod();
    }
}

class ChildClass extends ParentClass{
    public void childMethod(){
        System.out.println("Child Class");
    }
}


