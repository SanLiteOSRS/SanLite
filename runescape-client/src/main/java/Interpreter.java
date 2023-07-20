import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("am")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("as")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("aj")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("ag")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("az")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1226471323
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("ap")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1385664005
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1317950821
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lca;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("ad")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("ao")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("ak")
	static boolean field878;
	@ObfuscatedName("an")
	static boolean field864;
	@ObfuscatedName("af")
	static ArrayList field880;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 767172181
	)
	static int field881;
	@ObfuscatedName("bn")
	static final double field882;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	static Archive field885;

	static {
		Interpreter_arrayLengths = new int[5]; // L: 71
		Interpreter_arrays = new int[5][5000]; // L: 72
		Interpreter_intStack = new int[1000]; // L: 73
		Interpreter_stringStack = new String[1000]; // L: 75
		Interpreter_frameDepth = 0; // L: 77
		Interpreter_frames = new ScriptFrame[50]; // L: 78
		Interpreter_calendar = java.util.Calendar.getInstance(); // L: 84
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; // L: 87
		field878 = false;
		field864 = false;
		field880 = new ArrayList();
		field881 = 0;
		field882 = Math.log(2.0D); // L: 97
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lag;I)Lam;",
		garbageValue = "-654808051"
	)
	public static class3 method2069(class6 var0) {
		switch(var0.field20) { // L: 9
		case 0:
			return new class0(); // L: 16
		default:
			throw new IllegalArgumentException(); // L: 12
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnd;ZLpc;I)V",
		garbageValue = "2044314347"
	)
	public static void method2070(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		Frames.ItemComposition_archive = var0; // L: 90
		class140.ItemComposition_modelArchive = var1; // L: 91
		class502.ItemComposition_inMembersWorld = var2; // L: 92
		class239.ItemComposition_fileCount = Frames.ItemComposition_archive.getGroupFileCount(10); // L: 93
		GroundObject.ItemComposition_fontPlain11 = var3; // L: 94
	} // L: 95

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Ldc;",
		garbageValue = "-81"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = class126.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = SoundCache.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-2066860268"
	)
	static int method2073(int var0, Script var1, boolean var2) {
		return 2; // L: 3238
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "81"
	)
	static void method1995(int var0, int var1) {
		if (class150.clientPreferences.method2478() != 0 && var0 != -1) { // L: 3927
			ArrayList var2 = new ArrayList(); // L: 3928
			var2.add(new class318(GrandExchangeOfferOwnWorldComparator.field511, var0, 0, class150.clientPreferences.method2478(), false)); // L: 3929
			UserComparator4.method2858(var2, 0, 0, 0, 0, true); // L: 3930
			Client.playingJingle = true; // L: 3931
		}

	} // L: 3933

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-47"
	)
	static final void method1966(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12297
		class150.clientPreferences.method2556(var0); // L: 12298
	} // L: 12299
}
