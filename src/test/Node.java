package test;

public final class Node {
	private int count;
    private String name;
    private Object child;
    
    // ����������� ��� int
    public Node(int count)
    {
    	this.count=count;
    }
    
    // ������� ��� int
    public  boolean equals(int count1) {
		if (count == count1) return true;
		else return false;	  
    }
    
    // ����������� ��� String
    public Node(String name)
    {
    	this.name=name;
    }
    
    // ������� ��� String
    public   boolean equals(String name1) {
    	if(name.hashCode()==name1.hashCode()) return true;
    	else return false;	   	
    }
    
    // ����������� ��� Object
    public Node(Object child)
    {
    	this.child=child;
    }
    
    // ������� ��� Object
    public  boolean equals(Object child1) {
    	if(child.hashCode()==child1.hashCode()) return true;
    	else return false;	 
    }

}
