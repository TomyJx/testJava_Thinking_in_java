package test.testExeception;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-16-14:39
 */
public class Test {
    public static void main(String[] args) {
        /*try {
            show();
        } catch (NullPointerException e) {
            *//*System.out.println(e.toString());
            System.out.println("------------------");
            System.out.println(e.getMessage());
            System.out.println("------------------");
            System.out.println(e.getLocalizedMessage());
            System.out.println("------------------");
            e.printStackTrace();*//*
            *//*System.out.println(e.getClass());
            System.out.println(e.getClass().getName());
            System.out.println(e.getClass().getSimpleName());*//*
            *//*for (StackTraceElement s : e.getStackTrace()){
                System.out.println(s.toString());
                System.out.println(s.getClassName());
                System.out.println(s.getFileName());
                System.out.println(s.getLineNumber());
                System.out.println(s.getMethodName());
                System.out.println("------------------------");
            }*//*

        }*/
        /*int count = 0;
        while (true) {
            try {
                if (count++ == 0)
                    throw new Exception();
                System.out.println("no exception");
            } catch (Exception e) {
                System.out.println("exception");
            }finally {
                System.out.println("finally");
                if (count == 3) {
                    break;
                }
            }
        }*/
        /*try {
            System.out.println(111);
            throw new Exception();
        } catch (Exception e) {
            System.out.println("exception");
            System.exit(1);
        }finally {
            System.out.println("finally");
        }*/
        /*try{
            ex1();
        } catch (Exception1 e1) {
            System.out.println(e1);
        }finally {
            try {
                ex2();
            } catch (Exception2 e2) {
                System.out.println(e2);
            }
        }*/
        String result = null;
        for (int i = 0; i < 25; i++) {
            result += "1";
        }
        System.out.println(result);
    }

    static void show() {
        throw new NullPointerException("1111111");
    }

    static void ex1() throws Exception1 {
        throw new Exception1();
    }

    static void ex2() throws Exception2 {
        throw new Exception2();
    }
}
