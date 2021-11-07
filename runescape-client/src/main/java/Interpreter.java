import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("p")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("j")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("b")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("y")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 137218349
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "[Lbt;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("r")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("m")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("f")
	static boolean field795;
	@ObfuscatedName("h")
	static boolean field791;
	@ObfuscatedName("v")
	static ArrayList field797;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 519063965
	)
	static int field798;
	@ObfuscatedName("am")
	static final double field801;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	@Export("mouseRecorder")
	static class81 mouseRecorder;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field795 = false;
		field791 = false;
		field797 = new ArrayList();
		field798 = 0;
		field801 = Math.log(2.0D);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Ljf;IIIB)V",
		garbageValue = "124"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3128 == null) {
			throw new RuntimeException();
		} else {
			var0.field3128[var1] = var2;
			var0.field3129[var1] = var3;
		}
	}

	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "(Lfm;IIII)V",
		garbageValue = "-228411245"
	)
	static void method1872(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class408.clientPreferences.areaSoundEffectsVolume != 0) {
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
				int var4 = var0.soundEffects[var1];
				if (var4 != 0) {
					int var5 = var4 >> 8;
					int var6 = var4 >> 4 & 7;
					int var7 = var4 & 15;
					Client.soundEffectIds[Client.soundEffectCount] = var5;
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6;
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
					Client.soundEffects[Client.soundEffectCount] = null;
					int var8 = (var2 - 64) / 128;
					int var9 = (var3 - 64) / 128;
					Client.soundLocations[Client.soundEffectCount] = var7 + (var9 << 8) + (var8 << 16);
					++Client.soundEffectCount;
				}
			}
		}
	}
}
