package com.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.demo.Calculate;

public class TestCalculate {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp3() throws Exception {
	}

	@After
	public void tearDown3() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		Calculate cul = new Calculate();
		int result = cul.Add(3, 5);
		assertEquals(7, result);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// http://www.udel.edu/CIS/software/dist/junit4.1/javadoc/

	// 说明: Junit4.11版本及以后才支持,建议升级到最新版本.
	//
	// 按照设计原则,JUnit是不指定测试方法调用执行顺序的。
	// 目前为止,这些方法只是简单地按照反射(reflection) API返回的顺序执行。
	// 但是,使用JVM默认提供的排序是很不明智的,因为Java平台没有指定任何有规律的顺序,
	// 而事实上JDK 7可能会返回一个随机的顺序。
	// 当然,精心编写的测试代码之间并不需要假定任何执行顺序,但有时候,但在某些平台上一个可预测的失败总比随机的失败要好。
	//
	// 从4.11版本开始,JUnit将默认使用一个确定的,但不可预测的顺序( MethodSorters.DEFAULT )。
	// 要改变测试执行的顺序只需要在测试类(class)上使用 @FixMethodOrder 注解,并指定一个可用的MethodSorter即可:
	//
	// @FixMethodOrder(MethodSorters.JVM) :
	// 保留测试方法的执行顺序为JVM返回的顺序。每次测试的执行顺序有可能会所不同。
	// @FixMethodOrder(MethodSorters.NAME_ASCENDING)
	// :根据测试方法的方法名排序,按照词典排序规则(ASC,从小到大,递增)。


