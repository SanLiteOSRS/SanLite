import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("of")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("i")
	final int field4325;
	@ObfuscatedName("w")
	final int field4304;
	@ObfuscatedName("s")
	final int field4305;
	@ObfuscatedName("a")
	final int field4306;
	@ObfuscatedName("o")
	final int field4334;
	@ObfuscatedName("g")
	final int field4315;
	@ObfuscatedName("e")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -384998697
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1728715717
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("b")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1596993239
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 292759791
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -669806993
	)
	int field4303;
	@ObfuscatedName("t")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 234713663
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 895907887
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -2081618431
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 494353408
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2138397069
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1184456773
	)
	int field4322;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 159330307
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("m")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1103656879
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("f")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1576280253
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("ag")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("ae")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("aq")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("al")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("am")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("ai")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("ah")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("as")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("at")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("az")
	@Export("base")
	int[][] base;
	@ObfuscatedName("ac")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("ak")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -138275331
	)
	int field4326;

	BZip2State() {
		this.field4325 = 4096;
		this.field4304 = 16;
		this.field4305 = 258;
		this.field4306 = 6;
		this.field4334 = 50;
		this.field4315 = 18002;
		this.nextByte = 0;
		this.next_out = 0;
		this.unzftab = new int[256];
		this.cftab = new int[257];
		this.inUse = new boolean[256];
		this.inUse16 = new boolean[16];
		this.seqToUnseq = new byte[256];
		this.ll8 = new byte[4096];
		this.getAndMoveToFrontDecode_yy = new int[16];
		this.selector = new byte[18002];
		this.selectorMtf = new byte[18002];
		this.temp_charArray2d = new byte[6][258];
		this.limit = new int[6][258];
		this.base = new int[6][258];
		this.perm = new int[6][258];
		this.minLens = new int[6];
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Lfh;",
		garbageValue = "-360258293"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZB)I",
		garbageValue = "0"
	)
	static int method7179(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
			var4 = UserComparator9.getWidget(var3);
		} else {
			var4 = var2 ? class120.scriptDotWidget : Frames.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			class14.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 3];
			class184.invalidateWidget(var4);
			ArchiveLoader.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class81.revalidateWidgetScroll(WorldMapSection1.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			class14.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 3];
			class184.invalidateWidget(var4);
			ArchiveLoader.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class81.revalidateWidgetScroll(WorldMapSection1.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				class184.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}
}
