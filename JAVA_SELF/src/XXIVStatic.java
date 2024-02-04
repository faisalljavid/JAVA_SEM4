public class XXIVStatic {
    public static void main(String[] args) {
        // static = modifier. A single copy of a variable/method is created and shared.
        //         -> The class "owns" the static member

        Friend friend1 = new Friend("Bob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Tom");
        Friend friend4 = new Friend("Tim");

        // System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();
    }
}
