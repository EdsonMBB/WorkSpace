package org.bahena.Math;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentsUtils {
    static void showHelp(CLIArguments cliArguments){
        Consumer<CLIArguments> consumerHelper = cliArguments1 -> {
            if (cliArguments.isHelp()){
                System.out.println("Manual solicitado");
            }
        };
        consumerHelper.accept(cliArguments);
    }
    static CLIArguments genetateCLI(){
        Supplier<CLIArguments> generator = () -> new CLIArguments();
        return generator.get();
    }
}
