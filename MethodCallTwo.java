interface Rule {
    public void call();
}

class Parent {
    Rule rule;
    public void parentCall() {
        rule.call();
        System.out.println("Parent method called");
    }
}

class Child extends Parent implements Rule {
    public Child() {
        this.rule = this;
    }
    public void call() {
        System.out.println("Child method called");
    }
}

class MethodCall {
    public static void main(String[] arg) {
        MethodCall methodCallObject=new MethodCall();
        methodCallObject.methodCall();
    }

    public void methodCall(){
        Parent parent = new Child();
        parent.parentCall();
    }
}