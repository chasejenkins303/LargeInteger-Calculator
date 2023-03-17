package edu.unca.csci202;

public interface LargeInteger extends Comparable {
	
	public LargeInteger add(LargeInteger add);
	
	public LargeInteger subtract(LargeInteger add);
	
	public LargeInteger negate();
	
	public LargeInteger abs();
	
	public LargeInteger multiply(LargeInteger add);
	
	public LargeInteger max(LargeInteger add);
	
	public LargeInteger min(LargeInteger add);
	
	public int signum();
}
