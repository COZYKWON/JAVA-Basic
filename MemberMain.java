package final1;

public class MemberMain {

    public static void main(String[] args) {

        Member member = new Member("cozykwon03", "Jongwon");
        member.print();
        member.changeData("cozykwon", "Kwon");
        member.print();
    }
}
