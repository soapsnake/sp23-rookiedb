package edu.berkeley.cs186.database.learning;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Created on 2023-04-26
 */
public class AboutOptional {

    public static void main(String[] args) throws Exception {
        Integer res = null;
//        Optional<Integer> opp = Optional.of(res);  // of不能传递空值

        res = 45;
        Integer res1 = null;
        Optional<Integer> opp1 = Optional.of(res);
        Optional<Integer> opp2 = Optional.ofNullable(res1);

        System.out.println(opp2.isPresent());   //谁调用这个谁傻逼,和if(obj == null) 一个意思
        System.out.println(opp1.orElse(100));
        System.out.println(opp2.orElse(100));
        System.out.println(opp2.orElseGet(getFiles(100)));
//        System.out.println(opp2.orElseThrow(throwSome()));  //抛出异常来了
        System.out.println(opp1.filter(o -> o > 44));   //会对Optional包含的值应用过滤器,返回值还是个optional,可以进行链式调用
        System.out.println(opp1.map(o -> o * 1999));    //会对optinal包含值应用map,返回值还是optional,可以进行链式调用
//        System.out.println(opp1.flatMap(o -> o * 1000));   //不会用了

        //optinal不能序列化,不要用做类的字段
    }

    private static Supplier<Exception> throwSome() {
        return () -> new RuntimeException("wo cao ");
    }

    private static Supplier<Integer> getFiles(int a) {
        return () -> a * 100000;
    }

}
