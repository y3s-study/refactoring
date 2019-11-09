package refactoring.sk.ch10._12_replace_constructor_with_factory_method;


public class Example1 {
    static class Employee {
        private int type;
        static final int ENGINEER = 0;
        static final int SALESMAN = 1;
        static final int MANAGER = 2;

        private Employee(int type) {
            this.type = type;
        }

        // 이 메서드를 통해서 정수 타입을 받는 create 제거가 가능하다.
        // 새로운 하위 클래스가 추가 되어도 switch-case 문을 바꾸지 않는다.
        // 다만 오타로 인한 에러가 발생 가능
        static Employee create(String name) throws Exception {
            try {
                return (Employee) Class.forName(name).newInstance();
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                e.printStackTrace();
                throw new Exception("객체" + name + "를 인스턴스화 할 수 없음");
            }
        }

        // 요놈이 제거됨...
        static Employee create(int type) throws Exception {
            switch (type) {
                case ENGINEER:
                    return create("ENGINEER");
                case SALESMAN:
                    return create("SALESMAN");
                case MANAGER:
                    return create("MANAGER");
                default:
                    throw new Exception("없는 분류 부호 값");
            }
        }

    }

    static class Engineer extends Employee {

        private Engineer(int type) {
            super(type);
        }
    }

    static class Salesman extends Employee {

        private Salesman(int type) {
            super(type);
        }
    }

    static class Manager extends Employee {

        private Manager(int type) {
            super(type);
        }
    }
}
