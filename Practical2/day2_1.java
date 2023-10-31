public class day2_1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        try {
            System.out.println("请输入起始整数：");
            int start = scanner.nextInt();

            System.out.println("请输入结束整数：");
            int end = scanner.nextInt();

            if (start > end) {
                System.out.println("错误：起始整数不能大于结束整数！");
            } else {
                int sum = 0;
                for (int i = start; i <= end; i++) {
                    sum += i;
                }

                System.out.println("从" + start + "到" + end + "的整数之和为：" + sum);
            }
        } catch (Exception e) {
            System.out.println("输入错误，请输入整数！");
        }
    }
}