public class dfds {

    static void authenticate(GWAccount account) {
        handleErrors(
                () -> "authenticate; account: " + account,
                () -> _authenticate(account)


        );
    }
}
