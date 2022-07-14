package ss10_stack_queue.practice.stack_deployment.controller;

import static ss10_stack_queue.practice.stack_deployment.model.MyGenericStack.stackOfIStrings;
import static ss10_stack_queue.practice.stack_deployment.model.MyGenericStack.stackOfIntegers;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
