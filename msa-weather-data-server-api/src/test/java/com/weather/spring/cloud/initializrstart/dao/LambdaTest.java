package com.weather.spring.cloud.initializrstart.dao;

import com.weather.spring.cloud.initializrstart.service.FilterAgeStudentImpl;
import com.weather.spring.cloud.initializrstart.service.FilterFeeStudentImpl;
import com.weather.spring.cloud.initializrstart.service.FilterStudent;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;


/**
 * @program: msa-weather-master
 * @description: This is lambda test demo
 * @author: W.HL
 * @create: 2019-04-24 20:32
 *
 *jdk1.8中使用“->”操作符又称之为剪头操作符或者Lambda操作符，使用该操作符将表达式分为两部分：
 * 左侧：Lambda表达式参数列表
 * 右侧：Lambda表达式中所执行的功能 （又称之为函数式接口的实现方法）
 * 接口方法参数情况：
 * 一、无参数无返回值
 *         Runnable run = () -> System.out.println("come in");
 * 二、有一个参数无返回值（左边小括号可以省略）
 *         Consumer<String> com = x -> System.out.println(x);
 * 三、有多个参数有返回值 (Lambda体中只有一条语句，return 和大括号都可以省略)
 *         Comparator<Integer> li = (x,y) -> {
 *             System.out.println("come in");
 *             return Integer.compare(x,y);
 *         }
 *         Comparator<Integer> li = Integer::compare;
 *         Comparator<Integer> li = Comparator.comparingInt(x -> x);
 * 四、如果上下文中已指定参数类型则Lambda参数列表中可以省略参数类型，JVM根据上下文会自动识别参数类型
 *      (Integer x,Integer y) -> Integer.compare(x,y);
 * 函数式接口：只能含有一个抽象方法但是可以有多个默认方法的接口成为函数式接口
 *      @FunctionalInterface
 *      public interface FilterStudent<T>
 *      {
 *           boolean filterByCond(T t);
 *           // 如果在创建一个抽象接口 例如：boolean filterByCond5(T t);则会报错
 *           default void filterByCond3(T t){
 *              System.out.println(t);
 *          };
 *       }
 *
 **/
@Slf4j
public class LambdaTest
{
    private static final int ageLit = 30;

    private static final BigDecimal feeLit = new BigDecimal("18000.99");

    List<Student> list = Arrays.asList(
            new Student("张三",18,new BigDecimal("15000.11"))
            ,new Student("李四",20,new BigDecimal("16000.99"))
            ,new Student("王五",25,new BigDecimal("18000.99"))
            ,new Student("赵六",40,new BigDecimal("21000.99"))
            ,new Student("田七",50,new BigDecimal("31000.99"))
            );
    /**
     * 根据年龄过滤
     * @param list
     * @return
     */
    public List<Student> filterStudentByAge(List<Student> list){
        List<Student> resultList = new ArrayList<>();
        for (Student student : list){
            if(student.getAge()>ageLit){
                resultList.add(student);
            }
        }
        return resultList;
    }

    /**
     * 根据学费过滤
     * @param list
     * @return
     */
    public List<Student> filterStudentByFee(List<Student> list){
        List<Student> resultList = new ArrayList<>();
        for (Student student : list){
            if(student.getStudyFee().compareTo(feeLit)>0){
                resultList.add(student);
            }
        }
        return resultList;
    }

    @Test
    public void test(){
        /*获取年龄大于30的学生*/
        List<Student> list_1 = filterStudentByAge(list);
        log.info("当前年龄大于30的学生有：{}",list_1.toString());
        log.info("----------------------------------");
        /*获取学费大于18000的学生*/
        List<Student> list_2 = filterStudentByFee(list);
        log.info("当前学费大大于18000.99元的学生有：{}",list_2.toString());
    }

    /**
     * 优化一 使用策略者模式
     */
    @Test
    public void test1(){
        /*获取年龄大于30的学生*/
        List<Student> list_3 = filterByCond(list,new FilterAgeStudentImpl());
        log.info("当前年龄大于30的学生有：{}",list_3.toString());
        log.info("----------------------------------");
        /*获取学费大于18000的学生*/
        List<Student> list_4 = filterByCond(list,new FilterFeeStudentImpl());
        log.info("当前学费大大于18000.99元的学生有：{}",list_4.toString());
    }

    public List<Student> filterByCond(List<Student> list,FilterStudent<Student> filterStudent){
        List<Student> list_1 = new ArrayList<>();
        for (Student student: list){
            if(filterStudent.filterByCond(student)){
                list_1.add(student);
            }
        }
        return list_1;
    }

    /**
     * 优化二 使用Lambda 表达式进行处理
     */
    @Test
    public void test2(){
        /*获取年龄大于30的学生*/
        List<Student> list_3 = filterByCond(list,(s) -> s.getAge()<=ageLit);
        log.info("当前年龄大于30的学生有：{}",list_3.toString());
        log.info("----------------------------------");
        /*获取学费大于18000的学生*/
        List<Student> list_4 = filterByCond(list,(s) -> s.getStudyFee().compareTo(feeLit)>0);
        log.info("当前学费大于18000.99元的学生有：{}",list_4.toString());
    }

    /**
     * 优化三 使用Lambda stream表达式进行处理
     */
    @Test
    public void test3(){
        /*获取年龄大于30的学生 并按照年龄倒叙*/
        List<Student> list_3 = list.stream().filter((e)->e.getAge()>ageLit).sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());
        log.info("当前年龄大于30的学生有：{}",list_3.toString());
        log.info("----------------------------------");
        /*获取学费大于18000的学生*/
        List<Student> list_4 = list.stream().filter((e)->e.getStudyFee().compareTo(feeLit)>0).collect(Collectors.toList());
        log.info("当前学费大于18000.99元的学生有：{}",list_4.toString());
    }

    /**
     * 只获取年龄小于30的学生的学费
     */
    @Test
    public void test4(){
        /*获取年龄大于30的学生*/
        list.stream().filter(e->e.getAge()<30).map(e->e.getStudyFee()).forEach(e-> System.out.println(e));
        log.info("----------------------------------");
    }

    /**
     * 多个参数有返回值
     */
    @Test
    public void test5(){
        /*获取年龄大于30的学生*/
        //Comparator<Integer> li = (x,y) -> Integer.compare(x,y);
        //Comparator<Integer> li = Integer::compare;
        Comparator<Integer> li = Comparator.comparingInt(x -> x);
        System.out.println(li.compare(4,1));
        log.info("----------------------------------");
    }

    /**
     * 无参数无返回值
     */
    @Test
    public void test6(){
        Runnable run = () -> System.out.println("come in");
        run.run();
        log.info("----------------------------------");
    }

    /**
     * 一个参数无返回值
     */
    @Test
    public void test7(){
        Consumer<String> com = x-> System.out.println(x);
        com.accept("你好");
        log.info("----------------------------------");
    }

}
