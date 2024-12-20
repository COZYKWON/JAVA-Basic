package construct;

public class MethodInitMain1 {

    public static void main(String[] args) {

        MemberInit member1 = initMember("user1", 15, 90);
        MemberInit member2 = initMember("user2", 16, 90);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }

    static MemberInit initMember(String name, int age, int grade) {
        MemberInit member = new MemberInit();
        member.name = name;
        member.age = age;
        member.grade = grade;
        return member;
    }
}
