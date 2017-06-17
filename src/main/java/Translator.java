import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Translator {
    public static class Translation extends miniCBaseListener {

        private ArrayList<String> integer = new ArrayList<>();
        private ArrayList<String> real = new ArrayList<>();
        private ArrayList<String> parBuf = new ArrayList<>();
        private StringBuilder progBuf = new StringBuilder();
        private StringBuilder buf = new StringBuilder();
        private StringBuilder varBuf = new StringBuilder();
        private StringBuilder constBuf = new StringBuilder();
        private int countingVar = 0;

        @Override public void exitStart(miniCParser.StartContext ctx) {
            if(!(integer.isEmpty()) || !(real.isEmpty())) {
                progBuf.append("Var");
                progBuf.append("\n");
                if (!(integer.isEmpty())) {
                    for (int i = 0; i < integer.size() - 1; i++) {
                        progBuf.append(integer.get(i));
                        progBuf.append(", ");
                    }
                    progBuf.append(integer.get(integer.size() - 1));
                    progBuf.append(" : integer;");
                    progBuf.append("\n");
                }
                if (!(real.isEmpty())) {
                    for (int i = 0; i < real.size() - 2; i++) {
                        progBuf.append(real.get(i));
                        progBuf.append(", ");
                    }
                    progBuf.append(real.get(real.size() - 1));
                    progBuf.append(" ");
                    progBuf.append(": real;");
                    progBuf.append("\n");
                }
            }
            if(constBuf.length()!=0) {
                progBuf.append("Const");
                progBuf.append("\n");
                progBuf.append(constBuf);
            }
            progBuf.append("Begin");
            progBuf.append("\n");
            progBuf.append(varBuf);
            progBuf.append(buf);
            progBuf.append("End.");
//            System.out.println(progBuf);
        }

        @Override public void enterSelectionStat(miniCParser.SelectionStatContext ctx) {
            buf.append("If ");
            buf.append(ctx.expression().getChild(0));
            buf.append(" ");
            buf.append(retLogType(String.valueOf(ctx.expression().getChild(1))));
            buf.append(" ");
            buf.append(ctx.expression().getChild(2));
            buf.append(" Then");
            buf.append("\n");
        }

        @Override public void enterIterationStat(miniCParser.IterationStatContext ctx) {
            buf.append("While ");
            buf.append(ctx.expression().getChild(0));
            buf.append(" ");
            buf.append(retLogType(String.valueOf(ctx.expression().getChild(1))));
            buf.append(" ");
            buf.append(ctx.expression().getChild(2));
            buf.append(" do");
            buf.append("\n");
        }

        @Override public void enterAssigmentStat(miniCParser.AssigmentStatContext ctx) {
                buf.append(ctx.getChild(0));
                buf.append(" ");
                buf.append(":=");
                buf.append(" ");
                buf.append(ctx.getChild(2));
                if(ctx.parent.parent.getRuleIndex()!=5) {
                    buf.append(";");
                }
                buf.append("\n");
        }

        @Override public void enterArithmeticStat(miniCParser.ArithmeticStatContext ctx) {
            buf.append(ctx.getChild(0));
            buf.append(" ");
            buf.append(":=");
            buf.append(" ");
            buf.append(ctx.getChild(2));
            buf.append(" ");
            buf.append(retArithType(String.valueOf(ctx.getChild(3))));
            buf.append(" ");
            buf.append(ctx.getChild(4));
            if(ctx.parent.parent.getRuleIndex()!=5) {
                buf.append(";");
            }
            buf.append("\n");
        }

        @Override public void enterVaribleDecl(miniCParser.VaribleDeclContext ctx) {
            if(String.valueOf(ctx.getChild(0)).equals("float") || String.valueOf(ctx.getChild(0)).equals("double")){
                real.add(String.valueOf(ctx.getChild(1)));
                if(ctx.getChild(3) != null){
                    varBuf.append(ctx.getChild(1));
                    varBuf.append(" := ");
                    varBuf.append(ctx.getChild(3));
                    varBuf.append(";");
                    varBuf.append("\n");
                }
            } else {
                integer.add(String.valueOf(ctx.getChild(1)));
                if(ctx.getChild(3) != null) {
                    varBuf.append(ctx.getChild(1));
                    varBuf.append(" :=");
                    varBuf.append(" ");
                    varBuf.append(ctx.getChild(3));
                    varBuf.append(";");
                    varBuf.append("\n");
                }
            }
        }

        @Override public void enterConstDecl(miniCParser.ConstDeclContext ctx) {
            constBuf.append(ctx.getChild(2));
            constBuf.append(" = ");
            constBuf.append(ctx.getChild(4));
            constBuf.append(";");
            constBuf.append("\n");
        }

        @Override public void enterBlock(miniCParser.BlockContext ctx) {
            buf.append("Begin");
            buf.append("\n");
        }

        @Override public void exitBlock(miniCParser.BlockContext ctx) {
            if(ctx.parent.parent.getRuleIndex()==5) {
                buf.append("End");
            } else {
                buf.append("End;");
            }
            buf.append("\n");
        }

        @Override public void enterElseStat(miniCParser.ElseStatContext ctx) {
            buf.append("Else");
            buf.append("\n");
        }

        @Override public void enterScanf(miniCParser.ScanfContext ctx) {
            buf.append("readln(");
            buf.append(ctx.Word(0));

        }

        @Override public void exitScanf(miniCParser.ScanfContext ctx) {
            for(int i=1; i < countingVar; i++){
                buf.append(", ");
                buf.append(ctx.Word(i));
            }
            buf.append(")");
            if(ctx.parent.parent.getRuleIndex()!=5) {
                buf.append(";");
            }
            buf.append("\n");
            countingVar = 0;
        }

        @Override public void enterScanParam(miniCParser.ScanParamContext ctx) {
            countingVar++;
        }

        @Override public void enterPrintf(miniCParser.PrintfContext ctx) {
            buf.append("writeln(");
            for(int i=0; ctx.variables_2(i)!=null; i++){
                if(ctx.variables_2(0).Word()==null) {
                    parBuf.add(String.valueOf(ctx.variables_2(i).Number()));
                } else{
                    parBuf.add(String.valueOf(ctx.variables_2(i).Word()));
                }
            }
        }

        @Override public void exitPrintf(miniCParser.PrintfContext ctx) {
            buf.deleteCharAt(buf.length()-1);
            buf.deleteCharAt(buf.length()-1);
            buf.append(")");
            if(ctx.parent.parent.getRuleIndex()!=5) {
                buf.append(";");
            }
            buf.append("\n");
            countingVar = 0;
            parBuf.clear();
        }

        @Override public void enterVariables_1(miniCParser.Variables_1Context ctx) {
            if(ctx.printParam()!=null) {
                buf.append(parBuf.get(countingVar));
                countingVar++;
            }
        }

        @Override public void exitVariables_1(miniCParser.Variables_1Context ctx) {
            buf.append(',');
            buf.append(' ');
        }

        @Override public void enterPrintWord(miniCParser.PrintWordContext ctx) {
            buf.append("'");
            if(countingVar>0){
                buf.append(" ");
            }
            for(int i=0; ctx.Word(i)!=null; i++){
                buf.append(ctx.Word(i));
                buf.append(' ');
            }
            buf.append("'");
        }

        String retLogType(String logType) {

            String ret = "";

            switch (logType) {
                case "==":
                    ret = "=";
                    break;
                case "!=":
                    ret = "<>";
                    break;
                case "<":
                    ret = "<";
                    break;
                case "<=":
                    ret = "<=";
                    break;
                case ">":
                    ret = ">";
                    break;
                case ">=":
                    ret = ">=";
                    break;
            }
            return ret;
        }

        String retArithType(String arythType) {

            String ret = "";

            switch (arythType) {
                case "+":
                    ret = "+";
                    break;
                case "-":
                    ret = "-";
                    break;
                case "*":
                    ret = "*";
                    break;
                case "/":
                    ret = "div";
                    break;
                case "%":
                    ret = "mod";
                    break;
            }
            return ret;
        }
    }

    public static void main(String[] args) throws Exception {

        File file = new File("src\\main\\examples\\example.c");
        String inputText;

        try (BufferedReader br = new BufferedReader(new FileReader(file.getPath()))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            inputText = sb.toString();
        }

        ANTLRInputStream input = new ANTLRInputStream(inputText);
        miniCLexer lexer = new miniCLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        miniCParser parser = new miniCParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.start();
         /* show tree in text form */
//        System.out.println(tree.toStringTree(parser));
        ParseTreeWalker walker = new ParseTreeWalker();
        Translation converter = new Translation();
        walker.walk(converter, tree);
        try(PrintWriter out = new PrintWriter( "src\\main\\examples\\exampleInPascal.txt" )){
            out.println(converter.progBuf);
        }
    }
}