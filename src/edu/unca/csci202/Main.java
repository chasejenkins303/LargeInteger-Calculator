package edu.unca.csci202;

import java.math.BigInteger;

public class Main {
/**
 * @author chasejenkins
 * 
 * Main method to test the functionality and time 
 * of LargeInteger classes. Multiple instances of each are 
 * made to be used for testing
 * 
 * @param args
 */
	public static void main(String[] args) {
		//Test for basic methods
		/*ArrayLargeInteger a = new ArrayLargeInteger("-12345");
		ArrayLargeInteger b = new ArrayLargeInteger("123456");
		ArrayLargeInteger c = new ArrayLargeInteger("1234567");
		ArrayLargeInteger d= new ArrayLargeInteger("0");
		ArrayLargeInteger e = new ArrayLargeInteger("22345");
		ArrayLargeInteger f = new ArrayLargeInteger("-2234567");
		ArrayLargeInteger comp1 = new ArrayLargeInteger("-111");
		ArrayLargeInteger comp2 = new ArrayLargeInteger("-111");
		*/
		//Test for math methods
		ArrayLargeInteger g = new ArrayLargeInteger("99999");
		ArrayLargeInteger h = new ArrayLargeInteger("8");
		ArrayLargeInteger i = new ArrayLargeInteger("11");
		ArrayLargeInteger j = new ArrayLargeInteger("11111111");
		ArrayLargeInteger mult1= new ArrayLargeInteger("-10");
		ArrayLargeInteger mult2= new ArrayLargeInteger("11111");
		ArrayLargeInteger huge= new ArrayLargeInteger("12345678910111213");
		ArrayLargeInteger huge2= new ArrayLargeInteger("123456654321");
		ArrayLargeInteger test=null;
		
		//long time1;
		//long time2;
		
		
		/*System.out.println("toString: "+ a.toString() +"    "+b.toString()+"    "+c.toString()+"    "+d.toString());
		System.out.println("signum: "+a.signum()+"    "+b.signum()+"    "+c.signum()+"    "+d.signum());
		ArrayLargeInteger testNeg= (ArrayLargeInteger) a.negate();
		c.negate();
		d.negate();
		System.out.println("Negation: "+a.toString()+"   "+c.toString()+"   "+d.toString()+"   "+testNeg.toString());
		a.negate();
		c.negate();
		d.negate();
		System.out.println("Negation: "+a.toString()+"   "+c.toString()+"   "+d.toString());
		
		
		System.out.println("Max: " +a.max(b)+"   "+b.max(c)+"    "+a.max(e)+"   "+a.max(a)+"    "+c.max(f));
		System.out.println("Min: "+ a.min(b)+"   "+b.min(c)+"    "+a.min(e)+"   "+a.min(a)+"    "+c.min(f));
		
		
		System.out.println("Compare:"+ comp1.compareTo(comp2));
		
		
		ArrayLargeInteger sum= (ArrayLargeInteger) g.add(j);
		System.out.println("Sum: " + sum.toString());
		
		System.out.println("Result: "+g.toString()+"   "+j.toString());

		ArrayLargeInteger diff= (ArrayLargeInteger) g.subtract(j);
		System.out.println("Diff: "+ diff.toString());
		System.out.println("Result: "+g.toString()+"  "+j.toString());
		
		System.out.println();*/
		
		//ArrayLargeInteger product=(ArrayLargeInteger) mult1.multiply(mult2);
		//System.out.println("Product: "+product.toString());
		//System.out.println("");
		
	//	a.abs();
	//	c.abs();
	//	d.abs();
	//	System.out.println("Abs: "+a.toString()+"    "+b.toString()+"    "+c.toString());
		
	//	System.out.println();
	//	System.out.println("Linked:");
		
	//	LinkedLargeInteger a2 = new LinkedLargeInteger("-12345");
	//	LinkedLargeInteger b2 = new LinkedLargeInteger("123456");
	//	LinkedLargeInteger c2 = new LinkedLargeInteger("1234567");
	//	LinkedLargeInteger d2 = new LinkedLargeInteger("0");
	//	LinkedLargeInteger e2 = new LinkedLargeInteger("22345");
	//	LinkedLargeInteger f2 = new LinkedLargeInteger("-2234567");
	//	LinkedLargeInteger comp11 = new LinkedLargeInteger("-111");
	//	LinkedLargeInteger comp22 = new LinkedLargeInteger("-111");
		
		//Test for math methods
		LinkedLargeInteger g2 = new LinkedLargeInteger("99999");
		LinkedLargeInteger h2 = new LinkedLargeInteger("8");
		LinkedLargeInteger i2 = new LinkedLargeInteger("11");
		LinkedLargeInteger j2 = new LinkedLargeInteger("11111111");
		LinkedLargeInteger mult12= new LinkedLargeInteger("-10");
		LinkedLargeInteger mult22= new LinkedLargeInteger("11111");
		LinkedLargeInteger huge12= new LinkedLargeInteger("12345678910111213");
		LinkedLargeInteger huge22= new LinkedLargeInteger("123456654321");
		LinkedLargeInteger test2=null;
		
		BigInteger multBig = new BigInteger("-10");
		BigInteger multBig2 = new BigInteger("11111");
		BigInteger bigSum= new BigInteger("99999");
		BigInteger bigSum2 = new BigInteger("111111");
		BigInteger g22 = new BigInteger("99999");
		BigInteger j22 = new BigInteger("11111111");
		BigInteger h22 = new BigInteger("8");
		BigInteger i22 = new BigInteger("11");
		BigInteger huge122 = new BigInteger("12345678910111213");
		BigInteger huge222 = new BigInteger("123456654321");
		BigInteger test3=null;
		/*
		System.out.println("toString: "+ a2.toString() +"    "+b2.toString()+"    "+c2.toString()+"    "+d2.toString());
		System.out.println("signum: "+a2.signum()+"    "+b2.signum()+"    "+c2.signum()+"    "+d2.signum());
		a2.negate();
		c2.negate();
		d2.negate();
		System.out.println("Negation: "+a2.toString()+"   "+c2.toString()+"   "+d2.toString());
		a2.negate();
		c2.negate();
		d2.negate();
		System.out.println("Negation: "+a2.toString()+"   "+c2.toString()+"   "+d2.toString());
		
		
		System.out.println("Max: " +a2.max(b2)+"   "+b2.max(c2)+"    "+a2.max(e2)+"   "+a2.max(a2)+"    "+c2.max(f2));
		System.out.println("Min: "+ a2.min(b2)+"   "+b2.min(c2)+"    "+a2.min(e2)+"   "+a2.min(a2)+"    "+c2.min(f2));
		
		
		System.out.println("Compare:"+ comp11.compareTo(comp22));
		
		
		LinkedLargeInteger sum2= (LinkedLargeInteger) g2.add(j2);
		System.out.println("Sum: " + sum2.toString());
		
		System.out.println("Result: "+g2.toString()+"   "+j2.toString());

		LinkedLargeInteger diff2= (LinkedLargeInteger) g2.subtract(j2);
		System.out.println("Diff: "+ diff2.toString());
		System.out.println("Result: "+g2.toString()+"  "+j2.toString());
		
		System.out.println();
		*/
		
		
		
		System.out.println("medium size:");
		long time1=System.nanoTime();
		LinkedLargeInteger product2=(LinkedLargeInteger) mult12.multiply(mult22);
		long time2=System.nanoTime();
		System.out.println("Linked Product: "+product2.toString());
		System.out.println("Linked Time:"+(time2-time1));
		
		long time3=System.nanoTime();
		BigInteger product3=multBig.multiply(multBig2);
		long time4=System.nanoTime();
		System.out.println("Big Product: "+product3);
		System.out.println("Big Time: "+(time4-time3));
		//System.out.println("Big Product: "+product3);
		
		long time5=System.nanoTime();
		ArrayLargeInteger product4=(ArrayLargeInteger) mult1.multiply(mult2);
		long time6=System.nanoTime();
		System.out.println("Array Product: "+product4.toString());
		System.out.println("Array Time:"+(time6-time5));
		System.out.println();
		
		System.out.println("Large product:");
		long time7=System.nanoTime();
		LinkedLargeInteger product5=(LinkedLargeInteger) g2.multiply(j2);
		long time8=System.nanoTime();
		System.out.println("Linked Product: "+product5.toString());
		System.out.println("Linked Time:"+(time8-time7));
		
		long time9=System.nanoTime();
		BigInteger product6=g22.multiply(j22);
		long time10=System.nanoTime();
		System.out.println("Big Product: "+product6);
		System.out.println("Big Time: "+(time10-time9));
		//System.out.println("Big Product: "+product3);
		
		long time11=System.nanoTime();
		ArrayLargeInteger product7=(ArrayLargeInteger) g.multiply(j);
		long time12=System.nanoTime();
		System.out.println("Array Product: "+product7.toString());
		System.out.println("Array Time:"+(time12-time11));
		System.out.println();
		
		System.out.println("small product:");
		long time13=System.nanoTime();
		LinkedLargeInteger product8=(LinkedLargeInteger) h2.multiply(i2);
		long time14=System.nanoTime();
		System.out.println("Linked Product: "+product8.toString());
		System.out.println("Linked Time:"+(time14-time13));
		
		long time15=System.nanoTime();
		BigInteger product9=h22.multiply(i22);
		long time16=System.nanoTime();
		System.out.println("Big Product: "+product9);
		System.out.println("Big Time: "+(time16-time15));
		//System.out.println("Big Product: "+product3);
		
		long time17=System.nanoTime();
		ArrayLargeInteger product10=(ArrayLargeInteger) h.multiply(i);
		long time18=System.nanoTime();
		System.out.println("Array Product: "+product10.toString());
		System.out.println("Array Time:"+(time18-time17));
		System.out.println();
		
		System.out.println("huge product:");
		long time19=System.nanoTime();
		LinkedLargeInteger product11=(LinkedLargeInteger) huge12.multiply(huge22);
		long time20=System.nanoTime();
		System.out.println("Linked Product: "+product11.toString());
		System.out.println("Linked Time:"+(time20-time19));
		
		long time21=System.nanoTime();
		BigInteger product12=huge122.multiply(huge222);
		long time22=System.nanoTime();
		System.out.println("Big Product: "+product12);
		System.out.println("Big Time: "+(time22-time21));
		//System.out.println("Big Product: "+product3);
		
		long time23=System.nanoTime();
		ArrayLargeInteger product13=(ArrayLargeInteger) huge.multiply(huge2);
		long time24=System.nanoTime();
		System.out.println("Array Product: "+product13.toString());
		System.out.println("Array Time:"+(time24-time23));
		System.out.println();
		
		
		
		System.out.println("Large sum:");
		time1=System.nanoTime();
		ArrayLargeInteger sum1= (ArrayLargeInteger) g.add(j);
		time2=System.nanoTime();
		System.out.println("Array Sum: " + sum1.toString());
		System.out.println("Array Time: "+(time2-time1));
		
		time1=System.nanoTime();
		LinkedLargeInteger sum3= (LinkedLargeInteger) g2.add(j2);
		time2=System.nanoTime();
		System.out.println("Linked Sum: " + sum3.toString());
		System.out.println("Linked Time: "+(time2-time1));
		
		time1=System.nanoTime();
		BigInteger sum4= g22.add(j22);
		time2=System.nanoTime();
		System.out.println("Big Sum: " + sum4.toString());
		System.out.println("Big Time: "+(time2-time1));
		System.out.println();
		
		System.out.println("Medium sum:");
		time1=System.nanoTime();
		ArrayLargeInteger sum5= (ArrayLargeInteger) mult1.add(mult2);
		time2=System.nanoTime();
		System.out.println("Array Sum: " + sum5.toString());
		System.out.println("Array Time: "+(time2-time1));
		
		time1=System.nanoTime();
		LinkedLargeInteger sum6= (LinkedLargeInteger) mult12.add(mult22);
		time2=System.nanoTime();
		System.out.println("Linked Sum: " + sum6.toString());
		System.out.println("Linked Time: "+(time2-time1));
		
		time1=System.nanoTime();
		BigInteger sum7= multBig.add(multBig2);
		time2=System.nanoTime();
		System.out.println("Big Sum: " + sum7.toString());
		System.out.println("Big Time: "+(time2-time1));
		System.out.println();
		
		
		System.out.println("Small sum:");
		time1=System.nanoTime();
		ArrayLargeInteger sum8= (ArrayLargeInteger) h.add(i);
		time2=System.nanoTime();
		System.out.println("Array Sum: " + sum8.toString());
		System.out.println("Array Time: "+(time2-time1));
		
		time1=System.nanoTime();
		LinkedLargeInteger sum9= (LinkedLargeInteger) h2.add(i2);
		time2=System.nanoTime();
		System.out.println("Linked Sum: " + sum9.toString());
		System.out.println("Linked Time: "+(time2-time1));
		
		time1=System.nanoTime();
		BigInteger sum10= h22.add(i22);
		time2=System.nanoTime();
		System.out.println("Big Sum: " + sum10.toString());
		System.out.println("Big Time: "+(time2-time1));
		System.out.println();
		
		System.out.println("Huge sum:");
		time1=System.nanoTime();
		ArrayLargeInteger sum11= (ArrayLargeInteger) huge.add(huge2);
		time2=System.nanoTime();
		System.out.println("Array Sum: " + sum11.toString());
		System.out.println("Array Time: "+(time2-time1));
		
		time1=System.nanoTime();
		LinkedLargeInteger sum12= (LinkedLargeInteger) huge12.add(huge22);
		time2=System.nanoTime();
		System.out.println("Linked Sum: " + sum12.toString());
		System.out.println("Linked Time: "+(time2-time1));
		
		time1=System.nanoTime();
		BigInteger sum13= huge122.add(huge222);
		time2=System.nanoTime();
		System.out.println("Big Sum: " + sum13.toString());
		System.out.println("Big Time: "+(time2-time1));
		System.out.println();
		
		
		
		System.out.println("Large Diff:");
		
		time1=System.nanoTime();
		ArrayLargeInteger diff1= (ArrayLargeInteger) g.subtract(j);
		time2=System.nanoTime();
		System.out.println("Array diff: " + diff1.toString());
		System.out.println("Array Time: "+(time2-time1));
		
		time1=System.nanoTime();
		LinkedLargeInteger diff3= (LinkedLargeInteger) g2.subtract(j2);
		time2=System.nanoTime();
		System.out.println("Linked diff: " + diff3.toString());
		System.out.println("Linked Time: "+(time2-time1));
		
		
		time1=System.nanoTime();
		BigInteger diff4= g22.subtract(j22);
		time2=System.nanoTime();
		System.out.println("Big diff: " + diff4.toString());
		System.out.println("Big Time: "+(time2-time1));
		
		System.out.println();
		System.out.println("Medium Diff:");
		
		time1=System.nanoTime();
		ArrayLargeInteger diff5= (ArrayLargeInteger) mult1.subtract(mult2);
		time2=System.nanoTime();
		System.out.println("Array diff: " + diff5.toString());
		System.out.println("Array Time: "+(time2-time1));
		
		time1=System.nanoTime();
		LinkedLargeInteger diff6= (LinkedLargeInteger) mult12.subtract(mult22);
		time2=System.nanoTime();
		System.out.println("Linked diff: " + diff6.toString());
		System.out.println("Linked Time: "+(time2-time1));
		
		
		time1=System.nanoTime();
		BigInteger diff7= multBig.subtract(multBig2);
		time2=System.nanoTime();
		System.out.println("Big diff: " + diff7.toString());
		System.out.println("Big Time: "+(time2-time1));
		System.out.println();
		
		System.out.println("Small diff:");
		time1=System.nanoTime();
		ArrayLargeInteger diff8= (ArrayLargeInteger) h.subtract(i);
		time2=System.nanoTime();
		System.out.println("Array diff: " + diff8.toString());
		System.out.println("Array Time: "+(time2-time1));
		
		time1=System.nanoTime();
		LinkedLargeInteger diff9= (LinkedLargeInteger) h2.subtract(i2);
		time2=System.nanoTime();
		System.out.println("Linked diff: " + diff9.toString());
		System.out.println("Linked Time: "+(time2-time1));
		
		
		time1=System.nanoTime();
		BigInteger diff10= h22.subtract(i22);
		time2=System.nanoTime();
		System.out.println("Big diff: " + diff10.toString());
		System.out.println("Big Time: "+(time2-time1));
		System.out.println();
		
		System.out.println("Huge diff:");
		time1=System.nanoTime();
		ArrayLargeInteger diff11= (ArrayLargeInteger) huge.subtract(huge2);
		time2=System.nanoTime();
		System.out.println("Array diff: " + diff11.toString());
		System.out.println("Array Time: "+(time2-time1));
		
		time1=System.nanoTime();
		LinkedLargeInteger diff12= (LinkedLargeInteger) huge12.subtract(huge22);
		time2=System.nanoTime();
		System.out.println("Linked diff: " + diff12.toString());
		System.out.println("Linked Time: "+(time2-time1));
		
		
		time1=System.nanoTime();
		BigInteger diff13= huge122.subtract(huge222);
		time2=System.nanoTime();
		System.out.println("Big diff: " + diff13.toString());
		System.out.println("Big Time: "+(time2-time1));
		System.out.println();
		
		System.out.println("Negation:");
		time1=System.nanoTime();
		test=(ArrayLargeInteger) h.negate();
		time2=System.nanoTime(); 
		System.out.println("Array Small Result: "+test.toString()+" Array time: "+(time2-time1));
		time1=System.nanoTime();
		test=(ArrayLargeInteger) mult1.negate();
		time2=System.nanoTime();
		System.out.println("Array Medium Result: "+test.toString()+" Array time: "+(time2-time1));
		time1=System.nanoTime();
		test=(ArrayLargeInteger) g.negate();
		time2=System.nanoTime();
		System.out.println("Array Large Result: "+test.toString()+" Array time: "+(time2-time1));
		time1=System.nanoTime();
		test=(ArrayLargeInteger) huge.negate();
		time2=System.nanoTime();
		System.out.println("Array Huge Result: "+test.toString()+" Array time: "+(time2-time1));
		
		time1=System.nanoTime();
		test2=(LinkedLargeInteger) h2.negate();
		time2=System.nanoTime(); 
		System.out.println("Linked Small Result: "+test2.toString()+" Linked time: "+(time2-time1));
		time1=System.nanoTime();
		test2=(LinkedLargeInteger) mult12.negate();
		time2=System.nanoTime();
		System.out.println("Linked Medium Result: "+test2.toString()+" Linked time: "+(time2-time1));
		time1=System.nanoTime();
		test2=(LinkedLargeInteger) g2.negate();
		time2=System.nanoTime();
		System.out.println("Linked Large Result: "+test2.toString()+" Linked time: "+(time2-time1));
		time1=System.nanoTime();
		test2=(LinkedLargeInteger) huge12.negate();
		time2=System.nanoTime();
		System.out.println("Linked Huge Result: "+test2.toString()+" Linked time: "+(time2-time1));
		
		time1=System.nanoTime();
		test3=(BigInteger) h22.negate();
		time2=System.nanoTime(); 
		System.out.println("Big Small Result: "+test3.toString()+" Big time: "+(time2-time1));
		time1=System.nanoTime();
		test3=(BigInteger) multBig.negate();
		time2=System.nanoTime();
		System.out.println("Big Medium Result: "+test3.toString()+" Big time: "+(time2-time1));
		time1=System.nanoTime();
		test3=(BigInteger) g22.negate();
		time2=System.nanoTime();
		System.out.println("Big Large Result: "+test3.toString()+" Big time: "+(time2-time1));
		time1=System.nanoTime();
		test3=(BigInteger) huge122.negate();
		time2=System.nanoTime();
		System.out.println("Big Huge Result: "+test3.toString()+" Big time: "+(time2-time1));
		
		
		System.out.println();
		System.out.println("Absolute val:");
		time1=System.nanoTime();
		test=(ArrayLargeInteger) h.abs();
		time2=System.nanoTime(); 
		System.out.println("Array Small Result: "+test.toString()+" Array time: "+(time2-time1));
		time1=System.nanoTime();
		test=(ArrayLargeInteger) mult1.abs();
		time2=System.nanoTime();
		System.out.println("Array Medium Result: "+test.toString()+" Array time: "+(time2-time1));
		time1=System.nanoTime();
		test=(ArrayLargeInteger) g.abs();
		time2=System.nanoTime();
		System.out.println("Array Large Result: "+test.toString()+" Array time: "+(time2-time1));
		time1=System.nanoTime();
		test=(ArrayLargeInteger) huge.abs();
		time2=System.nanoTime();
		System.out.println("Array Huge Result: "+test.toString()+" Array time: "+(time2-time1));
		
		time1=System.nanoTime();
		test2=(LinkedLargeInteger) h2.abs();
		time2=System.nanoTime(); 
		System.out.println("Linked Small Result: "+test2.toString()+" Linked time: "+(time2-time1));
		time1=System.nanoTime();
		test2=(LinkedLargeInteger) mult12.abs();
		time2=System.nanoTime();
		System.out.println("Linked Medium Result: "+test2.toString()+" Linked time: "+(time2-time1));
		time1=System.nanoTime();
		test2=(LinkedLargeInteger) g2.abs();
		time2=System.nanoTime();
		System.out.println("Linked Large Result: "+test2.toString()+" Linked time: "+(time2-time1));
		time1=System.nanoTime();
		test2=(LinkedLargeInteger) huge12.abs();
		time2=System.nanoTime();
		System.out.println("Linked Huge Result: "+test2.toString()+" Linked time: "+(time2-time1));
		
		time1=System.nanoTime();
		test3=(BigInteger) h22.abs();
		time2=System.nanoTime(); 
		System.out.println("Big Small Result: "+test3.toString()+" Big time: "+(time2-time1));
		time1=System.nanoTime();
		test3=(BigInteger) multBig.abs();
		time2=System.nanoTime();
		System.out.println("Big Medium Result: "+test3.toString()+" Big time: "+(time2-time1));
		time1=System.nanoTime();
		test3=(BigInteger) g22.abs();
		time2=System.nanoTime();
		System.out.println("Big Large Result: "+test3.toString()+" Big time: "+(time2-time1));
		time1=System.nanoTime();
		test3=(BigInteger) huge122.abs();
		time2=System.nanoTime();
		System.out.println("Big Huge Result: "+test3.toString()+" Big time: "+(time2-time1));
		System.out.println();
		
		
		
		System.out.println("Max:");
		time1=System.nanoTime();
		test=(ArrayLargeInteger) h.max(i);
		time2=System.nanoTime(); 
		System.out.println("Array Small Result: "+test.toString()+" Array time: "+(time2-time1));
		time1=System.nanoTime();
		test=(ArrayLargeInteger) mult1.max(mult2);
		time2=System.nanoTime();
		System.out.println("Array Medium Result: "+test.toString()+" Array time: "+(time2-time1));
		time1=System.nanoTime();
		test=(ArrayLargeInteger) g.max(j);
		time2=System.nanoTime();
		System.out.println("Array Large Result: "+test.toString()+" Array time: "+(time2-time1));
		time1=System.nanoTime();
		test=(ArrayLargeInteger) huge.max(huge2);
		time2=System.nanoTime();
		System.out.println("Array Huge Result: "+test.toString()+" Array time: "+(time2-time1));
		
		time1=System.nanoTime();
		test2=(LinkedLargeInteger) h2.max(i2);
		time2=System.nanoTime(); 
		System.out.println("Linked Small Result: "+test2.toString()+" Linked time: "+(time2-time1));
		time1=System.nanoTime();
		test2=(LinkedLargeInteger) mult12.max(mult22);
		time2=System.nanoTime();
		System.out.println("Linked Medium Result: "+test2.toString()+" Linked time: "+(time2-time1));
		time1=System.nanoTime();
		test2=(LinkedLargeInteger) g2.max(j2);
		time2=System.nanoTime();
		System.out.println("Linked Large Result: "+test2.toString()+" Linked time: "+(time2-time1));
		time1=System.nanoTime();
		test2=(LinkedLargeInteger) huge12.max(huge22);
		time2=System.nanoTime();
		System.out.println("Linked Huge Result: "+test2.toString()+" Linked time: "+(time2-time1));
		
		time1=System.nanoTime();
		test3=(BigInteger) h22.max(i22);
		time2=System.nanoTime(); 
		System.out.println("Big Small Result: "+test3.toString()+" Big time: "+(time2-time1));
		time1=System.nanoTime();
		test3=(BigInteger) multBig.max(multBig2);
		time2=System.nanoTime();
		System.out.println("Big Medium Result: "+test3.toString()+" Big time: "+(time2-time1));
		time1=System.nanoTime();
		test3=(BigInteger) g22.max(j22);
		time2=System.nanoTime();
		System.out.println("Big Large Result: "+test3.toString()+" Big time: "+(time2-time1));
		time1=System.nanoTime();
		test3=(BigInteger) huge122.max(huge222);
		time2=System.nanoTime();
		System.out.println("Big Huge Result: "+test3.toString()+" Big time: "+(time2-time1));
		System.out.println();
		
		
		System.out.println("Min:");
		time1=System.nanoTime();
		test=(ArrayLargeInteger) h.min(i);
		time2=System.nanoTime(); 
		System.out.println("Array Small Result: "+test.toString()+" Array time: "+(time2-time1));
		time1=System.nanoTime();
		test=(ArrayLargeInteger) mult1.min(mult2);
		time2=System.nanoTime();
		System.out.println("Array Medium Result: "+test.toString()+" Array time: "+(time2-time1));
		time1=System.nanoTime();
		test=(ArrayLargeInteger) g.min(j);
		time2=System.nanoTime();
		System.out.println("Array Large Result: "+test.toString()+" Array time: "+(time2-time1));
		time1=System.nanoTime();
		test=(ArrayLargeInteger) huge.min(huge2);
		time2=System.nanoTime();
		System.out.println("Array Huge Result: "+test.toString()+" Array time: "+(time2-time1));
		
		time1=System.nanoTime();
		test2=(LinkedLargeInteger) h2.min(i2);
		time2=System.nanoTime(); 
		System.out.println("Linked Small Result: "+test2.toString()+" Linked time: "+(time2-time1));
		time1=System.nanoTime();
		test2=(LinkedLargeInteger) mult12.min(mult22);
		time2=System.nanoTime();
		System.out.println("Linked Medium Result: "+test2.toString()+" Linked time: "+(time2-time1));
		time1=System.nanoTime();
		test2=(LinkedLargeInteger) g2.min(j2);
		time2=System.nanoTime();
		System.out.println("Linked Large Result: "+test2.toString()+" Linked time: "+(time2-time1));
		time1=System.nanoTime();
		test2=(LinkedLargeInteger) huge12.min(huge22);
		time2=System.nanoTime();
		System.out.println("Linked Huge Result: "+test2.toString()+" Linked time: "+(time2-time1));
		
		time1=System.nanoTime();
		test3=(BigInteger) h22.min(i22);
		time2=System.nanoTime(); 
		System.out.println("Big Small Result: "+test3.toString()+" Big time: "+(time2-time1));
		time1=System.nanoTime();
		test3=(BigInteger) multBig.min(multBig2);
		time2=System.nanoTime();
		System.out.println("Big Medium Result: "+test3.toString()+" Big time: "+(time2-time1));
		time1=System.nanoTime();
		test3=(BigInteger) g22.min(j22);
		time2=System.nanoTime();
		System.out.println("Big Large Result: "+test3.toString()+" Big time: "+(time2-time1));
		time1=System.nanoTime();
		test3=(BigInteger) huge122.min(huge222);
		time2=System.nanoTime();
		System.out.println("Big Huge Result: "+test3.toString()+" Big time: "+(time2-time1));
		System.out.println();
		
		
		
		System.out.println("Signum:");
		time1=System.nanoTime();
		int sig1=i.signum();
		time2=System.nanoTime(); 
		System.out.println("Array Small Result: "+sig1+" Array time: "+(time2-time1));
		time1=System.nanoTime();
		int sig2=mult1.signum();
		time2=System.nanoTime();
		System.out.println("Array Medium Result: "+sig2+" Array time: "+(time2-time1));
		time1=System.nanoTime();
		int sig3=g.signum();
		time2=System.nanoTime();
		System.out.println("Array Large Result: "+sig3+" Array time: "+(time2-time1));
		time1=System.nanoTime();
		int sig4=huge.signum();
		time2=System.nanoTime();
		System.out.println("Array Huge Result: "+sig4+" Array time: "+(time2-time1));
		
		time1=System.nanoTime();
		int sig5=h2.signum();
		time2=System.nanoTime(); 
		System.out.println("Linked Small Result: "+sig5+" Linked time: "+(time2-time1));
		time1=System.nanoTime();
		int sig6=mult12.signum();
		time2=System.nanoTime();
		System.out.println("Linked Medium Result: "+sig6+" Linked time: "+(time2-time1));
		time1=System.nanoTime();
		int sig7=g2.signum();
		time2=System.nanoTime();
		System.out.println("Linked Large Result: "+sig7+" Linked time: "+(time2-time1));
		time1=System.nanoTime();
		int sig8=huge12.signum();
		time2=System.nanoTime();
		System.out.println("Linked Huge Result: "+sig8+" Linked time: "+(time2-time1));
		
		time1=System.nanoTime();
		int sig9=h22.signum();
		time2=System.nanoTime(); 
		System.out.println("Big Small Result: "+sig9+" Big time: "+(time2-time1));
		time1=System.nanoTime();
		int sig10=multBig.signum();
		time2=System.nanoTime();
		System.out.println("Big Medium Result: "+sig10+" Big time: "+(time2-time1));
		time1=System.nanoTime();
		int sig11=g22.signum();
		time2=System.nanoTime();
		System.out.println("Big Large Result: "+sig11+" Big time: "+(time2-time1));
		time1=System.nanoTime();
		int sig12=huge122.signum();
		time2=System.nanoTime();
		System.out.println("Big Huge Result: "+sig12+" Big time: "+(time2-time1));
		System.out.println();
		
		
		System.out.println("Compare:");
		time1=System.nanoTime();
		int compare1=h.compareTo(i);
		time2=System.nanoTime(); 
		System.out.println("Array Small Result: "+compare1+" Array time: "+(time2-time1));
		time1=System.nanoTime();
		int compare2=mult1.compareTo(mult2);
		time2=System.nanoTime();
		System.out.println("Array Medium Result: "+compare2+" Array time: "+(time2-time1));
		time1=System.nanoTime();
		int compare3=g.compareTo(j);
		time2=System.nanoTime();
		System.out.println("Array Large Result: "+compare3+" Array time: "+(time2-time1));
		time1=System.nanoTime();
		int compare4=huge.compareTo(huge2);
		time2=System.nanoTime();
		System.out.println("Array Huge Result: "+compare4+" Array time: "+(time2-time1));
		
		time1=System.nanoTime();
		int compare5=h2.compareTo(i2);
		time2=System.nanoTime(); 
		System.out.println("Linked Small Result: "+compare5+" Linked time: "+(time2-time1));
		time1=System.nanoTime();
		int compare6=mult12.compareTo(mult22);
		time2=System.nanoTime();
		System.out.println("Linked Medium Result: "+compare6+" Linked time: "+(time2-time1));
		time1=System.nanoTime();
		int compare7=g2.compareTo(j2);
		time2=System.nanoTime();
		System.out.println("Linked Large Result: "+compare7+" Linked time: "+(time2-time1));
		time1=System.nanoTime();
		int compare8=huge12.compareTo(huge22);
		time2=System.nanoTime();
		System.out.println("Linked Huge Result: "+compare8+" Linked time: "+(time2-time1));
		
		time1=System.nanoTime();
		int compare9=h22.compareTo(i22);
		time2=System.nanoTime(); 
		System.out.println("Big Small Result: "+compare9+" Big time: "+(time2-time1));
		time1=System.nanoTime();
		int compare10=multBig.compareTo(multBig2);
		time2=System.nanoTime();
		System.out.println("Big Medium Result: "+compare10+" Big time: "+(time2-time1));
		time1=System.nanoTime();
		int compare11=g22.compareTo(j22);
		time2=System.nanoTime();
		System.out.println("Big Large Result: "+compare11+" Big time: "+(time2-time1));
		time1=System.nanoTime();
		int compare12=huge122.compareTo(huge222);
		time2=System.nanoTime();
		System.out.println("Big Huge Result: "+compare12+" Big time: "+(time2-time1));
		System.out.println();

		
		
		
	}

}
