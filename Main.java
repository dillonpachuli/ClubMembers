public class Main{
    public static void main(String[] args){
        String[] names = {"Adrien", "Ocean", "Rain"};
        ClubMembers c = new ClubMembers();
        c.addMembers(names, 2026);
        System.out.println(c.getMemberList());
        System.out.println("");

        ClubMembers c2 = new ClubMembers();
        c2.addMember("SMITH, JANE", 2019, false);
        c2.addMember("FOX, STEVE", 2018, true);
        c2.addMember("XIN, MICHAEL", 2017, false);
        c2.addMember("GARCIA, MARIA", 2020, true);
        System.out.println(c2.getMemberList());
        System.out.println("");
        System.out.println(c2.removeMembers(2018));
        System.out.println("");
        System.out.println(c2.getMemberList());
    }
}
