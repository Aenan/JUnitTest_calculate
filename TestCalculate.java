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

	// ˵��: Junit4.11�汾���Ժ��֧��,�������������°汾.
	//
	// �������ԭ��,JUnit�ǲ�ָ�����Է�������ִ��˳��ġ�
	// ĿǰΪֹ,��Щ����ֻ�Ǽ򵥵ذ��շ���(reflection) API���ص�˳��ִ�С�
	// ����,ʹ��JVMĬ���ṩ�������Ǻܲ����ǵ�,��ΪJavaƽ̨û��ָ���κ��й��ɵ�˳��,
	// ����ʵ��JDK 7���ܻ᷵��һ�������˳��
	// ��Ȼ,���ı�д�Ĳ��Դ���֮�䲢����Ҫ�ٶ��κ�ִ��˳��,����ʱ��,����ĳЩƽ̨��һ����Ԥ���ʧ���ܱ������ʧ��Ҫ�á�
	//
	// ��4.11�汾��ʼ,JUnit��Ĭ��ʹ��һ��ȷ����,������Ԥ���˳��( MethodSorters.DEFAULT )��
	// Ҫ�ı����ִ�е�˳��ֻ��Ҫ�ڲ�����(class)��ʹ�� @FixMethodOrder ע��,��ָ��һ�����õ�MethodSorter����:
	//
	// @FixMethodOrder(MethodSorters.JVM) :
	// �������Է�����ִ��˳��ΪJVM���ص�˳��ÿ�β��Ե�ִ��˳���п��ܻ�����ͬ��
	// @FixMethodOrder(MethodSorters.NAME_ASCENDING)
	// :���ݲ��Է����ķ���������,���մʵ��������(ASC,��С����,����)��


