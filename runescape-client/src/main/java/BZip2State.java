import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tq")
@Implements("BZip2State")
public final class BZip2State {
	@ObfuscatedName("ai")
	final int field5095;
	@ObfuscatedName("aj")
	final int field5072;
	@ObfuscatedName("ac")
	final int field5079;
	@ObfuscatedName("aw")
	final int field5074;
	@ObfuscatedName("ay")
	final int field5075;
	@ObfuscatedName("ap")
	final int field5090;
	@ObfuscatedName("av")
	@Export("inputArray")
	byte[] inputArray;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -307936799
	)
	@Export("nextByte")
	int nextByte;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2054406347
	)
	@Export("nextBit_unused")
	int nextBit_unused;
	@ObfuscatedName("az")
	@Export("outputArray")
	byte[] outputArray;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -378825769
	)
	@Export("next_out")
	int next_out;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -313866291
	)
	@Export("outputLength")
	int outputLength;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -743502039
	)
	int field5083;
	@ObfuscatedName("am")
	@Export("out_char")
	byte out_char;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1136495377
	)
	@Export("su_rNToGo")
	int su_rNToGo;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1243011785
	)
	@Export("bsBuff")
	int bsBuff;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2080352557
	)
	@Export("bsLive")
	int bsLive;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1052974080
	)
	@Export("blockSize100k")
	int blockSize100k;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1249642241
	)
	@Export("originalPointer")
	int originalPointer;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 134646927
	)
	int field5084;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -368491139
	)
	@Export("su_ch2")
	int su_ch2;
	@ObfuscatedName("al")
	@Export("unzftab")
	int[] unzftab;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1423164587
	)
	@Export("nblocks_used")
	int nblocks_used;
	@ObfuscatedName("ah")
	@Export("cftab")
	int[] cftab;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -815741379
	)
	@Export("nInUse")
	int nInUse;
	@ObfuscatedName("bm")
	@Export("inUse")
	boolean[] inUse;
	@ObfuscatedName("bt")
	@Export("inUse16")
	boolean[] inUse16;
	@ObfuscatedName("by")
	@Export("seqToUnseq")
	byte[] seqToUnseq;
	@ObfuscatedName("bc")
	@Export("ll8")
	byte[] ll8;
	@ObfuscatedName("bw")
	@Export("getAndMoveToFrontDecode_yy")
	int[] getAndMoveToFrontDecode_yy;
	@ObfuscatedName("bq")
	@Export("selector")
	byte[] selector;
	@ObfuscatedName("bn")
	@Export("selectorMtf")
	byte[] selectorMtf;
	@ObfuscatedName("bb")
	@Export("temp_charArray2d")
	byte[][] temp_charArray2d;
	@ObfuscatedName("bi")
	@Export("limit")
	int[][] limit;
	@ObfuscatedName("bj")
	@Export("base")
	int[][] base;
	@ObfuscatedName("bf")
	@Export("perm")
	int[][] perm;
	@ObfuscatedName("ba")
	@Export("minLens")
	int[] minLens;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -691804033
	)
	int field5108;

	BZip2State() {
		this.field5095 = 4096; // L: 4
		this.field5072 = 16; // L: 5
		this.field5079 = 258; // L: 6
		this.field5074 = 6; // L: 7
		this.field5075 = 50; // L: 8
		this.field5090 = 18002; // L: 9
		this.nextByte = 0; // L: 11
		this.next_out = 0; // L: 14
		this.unzftab = new int[256]; // L: 25
		this.cftab = new int[257]; // L: 27
		this.inUse = new boolean[256]; // L: 30
		this.inUse16 = new boolean[16]; // L: 31
		this.seqToUnseq = new byte[256]; // L: 32
		this.ll8 = new byte[4096]; // L: 33
		this.getAndMoveToFrontDecode_yy = new int[16]; // L: 34
		this.selector = new byte[18002]; // L: 35
		this.selectorMtf = new byte[18002]; // L: 36
		this.temp_charArray2d = new byte[6][258]; // L: 37
		this.limit = new int[6][258]; // L: 38
		this.base = new int[6][258]; // L: 39
		this.perm = new int[6][258]; // L: 40
		this.minLens = new int[6]; // L: 41
	} // L: 44
}
