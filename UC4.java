public class OOPSBannerApp {

    public static void main(String[] args) {

        // 1. Create String Array
        String[] banner = new String[7];

        // 2. Populate Array using String.join()
        banner[0] = String.join("",
                "   ***   ",
                "    ***    ",
                " ****** ",
                "  ******");

        banner[1] = String.join("",
                "  **  **  ",
                "   **  **   ",
                " **   ** ",
                " **   **");

        banner[2] = String.join("",
                " **    ** ",
                "  **    **  ",
                " **   ** ",
                " **   **");

        banner[3] = String.join("",
                " **    ** ",
                "  **    **  ",
                " ****** ",
                "  ******");

        banner[4] = String.join("",
                " **    ** ",
                "  **    **  ",
                " **      ",
                " **");

        banner[5] = String.join("",
                "  **  **  ",
                "   **  **   ",
                " **      ",
                " **");

        banner[6] = String.join("",
                "   ***   ",
                "    ***    ",
                " **      ",
                " ******");

        // 3. Print using Enhanced For Loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}