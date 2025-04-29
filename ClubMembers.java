import java.util.ArrayList;

public class ClubMembers{
    private ArrayList<MemberInfo> memberList = new ArrayList<MemberInfo>();

    public void addMembers(String[] names, int gradYear){
        for (String name: names) memberList.add(new MemberInfo(name, gradYear, true));
    }

    public void addMember(String name, int gradYear, boolean hasGoodStanding){
        memberList.add(new MemberInfo(name, gradYear, hasGoodStanding));
    }

    public ArrayList<MemberInfo> removeMembers(int year){
        ArrayList<MemberInfo> list = new ArrayList<MemberInfo>();
        for (int i = 0; i < memberList.size(); i++){
            if (memberList.get(i).getGradYear() <= year){
                if (memberList.get(i).inGoodStanding()) list.add(memberList.get(i));
                memberList.remove(i);
                i--;
            }
        }
        return list;
    }

    public ArrayList<MemberInfo> getMemberList(){
        return memberList;
    }
}