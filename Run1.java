class Run1{
       void StaticMethod() {
        System.out.println("This is a non-static method");
    }

    public static void main(String[] args) {
	Run1.StaticMethod();
    }
}
