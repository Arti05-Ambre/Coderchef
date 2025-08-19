class Codechef {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2, result;

        // Example 1: Multiplication has higher precedence than addition
        result = a + b * c;  // 10 + (5 * 2) = 10 + 10 = 20
        System.out.println("Example 1 (Multiplication before Addition): " + result);

        // Example 2: Parentheses change the precedence
        result = (a + b) * c; // (10 + 5) * 2 = 15 * 2 = 30
        System.out.println("Example 2 (Using Parentheses): " + result);

        // Example 3: Division has higher precedence than subtraction
        result = a - b / c;  // 10 - (5 / 2) = 10 - 2 = 8 (Integer Division)
        System.out.println("Example 3 (Division before Subtraction): " + result);

        // Example 4: Modulus and Multiplication
        result = a % b * c;  // (10 % 5) * 2 = 0 * 2 = 0
        System.out.println("Example 4 (Modulus before Multiplication): " + result);

        // Example 5: Relational Operators before Logical AND
        boolean comparison = a > b && b > c; // (10 > 5) && (5 > 2) → true && true → true
        System.out.println("Example 5 (Relational before Logical AND): " + comparison);

