package contacts;

import java.util.ArrayList;

public class MyContacts {
    public static void main(String[] args){
        ArrayList<ContactDetail> friends = new ArrayList<>();

        ContactDetail jim = new ContactDetail();
        jim.setFullName("Jim Wang");
        jim.setEmail("jim@gmail.com");
        jim.setFacebookID("jim001");
        jim.setPhone("13671993456");

        ContactDetail rui = new ContactDetail();
        rui.setFullName("Rui Meng");
        rui.setEmail("mengruigege@gmail.com");
        rui.setFacebookID("rui001");
        rui.setPhone("13269002808");

        friends.add(jim);
        friends.add(rui);

        for (ContactDetail friend : friends){
            System.out.println(friend);
        }
    }
}
