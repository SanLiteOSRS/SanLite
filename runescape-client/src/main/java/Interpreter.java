import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
@Implements("Interpreter")
public class Interpreter {
   @ObfuscatedName("u")
   @Export("Interpreter_arrayLengths")
   static int[] Interpreter_arrayLengths = new int[5];
   @ObfuscatedName("n")
   @Export("Interpreter_arrays")
   static int[][] Interpreter_arrays = new int[5][5000];
   @ObfuscatedName("t")
   @Export("Interpreter_intStack")
   static int[] Interpreter_intStack = new int[1000];
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1267204541
   )
   @Export("Interpreter_intStackSize")
   static int Interpreter_intStackSize;
   @ObfuscatedName("x")
   @Export("Interpreter_stringStack")
   static String[] Interpreter_stringStack = new String[1000];
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1592164881
   )
   @Export("Interpreter_stringStackSize")
   static int Interpreter_stringStackSize;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 579682077
   )
   @Export("Interpreter_frameDepth")
   static int Interpreter_frameDepth = 0;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "[Lbp;"
   )
   @Export("Interpreter_frames")
   static ScriptFrame[] Interpreter_frames = new ScriptFrame[50];
   @ObfuscatedName("p")
   @Export("Interpreter_calendar")
   static java.util.Calendar Interpreter_calendar = java.util.Calendar.getInstance();
   @ObfuscatedName("b")
   @Export("Interpreter_MONTHS")
   static final String[] Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
   @ObfuscatedName("e")
   static boolean field1074 = false;
   @ObfuscatedName("z")
   static boolean field1072 = false;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1440593965
   )
   static int field1064 = 0;
   @ObfuscatedName("v")
   static final double field1078 = Math.log(2.0D);
}
