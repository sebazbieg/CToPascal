import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Translator {
    public static class Translation extends miniCBaseListener {

        ArrayList<String> integer = new ArrayList<String>();
        ArrayList<String> real = new ArrayList<String>();
        StringBuilder progBuf = new StringBuilder();
        StringBuilder buf = new StringBuilder();
        StringBuilder varBuf = new StringBuilder();
        StringBuilder constBuf = new StringBuilder();

        public void enterStart(miniCParser.StartContext ctx) {
        }

        public void exitStart(miniCParser.StartContext ctx) {
            progBuf.append("Var");
            progBuf.append("\n");
            if(!(integer.isEmpty())){
                for (int i = 0; i < integer.size() - 1; i++) {
                    progBuf.append(integer.get(i));
                    progBuf.append(", ");
                }
                progBuf.append(integer.get(integer.size()-1));
                progBuf.append(" : integer;");
                progBuf.append("\n");
            }
            if(!(real.isEmpty())){
                for (int i = 0; i < real.size() - 2; i++) {
                    progBuf.append(real.get(i));
                    progBuf.append(", ");
                }
                progBuf.append(real.get(real.size()-1));
                progBuf.append(" ");
                progBuf.append(": real;");
                progBuf.append("\n");
            }
            progBuf.append("Const");
            progBuf.append("\n");
            progBuf.append(constBuf);
            progBuf.append("Begin");
            progBuf.append("\n");
            progBuf.append(varBuf);
            progBuf.append(buf);
            progBuf.append("End.");
            System.out.println(progBuf);
        }

//        public void enterInitial(miniCParser.InitialContext ctx) {
//        }
//
//        public void exitInitial(miniCParser.InitialContext ctx) {
//        }
//
//        public void enterBlockItemList(miniCParser.BlockItemListContext ctx) {
//        }
//
//        public void exitBlockItemList(miniCParser.BlockItemListContext ctx) {
//        }
//
//        public void enterBlockItem(miniCParser.BlockItemContext ctx) {
//        }
//
//        public void exitBlockItem(miniCParser.BlockItemContext ctx) {
//        }

        public void enterSelectionStat(miniCParser.SelectionStatContext ctx) {
            buf.append("If ");
            buf.append(ctx.expression().getChild(0));
            buf.append(" ");
            buf.append(retLogType(String.valueOf(ctx.expression().getChild(1))));
            buf.append(" ");
            buf.append(ctx.expression().getChild(2));
            buf.append(" Then");
            buf.append("\n");
        }

        public void exitSelectionStat(miniCParser.SelectionStatContext ctx) {
        }

        public void enterIterationStat(miniCParser.IterationStatContext ctx) {
            buf.append("While ");
            buf.append(ctx.expression().getChild(0));
            buf.append(" ");
            buf.append(retLogType(String.valueOf(ctx.expression().getChild(1))));
            buf.append(" ");
            buf.append(ctx.expression().getChild(2));
            buf.append(" do");
            buf.append("\n");
        }

        public void exitIterationStat(miniCParser.IterationStatContext ctx) {
        }

        public void enterAssigmentStat(miniCParser.AssigmentStatContext ctx) {
                buf.append(ctx.getChild(0));
                buf.append(" ");
                buf.append(":=");
                buf.append(" ");
                buf.append(ctx.getChild(2));
                if(ctx.parent.parent.getRuleIndex()!=4) {
                    buf.append(";");
                }
                buf.append("\n");
        }

        public void exitAssigmentStat(miniCParser.AssigmentStatContext ctx) {
        }

        public void enterArithmeticStat(miniCParser.ArithmeticStatContext ctx) {
            buf.append(ctx.getChild(0));
            buf.append(" ");
            buf.append(":=");
            buf.append(" ");
            buf.append(ctx.getChild(2));
            buf.append(" ");
            buf.append(retArithType(String.valueOf(ctx.getChild(3))));
            buf.append(" ");
            buf.append(ctx.getChild(4));
            if(ctx.parent.parent.getRuleIndex()!=4) {
                buf.append(";");
            }
            buf.append("\n");
        }

        public void exitArithmeticStat(miniCParser.ArithmeticStatContext ctx) {
        }

        public void enterVaribleDecl(miniCParser.VaribleDeclContext ctx) {
            if(String.valueOf(ctx.getChild(0)).equals("float") || String.valueOf(ctx.getChild(0)).equals("double")){
                real.add(String.valueOf(ctx.getChild(1)));
                if(ctx.getChild(2) != null){
                    varBuf.append(ctx.getChild(1));
                    varBuf.append(" := ");
                    varBuf.append(ctx.getChild(3));
                    varBuf.append(";");
                    varBuf.append("\n");
                }
            } else {
                integer.add(String.valueOf(ctx.getChild(1)));
                if(ctx.getChild(2) != null) {
                    varBuf.append(ctx.getChild(1));
                    varBuf.append(" :=");
                    varBuf.append(" ");
                    varBuf.append(ctx.getChild(3));
                    varBuf.append(";");
                    varBuf.append("\n");
                }
            }
        }

        public void exitVaribleDecl(miniCParser.VaribleDeclContext ctx) {
        }

        public void enterConstDecl(miniCParser.ConstDeclContext ctx) {
            constBuf.append(ctx.getChild(2));
            constBuf.append(" = ");
            constBuf.append(ctx.getChild(4));
            constBuf.append(";");
            constBuf.append("\n");
        }

//        public void exitConstDecl(miniCParser.ConstDeclContext ctx) {
//        }
//
//        public void enterExpression(miniCParser.ExpressionContext ctx) {
//        }
//
//        public void exitExpression(miniCParser.ExpressionContext ctx) {
//        }
//
//        public void enterStat(miniCParser.StatContext ctx) {
//        }
//
//        public void exitStat(miniCParser.StatContext ctx) {
//        }

        public void enterBlock(miniCParser.BlockContext ctx) {
            buf.append("Begin");
            buf.append("\n");
        }

        public void exitBlock(miniCParser.BlockContext ctx) {
            if(ctx.parent.parent.getRuleIndex()==4) {
                buf.append("End");
            } else {
                buf.append("End;");
            }
            buf.append("\n");
        }

        public void enterElseStat(miniCParser.ElseStatContext ctx) {
            buf.append("Else");
            buf.append("\n");

        }

//        public void exitElseStat(miniCParser.ElseStatContext ctx) {
//        }
//
//        public void enterEveryRule(ParserRuleContext ctx) {
//        }
//
//        public void exitEveryRule(ParserRuleContext ctx) {
//        }
//
//        public void visitTerminal(TerminalNode node) {
//        }
//
//        public void visitErrorNode(ErrorNode node) {
//        }

        public String retLogType(String logType) {

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

        public String retIdenType(String idenType) {

            String ret = "";

            switch (idenType) {
                case "Int":
                    ret = "Integer";
                    break;
                case "Short":
                    ret = "Integer";
                    break;
                case "Integer":
                    ret = "<";
                    break;
                case "Float":
                    ret = "Real";
                    break;
            }
            return ret;
        }

        public String retArithType(String arythType) {

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
//        String inputFile = null;
//        if ( args.length>0 ) inputFile = args[0];
//        InputStream is = System.in;
//        if ( inputFile!=null ) {
//            is = new FileInputStream(inputFile);
//        }
        String is = "    int main()\n" +
                "    {\n" +
                "        int i = 0;\n" +
                "\t\tint sum = 0;\n" +
                "\t\tfloat dram = 0;\n" +
                "\t\tconst int bumm = 2; \n" +
                "       \n" +
                "        while( i < 10 ) {\n" +
                "          sum = i;\n" +
                "        }\n" +
                "        if(i==9){\n" +
                "        \ti=10;\n" +
                "\t\t} else i = 11;\n" +
                "\t\t\n" +
                "\t\twhile( i < 10 ) {\n" +
                "          sum = i;\n" +
                "        }\n" +
                "        if(i==9){\n" +
                "            i=10;\n" +
                "            i=i+10;\n" +
                "          sum = i;\n" +
                "           {\n" +
                "            i=10;\n" +
                "            i=i+10;\n" +
                "            i=i/10;\n" +
                "            i=i%10;\n" +
                "          sum = i;\n" +
                "        }\n" +
                "        }\n" +
                "\t\t    else {\n" +
                "\t\t    i = 11;\n" +
                "\t\t    }\n" +
                "    }";
        ANTLRInputStream input = new ANTLRInputStream(is);
        miniCLexer lexer = new miniCLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        miniCParser parser = new miniCParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.start();
        // show tree in text form
//        System.out.println(tree.toStringTree(parser));
        ParseTreeWalker walker = new ParseTreeWalker();
        Translation converter = new Translation();
        walker.walk(converter, tree);
    }
}