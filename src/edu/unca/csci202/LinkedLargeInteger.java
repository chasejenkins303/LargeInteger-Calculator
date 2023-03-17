package edu.unca.csci202;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedLargeInteger implements LargeInteger {

	private List<Integer> list;
	private int neg=1;
	
	/**
	 * Constructor to add the string to a list one character at a time
	 * and determine if it is negative or not.
	 * 
	 * @param num is the string representaion of the number
	 */
	public LinkedLargeInteger(String num) {
		list = new LinkedList<Integer>();
		for(int i=0; i<num.length(); i++) {
			char s = num.charAt(i);
			if(s=='-') {
				neg=-1;
			}else {
			int j = Integer.parseInt(String.valueOf(s));
			list.add(j);
			}
		}
		
	}
	/**
	 * This method takes two LargeIntegers and adds them 
	 * together and returns the sum. Uses a loop with a carry
	 * value to do the math and adds it to a list.
	 * 
	 * @param add is the LargeInteger we want to add to this.
	 * @return a LargeInteger representing the sum
	 */
	@Override
	public LargeInteger add(LargeInteger add) {
		LinkedLargeInteger add2 = new LinkedLargeInteger(add.toString());
		LinkedList<Integer> second = (LinkedList<Integer>) add2.getList();
		LinkedList<Integer> smallest=null;
		LinkedList<Integer> biggest=null;
		LinkedList<Integer> tempList = new LinkedList<Integer>();
		int size=0;
		int carry=0;
		String out="";
		int diff=0;
		
		if(add.signum()==-1 && this.signum()==1) {
			add2=(LinkedLargeInteger) add2.abs();
			add2=(LinkedLargeInteger) this.subtract(add2);
			//add.negate();
			return add2;
			//return this.subtract(add2.abs());
		}
		if(add.signum()==1 && this.signum()==-1) {
			LinkedLargeInteger temp2= new LinkedLargeInteger(this.toString());
			temp2=(LinkedLargeInteger) temp2.abs();
			temp2= (LinkedLargeInteger) add2.subtract(temp2);
			//this.negate();
			return temp2;
			//return add2.subtract(this.abs());
		}
		if(add.signum()==-1 && this.signum()==-1) {
			out = "-";
		}
		if(list.size()>second.size()) {
			size=list.size();
			smallest= second;
			biggest=(LinkedList<Integer>) list;
			diff = biggest.size()-smallest.size();
			//ArrayList<Integer> tempList = new ArrayList<Integer>();
			for(int i=0; i<diff; i++) {
				tempList.add(0);
			}
			for(int i=diff; i<biggest.size(); i++) {
				int put=smallest.get(i-diff);
				tempList.add(put);
			}
		}else if(second.size()>list.size()){
			size=second.size();
			smallest=(LinkedList<Integer>) list;
			biggest=second;
			diff = biggest.size()-smallest.size();
			//ArrayList<Integer> tempList = new ArrayList<Integer>();
			for(int i=0; i<diff; i++) {
				tempList.add(0);
			}
			for(int i=diff; i<biggest.size(); i++) {
				int put=smallest.get(i-diff);
				tempList.add(put);
			}
		}else {
			size=list.size();
			biggest=(LinkedList<Integer>) list;
			tempList=second;
		}
		ArrayList<Integer> tempList2 = new ArrayList<Integer>();
		for(int i=size-1; i>=0; i--) {
			
			int sum=tempList.get(i)+biggest.get(i);
			if(sum+carry<10) {
				tempList2.add(sum+carry);
				carry=0;
			}else if(sum+carry>=10) {
				tempList2.add(sum-10+carry);
				carry=1;
			}
			
		}
		if(carry==1) {
			tempList2.add(1);
			out+="1";
		}
		for(int i=size-1; i>=0; i--) {
			out = out+String.valueOf(tempList2.get(i));
		}
		LinkedLargeInteger last = new LinkedLargeInteger(out);
		
		return last;
		//return null;
	}
	/**
	 * Is a getter for a LargeIntegers list
	 * @return list
	 */
	private List<Integer> getList() {
		return list;
	}
	/**
	 * This method subtracts two LargeIntegers and returns the difference.
	 * Uses a loop with carry value in order to do the math.
	 * 
	 * @param add is the LargeInteger we are subtracting from 'this'
	 * @return A large integer representing the difference.
	 */
	@Override
	public LargeInteger subtract(LargeInteger add) {
		LinkedLargeInteger add2 = new LinkedLargeInteger(add.toString());
		LinkedList<Integer> second = (LinkedList<Integer>) add2.getList();
		LinkedList<Integer> smallest=null;
		LinkedList<Integer> biggest=null;
		LinkedList<Integer> tempList = new LinkedList<Integer>();
		int size=0;
		int carry=0;
		String out="";
		int diff=0;
		boolean negAns=false;
		
		if(add.signum()==-1 && this.signum()==1) {
			add2=(LinkedLargeInteger) add2.abs();
			add2=(LinkedLargeInteger) this.add(add2);
			//add.negate();
			return add2;
			//return this.sum(add2.abs());
		}
		if(add.signum()==1 && this.signum()==-1) {
			add2=(LinkedLargeInteger) add.subtract(this);
			add2=(LinkedLargeInteger) add2.negate();
			return add2;
		}
		if(add.signum()==-1 && this.signum()==-1) {
			add2=(LinkedLargeInteger) add2.abs();
			add2=(LinkedLargeInteger) this.add(add2);
			//add.negate();
			return add2;
			//return this.sum(add2.abs());
		}
		if(list.size()>second.size()) {
			size=list.size();
			smallest= second;
			biggest=(LinkedList<Integer>) list;
			diff = biggest.size()-smallest.size();
			//ArrayList<Integer> tempList = new ArrayList<Integer>();
			for(int i=0; i<diff; i++) {
				tempList.add(0);
			}
			for(int i=diff; i<biggest.size(); i++) {
				int put=smallest.get(i-diff);
				tempList.add(put);
			}
		}else if(second.size()>list.size()){
			size=second.size();
			smallest=(LinkedList<Integer>) list;
			biggest=second;
			diff = biggest.size()-smallest.size();
			//ArrayList<Integer> tempList = new ArrayList<Integer>();
			for(int i=0; i<diff; i++) {
				tempList.add(0);
			}
			for(int i=diff; i<biggest.size(); i++) {
				int put=smallest.get(i-diff);
				tempList.add(put);
			} 
			negAns=true;
		}else {
			int n=0;
			while(n<list.size()) {
				if(list.get(n)>second.get(n)) {
					size=list.size();
					biggest=(LinkedList<Integer>) list;
					tempList=second;
					break;
				}else if(second.get(n)>list.get(n)) {
					size=second.size();
					biggest=second;
					tempList=(LinkedList<Integer>) list;
					negAns=true;
					break;
				}else {
					n++;
				}
				
			}
		}
		ArrayList<Integer> tempList2 = new ArrayList<Integer>();
		for(int i=size-1; i>=0; i--) {
			
			int difFin=biggest.get(i)-tempList.get(i);
			if(difFin+carry>=0) {
				tempList2.add(difFin+carry);
				carry=0;
			}else if(difFin+carry<0) {
				difFin=(biggest.get(i)+10)-tempList.get(i);
				tempList2.add(difFin+carry);
				carry=-1;
			}
			
		}
		for(int i=size-1; i>=0; i--) {
			out = out+String.valueOf(tempList2.get(i));
		}
		if(out=="") {
			out="0";
		}
		LinkedLargeInteger last = new LinkedLargeInteger(out);
		if(negAns==true) {
			last.neg=-1;
		}
		return last;
		//return null;
	}
	/**
	 * This method negates a LargeInteger, meaning it will flip the 
	 * sign. If its negative it makes it positive and if its positive
	 * it makes it negative
	 * 
	 * @return a LargeInteger that is the negation of 'this'
	 */
	@Override
	public LargeInteger negate() {
		LinkedLargeInteger a = new LinkedLargeInteger(this.toString());
		if(neg==-1) {
			a.neg=1;
			return a;
		}else if(neg==1) {
			a.neg=-1;
			return a;
		}else if(this.isZero()==true){
			return a;
		}else {
			return null;
		}
		//return null;
	}
	/**
	 * Returns the absolute value of the LargeInteger it is called on. 
	 * If it is negative it makes it positive but if it is positive it
	 * keeps it positive
	 * 
	 * @return a LargeInteger that is the absolute value of 'this'
	 */
	@Override
	public LargeInteger abs() {
		LinkedLargeInteger a= new LinkedLargeInteger(this.toString());
		if(this.signum()>-1) {
			return this;
		}else {
			a.neg=1;
			return a;
		}
	}
	/**
	 * This method multiplies two LargeIntegers together using nested loops 
	 * in order to account for all of the values that need to be added. Creates
	 * two temporary LargeIntegers to store previous values.
	 * 
	 * @param add is the LargeInteger we are multiplying to 'this'
	 * @return a LargeInteger that is the product of the parameter and 'this'
	 */
	@Override
	public LargeInteger multiply(LargeInteger add) {
		LinkedLargeInteger add2 = (LinkedLargeInteger) add;
		LinkedList<Integer> second = (LinkedList<Integer>) add2.getList();
		LinkedList<Integer> smallest=null;
		LinkedList<Integer> biggest=null;
		LinkedList<Integer> tempList = new LinkedList<Integer>();
		LinkedLargeInteger a =null;
		LinkedLargeInteger b=null;
		LinkedLargeInteger c=null;
		int size=0;
		int carry=0;
		String out="";
		int diff=0;
		
		if(list.size()>second.size()) {
			size=list.size();
			smallest= second;
			biggest=(LinkedList<Integer>) list;
			diff = biggest.size()-smallest.size();
			//ArrayList<Integer> tempList = new ArrayList<Integer>();
			for(int i=0; i<diff; i++) {
				tempList.add(0);
			}
			for(int i=diff; i<biggest.size(); i++) {
				int put=smallest.get(i-diff);
				tempList.add(put);
			}
		}else if(second.size()>list.size()){
			size=second.size();
			smallest=(LinkedList<Integer>) list;
			biggest=second;
			diff = biggest.size()-smallest.size();
			//ArrayList<Integer> tempList = new ArrayList<Integer>();
			for(int i=0; i<diff; i++) {
				tempList.add(0);
			}
			for(int i=diff; i<biggest.size(); i++) {
				int put=smallest.get(i-diff);
				tempList.add(put);
			}
		}else {
			size=list.size();
			biggest=(LinkedList<Integer>) list;
			tempList=second;
		}
		int carryHelp=0;
		LinkedList<Integer> tempList2 = new LinkedList<Integer>();
		
		for(int i=size-1; i>=0; i--) {
			int increment=i;
			while(increment<size-1) {
				tempList2.add(0);
				increment++;
			}
			for(int j=size-1;j>=0;j--) {
				int prod=tempList.get(i)*biggest.get(j);
				int prodCar=prod+carry;
				
				if(prodCar<10) {
			
					tempList2.add(prodCar);
					carry=0;
				}else if(prodCar>=10) {
					
					while(prodCar>=10) {
						prodCar=prodCar-10;
						carryHelp++;
					}
					tempList2.add(prodCar);
					carry=carryHelp;
					if(j==0) {
						tempList2.add(carryHelp);
					}
					carryHelp=0;
				}
			}

			out="";
			for(int k=tempList2.size()-1; k>=0; k--) {
				out = out+String.valueOf(tempList2.get(k));
				
			}
			if(i==size-1) {
			a = new LinkedLargeInteger(out);
			//System.out.println("First a: "+a.toString());
			out="";
			tempList2.clear();
			if(size-1==0) {
				return a;
			}
			}
			else if(i==size-2) {
					b = a;
					//System.out.println("B: "+b.toString());
					a = new LinkedLargeInteger(out);
					//System.out.println("Second a:"+a.toString());
					if(a.signum()!=0) {
						c = (LinkedLargeInteger) a.add(b);
					}if(c==null) {
						c=b;
					}
					//System.out.println("C: "+c.toString());
					tempList2.clear();
					out="";
			}else if(i<size-2) {
				b = c;
				//System.out.println("B: "+b.toString());
				a = new LinkedLargeInteger(out);
				//System.out.println("Second a:"+a.toString());
				if(a.signum()!=0) {
					c = (LinkedLargeInteger) a.add(b);
				}if(c==null) {
					c=b;
				}
				//System.out.println("C: "+c.toString());
				tempList2.clear();
				out="";
			}
			
			//tempList2.clear();
		}
		if(add.signum()==-1&&this.signum()==1) {
			c=(LinkedLargeInteger) c.negate();
		}else if(add.signum()==1&&this.signum()==-1) {
			c=(LinkedLargeInteger) c.negate();
		}
		
		return c;
		
		
	}
	/**
	 * This method compares two LargeIntegers and returns the 
	 * largest one
	 * 
	 * @param add is the LargeInteger we are comparing
	 * @return the Largest LargeInteger
	 */
	@Override
	public LargeInteger max(LargeInteger add) {
		if(this.signum()==-1&&add.signum()>-1) {
			return add;
		}else if(this.signum()>-1&&add.signum()==-1) {
			return this;
		}else if(this.signum()==-1&&add.signum()==-1) {
			LinkedLargeInteger add2 = (LinkedLargeInteger) add;
			if(this.getLength()>add2.getLength()) {
				return add;
			}else if(add2.getLength()>this.getLength()) {
				return this;
			}else {
				LinkedList<Integer> temp1 =(LinkedList<Integer>) this.getList();
				LinkedList<Integer> temp2 =(LinkedList<Integer>) add2.getList();
				for(int i=0; i<this.getLength(); i++) {
					if(temp1.get(i)>temp2.get(i)) {
						return add;
					}else if(temp2.get(i)>temp1.get(i)) {
						return this;
					}
				}
				return this;
			}
		}else {
			LinkedLargeInteger add2 = (LinkedLargeInteger) add;
			if(this.getLength()>add2.getLength()) {
				return this;
			}else if(add2.getLength()>this.getLength()) {
				return add;
			}else {
				LinkedList<Integer> temp1 =(LinkedList<Integer>) this.getList();
				LinkedList<Integer> temp2 =(LinkedList<Integer>) add2.getList();
				for(int i=0; i<this.getLength(); i++) {
					if(temp1.get(i)>temp2.get(i)) {
						return this;
					}else if(temp2.get(i)>temp1.get(i)) {
						return add;
					}
				}
				return this;
			}
		}
	}
	/**
	 * This method compares two LargeIntegers
	 * and returns the one with the smallest value
	 * 
	 * @param add is the LargeInteger we are comparing
	 * @return the smallest LargeInteger
	 */
	@Override
	public LargeInteger min(LargeInteger add) {
		if(this.signum()==-1&&add.signum()>-1) {
			return this;
		}else if(this.signum()>-1&&add.signum()==-1) {
			return add;
		}else if(this.signum()==-1&&add.signum()==-1) {
			LinkedLargeInteger add2 = (LinkedLargeInteger) add;
			if(this.getLength()>add2.getLength()) {
				return this;
			}else if(add2.getLength()>this.getLength()) {
				return add;
			}else {
				LinkedList<Integer> temp1 =(LinkedList<Integer>) this.getList();
				LinkedList<Integer> temp2 =(LinkedList<Integer>) add2.getList();
				for(int i=0; i<this.getLength(); i++) {
					if(temp1.get(i)>temp2.get(i)) {
						return this;
					}else if(temp2.get(i)>temp1.get(i)) {
						return add;
					}
				}
				return this;
			}
		}else {
			LinkedLargeInteger add2 = (LinkedLargeInteger) add;
			if(this.getLength()>add2.getLength()) {
				return add;
			}else if(add2.getLength()>this.getLength()) {
				return this;
			}else {
				LinkedList<Integer> temp1 =(LinkedList<Integer>) this.getList();
				LinkedList<Integer> temp2 =(LinkedList<Integer>) add2.getList();
				for(int i=0; i<this.getLength(); i++) {
					if(temp1.get(i)>temp2.get(i)) {
						return add;
					}else if(temp2.get(i)>temp1.get(i)) {
						return this;
					}
				}
				return this;
			}
		}
	}
	/**
	 * Method that returns 0 if the value of the LargeInteger is 0,
	 * 1 if it is positive, and negative 1 if it is not positive
	 * 
	 * @return an int value
	 */
	@Override
	public int signum() {
		if(this.isZero()==true) {
			return 0;
		}
		return neg;
	}
	/**
	 * Checks if a list is the value of 0
	 * 
	 * @return true or false
	 */
	private boolean isZero() {
		int i=0;
		while(i<list.size()) {
			if(list.get(i)!=0) {
				return false;
			}
			i++;
			
		}
		this.neg=0;
		return true;
	}
	/**
	 * This method compares two LargeIntegers, returns 0 if
	 * they are the same, 1 if 'this' is larger and negative 
	 * 1 if the parameter is larger
	 * 
	 * @param o which is the LargeInteger we are comparing.
	 * @return an int vale
	 */
	@Override
	public int compareTo(Object o) {
		LinkedLargeInteger temp = (LinkedLargeInteger) o;
		if(this.signum()==-1&&temp.signum()>-1) {
			return -1;
		}else if(temp.signum()==-1&&this.signum()>-1) {
			return 1;
		}else if(temp.signum()==0&&this.signum()==0) {
			return 0;
		}else {
			if(this.signum()==1) {
				if(this.getLength()>temp.getLength()) {
					return 1;
				}else if(temp.getLength()>this.getLength()) {
					return -1;
				}else {
					int n=0;
					ArrayList<Integer> tempList =(ArrayList<Integer>) temp.getList();
					while(n<this.getLength()) {
						if(list.get(n)>tempList.get(n)) {
							return 1;
						}else if(tempList.get(n)>list.get(n)) {
							return -1;
						}else {
							n++;
						}	
					}
					return 0;
				}
			}
			if(this.signum()==-1) {
				if(this.getLength()>temp.getLength()) {
					return -1;
				}else if(temp.getLength()>this.getLength()) {
					return 1;
				}else {
					int n=0;
					LinkedList<Integer> tempList =(LinkedList<Integer>) temp.getList();
					while(n<this.getLength()) {
						if(list.get(n)>tempList.get(n)) {
							return -1;
						}else if(tempList.get(n)>list.get(n)) {
							return 1;
						}else {
							n++;
						}	
					}
					return 0;
				}
			}
		}
		return 0;		
	}
	/**
	 * Is a getter for the size of a list
	 * 
	 * @return size of list
	 */
	private int getLength() {
		
		return list.size();
	}
	/**
	 * Creates a string that is the representation of the number we are trying 
	 * to store.
	 * 
	 * @return a string 
	 */
	public String toString() {
		String out="";
		for(int i=0; i<list.size(); i++) {
			String s = Integer.toString(list.get(i));
			out=out+s;
		}
		if(neg==-1) {
			out="-"+out;
		}
		return out;
	}

}
